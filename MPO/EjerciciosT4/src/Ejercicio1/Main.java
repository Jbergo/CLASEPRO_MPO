package Ejercicio1;

/*
**Ejercicio 1 - Lambda Básica: Operación Simple**

Crea una función lambda que reciba un número entero y devuelva su cuadrado. Pruébala con los números del 1 al 5.
 */

public class Main {
    public static void main(String[] args) {
        Operacion cuadrado = n -> n * n;
        for (int i = 0; i <= 5; i++) {
            System.out.println(cuadrado.aplicar(i));
        }
    }
}
