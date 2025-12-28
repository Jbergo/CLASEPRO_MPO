package model;

public class Coche {

    /*ATRIBUTOS*/
    private String marca;
    private String modelo;
    private int km;
    private int acumPuntos;

    /*CONSTRUCTORES*/
    public Coche (){}

    public Coche (String marca, String modelo, int km) {
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

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getAcumPuntos() {
        return acumPuntos;
    }

    public void setAcumPuntos(int acumPuntos) {
        this.acumPuntos = acumPuntos;
    }
}
