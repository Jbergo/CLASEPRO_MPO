package model;

public class Producto {
    private String nombre, categoria, codigo;
    private double precio;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public Producto(String nombre, String categoria, String codigo, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.codigo = codigo;
        this.precio = precio;
    }

    public void mostrarDatos() {
        System.out.println("nombre = " + nombre);
        System.out.println("categoria = " + categoria);
        System.out.println("codigo = " + codigo);
        System.out.println("precio = " + precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
