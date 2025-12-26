package model;

public class Coche {

    /*ATRIBUTOS*/
    private String marca;
    private String modelo;
    private double km;
    private int acumPuntos;

    /*CONSTRUCTORES*/
    public Coche (){}

    public Coche (String marca, String modelo, double km) {
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
    }

    /*GETTER and SETTER*/
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
