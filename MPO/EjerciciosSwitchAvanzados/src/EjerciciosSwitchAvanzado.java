import java.sql.SQLOutput;
import java.util.Scanner;

public class EjerciciosSwitchAvanzado {
    Scanner sc = new Scanner(System.in);

    public void ejercicio1() {
        /*
        **Objetivo:**
        Crear un programa que convierta una calificación numérica (0-10)
        en su equivalente alfabético usando un switch.

         **Requisitos:**

         1. Declara una variable `double calificacion` con un valor entre 0 y 10.
         2. Usa un `switch` para convertir la calificación a una letra (A, B, C, D, F).
         3. Considera: 9-10 = A, 7-8.9 = B, 5-6.9 = C, 4-4.9 = D, 0-3.9 = F
         4. Muestra un mensaje apropiado para cada calificación.
         */

        System.out.println("Introduce tu nota (entre 0-10 y con ','");
        double calificacion = sc.nextDouble();

        while (calificacion < 0 || calificacion > 10) {
            System.out.println("Nota no válida, vuelve a introducirla");
            calificacion = sc.nextDouble();
        }

        int calEntero = (int) calificacion;
        switch (calEntero) {
            case 9, 10:
                System.out.println("Nota: A");
                break;
            case 7, 8:
                System.out.println("Nota: B");
                break;
            case 5, 6:
                System.out.println("Nota: C");
                break;
            case 4:
                System.out.println("Nota: D");
                break;
            case 0, 1, 2, 3:
                System.out.println("Nota: F");
                break;
            default:
                System.out.println("Nota no reconocida");
                break;
        }

        sc.close();
    }

    public void ejercicio2() {
        /*
        **Objetivo:**
        Crear un programa que convierta una cantidad en euros a otras monedas según la opción seleccionada.

        **Requisitos:**

        1. Crea un enum `Moneda` con: `DOLLAR`, `LIBRA`, `YEN`, `PESO`.
        2. Declara una variable `double euros` con una cantidad.
        3. Usa un `switch` con el enum para aplicar la tasa de conversión correspondiente.
        4. Muestra el resultado de la conversión.
         */

        enum Moneda {
            DOLLAR,
            LIBRA,
            YEN,
            PESO
        }

        System.out.println("Introduce una cantidad y a que lo quieres convertir");
        double euros = sc.nextDouble();


        switch (){

        }
    }
}
