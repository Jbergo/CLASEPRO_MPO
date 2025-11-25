import java.util.Scanner;

public class EjerciciosSwitchFor {
    Scanner sc = new Scanner(System.in);

    public void ejercicio1() {
        /*
        Crea un programa que pida un número del 1 al 7 y use un switch para
        mostrar el día de la semana correspondiente (1=Lunes, 2=Martes, etc.).
        */

        System.out.println("Número del 1-7");
        int diaSemana = sc.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Este número de semana no existe");
                break;
        }
        sc.close();
    }

    public void ejercicio2() {
        /*
        Desarrolla un programa que pida una letra de calificación (A, B, C, D, F)
        y use un switch para mostrar el mensaje correspondiente: A="Excelente",
        B="Muy bien", C="Bien", D="Suficiente", F="Insuficiente".
        */

        System.out.println("Letra a calificar (A-F)");
        String letra = sc.next();

        switch (letra.toLowerCase()) {
            case "a" -> {
                System.out.println("Excelente");
            }
            case "b" -> {
                System.out.println("Muy bien");
            }
            case "c" -> {
                System.out.println("Bien");
            }
            case "d" -> {
                System.out.println("Suficiente");
            }
            case "f" -> {
                System.out.println("Insuficiente");
            }
            default -> {
                System.out.println("Letra no válida");
            }
        }
        sc.close();
    }

    public void ejercicio3() {
        /*
        Escribe un programa que pida dos números y una operación (+, -, *, /).
        Usa un switch para realizar la operación correspondiente y mostrar el resultado.
        */

        System.out.println("¿Que operación desea realizar?");
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicación");
        System.out.println("4-División");
        int operacion = sc.nextInt();

        System.out.println("Introduce el primer operando");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo operando");
        int num2 = sc.nextInt();

        double resultado = 0;
        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Suma = " + (int) resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resta = " + (int) resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Multiplicación = " + (int) resultado);
                break;
            case 4:
                resultado = (double) num1 / num2;
                System.out.println("División = " + resultado);
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }
        sc.close();
    }

    public void ejercicio4() {
        /*
        Crea un programa que muestre un menú con 4 opciones: 1=Ver perfil,
        2=Configuración, 3=Ayuda, 4=Salir. Pide al usuario que elija
        una opción y usa un switch para mostrar el mensaje
        correspondiente a cada opción
        */

        System.out.println("1-Ver Perfil");
        System.out.println("2-Configuración");
        System.out.println("3-Ayuda");
        System.out.println("4-Salir");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Viendo perfil");
                break;
            case 2:
                System.out.println("Entrando en configuración");
                break;
            case 3:
                System.out.println("Entrando en ayuda");
                break;
            case 4:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        sc.close();
    }

    public void ejercicio5() {
        /*
        Desarrolla un programa que pida un mes (número del 1 al 12) y use un
        switch para determinar la estación del año: Invierno (12, 1, 2),
        Primavera (3, 4, 5), Verano (6, 7, 8), Otoño (9, 10, 11).
        */

        System.out.println("Introduce un mes (1-12)");
        int mes = sc.nextInt();

        switch (mes) {
            case 12, 1, 2:
                System.out.println("Invierno");
                break;
            case 3, 4, 5:
                System.out.println("Primavera");
                break;
            case 6, 7, 8:
                System.out.println("Verano");
                break;
            case 9, 10, 11:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Mes no válido");
                break;
        }
        sc.close();
    }

    public void ejercicio6() {
        /*
        Escribe un programa que pida un número y use un bucle
        for para mostrar su tabla de multiplicar del 1 al 10.
        */

        System.out.println("Introduce un número");
        int num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + " * " + i + " = " + resultado);
        }
    }

    public void ejercicio7() {
        /*
        Crea un programa que pida un número N y use un bucle for para calcular
        la suma de todos los números desde 1 hasta N.
        Muestra el resultado final.
        */

        System.out.println("Introduce un número");
        int num = sc.nextInt();

        int resultado = 0;
        for (int i = 1; i <= num; i++) {
            resultado += i;
        }
        System.out.println(resultado);

        sc.close();
    }

    public void ejercicio8() {
        /*
        Desarrolla un programa que pida un número N y use un
        bucle for para contar cuántos números pares e impares hay
        desde 1 hasta N. Muestra ambos contadores.
        */

        System.out.println("Introduce un número");
        int num = sc.nextInt();

        int par = 0, impar = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
        }
        System.out.println("Par: " + par);
        System.out.println("Impar: " + impar);

        sc.close();
    }

    public void ejercicio9() {
        /*
        Escribe un programa que pida un número entero positivo y
        calcule su factorial usando un bucle for.
        El factorial de N es: N! = N × (N-1) × (N-2) × ... × 1
        */

        System.out.println("Introduce un número positivo");
        int num = sc.nextInt();

        int resultado=1;
        if (num>=0){
            for (int i = 1; i <=num; i++) {
                resultado*=i;
            }
        } else {
            System.out.println("Número no disponible");
            resultado=0;
        }

        System.out.println(resultado);

        sc.close();
    }

    public void ejercicio10() {
        /*
        Crea un programa que muestre un menú con 3 tipos de ejercicios:
        1=Flexiones, 2=Abdominales, 3=Sentadillas.
        Pide al usuario que elija un ejercicio y cuántas repeticiones quiere hacer.
        Usa un switch para determinar el ejercicio y un for para
        contar las repeticiones una a una.
        */

        System.out.println("Selecciona un ejercicio");
        System.out.println("1-Flexiones");
        System.out.println("2-Abdominales");
        System.out.println("3-Sentadillas");
        int opcion = sc.nextInt();

        System.out.println("¿Cuántas repeticiones desea realizar?");
        int repeticiones = sc.nextInt();

        switch (opcion){
            case 1 -> {
                System.out.println("Flexiones:");
            }
            case 2 -> {
                System.out.println("Adbominales:");
            }
            case 3 -> {
                System.out.println("Sentadillas:");
            }
        }

        int contadorReps = 0;
        for (int i = 1; i <= repeticiones ; i++) {
            contadorReps +=1;
            System.out.println("Repeticiones: "+contadorReps);
        }
        sc.close();
    }
}
