package Ejercicio9;

import Ejercicio4.Producto;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private ArrayList<Producto> productos;

    public Tienda(String nombre) {
        this.nombre = nombre;
        productos = new ArrayList<>(50);
    }

    public boolean agregarProducto(Producto producto){
        if (productos.size()<50){
            productos.add(producto);
            return true;
        }
        return false;
    }

    public Producto buscarProducto(String codigo){
        for (Producto producto : productos) {
            if (codigo.equals(producto.getCodigo())){
                return producto;
            }
        }
        return null;
    }

    public void listarProductos(){
        for (Producto item : productos) {
            System.out.println(item.getNombre());
        }
    }

    public double calcularValorTotalInventario(){
        double total = 0;
        for (Producto item : productos) {
            total+=(item.getPrecio()* item.getStock());
        }
        return total;
    }

    public void listarProductosSinStock(){
        for (Producto item : productos) {
            if (item.getStock()==0){
                System.out.println(item.getNombre());
            }
        }

    }
}
