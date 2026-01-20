package Ejercicio2;

import java.util.HashMap;

public class SistemaInventario {
    private HashMap<String, Integer> productos;

    public SistemaInventario() {
        productos = new HashMap<String, Integer>();
    }

    public void agregarProducto(String codigo, int cantidad) {
        if (!productos.containsKey(codigo)) {
            productos.put(codigo, cantidad);
        } else {
            productos.put(codigo, productos.get(codigo) + cantidad);
        }
    }

    public boolean venderProducto(String codigo, int cantidad) {
        if (productos.get(codigo) <= cantidad) {
            productos.put(codigo, productos.get(codigo) - cantidad);
            return true;
        }
        return false;
    }

    public Integer consultarStock(String codigo) {
        return productos.get(codigo);
    }

    public void listarInventario() {
        for (String producto : productos.keySet()) {
            System.out.println(producto + " --> " + productos.get(producto));
        }
    }

    public void listarProductosBajoStock(int minimo) {
        for (String producto : productos.keySet()) {
            if (productos.get(producto) >= minimo) {
                System.out.println(producto + " --> " + productos.get(producto));
            }
        }
    }

    public int calcularStockTotal() {
        int total = 0;
        for (Integer cantidad : productos.values()) {
            total += cantidad;
        }
        return total;
    }

    public String productoConMasStock() {
        if (!productos.isEmpty()) {
            String mayorClave = "";
            Integer mayorValor = 0;
            for (String producto : productos.keySet()) {
                if (productos.get(producto) > mayorValor) {
                    mayorClave = producto;
                    mayorValor = productos.get(producto);
                }
            }
            return "Nombre: " + mayorClave + ", Cantidad: " + mayorValor;
        }
        return "Inventario vacío";
    }

    public HashMap<String, Integer> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<String, Integer> productos) {
        this.productos = productos;
    }
}
