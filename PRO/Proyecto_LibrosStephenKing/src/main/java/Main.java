import controller.APIController;
import controller.BibliotecaController;
import model.Libro;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final BibliotecaController biblioteca = new BibliotecaController();
    private static final APIController api = new APIController();

    public static void main(String[] args) {
        int opcion = -1;

        do {
            System.out.println("""
                    Menú:
                    1. Importar libros
                    2. Buscar información sobre un libro
                    3. Seleccionar un libro como favorito
                    4. Exportar libros favoritos
                    5. Importar favoritos
                    0. Salir
                    Indica la opción a realizar
                    """);
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                System.out.println("Debes introducir un número.");
                sc.nextLine();
                opcion = -1;
                continue;
            }

            switch (opcion) {
                case 1:
                    biblioteca.importarLibros();
                    System.out.println("Libros importados");
                    break;
                case 2:
                    System.out.println("Indica el ID del libro");

                    if (!sc.hasNextInt()) {
                        System.out.println("Debes introducir un número.");
                        sc.nextLine();
                        break;
                    }

                    int idBusc = sc.nextInt();

                    if (idBusc <= 0) {
                        System.out.println("El ID debe ser mayor que 0.");
                        break;
                    }

                    Libro libro = api.obtenerLibroPorId(idBusc);

                    if (libro != null) {
                        System.out.println(libro);
                    } else {
                        System.out.println("Libro no encontrado");
                    }

                    break;
                case 3:
                    System.out.println("Indica el ID del libro");
                    if (!sc.hasNextInt()) {
                        System.out.println("Debes introducir un número.");
                        sc.nextLine();
                        break;
                    }

                    int idFav = sc.nextInt();

                    if (idFav <= 0) {
                        System.out.println("El ID debe ser mayor que 0.");
                        break;
                    }

                    if (biblioteca.agregarFavorito(idFav)) {
                        System.out.println("Libro añadido correctamente");
                    } else {
                        System.out.println("Error al añadir el libro");
                    }
                    break;
                case 4:
                    if (biblioteca.obtenerFavoritos().isEmpty()) {
                        System.out.println("No hay favoritos para exportar.");
                    } else {
                        biblioteca.exportarFavoritos();
                        System.out.println("Favoritos exportados correctamente.");
                    }
                    break;
                case 5:
                    biblioteca.importarFavoritos();

                    if (biblioteca.obtenerFavoritos().isEmpty()) {
                        System.out.println("No hay favoritos para exportar.");
                    } else {
                        System.out.println("Favoritos importados correctamente.");
                        for (Libro item : biblioteca.obtenerFavoritos()) {
                            System.out.println(item);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción Inválida");
            }

        } while (opcion != 0);
        sc.close();
    }
}
