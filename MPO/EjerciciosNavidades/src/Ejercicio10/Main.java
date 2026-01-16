package Ejercicio10;

/*
**Objetivo:** Crear un sistema de biblioteca que gestione libros y préstamos usando la clase `Libro` y una nueva clase `Biblioteca`.

**Requisitos:**

1. Modificar la clase `Libro` del Ejercicio 1 para añadir: `isbn` (String) y `prestado` (boolean).
2. Añadir a `Libro` los métodos:
    - boolean `prestar()` que marque el libro como prestado si no lo está ya
    - boolean `devolver()` que marque el libro como no prestado
3. Crear una clase `Biblioteca` con atributos: `nombre` (String), `libros` (array de Libro), `numLibros` (int).
4. Crear métodos en `Biblioteca`:
    - `boolean agregarLibro(Libro libro)`
    - `Libro buscarLibroPorIsbn(String isbn)`
    - `boolean prestarLibro(String isbn)`
    - `boolean devolverLibro(String isbn)`
    - `void listarLibrosDisponibles()`
    - `void listarLibrosPrestados()`
5. En el `main`, crear una biblioteca, añadir libros, realizar préstamos y devoluciones, y listar libros por estado.
 */

import Ejercicio10.Libro;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblio = new Biblioteca("Biblioteca Central");

        Libro l1 = new Libro("1984", "George Orwell", 328, 12.5, "ISBN001");
        Libro l2 = new Libro("El Principito", "Saint-Exupéry", 96, 8.0, "ISBN002");
        Libro l3 = new Libro("Clean Code", "Robert C. Martin", 464, 30.0, "ISBN003");

        biblio.agregarLibro(l1);
        biblio.agregarLibro(l2);
        biblio.agregarLibro(l3);

        System.out.println("=== DISPONIBLES ===");
        biblio.listarLibrosDisponibles();

        System.out.println("\nPrestando ISBN002...");
        System.out.println(biblio.prestarLibro("ISBN002")); // true

        System.out.println("\n=== PRESTADOS ===");
        biblio.listarLibrosPrestados();

        System.out.println("\nDevolviendo ISBN002...");
        System.out.println(biblio.devolverLibro("ISBN002")); // true

        System.out.println("\n=== DISPONIBLES ===");
        biblio.listarLibrosDisponibles();
    }
}
