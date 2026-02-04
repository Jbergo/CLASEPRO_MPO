package Ejercicio5;

/*
**Ejercicio 5 - Consumer y BiConsumer: Impresión de Datos**

Crea un BiConsumer que reciba un nombre (String) y una edad (Integer) e imprima un mensaje formateado como "Nombre: [nombre], Edad: [edad]".
Úsalo para imprimir información de varios estudiantes.
 */

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<String, Integer> mensaje = (s, integer) -> System.out.printf("Nombre: %s, Edad: %d", s, integer);
        mensaje.accept("Jorge", 23);
    }
}
