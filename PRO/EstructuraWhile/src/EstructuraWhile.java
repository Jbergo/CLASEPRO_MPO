import java.util.Scanner;

public class EstructuraWhile {

    Scanner sc = new Scanner(System.in);

    public void ejemploWhile() {
        int intentos = 3;
        int pin = 1234;
        int pinIntroducido = 0;

        while (intentos>=0&&pinIntroducido!=pin){
            System.out.println("Introduce tu pin");
            pinIntroducido = sc.nextInt();
            intentos--;
        }

        if (pinIntroducido==pin){
            System.out.println("Bienvenido!");
        } else {
            System.out.println("Sistema bloqueado");
        }

    }

    public void ejemploDoWhile(){

        int opcion;
        do{
            System.out.println("Opciones de menú:");
            System.out.println("1-sumar");
            System.out.println("2-restar");
            System.out.println("3-salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("SUMANDO");
                }
                case 2 -> {
                    System.out.println("RESTANDI");
                }
                case 3 -> {
                    System.out.println("SALIENDO");
                }
                default -> {
                    System.out.println("CASO NO CONTEMPLADO");
                }
            }
        }while (opcion!=3);
    }
}
