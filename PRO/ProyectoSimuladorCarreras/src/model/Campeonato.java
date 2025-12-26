package model;

import java.util.ArrayList;

public class Campeonato {

    /*ATRIBUTOS*/
    private ArrayList<Carrera> carreras;
    private ArrayList<Coche> clasificacion;

    /*CONSTRUCTORES*/
    public Campeonato() {
        carreras = new ArrayList<>();
        clasificacion = new ArrayList<>();
    }

    public Campeonato(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
        clasificacion = new ArrayList<>();
    }

    /*METODOS*/
    public void addCarrera(Carrera carrera) {
        carreras.add(carrera);
    }

    /*GETTER and SETTER*/
    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public ArrayList<Coche> getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(ArrayList<Coche> clasificacion) {
        this.clasificacion = clasificacion;
    }
}
