import Controller.GestionApp;
import Model.Audio;
import Model.Libro;
import Model.Video;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static GestionApp gestion = new GestionApp();

    public static void main(String[] args) {

        int opcion = 0;
        do {
            System.out.println("""
                    --- MENU ---
                    1. Añadir a la colección
                    2. Eliminar de la colección
                    3. Listar Elementos
                    4. Buscar Elementos
                    5. Salir
                    INTRODUCE EL NÚMERO DE LA OPCIÓN
                    """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("--- AÑADIENDO A LA COLECCIÓN ---");

                    System.out.println("Introduce su id");
                    int id = sc.nextInt();
                    System.out.println("Introduce su tamaño");
                    int tamanio = sc.nextInt();
                    System.out.println("Introduce su título");
                    String titulo = sc.next();
                    System.out.println("Introduce su autor");
                    String autor = sc.next();
                    System.out.println("Introduce su formato");
                    String formato = sc.next();
                    System.out.println("¿De qué tipo va a ser?");
                    String tipo = sc.next();
                    if (tipo.equalsIgnoreCase("audio")) {
                        System.out.println("Introduce su duración");
                        int duracion = sc.nextInt();
                        System.out.println("Introduce su soporte");
                        String soporte = sc.next();
                        Audio audio = new Audio(id, tamanio, titulo, autor, formato, duracion, soporte);
                        if (gestion.nuevoElemento(audio)) {
                            System.out.println("Elemento añadido correctamente");
                        } else {
                            System.out.println("Error al añadir el elemento");
                        }
                    } else if (tipo.equalsIgnoreCase("video")) {
                        System.out.println("Introduce su director");
                        String director = sc.next();
                        sc.nextLine();
                        System.out.println("Introduce sus actores");
                        String linea = sc.nextLine();
                        String[] actores = linea.split(",");
                        for (int i = 0; i < actores.length; i++) {
                            actores[i] = actores[i].trim();
                        }
                        Video video = new Video(id, tamanio, titulo, autor, formato, director, actores);
                        if (gestion.nuevoElemento(video)) {
                            System.out.println("Elemento añadido correctamente");
                        } else {
                            System.out.println("Error al añadir el elemento");
                        }
                    } else if (tipo.equalsIgnoreCase("libro")) {
                        System.out.println("Introduce su ISBN");
                        String isbn = sc.next();
                        System.out.println("Introduce su número de páginas");
                        int nPags = sc.nextInt();
                        Libro libro = new Libro(id, tamanio, titulo, autor, formato, isbn, nPags);
                        if (gestion.nuevoElemento(libro)) {
                            System.out.println("Elemento añadido correctamente");
                        } else {
                            System.out.println("Error al añadir el elemento");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("--- ELIMINANDO DE LA COLECCIÓN ---");

                    System.out.println("Introduce el identificar del elemento a eliminar");
                    int id = sc.nextInt();

                    if (gestion.eliminarElemento(id)) {
                        System.out.println("Elemento eliminado correctamente");
                    } else {
                        System.out.println("Error al eliminar el elemento");
                    }
                }
                case 3 -> {
                    System.out.println("--- LISTANDO ELEMENTOS ---");

                    System.out.println("""
                            a. Video
                            b. Audio
                            c. Todos
                            """);
                    char letra = sc.next().toLowerCase().charAt(0);

                    switch (letra) {
                        case 'a' -> {
                            gestion.listarElementos("video");
                        }

                        case 'b' -> {
                            gestion.listarElementos("audio");
                        }

                        case 'c' -> {
                            gestion.listarElementos("todos");
                        }

                        default -> {
                            System.out.println("Error al listar");
                        }
                    }

                }
                case 4 -> {
                    System.out.println("--- BUSCANDO ELEMENTOS ---");

                    System.out.println("""
                            a. Buscar por Autor
                            b. Buscar por Actor
                            c. Buscar por Director
                            """);
                    char letra = sc.next().toLowerCase().charAt(0);

                    switch (letra) {
                        case 'a' -> {
                            System.out.println("Introduce su nombre");
                            String nombre = sc.next();
                            gestion.buscarPorAutor(nombre);
                        }

                        case 'b' -> {
                            System.out.println("Introduce su nombre");
                            String nombre = sc.next();
                            gestion.buscarPorActor(nombre);
                        }

                        case 'c' -> {
                            System.out.println("Introduce su nombre");
                            String nombre = sc.next();
                            gestion.buscarPorDirector(nombre);
                        }

                        default -> {
                            System.out.println("Error al listar");
                        }
                    }
                }
                case 5 -> {
                    System.out.println("--- SALIENDO DEL PROGRAMA ---");
                }
                default -> {
                    System.out.println("Error");
                }
            }

        } while (opcion != 5);
    }
}
