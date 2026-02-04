package Ejercicio2;

/*
**Ejercicio 2 - Predicate: Filtrado de Números**

Utiliza un Predicate para crear una función lambda que determine si un número es par.
Aplícala a una lista de números del 1 al 20 y muestra solo los pares.
 */

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> esPar = n -> n % 2==0;
        for (int i = 0; i <= 20; i++) {
            if (esPar.test(i)) {
                System.out.println(i);
            }
        }
    }
}
