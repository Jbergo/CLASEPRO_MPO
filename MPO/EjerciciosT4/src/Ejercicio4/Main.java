package Ejercicio4;

/*
**Ejercicio 4 - BiPredicate: Comparación de Strings**

Implementa un BiPredicate que reciba dos Strings y determine si tienen la misma longitud.
Pruébalo con varios pares de palabras.
 */

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        BiPredicate<String, String> mismaLongitud = (s, s2) -> s.length() == s2.length();
        System.out.println(mismaLongitud.test("hola", "hola"));
        System.out.println(mismaLongitud.test("si", "puede ser"));
    }
}
