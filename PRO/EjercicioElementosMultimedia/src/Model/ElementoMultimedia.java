package Model;

public class ElementoMultimedia {
    private int id, tamanio;
    private String titulo, autor, formato;

    public ElementoMultimedia() {
    }

    public ElementoMultimedia(int id, int tamanio, String titulo, String autor, String formato) {
        this.id = id;
        this.tamanio = tamanio;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
    }

    public void mostrarInfo() {
        System.out.println("titulo = " + titulo);
        System.out.println("autor = " + autor);
        System.out.println("id = " + id);
        System.out.println("tamanio = " + tamanio);
        System.out.println("formato = " + formato);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
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

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
