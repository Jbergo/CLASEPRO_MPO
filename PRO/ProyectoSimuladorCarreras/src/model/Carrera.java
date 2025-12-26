package model;

import java.util.ArrayList;

public class Carrera {

    /*ATRIBUTOS*/
    private ArrayList<Coche> participantes;

    /*CONSTRUCTORES*/
    public Carrera() {
        participantes = new ArrayList<>();
    }

    /*METODOS*/
    public void addParticipante(Coche coche) {
        participantes.add(coche);
    }

    /*GETTER and SETTER*/
    public ArrayList<Coche> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Coche> participantes) {
        this.participantes = participantes;
    }
}
