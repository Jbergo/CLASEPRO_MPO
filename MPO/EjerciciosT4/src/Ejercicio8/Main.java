package Ejercicio8;

/*
**Ejercicio 8 - Predicates Compuestos: Filtrado Múltiple**

Crea varios Predicates para filtrar una lista de números:

- Números mayores que 50
- Números pares
- Números divisibles por 3

Combínalos usando `and()`, `or()` y `negate()` para crear filtros complejos.
 */

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Predicate<Integer> nMayor50 = integer -> integer > 50;
        Predicate<Integer> nPares = integer -> integer % 2 == 0;
        Predicate<Integer> nDivisible3 = integer -> integer%3==0;

        Predicate<Integer> prueba1 = nMayor50.and(nPares);
        Predicate<Integer> prueba2 = nPares.negate().or(nDivisible3);

        System.out.println(prueba1.test(60));
        System.out.println(prueba2.test(65));
    }
}
