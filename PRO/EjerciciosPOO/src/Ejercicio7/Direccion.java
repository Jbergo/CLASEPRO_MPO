package Ejercicio7;

public class Direccion {
    private String calle, ciudad;
    private int codPostal;

    public Direccion(String calle, String ciudad, int codPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codPostal = codPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

}
