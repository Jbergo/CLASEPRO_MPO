package Ejercicio10;

public class Libro {
    private String titulo, autor;
    private int numPaginas;
    private double precio;

    // NUEVO
    private String isbn;
    private boolean prestado;

    public Libro(String titulo, String autor, int numPaginas, double precio, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.precio = precio;

        this.isbn = isbn;
        this.prestado = false; // por defecto disponible
    }

    // Getters/Setters existentes
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // NUEVOS getters/setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isPrestado() {
        return prestado;
    }

    // NUEVOS métodos pedidos
    public boolean prestar() {
        if (prestado) return false;
        prestado = true;
        return true;
    }

    public boolean devolver() {
        if (!prestado) return false;
        prestado = false;
        return true;
    }

    public String mostrarInfo() {
        return "Titulo: " + titulo +
                ", Autor: " + autor +
                ", Páginas: " + numPaginas +
                ", Precio: " + precio + " euros" +
                ", ISBN: " + isbn +
                ", Prestado: " + prestado;
    }

    public boolean esLibroLargo() {
        return numPaginas > 300;
    }

    public void aplicarDescuento(double porcentaje) {
        precio -= (precio * porcentaje) / 100;
    }

    @Override
    public String toString() {
        return mostrarInfo();
    }
}