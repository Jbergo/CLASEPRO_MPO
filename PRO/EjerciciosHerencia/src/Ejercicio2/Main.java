package Ejercicio2;

/*
Crea una clase Vehiculo con atributos marca y modelo.
Crea una clase Coche que herede de Vehiculo y añada el atributo numeroPuertas.
Implementa constructores en ambas clases usando super().
Crea varios objetos y muestra su información.
 */

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla");
        System.out.println("Vehículo: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        Coche coche1 = new Coche("Seat", "Ibiza", 3);
        System.out.println("Coche: " + coche1.getMarca() + " " + coche1.getModelo() + ", " + coche1.getNumPuertas() + " puertas");
        Coche coche2 = new Coche("Ford", "Focus", 5);
        System.out.println("Coche: " + coche2.getMarca() + " " + coche2.getModelo() + ", " + coche2.getNumPuertas() + " puertas");
    }
}
