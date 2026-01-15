package Ejercicio1;

/*
Crea una clase Animal con atributos nombre y edad, y un método hacerSonido().
Luego crea dos clases hijas: Perro y Gato que hereden de Animal.
Sobrescribe el método hacerSonido() en cada clase hija para que muestre el sonido correspondiente.
Crea objetos de cada tipo y prueba los métodos.
 */

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Rex", 5);
        System.out.println(perro.hacerSonido());

        Gato gato = new Gato("Mishi", 3);
        System.out.println(gato.hacerSonido());
    }
}
