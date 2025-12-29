package controller;

import model.Carrera;
import model.Coche;

import java.util.ArrayList;
import java.util.Comparator;

public class CarreraController {

    public ArrayList<Coche> ejecutarCarrera(Carrera carrera) {

        //Realizar carrera
        boolean finCarrera = comprobarFinCarrera(carrera);

        while (!finCarrera) {
            for (Coche coche : carrera.getParticipantes()) {
                int kmAleatorios = (int) (Math.random() * (50 - 20 + 1)) + 20;
                int nuevoKm = coche.getKm() + kmAleatorios;
                coche.setKm(nuevoKm);

            }
            finCarrera = comprobarFinCarrera(carrera);
        }

        //Ordenar participantes
        ordenarParticipantes(carrera);

        //Asignar puntos
        asignarPuntos(carrera);

        //Crear podio
        ArrayList<Coche> podio = new ArrayList<>();
        ArrayList<Coche> coches = carrera.getParticipantes();

        for (int i = 0; i < coches.size() && i < 3; i++) {
            podio.add(coches.get(i));
        }

        return podio;
    }

    private boolean comprobarFinCarrera(Carrera carrera) {
        ArrayList<Coche> coches = carrera.getParticipantes();
        int kmCarrera = carrera.getKmTotales();

        for (Coche coche : coches) {
            if (coche.getKm() >= kmCarrera) {
                return true;
            }
        }
        return false;
    }

    private void ordenarParticipantes(Carrera carrera) {
        carrera.getParticipantes().sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche c1, Coche c2) {
                if (c1.getKm() > c2.getKm()) {
                    return -1;
                } else if (c1.getKm() < c2.getKm()) {
                    return 1;
                } else {
                    return Integer.compare(c1.getDorsal(), c2.getDorsal());
                }
            }
        });

    }

    private void asignarPuntos(Carrera carrera) {
        ArrayList<Coche> coches = carrera.getParticipantes();

        if (coches.size() > 0) {
            coches.get(0).setAcumPuntos(coches.get(0).getAcumPuntos() + 10);
        }
        if (coches.size() > 1) {
            coches.get(1).setAcumPuntos(coches.get(1).getAcumPuntos() + 8);
        }
        if (coches.size() > 2) {
            coches.get(2).setAcumPuntos(coches.get(2).getAcumPuntos() + 6);
        }

    }
}
