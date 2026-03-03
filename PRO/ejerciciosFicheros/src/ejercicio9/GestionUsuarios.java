package ejercicio9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestionUsuarios {
    private final List<Usuario> usuarios;

    public GestionUsuarios() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(String nombre, String apellido, String dni) {
        usuarios.add(new Usuario(nombre, apellido, dni));
    }

    public void listarUsuarios() {
        usuarios.forEach(usuario -> System.out.println(usuario.toString()));
    }

    public void exportarUsuarios() {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("src/ejercicio9/usuarios.txt"));

            for (Usuario item : usuarios) {
                bw.write(item.toString());
                bw.newLine();
            }


        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
        } finally {
            try {
                bw.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error cerrando el buffer");
            }
        }

    }
}
