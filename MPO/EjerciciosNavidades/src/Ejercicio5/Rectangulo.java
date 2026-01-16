package Ejercicio5;

public class Rectangulo {
    private double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    private boolean validar(double base, double altura) {
        return base > 0 && altura > 0;
    }

    public double getBase() {
        if (validar(base, altura)) {
            return base;
        }
        return 0;
    }

    public void setBase(double base) {
        if (validar(base, altura)) {
            this.base = base;
        }
    }

    public double getAltura() {
        if (validar(base, altura)) {
            return altura;
        }
        return 0;
    }

    public void setAltura(double altura) {
        if (validar(base, altura)) {
            this.altura = altura;
        }
    }

    public double calcularArea(){
        return getAltura()*getAltura();
    }

    public double calcularPerimetro(){
        return 2*(getAltura()+getAltura());
    }

    public boolean esCuadrado(){
        if (base==altura){
            return true;
        }
        return false;
    }

    public void escalar(double factor){
        setAltura(getAltura()*factor);
        setBase(getBase()*factor);
    }

    public void mostrarInfo(){
        System.out.println("base = " + base);
        System.out.println("altura = " + altura);
        System.out.println("area = " + calcularArea());
        System.out.println("perimetro = " + calcularPerimetro());
        System.out.println("es cuadrado = " + esCuadrado());
    }
}
