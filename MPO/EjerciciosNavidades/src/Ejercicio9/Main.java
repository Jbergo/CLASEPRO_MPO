package Ejercicio9;

/*
**Objetivo:** Crear una clase `Tienda` que gestione un inventario de productos usando la clase `Producto` del ejercicio anterior.

**Requisitos:**

1. Usar la clase `Producto` del Ejercicio 4.
2. Crear una clase `Tienda` con atributos: `nombre` (String), `productos` (array de Producto), `numProductos` (int).
3. Crear constructor que inicialice el nombre y cree un array de productos con capacidad para 50 productos.
4. Crear método `boolean agregarProducto(Producto producto)` que añada un producto al array si hay espacio.
5. Crear método `Producto buscarProducto(String codigo)` que busque y devuelva un producto por su código (o `null` si no existe).
6. Crear método `void listarProductos()` que muestre todos los productos del inventario.
7. Crear método `double calcularValorTotalInventario()` que sume el valor de todos los productos.
8. Crear método `void listarProductosSinStock()` que muestre solo los productos sin stock.
9. En el `main`, crear una tienda, añadir varios productos y probar todos los métodos.
 */

import Ejercicio4.Producto;

public class Main {
    public static void main(String[] args) {

        Tienda tienda = new Tienda("Mi Tienda");

        Producto p1 = new Producto("P01", "Laptop", 800, 5);
        Producto p2 = new Producto("P02", "Ratón", 20, 0);
        Producto p3 = new Producto("P03", "Teclado", 35, 10);

        tienda.agregarProducto(p1);
        tienda.agregarProducto(p2);
        tienda.agregarProducto(p3);

        System.out.println("=== LISTA DE PRODUCTOS ===");
        tienda.listarProductos();

        System.out.println("\n=== BUSCAR PRODUCTO P02 ===");
        Producto buscado = tienda.buscarProducto("P02");
        System.out.println(buscado != null ? buscado : "No encontrado");

        System.out.println("\nValor total inventario: " + tienda.calcularValorTotalInventario());

        System.out.println("\n=== PRODUCTOS SIN STOCK ===");
        tienda.listarProductosSinStock();
    }
}
