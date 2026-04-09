package controller;

import model.Administrador;
import model.Trabajador;
import model.Usuario;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GestorUsers {
    private final List<Administrador> administradores;
    private final List<Trabajador> trabajadores;

    public GestorUsers() {
        this.administradores = new ArrayList<>();
        this.trabajadores = new ArrayList<>();

        administradores.add(new Administrador("admin", "admin", "admin", "admin", "admin"));
        trabajadores.add(new Trabajador("user", "user", "user", "user", "user"));
    }

    public Usuario iniciarSesion(String correo, String password) {
        for (Administrador item : administradores) {
            if (item.getCorreo().equals(correo) && item.getPassword().equals(password)) {
                return item;
            }
        }
        for (Trabajador item : trabajadores) {
            if (item.getCorreo().equals(correo) && item.getPassword().equals(password)) {
                return item;
            }
        }
        return null;
    }

    public boolean darAltaTrabajador(String nombre, String apellido, String dni, String correo, String password) {
        for (Trabajador item : trabajadores) {
            if (item.getDni().equalsIgnoreCase(dni.trim()) || item.getCorreo().equalsIgnoreCase(correo.trim())) {
                return false;
            }
        }

        trabajadores.add(new Trabajador(nombre, apellido, dni, correo, password));
        return true;
    }

    public boolean darBajaTrabajador(String dni) {
        for (int i = 0; i < trabajadores.size(); i++) {
            if (trabajadores.get(i).getDni().equalsIgnoreCase(dni.trim())) {
                trabajadores.remove(i);
                return true;
            }
        }
        return false;
    }

    public Trabajador verDatosTrabajador(String dni) {
        for (Trabajador item : trabajadores) {
            if (item.getDni().equalsIgnoreCase(dni.trim())) {
                return item;
            }
        }
        return null;
    }

    public List<Trabajador> verTrabajadores() {
        return new ArrayList<>(trabajadores);

    }

    public boolean cambiarPassword(String dni, String nuevaPass) {
        for (Trabajador trabajador : trabajadores) {
            if (trabajador.getDni().equalsIgnoreCase(dni.trim())) {
                trabajador.setPassword(nuevaPass.trim());
                return true;
            }
        }
        return false;
    }

    public boolean realizarFichaje(Trabajador trabajador) {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String fechaHora = ahora.format(formato);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("horas.txt", true))) {
            bw.write(trabajador.getCorreo() + " - " + fechaHora);
            bw.newLine();
            return true;
        } catch (IOException e) {
            System.out.println("Error al registrar el fichaje");
            return false;
        }
    }

    public void verRegistroJornada() {
        try (BufferedReader br = new BufferedReader(new FileReader("horas.txt"))) {
            String linea = br.readLine();
            if (linea == null) {
                System.out.println("No hay registros de jornada");
            }
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo horas.txt");
        }
    }
}
