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
    static ArrayList<Object[]> listaUsuarios = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("""
                    OPCIONES:
                    1. Agregar persona
                    2. Buscar persona
                    3. Borrar persona
                    4. Listar personas
                    5. Salir
                    
                    Elige la opción a realizar:
                    """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    confirmation(agregarPersona(listaUsuarios));
                }
                case 2 -> {
                    confirmation(buscarPersona(listaUsuarios));
                }
                case 3 -> {
                    confirmation(borrarPersona(listaUsuarios));
                }
                case 4 -> {
                    confirmation(listarPersonas(listaUsuarios));
                }
                case 5 -> {
                    System.out.println("Saliendo de la agenda");
                }
            }

        } while (opcion != 5);

        sc.close();
    }

    private static boolean agregarPersona(ArrayList<Object[]> array) {
        System.out.println("--- AGREGAR PERSONA ---");

        try {
            System.out.println("Ingresa el nombre de la persona: ");
            String nombre = sc.next();

            System.out.println("Ingresa el apellido de la persona: ");
            String apellido = sc.next();

            System.out.println("Ingresa el teléfono de la persona: ");
            int telefono = sc.nextInt();

            System.out.println("Ingresa el DNI de la persona: ");
            String dni = sc.next();

            array.add(new Object[]{nombre, apellido, telefono, dni});

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean buscarPersona(ArrayList<Object[]> array) {
        System.out.println("--- BUSCAR PERSONA ---");

        System.out.println("Ingresa el DNI de la persona que quieres buscar: ");
        String dni = sc.next();

        for (Object[] persona : array) {
            if (persona[3].equals(dni)) {
                System.out.println("Nombre:" + persona[0]);
                System.out.println("Apellidos:" + persona[1]);
                System.out.println("Teléfono:" + persona[2]);
                System.out.println("DNI:" + persona[3]);
                return true;
            }
        }

        return false;
    }

    private static boolean borrarPersona(ArrayList<Object[]> array) {
        System.out.println("--- BORRAR PERSONA ---");

        System.out.println("Ingresa el DNI de la persona a eliminar:");
        String dni = sc.next();

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)[3].equals(dni)) {
                array.remove(i);
                System.out.println("Persona eliminada");
                return true;
            }
        }

        return false;
    }

    private static boolean listarPersonas(ArrayList<Object[]> array) {
        System.out.println("--- LISTAR PERSONAS ---");

        for (Object[] item : array) {
            System.out.println("Nombre: " + item[0]);
            System.out.println("Apellido: " + item[1]);
            System.out.println("Teléfono: " + item[2]);
            System.out.println("DNI: " + item[3]);
            System.out.println("------------------------");
            return true;
        }

        return false;

    }

    private static void confirmation(boolean success) {
        if (success) {
            System.out.println("Ejecución realizada CORRECTAMENTE");
        } else {
            System.out.println("Ejecución realizada INCORRECTAMENTE");
        }
    }

}