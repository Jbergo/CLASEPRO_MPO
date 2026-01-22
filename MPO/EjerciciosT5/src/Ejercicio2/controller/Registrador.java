package Ejercicio2.controller;

import Ejercicio2.model.Partido;

import java.util.ArrayList;

public class Registrador {
    private ArrayList<Partido> listaPartidos;

    public Registrador() {
        listaPartidos = new ArrayList<>();
    }

    public void registrarPartido(Partido partido) {
        this.listaPartidos.add(partido);
    }

    public void mostrarPartidos() {
        for (Partido partido : listaPartidos) {
            partido.mostrarDatos();
        }

    }

    public void buscarEstadisticas(String nombre){
        for (Partido partido : listaPartidos) {
            if (partido.geteLocal().getNombre().equals(nombre)){
                partido.geteLocal().mostrarEstadisticas();
                return;
            } else if (partido.geteVisitante().getNombre().equals(nombre)) {
                partido.geteVisitante().mostrarEstadisticas();
                return;
            }
        }

    }

    public ArrayList<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(ArrayList<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }
}
