//package
//import nombrePaquete.NombreClase
//import controller.GestorDocumentos
//import controller.GestorUsuarios
//import controller.*

import controller.GestorUsuarios;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando la clase");
        GestorUsuarios gestorUsuarios = new GestorUsuarios();

        /*
        COMPARACIÓN DE NÚMEROS A NIVEL DE BIT
            & -> AND BIT
            | -> OR BIT
            Este tipo de comparación comprueba todos los elementos
        */

        int numero1 = 5;
        int numero2 = 6;

        int resultado = numero1 & numero2;

        System.out.println("El resultado con & es: "+resultado);

        int resultado2 = numero1 | numero2;

        System.out.println("El resultado con | es: "+resultado2);

    }
}
