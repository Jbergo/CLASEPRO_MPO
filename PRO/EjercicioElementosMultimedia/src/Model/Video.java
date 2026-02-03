package Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Video extends ElementoMultimedia {
    private String director;
    private ArrayList<String> actores;

    public Video(int id, int tamanio, String titulo, String autor, String formato, String director, String[] actores) {
        super(id, tamanio, titulo, autor, formato);
        this.director = director;
        this.actores = new ArrayList<>();
        this.actores.addAll(Arrays.asList(actores));
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("director = " + director);
        System.out.println("actores = " + actores);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }
}
