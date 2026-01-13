package Ejercicio7;

public class Cliente {
    private String nombre, email;
    private Direccion direccion;

    public Cliente(String nombre, String email, Direccion direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Direccion: " + direccion.getCalle() + ", " + direccion.getCiudad() + ", " + direccion.getCodPostal());
    }
}
