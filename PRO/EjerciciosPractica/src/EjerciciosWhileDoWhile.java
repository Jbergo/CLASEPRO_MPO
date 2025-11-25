import java.util.Random;
import java.util.Scanner;

public class EjerciciosWhileDoWhile {

    Scanner sc = new Scanner(System.in);

    public void ejercicio1() {
        /*
        Crea un programa que pida un número N y use un
        bucle while para contar desde 1 hasta N, mostrando cada número.
        */

        System.out.println("Introduce un número");
        int numero = sc.nextInt();

        int recorrerNum = 0;
        while (recorrerNum < numero) {
            recorrerNum += 1;
            System.out.println("Número actual: " + recorrerNum);
        }
        System.out.println("FIN");

        sc.close();
    }

    public void ejercicio2() {
        /*
        Desarrolla un programa que pida al usuario una contraseña.
        La contraseña correcta es "1234".
        Usa un bucle do-while para seguir pidiendo la contraseña
        hasta que el usuario la introduzca correctamente.
        */

        int password = 0;
        int correctPW = 1234;

        do {
            System.out.println("Introduce una contraseña");
            password = sc.nextInt();
        } while (password != correctPW);
        System.out.println("Contraseña correcta");
        sc.close();
    }

    public void ejercicio3() {
        /*
        Escribe un programa que pida números al usuario y los vaya sumando.
        El bucle while debe continuar mientras el usuario introduzca números positivos.
        Cuando introduzca un número negativo o cero, el programa debe
        terminar y mostrar la suma total.
        */

        int numeros = 1, suma = 0;
        while (true) {
            System.out.println("Introduce números");
            numeros = sc.nextInt();

            if (numeros <= 0) {
                System.out.println("Número no válido");
                break;
            }

            suma += numeros;
        }

        System.out.println("Fin programa");
        System.out.println("Suma total: " + suma);
        sc.close();
    }

    public void ejercicio4() {
        /*
        Crea un juego donde el programa elige un número secreto
        entre 1 y 10 (por ejemplo, 7). Usa un bucle do-while para pedir
        al usuario que adivine el número. El programa debe indicar
        si el número es mayor o menor, y continuar hasta que el
        usuario acierte.
        */

        Random random = new Random();
        int numSecreto = random.nextInt(10) + 1;

        int numUser = 0;
        do {
            System.out.println("Trata de adivinar el número secreto introduciendo números (entre 1-10)");
            numUser = sc.nextInt();

            if (numUser > numSecreto) {
                System.out.println("Número más bajo");
            } else if (numUser < numSecreto) {
                System.out.println("Número más alto");
            } else {
                System.out.println("Número correcto!");
            }
        } while (numUser != numSecreto);

        sc.close();
    }

    public void ejercicio5() {
        /*
        Desarrolla un programa con un menú que se repita usando do-while.
        El menú debe tener 4 opciones: 1=Saludar, 2=Despedirse, 3=Ver hora actual
        (puedes mostrar un mensaje fijo), 4=Salir.
        Usa switch para procesar cada opción.
        El programa solo debe terminar cuando el usuario elija la opción 4.
        */

        int opcion = 0;
        do {
            System.out.println("""
                    Menú:
                    1=Saludar
                    2=Despedirse
                    3=Ver hora actual
                    4=Salir
                    Selecciona opción del menú""");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saludando");
                    break;
                case 12:
                    System.out.println("Despidiendo");
                    break;
                case 3:
                    System.out.println("Viendo hora actual");
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
            }
        } while (opcion != 4);

