package Ejercicio1;

import java.util.HashMap;

public class AgendaContactos {
    private HashMap<String, String> contactos;

    public AgendaContactos() {
        contactos = new HashMap<String, String>();
    }

    public void agregarContacto(String nombre, String telefono) {
        contactos.put(nombre, telefono);
    }

    public String buscarContacto(String nombre) {
        if (contactos.containsKey(nombre)) {
            for (String contacto : contactos.keySet()) {
                return "Teléfono: " + contactos.get(contacto);
            }
        }
        return "No se ha encontrado el contacto";
    }

    public boolean eliminarContacto(String nombre) {
        if (contactos.containsKey(nombre)) {
            contactos.remove(nombre);
            return true;
        }
        return false;
    }

    public void listarContactos(){
        for (String contacto : contactos.keySet()) {
            System.out.println("Nombre: " + contacto + ", Teléfono: " + contactos.get(contacto));
        }
    }

    public int contarContactos(){
        return contactos.size();
    }

    public boolean existeContacto(String nombre){
        return contactos.containsKey(nombre);
    }

    public HashMap<String, String> getContactos() {
        return contactos;
    }

    public void setContactos(HashMap<String, String> contactos) {
        this.contactos = contactos;
    }
}
