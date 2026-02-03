package Model;

public class Libro extends ElementoMultimedia {
    private String isbn;
    private int nPags;

    public Libro(int id, int tamanio, String titulo, String autor, String formato, String isbn, int nPags) {
        super(id, tamanio, titulo, autor, formato);
        this.isbn = isbn;
        this.nPags = nPags;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("isbn = " + isbn);
        System.out.println("nPags = " + nPags);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getnPags() {
        return nPags;
    }

    public void setnPags(int nPags) {
        this.nPags = nPags;
    }
}
