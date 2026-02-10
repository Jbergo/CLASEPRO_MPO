package Ejercicio9;

/*
**Ejercicio 9 - BiFunction con Colecciones: Fusión de Listas**

Implementa una BiFunction que reciba dos listas de enteros y
devuelva una nueva lista con todos los elementos de ambas listas,
pero sin duplicados y ordenada de menor a mayor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        BiFunction<ArrayList<Integer>, ArrayList<Integer>, ArrayList<Integer>> fusionLista =
                (integer, integer2) -> {
                    Set<Integer> listaOrd = new TreeSet<>();
                    listaOrd.addAll(integer);
                    listaOrd.addAll(integer2);
                    return new ArrayList<>(listaOrd);
        };

        ArrayList<Integer> lista1 = new ArrayList<>(List.of(10, 5, 3, 10, 7, 50));
        ArrayList<Integer> lista2 = new ArrayList<>(List.of(7, 2, 50, 1, 3, 99));

        System.out.println(fusionLista.apply(lista1, lista2));
    }
}
