package Ejercicio1.controller;

import Ejercicio1.model.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class GestionNotas {
    private HashMap<String, Alumno> alumnos;

    public GestionNotas() {
        alumnos = new HashMap<>();
    }

    public boolean introducirAlumno(String dni, String nombre, String apellido, double nota) {
        if (alumnos.containsKey(dni)) {
            return false;
        } else {
            alumnos.put(dni, new Alumno(dni, nombre, apellido, nota));
            return true;
        }
    }

    public double buscarAlumnoNota(String dni) {
        for (String dniAlumno : alumnos.keySet()) {
            if (dniAlumno.equals(dni)) {
                return alumnos.get(dniAlumno).getNota();
            }
        }
        return 0;
    }

    public List<Alumno> verMejoresExpedientes(int limite) {
        List<Alumno> alumnosOrdenados = new ArrayList<>(alumnos.values());
        alumnosOrdenados.sort(Comparator.comparingDouble(Alumno::getNota).reversed());

        List<Alumno> mejoresExpedientes = new ArrayList<>();
        for (int i = 0; i < alumnosOrdenados.size() && i < limite; i++) {
            mejoresExpedientes.add(alumnosOrdenados.get(i));
        }
        return mejoresExpedientes;
    }

    public List<Alumno> verExpedientesSuperiores(double nota) {
        List<Alumno> notas = new ArrayList<>();
        for (Alumno alumno : alumnos.values()) {
            if (alumno.getNota() >= nota) {
                notas.add(alumno);
            }
        }
        return notas;
    }

    public void vaciarLista() {
        alumnos.clear();
    }

    public HashMap<String, Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(HashMap<String, Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
