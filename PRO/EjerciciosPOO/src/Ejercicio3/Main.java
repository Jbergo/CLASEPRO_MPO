package Ejercicio3;

/*
Crea una clase Rectangulo con atributos base y altura.
Añade métodos calcularArea() y calcularPerimetro() que
devuelvan el área y el perímetro respectivamente.
Crea un objeto y muestra los resultados.
 */

public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(5,3);
        System.out.println("Rectángulo con base " + rectangulo.getBase() + " y altura " + rectangulo.getAltura());
        System.out.println("Área = " + rectangulo.calcularArea());
        System.out.println("Perímetro = " + rectangulo.calcularPerimetro());

    }
}
