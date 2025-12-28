package model;

import java.util.ArrayList;

public class Carrera {

    /*ATRIBUTOS*/
    private ArrayList<Coche> participantes;
    private int kmTotales;

    /*CONSTRUCTORES*/
    public Carrera(int kmTotales) {
        participantes = new ArrayList<>();
        this.kmTotales = kmTotales;
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

    public int getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }
}
