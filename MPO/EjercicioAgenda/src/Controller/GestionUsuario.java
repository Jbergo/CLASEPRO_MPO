package Controller;

import Model.Contacto;

import java.util.ArrayList;

public class GestionUsuario {
    private ArrayList<Contacto> contactos;

    public GestionUsuario() {
        contactos = new ArrayList<>();
    }

    public String agregarPersona(String nombre, String apellido, String dni, int telefono, String email) {
        Contacto contacto = new Contacto(nombre, apellido, dni, email, telefono);
        if (!verificarContacto(email)) {
            contactos.add(contacto);
            return "Persona agregada correctamente";
        }
        return "Error al agregar la persona";
    }

    private boolean verificarContacto(String email) {
        for (Contacto contacto : contactos) {
            if (email.equals(contacto.getEmail())) {
                return true;
            }
        }
        return false;
    }

    public String buscarPersona(String dni) {
        for (Contacto contacto : contactos) {
            if (dni.equals(contacto.getDni())) {
                return contacto.toString();
            }
        }
        return "Persona no encontrada";
    }

    public String borrarPersona(String dni) {
        for (int i = 0; i < contactos.size(); i++) {
            if (dni.equals(contactos.get(i).getDni())) {
                contactos.remove(i);
                return "Persona eliminada correctamente";
            }
        }
        return "Persona no encontrada";
    }

    public ArrayList<Contacto> listarPersonas() {
        return contactos;
    }
}
