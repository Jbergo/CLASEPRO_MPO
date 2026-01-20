package Ejercicio2;

/*
**Objetivo:** Crear un sistema de inventario que gestione productos usando un HashMap donde la clave sea el código del producto y el valor sea la cantidad en stock.

**Requisitos:**

1. Crear un `HashMap&lt;String, Integer&gt;` para almacenar productos (código como clave, cantidad como valor).
2. Crear método `void agregarProducto(String codigo, int cantidad)` que añada un producto o incremente su cantidad si ya existe.
3. Crear método `boolean venderProducto(String codigo, int cantidad)` que reduzca la cantidad si hay suficiente stock.
4. Crear método `Integer consultarStock(String codigo)` que devuelva la cantidad disponible o `null` si no existe.
5. Crear método `void listarInventario()` que muestre todos los productos y sus cantidades.
6. Crear método `void listarProductosBajoStock(int minimo)` que muestre productos con stock menor al mínimo especificado.
7. Crear método `int calcularStockTotal()` que sume todas las cantidades del inventario.
8. Crear método `String productoConMasStock()` que devuelva el código del producto con mayor cantidad.
9. En el `main`, crear un inventario, realizar operaciones de entrada, venta y consultas.
 */

public class Main {
    public static void main(String[] args) {
        SistemaInventario inventario = new SistemaInventario();
        inventario.agregarProducto("PROD01", 50);
        inventario.agregarProducto("PROD02", 50);
        inventario.agregarProducto("PROD03", 50);
        inventario.listarInventario();
        System.out.println(inventario.venderProducto("PROD01", 25));
        System.out.println(inventario.calcularStockTotal());
        System.out.println(inventario.consultarStock("PROD02"));
        System.out.println(inventario.productoConMasStock());
        inventario.listarProductosBajoStock(40);
    }
}
