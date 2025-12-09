import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
    Crear una agenda de personas gestionada por menú con operaciones básicas.
    Realizar una aplicación que gestione usuarios mediante arrays.
    Cada usuario: nombre (string), apellido (string), teléfono (int) y dni (string).
    Funcionalidad guiada por menú:
        - Agregar persona: pedir nombre, apellido, teléfono y dni. Agregar a la lista
        - Buscar persona: pedir un dni y sacar por pantalla todos los datos con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
        - Borrar persona: pedir un dni y eliminar de la lista
        - Listar personas: listar todos los elementos con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
        - En todos los casos dar confirmación al usuario tanto del éxito como de la ejecución incorrecta de la opción
     */

    static Scanner sc = new Scanner(System.in);

    //Crear listaUsuarios -> [nombre, apellido, telefono, dni]
    static ArrayList<Object> listaUsuarios = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("""
                Elige la opción a realizar:
                1. Agregar persona
                2. Buscar persona
                3. Borrar persona
                4. Listar personas
                5. Salir
                """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    agregarPersona(listaUsuarios);
                }
                case 2 -> {
                    buscarPersona(listaUsuarios);
                }
                case 3 -> {
                    borrarPersona(listaUsuarios);
                }
                case 4 -> {
                    listarPersonas(listaUsuarios);
                }
                case 5 -> {
                    System.out.println("Saliendo de la agenda");
                }
            }

        } while (opcion!=5);

        sc.close();
    }

    private static void agregarPersona(ArrayList<Object> array) {
        System.out.println("--- AGREGAR PERSONA ---");

        System.out.println("Ingresa el nombre de la persona: ");
        String nombre = sc.nextLine();

        System.out.println("Ingresa el apellido de la persona: ");
        String apellido = sc.nextLine();

        System.out.println("Ingresa el teléfono de la persona: ");
        int telefono = sc.nextInt();

        System.out.println("Ingresa el DNI de la persona: ");
        String dni = sc.nextLine();

        array.add(nombre);
        array.add(apellido);
        array.add(telefono);
        array.add(dni);
    }

    private static void buscarPersona(ArrayList<Object> array) {
        System.out.println("--- BUSCAR PERSONA ---");

        System.out.println("Ingresa el DNI de la persona que quieres buscar: ");
        String dni = sc.nextLine();

        if (array.contains(dni)) {
            System.out.println("Persona encontrada: "+array.indexOf(dni));
        }
    }

    private static void borrarPersona(ArrayList<Object> array) {
        System.out.println("--- BORRAR PERSONA ---");
    }

    private static void listarPersonas(ArrayList<Object> array) {
        System.out.println("--- LISTAR PERSONAS ---");
    }

}