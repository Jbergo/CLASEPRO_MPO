package Ejercicio7;

/*
Crea una clase Producto con atributos nombre, precio y cantidad.
Sobrescribe el método toString() para mostrar la información del producto de forma legible.
Crea varios productos y muéstralos usando System.out.println().

Crea una clase Direccion con atributos calle, ciudad y codigoPostal.
Luego crea una clase Cliente que tenga como atributos nombre, email y un objeto Direccion.
Implementa un método para mostrar todos los datos del cliente incluyendo su dirección.
 */

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Manzana", 45.36,99);
        System.out.println(producto.toString());

        Direccion direccion =  new Direccion("Santiago de Compostela", "España", 28001);
        Cliente cliente = new Cliente("Luis", "luis@correo.es", direccion);
        cliente.mostrarInfo();
    }
}
