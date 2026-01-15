/*
Crear una agenda de personas gestionada por menú con operaciones básicas.

Realizar una aplicación que gestione usuarios mediante arrays. Cada usuario: nombre (string), apellido (string), teléfono (int) y dni (string). Funcionalidad guiada por menú:

- Agregar persona: pedir nombre, apellido, teléfono y dni. Agregar a la lista
- Buscar persona: pedir un dni y sacar por pantalla todos los datos con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
- Borrar persona: pedir un dni y eliminar de la lista
- Listar personas: listar todos los elementos con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
- En todos los casos dar confirmación al usuario tanto del éxito como de la ejecución incorrecta de la opción
 */

import Controller.GestionUsuario;
import Model.Contacto;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static GestionUsuario gestion = new GestionUsuario();

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("""
                    --- MENÚ AGENDA ---
                    1- Agregar Persona
                    2- Buscar Persona
                    3- Borrar Persona
                    4- Listar Personas
                    5- Salir
                    Introduce la opción que quieres realizar:
                    """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce el nombre de la persona:");
                    String nombre = sc.next();
                    System.out.println("Introduce el apellido de la persona:");
                    String apellido = sc.next();
                    System.out.println("Introduce el teléfono de la persona:");
                    int telefono = sc.nextInt();
                    System.out.println("Introduce el DNI de la persona:");
                    String dni = sc.next();
                    System.out.println("Introduce el email de la persona:");
                    String email = sc.next();

                    System.out.println(gestion.agregarPersona(nombre, apellido, dni, telefono, email));
                }
                case 2 -> {
                    System.out.println("Introduce el DNI de la persona que quieres buscar");
                    String dni = sc.next();

                    System.out.println(gestion.buscarPersona(dni));
                }
                case 3 -> {
                    System.out.println("Introduce el DNI de la persona que quieres eliminar");
                    String dni = sc.next();

                    System.out.println(gestion.borrarPersona(dni));
                }
                case 4 -> {
                    for (Contacto contacto : gestion.listarPersonas()) {
                        System.out.println(contacto.toString());
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo del programa");
                }
            }
        } while (opcion!=5);
    }

}
