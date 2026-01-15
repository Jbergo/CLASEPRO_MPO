package Ejercicio4;

/*
Crea una clase Figura con un método calcularArea().
Crea dos clases hijas: Circulo (con atributo radio) y Cuadrado (con atributo lado).
Implementa el método calcularArea() en cada clase hija con la fórmula correspondiente.
Crea objetos de cada tipo y muestra sus áreas.
 */

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        System.out.println("Area del circulo: " + circulo.calcularArea());
        Cuadrado cuadrado = new Cuadrado(4.0);
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
    }

}
