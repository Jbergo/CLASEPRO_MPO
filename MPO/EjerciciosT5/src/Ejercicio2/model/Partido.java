package Ejercicio2.model;

public class Partido {
    private Equipo eLocal, eVisitante;
    private int gLocal, gContra;
    private boolean jugado;

    public Partido() {
    }

    public Partido(Equipo eLocal, Equipo eVisitante, int gLocal, int gContra) {
        this.eLocal = eLocal;
        this.eVisitante = eVisitante;
        this.gLocal = gLocal;
        this.gContra = gContra;
        this.jugado = true;
        eLocal.setgFavor(eLocal.getgFavor()+gLocal);
        eLocal.setgContra(eLocal.getgContra()+gContra);
        eVisitante.setgFavor(eVisitante.getgFavor()+gLocal);
        eVisitante.setgContra(eVisitante.getgContra()-gContra);
    }

    public void mostrarDatos() {
        System.out.printf("%s:%d vs %d:%s%n", eLocal.getNombre(),gLocal, gContra, eVisitante.getNombre());
    }

    public Equipo geteLocal() {
        return eLocal;
    }

    public void seteLocal(Equipo eLocal) {
        this.eLocal = eLocal;
    }

    public Equipo geteVisitante() {
        return eVisitante;
    }

    public void seteVisitante(Equipo eVisitante) {
        this.eVisitante = eVisitante;
    }

    public int getgLocal() {
        return gLocal;
    }

    public void setgLocal(int gLocal) {
        this.gLocal = gLocal;
    }

    public int getgContra() {
        return gContra;
    }

    public void setgContra(int gContra) {
        this.gContra = gContra;
    }
}
