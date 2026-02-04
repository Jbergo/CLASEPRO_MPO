package Ejercicio3;

/*
**Ejercicio 3 - BiFunction: Calculadora Básica**

Crea una BiFunction que reciba dos números enteros y devuelva su suma.
Después, crea otras tres BiFunctions para resta, multiplicación y división.
*/

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> suma = Integer::sum;
        System.out.println(suma.apply(2,3));

        BiFunction<Integer,Integer,Integer> resta = (integer, integer2) -> integer - integer2;
        System.out.println(resta.apply(2,3));

        BiFunction<Integer,Integer,Integer> multiplicacion = (integer, integer2) -> integer * integer2;
        System.out.println(multiplicacion.apply(2,3));

        BiFunction<Integer,Integer,Integer> division = (integer, integer2) -> (integer / integer2);
        System.out.println(division.apply(4,2));
    }
}
