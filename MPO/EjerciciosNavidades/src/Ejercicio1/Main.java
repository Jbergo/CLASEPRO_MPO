package Ejercicio1;

/*
**Objetivo:** Crear una clase `Libro` con atributos básicos y métodos simples.

**Requisitos:**

1. Crear una clase `Libro` con los atributos: `titulo` (String), `autor` (String), `numPaginas` (int), `precio` (double).
2. Crear un constructor que inicialice todos los atributos.
3. Crear getters y setters para todos los atributos.
4. Crear un método `mostrarInfo()` que imprima toda la información del libro con formato: "Título: XXX, Autor: XXX, Páginas: XXX, Precio: XXX€"
5. Crear un método `boolean esLibroLargo()` que devuelva `true` si el libro tiene más de 300 páginas.
6. Crear un método `void aplicarDescuento(double porcentaje)` que reduzca el precio según el porcentaje dado.
7. En el `main`, crear varios objetos `Libro` y probar todos los métodos.
 */

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Quijote", "Cervantes", 863, 25.5);

        System.out.println(libro1.mostrarInfo());
        System.out.println("Libro largo: " + libro1.esLibroLargo());
        libro1.aplicarDescuento(10);
        System.out.println(libro1.getPrecio());
    }
}
