import controller.GestorUsers;
import model.Administrador;
import model.Trabajador;
import model.Usuario;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final GestorUsers gestor = new GestorUsers();

    public static void main(String[] args) {
        //INICIAR SESIÓN
        System.out.println("Introduce el correo (correo):");
        String correoInicio = sc.next();
        System.out.println("Introduce la contraseña:");
        String passwordInicio = sc.next();

        Usuario userInicio = gestor.iniciarSesion(correoInicio, passwordInicio);
        if (userInicio == null) {
            System.out.println("Usuario o contraseña no válidos");
        } else if (userInicio instanceof Administrador) {
            System.out.println("PERFIL ADMINISTRADOR");

            //MENÚ
            int opcion = -1;
            do {
                System.out.println("""
                        MENÚ:
                        0. SALIR
                        1. DAR DE ALTA A TRABAJADOR
                        2. DAR DE BAJA A TRABAJADOR
                        3. VER DATOS DE UN TRABAJADOR
                        4. VER TRABAJADORES
                        5. CAMBIAR CONTRASEÑA DE UN USUARIO
                        6. VER REGISTROS DE JORNADA
                        INDICA LA OPCIÓN A REALIZAR
                        """);
                opcion = sc.nextInt();

                switch (opcion) {
                    case 0 -> {
                        //0. Salir
                        System.out.println("SALIENDO DEL PROGRAMA");
                    }
                    case 1 -> {
                        //1. Dar de alta trabajadores indicando todos sus datos
                        System.out.println("DANDO DE ALTA A UN TRABAJADOR");
                        System.out.println("Introduce el nombre");
                        String nombre = sc.next();
                        System.out.println("Introduce el apellido");
                        String apellido = sc.next();
                        System.out.println("Introduce el dni");
                        String dni = sc.next();
                        System.out.println("Introduce el correo");
                        String correo = sc.next();
                        System.out.println("Introduce el password");
                        String password = sc.next();

                        if (gestor.darAltaTrabajador(nombre, apellido, dni, correo, password)) {
                            System.out.println("Usuario añadido correctamente");
                        } else {
                            System.out.println("Usuario duplicado");
                        }
                    }
                    case 2 -> {
                        //2. Dar de baja trabajadores indicando su dni
                        System.out.println("DANDO DE BAJA A UN TRABAJADOR");
                        System.out.println("Introduce el dni");
                        String dni = sc.next();

                        if (gestor.darBajaTrabajador(dni)) {
                            System.out.println("Usuario eliminado correctamente");
                        } else {
                            System.out.println("Usuario no eliminado");
                        }
                    }
                    case 3 -> {
                        //3. Ver datos de trabajador indicando su dni
                        System.out.println("VIENDO DATOS DE UN TRABAJADOR");
                        System.out.println("Introduce el dni");
                        String dni = sc.next();

                        Trabajador trabajador = gestor.verDatosTrabajador(dni);
                        if (trabajador == null) {
                            System.out.println("Trabajador no encontrado");
                        } else {
                            System.out.println(trabajador);
                        }
                    }
                    case 4 -> {
                        //4. Ver trabajadores
                        System.out.println("VIENDO LOS TRABAJADORES");
                        if (gestor.verTrabajadores().isEmpty()) {
                            System.out.println("No hay trabajadores registrados");
                        } else {
                            for (Trabajador item : gestor.verTrabajadores()) {
                                System.out.println(item);
                            }
                        }

                    }
                    case 5 -> {
                        //5. Cambiar la pass de un trabajador indicando su dni y pass nueva
                        System.out.println("CAMBIANDO LA CONTRASEÑA DE UN TRABAJADOR");
                        System.out.println("Introduce el DNI de la persona");
                        String dni = sc.next();
                        System.out.println("Introduce la nueva contraseña");
                        String password = sc.next();

                        if (gestor.cambiarPassword(dni, password)) {
                            System.out.println("Contraseña actualizada correctamente");
                        } else {
                            System.out.println("Error al cambiar la contraseña");
                        }
                    }
                    case 6 -> {
                        //6. Ver registros de jornada
                        System.out.println("VIENDO LOS REGISTROS DE JORNADA");
                        gestor.verRegistroJornada();
                    }
                    default -> {
                        System.out.println("ERROR EN LA OPCIÓN DEL MENÚ ADMINISTRADOR");
                    }
                }

            } while (opcion != 0);

        } else if (userInicio instanceof Trabajador) {
            System.out.println("PERFIL TRABAJADOR");

            Trabajador trabajador = (Trabajador) userInicio;
            int opcionTrabajador = -1;

            do {
                System.out.println("""
                        MENÚ TRABAJADOR:
                        0. SALIR
                        1. REALIZAR FICHAJE
                        INDICA LA OPCIÓN A REALIZAR
                        """);

                opcionTrabajador = sc.nextInt();

                switch (opcionTrabajador) {
                    case 0 -> System.out.println("SALIENDO DEL MENÚ TRABAJADOR");
                    case 1 -> {
                        System.out.println("REALIZANDO EL FICHAJE");
                        if (gestor.realizarFichaje(trabajador)) {
                            System.out.println("Fichaje realizado correctamente");
                        } else {
                            System.out.println("Error al realizar el fichaje del trabajador");
                        }
                    }
                    default -> System.out.println("ERROR EN LA OPCIÓN DEL MENÚ TRABAJADOR");
                }

            } while (opcionTrabajador != 0);
        }


    }
}
