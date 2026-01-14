package Ejercicio11.Model;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;
    private ArrayList<Integer> cantidades;

    public Carrito() {
        productos = new ArrayList<Producto>();
        cantidades = new ArrayList<Integer>();
    }

    public Carrito(ArrayList<Producto> productos, ArrayList<Integer> cantidades) {
        this.productos = productos;
        this.cantidades = cantidades;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Integer> getCantidades() {
        return cantidades;
    }

    public void setCantidades(ArrayList<Integer> cantidades) {
        this.cantidades = cantidades;
    }
}
