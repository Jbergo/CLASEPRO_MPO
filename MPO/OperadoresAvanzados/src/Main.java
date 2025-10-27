//package
//import nombrePaquete.NombreClase
//import controller.GestorDocumentos
//import controller.GestorUsuarios
//import controller.*

import controller.GestorUsuarios;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando la clase");
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        gestorUsuarios.validarUsuario("jorge", 28, "jorge@gmail.com");
    }
}
