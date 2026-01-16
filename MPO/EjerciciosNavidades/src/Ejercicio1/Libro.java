package Ejercicio1;

public class Libro {
    private String titulo, autor;
    private int numPaginas;
    private double precio;

    public Libro(String titulo, String autor, int numPaginas, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.precio = precio;
    }

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

    public String mostrarInfo() {
        return "Titulo: " + titulo +
                ", Autor:" + autor +
                ", Páginas: " + numPaginas +
                ", Precio: " + precio + " euros";
    }

    public boolean esLibroLargo() {
        if (numPaginas > 300) {
            return true;
        }
        return false;
    }

    public void aplicarDescuento(double porcentaje) {
        precio -= ((precio*porcentaje)/100);
    }
}