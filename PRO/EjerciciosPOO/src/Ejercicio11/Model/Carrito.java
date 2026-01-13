package Ejercicio11.Model;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;
    private int cantidades;

    public Carrito(ArrayList<Producto> productos, int cantidades) {
        this.productos = productos;
        this.cantidades = cantidades;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getCantidades() {
        return cantidades;
    }

    public void setCantidades(int cantidades) {
        this.cantidades = cantidades;
    }
}
