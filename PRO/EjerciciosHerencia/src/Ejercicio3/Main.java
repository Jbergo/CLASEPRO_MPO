package Ejercicio3;

/*
Crea una clase Persona con atributos nombre y edad, y un método presentarse().
Crea una clase Estudiante que herede de Persona y añada el atributo curso.
Añade un método estudiar() en la clase Estudiante.
Crea objetos y prueba todos los métodos.
 */

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Leo", 22, "1º DAW");
        estudiante.presentarse();
        estudiante.estudiar();
    }
}
