package Ejercicio2.model;

public class Equipo {
    private String nombre;
    private int gFavor, gContra;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo() {
    }

    public void mostrarEstadisticas() {
        System.out.println("El nombre del equipo es: " + nombre);
        System.out.println("Los goles a favor son" + gFavor);
        System.out.println("Los goles en contra son" + gContra);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getgFavor() {
        return gFavor;
    }

    public void setgFavor(int gFavor) {
        this.gFavor = gFavor;
    }

    public int getgContra() {
        return gContra;
    }

    public void setgContra(int gContra) {
        this.gContra = gContra;
    }
}
