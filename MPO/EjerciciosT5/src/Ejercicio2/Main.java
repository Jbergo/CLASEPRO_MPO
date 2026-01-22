package Ejercicio2;

import Ejercicio2.controller.Registrador;
import Ejercicio2.model.Equipo;
import Ejercicio2.model.Partido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Registrador registrador = new Registrador();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("======================================");
            System.out.println("  SEGUIMIENTO DE EVENTOS DEPORTIVOS");
            System.out.println("======================================");
            System.out.println("1. Agregar partido");
            System.out.println("2. Mostrar partidos");
            System.out.println("3. Mostrar partidos de un equipo");
            System.out.println("4. Mostrar estadísticas de un equipo");
            System.out.println("0. Salir");
            System.out.println("======================================");

            System.out.print("Elige una opción: ");
            while (!sc.hasNextInt()) {
                System.out.print("Introduce un número válido: ");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println("--- Agregar partido ---");

                    System.out.print("Nombre equipo local: ");
                    String nombreLocal = sc.nextLine();

                    System.out.print("Nombre equipo visitante: ");
                    String nombreVisitante = sc.nextLine();

                    while (nombreLocal.equalsIgnoreCase(nombreVisitante)) {
                        System.out.println("Local y visitante no pueden ser el mismo equipo.");
                        System.out.print("Nombre equipo visitante (distinto): ");
                        nombreVisitante = sc.nextLine();
                    }

                    int golesLocal = leerEnteroNoNegativo(sc, "Goles local: ");
                    int golesVisitante = leerEnteroNoNegativo(sc, "Goles visitante: ");

                    // Creamos equipos
                    Equipo local = new Equipo(nombreLocal);
                    Equipo visitante = new Equipo(nombreVisitante);

                    // Crear partido y registrar
                    Partido partido = new Partido(local, visitante, golesLocal, golesVisitante);
                    registrador.registrarPartido(partido);

                    System.out.println("Partido registrado correctamente.");
                }
                case 2 -> {
                    System.out.println("--- Mostrar partidos ---");
                    registrador.mostrarPartidos();
                }
                case 3 -> {
                    System.out.println("--- Mostrar partidos de un equipo ---");
                    System.out.print("Nombre del equipo: ");
                    String nombre = sc.nextLine();

                    boolean encontrado = false;
                    for (Partido p : registrador.getListaPartidos()) {
                        if (p.geteLocal().getNombre().equalsIgnoreCase(nombre)
                                || p.geteVisitante().getNombre().equalsIgnoreCase(nombre)) {
                            p.mostrarDatos();
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontraron partidos para: " + nombre);
                    }
                }
                case 4 -> {
                    System.out.println("--- Mostrar estadísticas de un equipo ---");
                    System.out.print("Nombre del equipo: ");
                    String nombre = sc.nextLine();

                    registrador.buscarEstadisticas(nombre);
                }
                case 0 -> System.out.println("Saliendo... ¡Hasta luego!");
                default -> System.out.println("Opción inválida.");
            }

            System.out.println();
        } while (opcion != 0);

        sc.close();
    }

    private static int leerEnteroNoNegativo(Scanner sc, String mensaje) {
        int valor;
        do {
            System.out.print(mensaje);
            while (!sc.hasNextInt()) {
                System.out.print("Introduce un número válido: ");
                sc.next();
            }
            valor = sc.nextInt();
            if (valor < 0) System.out.println("No se permiten números negativos.");
        } while (valor < 0);
        return valor;
    }
}
