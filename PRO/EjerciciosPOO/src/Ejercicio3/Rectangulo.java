package Ejercicio3;

public class Rectangulo {
    private double base, altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea() {
        return base*altura;
    }

    public double calcularPerimetro() {
        return 2*(base+altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
