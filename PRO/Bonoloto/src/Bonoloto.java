import java.util.Arrays;
import java.util.Scanner;

public class Bonoloto {
    Scanner sc = new Scanner(System.in);

    //Array de números
    private int[] cadenaSystem = new int[5];
    private int[] cadenaUser = new int[5];

    public void sorteoNum() {

        //Guardar números aleatorios en cadenaSystem
        for (int i = 0; i < cadenaSystem.length; i++) {
            cadenaSystem[i] = (int) ((Math.random() * 20) + 1);
        }

        //Pedir números al usuario
        int contador = 1, numUser = 0;
        for (int i = 0; i < cadenaUser.length; i++) {
            System.out.println("Introduce el " + contador + "º número a jugar (entre 1-20)");
            numUser = sc.nextInt();

            while (numUser < 1 || numUser > 20) {
                System.out.println("Número no válido");
                numUser = sc.nextInt();
            }

            cadenaUser[i] = numUser;
            contador++;

        }
    }

    public void comprobarNum() {

        int aciertos = 0;

        //Comprobar número aciertos
        for (int a : cadenaSystem) {
            for (int b : cadenaUser) {
                if (a == b) {
                    aciertos++;
                    break;
                }
            }
        }

        //Validar premio
        switch (aciertos) {
            case 5:
                System.out.println("Has ganado 1 millón de euros");
                break;
            case 4:
                System.out.println("Has ganado 10 mil euros");
                break;
            case 3:
                System.out.println("Has ganado mil euros");
                break;
            case 2,1:
                System.out.println("Has ganado 10 euros");
                break;
            case 0:
                System.out.println("Prueba suerte la próxima vez");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
