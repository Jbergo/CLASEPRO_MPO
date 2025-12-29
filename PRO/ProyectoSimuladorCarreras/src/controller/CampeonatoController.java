package controller;

import model.Campeonato;
import model.Carrera;
import model.Coche;

import java.util.ArrayList;
import java.util.Comparator;

public class CampeonatoController {

    private CarreraController carreraController = new CarreraController();
    private int numCarrera = 1;

    public ArrayList<Coche> ejecutarCampeonato(Campeonato campeonato) {
        numCarrera = 1;

        //Copiar lista de participantes en clasificacion
        if (campeonato.getClasificacion().isEmpty() && !campeonato.getCarreras().isEmpty()) {
            campeonato.getClasificacion().addAll(campeonato.getCarreras().get(0).getParticipantes());
        }

        //Para cada carrera
        for (Carrera carrera : campeonato.getCarreras()) {

            //Reset km coche
            for (Coche coche : carrera.getParticipantes()) {
                coche.setKm(0);
            }

            //Ejecutar carrera y guardar podio
            ArrayList<Coche> podio = carreraController.ejecutarCarrera(carrera);

            //Ordenar clasificacion
            ordenarClasificacion(campeonato);

            //Mostrar clasificacion de cada carrera
            mostrarCarrera(podio);

            //Mostrar Clasificacion
            mostrarClasificacion(campeonato.getClasificacion());

            numCarrera++;
        }

        return campeonato.getClasificacion();
    }

    private void ordenarClasificacion(Campeonato campeonato) {
        campeonato.getClasificacion().sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche c1, Coche c2) {
                if (c1.getAcumPuntos() > c2.getAcumPuntos()) {
                    return -1;
                } else if (c1.getAcumPuntos() < c2.getAcumPuntos()) {
                    return 1;
                } else {
                    return Integer.compare(c1.getDorsal(), c2.getDorsal());
                }
            }
        });
    }

    private void mostrarCarrera(ArrayList<Coche> podio) {
        int[] puntos = {10, 8, 6};
        System.out.println("=== CARRERA " + numCarrera + " ===");
        for (int i = 0; i < podio.size() && i < 3; i++) {
            Coche coche = podio.get(i);
            System.out.println((i + 1) + "º - " + coche.getMarca() + " " + coche.getModelo() + " [" + puntos[i] + " puntos]");
        }
        System.out.println();
    }

    private static void mostrarClasificacion(ArrayList<Coche> clasificacionFinal) {
        System.out.println("=== CLASIFICACIÓN GENERAL ===");
        System.out.printf("%-10s | %-20s | %-10s | %-10s%n", "Posición", "Piloto", "Dorsal", "Puntos");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < clasificacionFinal.size(); i++) {
            Coche coche = clasificacionFinal.get(i);
            String piloto = coche.getMarca() + " " + coche.getModelo();

            System.out.printf("%-10s | %-20s | %-10d | %-10d%n",
                    (i + 1) + "º",
                    piloto,
                    coche.getDorsal(),
                    coche.getAcumPuntos());
        }
    }
}
