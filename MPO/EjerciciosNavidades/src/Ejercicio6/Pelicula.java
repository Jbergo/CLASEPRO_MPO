package Ejercicio6;

import java.util.IllegalFormatCodePointException;

public class Pelicula {
    private String titulo, director;
    private int duracion, anio;
    private double calificacion;

    public Pelicula(String titulo, String director, int duracion, int anio, double calificacion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.anio = anio;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion <= 10 && calificacion >= 0) {
            this.calificacion = calificacion;
        }
        System.out.println("Calificación errónea");
    }

    public String obtenerDuracionFormateada() {
        int horas = duracion / 60;
        int min = duracion % 60;
        return horas + " horas y " + min + " minutos";
    }

    public boolean esClasica() {
        if (anio > 25) {
            return true;
        }
        return false;
    }

    public boolean esRecomendable() {
        if (calificacion >= 7) {
            return true;
        }
        return false;
    }

    public void mostrarInfo() {
        System.out.println("titulo = " + titulo);
        System.out.println("director = " + director);
        System.out.println("duracion = " + duracion);
        System.out.println("la pelicula dura = " + obtenerDuracionFormateada());
        System.out.println("anio = " + anio);
        System.out.println("es clasica = " + esClasica());
        System.out.println("calificacion = " + calificacion);
        System.out.println("es recomendable = " + esRecomendable());
    }
}
