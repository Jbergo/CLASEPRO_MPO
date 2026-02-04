package Ejercicio6;

/*
**Ejercicio 6 - Composición de Funciones: Operaciones Encadenadas**

Utiliza Function y el método `andThen()` para crear una cadena de operaciones:
toma un número, súmale 10, multiplícalo por 2, y conviértelo a String.
Aplícalo a una lista de números.
*/

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> sumar = integer -> (integer + 10) * 2;
        Function<Integer, String> conversion = Object::toString;
        Function<Integer, String> combinado = sumar.andThen(conversion);

        System.out.println(combinado.apply(5));
    }
}
