package Ejercicio8;

public class Coche {
    private String marca, modelo;
    private int anio;
    private double kilometraje, combustible;

    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = 0;
        this.combustible = 50;
    }

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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getKm() {
        return kilometraje;
    }

    public void setKm(double km) {
        this.kilometraje = km;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public void conducir(double km) {
        double combustibleNecesario = km / 15.0;

        if (combustibleNecesario <= combustible) {
            kilometraje += km;
            combustible -= combustibleNecesario;
        } else {
            System.out.println("No hay suficiente combustible para recorrer " + km + " km.");
        }
    }

    public void repostar(double litros) {
        if (litros <= 0) {
            System.out.println("Cantidad a repostar no válida.");
            return;
        }

        combustible += litros;

        if (combustible > 60) {
            combustible = 60;
        }
    }

    public int calcularAntiguedad() {
        return 2025 - getAnio();
    }

    public boolean necesitaMantenimiento() {
        return kilometraje > 10000;
    }

    public void mostrarInfo(){
        System.out.println("marca = " + marca);
        System.out.println("modelo = " + modelo);
        System.out.println("anio = " + anio);
        System.out.println("kilometraje = " + kilometraje);
        System.out.println("combustible = " + combustible);
    }
}
