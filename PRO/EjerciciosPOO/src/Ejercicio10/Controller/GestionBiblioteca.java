package Ejercicio10.Controller;

import Ejercicio10.Model.Libro;
import Ejercicio10.Model.Prestamo;
import Ejercicio10.Model.Usuario;

public class GestionBiblioteca {

    public void prestarLibro(Libro libro, Usuario usuario){

        System.out.println("Usuario " + usuario.getNombre() + "(Socio " + usuario.getNumSocio() + ") intenta tomar prestado " + libro.getTitulo());

        if(libro.isDisponible()) {
            Prestamo prestamo = new Prestamo(libro, usuario);
            System.out.println("Préstamo realizado correctamente el " + prestamo.getFechaPrestamo());
            libro.setDisponible(false);

        } else {
            System.out.println("El libro no está disponible");
        }
    }

    public void devolverLibro(Libro libro, Usuario usuario) {
        System.out.println("Usuario " + usuario.getNombre() + "(Socio " + usuario.getNumSocio() + ") devuelve " + libro.getTitulo());
        libro.setDisponible(true);
        System.out.println("Libro devuelto correctamente");
    }
}
