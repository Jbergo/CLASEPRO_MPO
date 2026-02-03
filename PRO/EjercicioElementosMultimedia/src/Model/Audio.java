package Model;

public class Audio extends ElementoMultimedia {
    private int duracion;
    private String soporte;

    public Audio(int id, int tamanio, String titulo, String autor, String formato, int duracion, String soporte) {
        super(id, tamanio, titulo, autor, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("duracion = " + duracion);
        System.out.println("soporte = " + soporte);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
