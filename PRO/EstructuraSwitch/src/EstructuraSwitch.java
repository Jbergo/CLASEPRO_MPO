import java.util.Scanner;

public class EstructuraSwitch {

    public void estructuraTradicional () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota");
        int nota = scanner.nextInt();

        switch (nota) {
            case 1:
                System.out.println("La nota vale 1, has suspendido");
                break;
            case 5:
                System.out.println("Has aprobado");
                break;
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Esta nota no es analizable");
        }
    }

    public void estructuraLambda () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = scanner.next();

        switch (nombre.toLowerCase()) {
           case "borja" -> {
               System.out.println("Nombre introducido Borja");
               String apellido = "asd";
           }
            case "maria" -> {
                System.out.println("Nombre introducido Maria");
               String apellido = "asd";
            }
            case "juan" -> {
                System.out.println("Nombre introducido Juan");
               String apellido = "asd";
            }
            case "marcos" -> {
                System.out.println("Nombre introducido Marcos");
               String apellido = "asd";
            }
            default -> {
                System.out.println("Nombre no contemplado");
                String apellido = "asd";
            }
        }

    }

    public void estructuraChar() {
        char letra = 'a';
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("es vocal");
                break;
            default:
                System.out.println("es consonante");
        }
    }

    public void menuOpciones () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la opción a realizar");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Dividir");
        System.out.println("4 - Multiplicar");
        System.out.println("5 - Salir");

        int opcion = scanner.nextInt();
        int operando1 = 0, operando2 = 0;

        if (opcion>=1 && opcion<=4){
            System.out.println("Introduce el operando 1");
            operando1 = scanner.nextInt();

            System.out.println("Introduce el operando 2");
            operando2 = scanner.nextInt();
        }

        double resultado = 0;
        switch (opcion) {
            case 1 -> {
                System.out.println("Sumar");
                resultado = operando1+operando2;
            }
            case 2 -> {
                System.out.println("Restar");
                resultado = operando1-operando2;
            }
            case 3 -> {
                System.out.println("Dividir");
                if (operando2!=0) { //sino da infinito
                    resultado = (double) operando1 / operando2;
                }
            }
            case 4 -> {
                System.out.println("Multiplicar");
                resultado = operando1*operando2;
            }
            case 5 -> {
                System.out.println("Saliendo");
            }
            default -> {
                System.out.println("Opción no contemplada");
            }
        }

        System.out.println("El resultado obtenido es: " + resultado);
    }
}
