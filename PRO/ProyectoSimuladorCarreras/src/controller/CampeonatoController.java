package controller;

import model.Campeonato;
import model.Carrera;
import model.Coche;

import java.util.ArrayList;
import java.util.Comparator;

public class CampeonatoController {

    private CarreraController carreraController = new CarreraController();

    public ArrayList<Coche> ejecutarCampeonato(Campeonato campeonato) {

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

            //Ejecutar carrera
            carreraController.ejecutarCarrera(carrera);

            //Ordenar clasificacion
            ordenarClasificacion(campeonato);
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
                    return 0;
                }
            }
        });
    }

}
