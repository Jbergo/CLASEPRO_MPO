package Ejercicio1y2;

/*
Crea una clase llamada Persona con dos atributos: nombre y edad.
Define un constructor que inicialice estos atributos.
En el método main, crea un objeto de tipo Persona y muestra sus datos.

Amplía la clase Persona del ejercicio anterior añadiendo métodos
getter y setter para los atributos nombre y edad.
Crea un objeto, modifica sus valores usando los setters y muestra los datos usando los getters.
 */

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        Persona persona = new Persona("Jose", 49);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        //Ejercicio 2
        persona.setEdad(55);
        persona.setNombre("Miguel");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

    }
}
