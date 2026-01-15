package Ejercicio4;

public class Producto {
    private String codigo, nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean hayStock() {
        if (getStock()>0){
            return true;
        }
        return false;
    }

    public boolean vender(int cantidad){
        if (stock>cantidad){
            setStock(stock-cantidad);
            return true;
        }
        return false;
    }

    public void reabastecer(int cantidad){
        setStock(stock+=cantidad);
    }

    public double calcularValorInventario() {
        return getStock()*getPrecio();
    }

    public void mostrarInfo() {
        System.out.println("Código: " + getCodigo() +
                ", Nombre: " + getNombre() +
                ", Precio: " + getPrecio() +
                ", Stock: " + getStock() +
                ", Valor Total: " + calcularValorInventario());
    }
}
