package Ejercicio4;

/*
Crea una clase Libro con atributos titulo, autor y paginas.
Implementa tres constructores: uno sin parámetros (valores por defecto),
uno con título y autor, y otro con los tres parámetros.
Crea tres objetos usando cada constructor y muestra sus datos.
 */

public class Main {

    public static void main(String[] args) {

        Libro libro = new Libro();
        System.out.println("Libro");
        System.out.println(libro.getAutor());
        System.out.println(libro.getTitulo());
        System.out.println(libro.getPaginas());

        Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        System.out.println("Libro 1");
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getPaginas());

        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1566);
        System.out.println("Libro 2");
        System.out.println(libro2.getAutor());
        System.out.println(libro2.getTitulo());
        System.out.println(libro2.getPaginas());

    }

}
