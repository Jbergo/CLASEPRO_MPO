import java.util.Scanner;

public class EjerciciosT2 {
    Scanner sc = new Scanner(System.in);
    public void ejercicio1() {
        /*
         Crea un programa que pida al usuario dos números enteros por consola
          y muestre el resultado de las cinco operaciones aritméticas básicas:
          suma, resta, multiplicación, división y módulo (resto).
        */

        System.out.println("Introduce dos números:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int suma = num1+num2;
        int resta = num1-num2;
        int multiplicacion = num1*num2;
        double division = num1/(double)num2;
        int resto = num1%num2;

        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multiplicacion);
        System.out.println("División: "+division);
        System.out.println("Resto: "+resto);

        sc.close();
    }

    public void ejercicio2() {
        /*
        Escribe un programa que pida dos números al usuario y
        muestre el resultado de todas las comparaciones relacionales entre ellos
        (mayor que, menor que, igual, diferente, mayor o igual, menor o igual).
        */

        System.out.println("Introduce dos números:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        boolean mayor = num1>num2;
        boolean menor = num1<num2;
        boolean igual = num1==num2;
        boolean diferente = num1!=num2;
        boolean mayorIgual = num1>=num2;
        boolean menorIgual = num1<=num2;

        System.out.println("Mayor que: "+mayor);
        System.out.println("Menor que: "+menor);
        System.out.println("Igual: "+igual);
        System.out.println("Diferente: "+diferente);
        System.out.println("Mayor o igual que: "+mayorIgual);
        System.out.println("Menor o igual que: "+menorIgual);

        sc.close();
    }

    public void ejercicio3() {
        /*
         Crea un programa que declare una variable con valor inicial 100 y
         aplique diferentes operadores de asignación compuesta (+=, -=, *=, /=).
         Muestra el valor de la variable después de cada operación.
        */

        int valor = 100;
        System.out.println(valor);
        valor +=50;
        System.out.println(valor);
        valor -=20;
        System.out.println(valor);
        valor+=2;
        System.out.println(valor);
        valor/=valor;
        System.out.println(valor);

    }

    public void ejercicio4() {
        /*
        Desarrolla un programa que pida un número al usuario y
        determine si es par o impar usando el operador módulo.
        Muestra el resultado por consola.
        */

        System.out.println("Introduce un número:");
        int numero = sc.nextInt();

        if(numero%2==0){
            System.out.println("Número PAR");
        } else {
            System.out.println("Número IMPAR");
        }

        sc.close();
    }

    public void ejercicio5() {
        /*
        Crea un programa que pida la edad del usuario y si tiene carnet de conducir
        (true/false).
        Usa operadores lógicos para determinar si puede alquilar un coche
        (debe tener 21 años o más Y tener carnet).
        */

        System.out.println("Introduce tu edad:");
        int edad = sc.nextInt();
        System.out.println("¿Tienes carnet de conducir?");
        boolean tieneCarnet = sc.hasNext();

        if(edad>=21 && tieneCarnet) {
            System.out.println("Puedes alquilar un coche");
        } else {
            System.out.println("No puedes alquilar un coche");
        }

        sc.close();
    }

    public void ejercicio6() {
        /*
        Escribe un programa que pida el precio de un producto y el porcentaje de descuento.
        Calcula el precio final después del descuento usando operadores aritméticos y
        muestra todos los pasos del cálculo.
        */

        System.out.println("Introduce el precio de un producto (utiliza ',' para decimal)");
        double precio = sc.nextDouble();
        System.out.println("Introduce su descuento");
        int descuento = sc.nextInt();

        double resultado = (precio*descuento)/100;

        System.out.println("Precio del producto: "+precio+" euros");
        System.out.println("Descuento: "+descuento+ "%");
        System.out.println("Precio final: "+resultado+ " euros");

        sc.close();
    }

    public void ejercicio7() {
        /*
        Crea un programa que pida al usuario su edad y si es estudiante (true/false).
        Usa operadores lógicos (AND, OR, NOT) para
        determinar si puede acceder a diferentes descuentos:
        descuento joven (menor de 26 años), descuento estudiante, o
        descuento especial (menor de 26 Y estudiante).
        */

        System.out.println("Dime tu edad:");
        int edad = sc.nextInt();
        System.out.println("¿Eres estudiante? (true/false)");
        boolean esEstudiante = sc.nextBoolean();

        if (edad < 26 && esEstudiante) {
            System.out.println("Tienes descuento joven y descuento estudiante (descuento especial).");
        } else if (edad < 26 && !esEstudiante) {
            System.out.println("Tienes descuento joven.");
        } else if (edad >= 26 && esEstudiante) {
            System.out.println("Tienes descuento estudiante.");
        } else {
            System.out.println("No tienes ningún descuento.");
        }

        sc.close();
    }

    public void ejercicio8() {
        /*
        Desarrolla un programa que pida tres números al usuario y
        calcule: la suma de los tres, el promedio, el resultado de
        multiplicar el primero por el segundo y dividirlo entre
        el tercero.
        Usa paréntesis para controlar la precedencia de operadores.
        */

        System.out.println("Introduce tres números aleatorios:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int suma = num1+num2+num3;
        double promedio = (double)suma/3;
        double operacion = (num1*num2)/(double)num3;

        System.out.println("Suma: "+suma);
        System.out.println("Promedio: "+promedio);
        System.out.println("Operación: "+operacion);

        sc.close();
    }

    public void ejercicio9() {
        /*
        Escribe un programa que pida al usuario la puntuación
        de tres exámenes. Calcula la nota media y usa operadores
        relacionales para determinar si ha aprobado (>=5),
        si tiene notable (>=7), y si tiene sobresaliente (>=9).
        Muestra todos los resultados.
        */

        System.out.println("Escribe la puntuación del primer examen");
        double puntuacion1 = sc.nextDouble();
        System.out.println("Escribe la puntuación del segundo examen");
        double puntuacion2 = sc.nextDouble();
        System.out.println("Escribe la puntuación del tercer examen");
        double puntuacion3 = sc.nextDouble();

        double notaMedia = (puntuacion1+puntuacion2+puntuacion3)/3;

        if (notaMedia <= 10 && notaMedia >= 0) {
            if (notaMedia>=9) {
                System.out.println("Sobresaliente");
            } else if(notaMedia>=7) {
                System.out.println("Notable");
            } else if(notaMedia>=5){
                System.out.println("Aprobado");
            }
        } else {
            System.out.println("Nota no válida");
        }


        sc.close();
    }

    public void ejercicio10() {
        /*
        Crea un programa que pida el salario base por hora,
        las horas trabajadas y si ha hecho horas extra (true/false).
        Si ha hecho horas extra y trabajó más de 40 horas, las horas
        que excedan de 40 se pagan al doble.
        Usa operadores lógicos, relacionales y aritméticos para
        calcular el salario total.
        */

        System.out.println("Introduce el salario base por hora trabajada");
        double salarioHora = sc.nextDouble();
        System.out.println("Introduce las horas trabajadas");
        int horas = sc.nextInt();
        System.out.println("¿Has hecho horas extra?");
        boolean tieneExtra = sc.nextBoolean();

        double salarioMensual;
        if (tieneExtra && horas>40) {
            double horasFijas = 40;
            double horasExtra = horas - horasFijas;

            salarioMensual =  (horasFijas*salarioHora) + (horasExtra*salarioHora*2);

        } else {
            salarioMensual =  horas*salarioHora;
        }

        System.out.println("El salario mensual es de: "+salarioMensual);
        sc.close();
    }
}
