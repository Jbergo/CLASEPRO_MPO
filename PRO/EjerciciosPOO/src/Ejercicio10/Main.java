package Ejercicio10;

/*
Crea un sistema de biblioteca con las clases:
Libro (titulo, autor, ISBN, disponible), Usuario (nombre, numeroSocio) y Prestamo (libro, usuario, fechaPrestamo).
Implementa métodos para prestar un libro (si está disponible) y devolverlo.
Crea varios libros y usuarios, realiza algunos préstamos y devoluciones.
 */

import Ejercicio10.Controller.GestionBiblioteca;
import Ejercicio10.Model.Libro;
import Ejercicio10.Model.Usuario;

public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro("Don Quijote", "Miguel de Cervantes", 001, true);
        Usuario usuario = new Usuario("Angeles", 111);
        Usuario usuario2 = new Usuario("Fernando", 222);

        GestionBiblioteca gestion = new GestionBiblioteca();
        gestion.prestarLibro(libro, usuario);
        gestion.prestarLibro(libro, usuario2);
        gestion.devolverLibro(libro, usuario);
        gestion.prestarLibro(libro, usuario2);
    }
}
