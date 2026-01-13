package Ejercicio9;

/*
Crea una clase Calculadora con métodos estáticos para sumar, restar, multiplicar y dividir dos números.
Añade también un método estático potencia(base, exponente). Usa estos métodos sin crear objetos de la clase.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculadora.sumar(5, 3));
        System.out.println(Calculadora.restar(5, 3));
        System.out.println(Calculadora.multiplicar(5, 3));
        System.out.println(Calculadora.dividir(5, 3));
        System.out.println(Calculadora.potencia(5, 3));
    }
}
