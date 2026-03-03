package ejercicio9;

/*
Crea una aplicación que permita gestionar una agenda de contactos.
Para ello crea una clase Usuario que tenga las características: nombre, apellido, dni.
Además de esta clase, crea un main que permita gestionar los usuarios, con las siguientes opciones:

1. Agregar usuario: pedirá por consola todos los datos
2. Listar usuarios: mostrará por consola todos los usuarios del sistema
3. Exportar usuarios: guardará en un fichero .txt todos los usuarios de la lista
 */

import java.util.Scanner;

public class ejercicio9 {
    static final Scanner sc = new Scanner(System.in);
    static final GestionUsuarios gu = new GestionUsuarios();

    public static void main(String[] args) {
        int opcion = 0;

        do {
            System.out.println("""
                    MENÚ:
                    1. Agregar Usuario
                    2. Listar Usuarios
                    3. Exportar Usuarios
                    4. Salir
                    Introduce la opción que deseas realizar
                    """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce el nombre del usuario:");
                    String nombre = sc.next();

                    System.out.println("Introduce el apellido del usuario:");
                    String apellido = sc.next();

                    System.out.println("Introduce el dni del usuario:");
                    String dni = sc.next();

                    gu.agregarUsuario(nombre, apellido, dni);
                }
                case 2 -> {
                    gu.listarUsuarios();
                }
                case 3 -> {
                    gu.exportarUsuarios();
                }
                case 4 -> {
                    System.out.println("Saliendo");
                }
                default -> {
                    System.out.println("Opción no contemplada");
                }
            }

        } while (opcion != 4);

    }
}