        System.out.println("FIN");
        sc.close();
    }

    public void ejercicio6() {
        /*
        Escribe un programa que pida un número N y
        use un bucle while para hacer una cuenta atrás
        desde N hasta 1, mostrando cada número.
        Al llegar a 1, debe mostrar "¡Despegue!".
        */

        System.out.println("Introduce un número");
        int num = sc.nextInt();

        while (num != 1) {
            num--;
            System.out.println(num);
            if (num == 1) {
                System.out.println("¡Despegue!");
            }
        }

        System.out.println("FIN");
        sc.close();
    }

    public void ejercicio7() {
        /*
        Crea un programa que pida al usuario
        cuántas calificaciones va a introducir.
        Luego, usa un bucle while para pedir cada calificación
        una por una, sumarlas y al final calcular y mostrar
        el promedio.
        */

        System.out.println("¿Cuántas calificaciones vas a introducir?");
        int numCal = sc.nextInt();

        int recorrerCal = 0;
        double cal = 0;
        while (recorrerCal != numCal) {
            System.out.println("Introduce una calificación (con ',')");
            cal += sc.nextDouble();
            recorrerCal++;
        }

        double promCal = cal / numCal;
        System.out.println("El promedio es: " + promCal);
        sc.close();
    }

    public void ejercicio8() {
        /*
        Desarrolla un programa que pida la edad del usuario.
        Usa un bucle do-while para validar que la edad introducida
        esté entre 0 y 120. Si no es válida, debe volver a pedirla.
        Una vez válida, muestra un mensaje de confirmación.
        */

        System.out.println("Edad");
        int edad;

        do {
            edad = sc.nextInt();

            if (edad < 0 || edad > 120) {
                System.out.println("Edad no válida.\nVuelve a introducirla:");
            } else {
                System.out.println("Edad válida");
            }
        } while (edad < 0 || edad > 120);

        sc.close();
    }

    public void ejercicio9() {
        /*
        Crea un programa que pida al usuario cuántos estudiantes hay en una clase.
        Para cada estudiante, usa un bucle while para pedir su calificación numérica (0-10).
        Luego, usa un bucle for para mostrar todas las calificaciones
        y usa un switch para convertir cada nota numérica en letra:
        9-10=A, 7-8=B, 5-6=C, 3-4=D, 0-2=F.
        */

        System.out.println("¿Cuántos estudiantes hay en la clase?");
        int estudiantes = sc.nextInt();

        int contEstudiantes = estudiantes;
        int calificacion = 0;
        char notaCal = ' ';

        char[] calificaciones = new char[estudiantes];
        int i = 0;

        while (contEstudiantes != 0) {
            System.out.println("Calificación del estudiante " + (i + 1));
            calificacion = sc.nextInt();

            if (calificacion >= 0 && calificacion <= 10) {
                switch (calificacion) {
                    case 0, 1, 2:
                        notaCal = 'F';
                        break;
                    case 3, 4:
                        notaCal = 'D';
                        break;
                    case 5, 6:
                        notaCal = 'C';
                        break;
                    case 7, 8:
                        notaCal = 'B';
                        break;
                    case 9, 10:
                        notaCal = 'A';
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }

                calificaciones[i] = notaCal;
                contEstudiantes--;
                i++;
            } else {
                System.out.println("Calificación errónea");
            }
        }

        for (int j = 0; j < estudiantes; j++) {
            System.out.println("Nota Estudiante " + (j + 1) + "= " + calificaciones[j]);
        }

        sc.close();
    }

    public void ejercicio10() {
        /*
        Desarrolla un programa que simule un cajero automático.
        El saldo inicial es 1000€. Usa un bucle do-while para mostrar un menú con opciones:
        1=Consultar saldo, 2=Retirar dinero, 3=Depositar dinero, 4=Salir.
        Usa switch para cada opción.
        Para retirar dinero, usa un bucle while para validar que no se retire más
        del saldo disponible (si intenta retirar más, debe volver a pedir la cantidad).
        Para depositar, valida que sea una cantidad positiva.
        */

        double saldoInicial = 1000;
        int opcion = 0;
        double retirarDinero = 0;
        double depositarDinero = 0;

        do {
            System.out.println("""
                    Menú de opciones:
                    1- Consultar saldo
                    2- Retirar dinero
                    3- Depositar dinero
                    4- Salir
                    Seleccione una opción
                    """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo: " + saldoInicial);
                    break;
                case 2:
                    while (retirarDinero <= saldoInicial) {
                        System.out.println("¿Cuánto dinero quieres retirar?");
                        retirarDinero = sc.nextDouble();
                        saldoInicial -= retirarDinero;
                    }
                    break;
                case 3:
                    System.out.println("¿Cuánto dinero quieres depositar?");
                    depositarDinero = sc.nextDouble();

                    if (depositarDinero > 0) {
                        saldoInicial += depositarDinero;
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 4);

        System.out.println("Saliendo del cajero");
        sc.close();
    }
}
