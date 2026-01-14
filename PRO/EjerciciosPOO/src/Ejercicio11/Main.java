package Ejercicio11;

/*
Crea un sistema de tienda online con las clases:
Producto (codigo, nombre, precio, stock),
Cliente (nombre, email, carrito) y
Carrito (lista de productos, cantidades).
Implementa métodos para añadir productos al carrito,
eliminarlos, calcular el total y finalizar la compra (actualizando el stock).
Simula una compra completa.
 */

import Ejercicio11.Controller.GestionTienda;
import Ejercicio11.Model.Carrito;
import Ejercicio11.Model.Cliente;
import Ejercicio11.Model.Producto;

public class Main {
    public static void main(String[] args) {
        // 1) Crear productos (catálogo)
        Producto p1 = new Producto("A1", "Teclado", 50, 10);
        Producto p2 = new Producto("B2", "Raton", 20, 5);
        Producto p3 = new Producto("C3", "Auriculares", 35, 3);

        // 2) Crear carrito y cliente
        Carrito carrito = new Carrito(); // si tu constructor necesita listas, ajusta aquí
        Cliente cliente = new Cliente("Mario", "mario@gmail.com", carrito);

        // 3) Crear gestor (donde está la lógica)
        GestionTienda gestion = new GestionTienda();

        // Mostrar catálogo inicial
        System.out.println("=== CATALOGO INICIAL ===");
        System.out.println(p1.getNombre());
        System.out.println(p2.getNombre());
        System.out.println(p3.getNombre());

        // 4) Simular compra: añadir productos al carrito
        System.out.println("\n=== AÑADIENDO AL CARRITO ===");
        gestion.nuevoProducto(p1, carrito); // Teclado x1
        gestion.nuevoProducto(p1, carrito); // Teclado x2
        gestion.nuevoProducto(p2, carrito); // Ratón x1
        gestion.nuevoProducto(p3, carrito); // Auriculares x1

        // 5) Calcular total
        double total = gestion.calcularTotal(carrito);
        System.out.println("\nTotal actual del carrito: " + total + "€");

        // 6) Eliminar un producto del carrito
        System.out.println("\n=== ELIMINANDO PRODUCTO (Ratón) ===");
        System.out.println(gestion.eliminarProducto(carrito, p2));

        // Recalcular total tras eliminar
        total = gestion.calcularTotal(carrito);
        System.out.println("Total tras eliminar: " + total + "€");

        // 7) Finalizar compra (actualizar stock y vaciar carrito)
        System.out.println("\n=== FINALIZANDO COMPRA ===");
        gestion.actualizarCarrito(carrito);
        System.out.println("Compra finalizada. Carrito vaciado.");

        // 8) Mostrar catálogo final (stock actualizado)
        System.out.println("\n=== CATALOGO FINAL (STOCK ACTUALIZADO) ===");
        System.out.println(p1.getNombre());
        System.out.println(p2.getNombre());
        System.out.println(p3.getNombre());

        // 9) Comprobar que el carrito está vacío
        System.out.println("\n=== ESTADO DEL CARRITO ===");
        System.out.println("Productos en carrito: " + carrito.getProductos().size());
        System.out.println("Cantidades en carrito: " + carrito.getCantidades().size());
    }
}
