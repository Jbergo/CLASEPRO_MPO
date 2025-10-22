import java.util.Scanner;

public class Operadores {
    public void operadoresAritmeticos() {
        System.out.println("Explicación de los operadores aritméticos");

        //UNARIOS -> solo necesitan un operando
        int operandoUno = 5;
        System.out.println("Antes del incremento: " + operandoUno);
        operandoUno++; //operandoUno = operandoUno + 1
        System.out.println("Después del incremento: " + operandoUno);
        operandoUno--; //operandoUno = operandoUno - 1
        operandoUno--;
        System.out.println("Después del decremento: " + operandoUno);
        operandoUno=-operandoUno; //Calculando el inverso
        System.out.println("Operador inverso: " + operandoUno);

        //BINARIOS
        int operandoDos = 5;
        int suma = operandoUno + operandoDos;
        System.out.println("El resultado de la suma: " + suma);
        int resta = operandoUno - operandoDos;
        System.out.println("El resultado de la resta: " + resta);
        int multiplicacion = operandoUno * operandoDos;
        System.out.println("El resultado de la multiplicacion: " + multiplicacion);
        double division = (double) operandoUno / operandoDos;
        System.out.println("El resultado de la division: " + division);
        int modulo = operandoUno % operandoDos;
        System.out.println("El resultado de la modulo: " + modulo);
    }

    public void operadoresAsignacion() {
        int operandoUno = 6;
        operandoUno += 6; //operandoUno = operandoUno + 10;
        System.out.println(operandoUno);
        operandoUno *= 6;
        System.out.println(operandoUno);
        operandoUno -= 6;
        System.out.println(operandoUno);
        operandoUno /= 6;
        System.out.println(operandoUno);
        operandoUno %= 6;
        System.out.println(operandoUno);
    }

    public void operadoresRelacionales() {
        int numeroUno = 4;
        int numeroDos= 7;

        boolean resultado = numeroUno < numeroDos;
//        resultado = numeroUno > numeroDos;
//        resultado = numeroUno >= numeroDos;
//        resultado = numeroUno <= numeroDos;
//        resultado = numeroUno == numeroDos;
//        resultado = numeroUno != numeroDos;
        System.out.println(resultado);
    }

    public void operadoresLogicos() {
        int numeroUno = 4;
        int numeroDos = 10;
        int numeroTres = 17;

        boolean resultadoLogico = numeroUno>1 && numeroDos<11 && numeroDos!=numeroTres && numeroTres%2!=0;
        System.out.println("Comparación AND: " + resultadoLogico);

        resultadoLogico = numeroUno>1 || numeroDos<11 || numeroDos!=numeroTres || numeroTres%2==0;
        System.out.println("Comparación OR: " + resultadoLogico);

        boolean resultadoTotalInv = !resultadoLogico;
        System.out.println("Comparación OR: " + resultadoTotalInv);
    }

    public void evaluarCandidato() {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Nombre y apellidos");
        String nombreApellidos = lectorTeclado.nextLine();
        System.out.println("Edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("Salario");
        double salario = lectorTeclado.nextDouble();
        System.out.println("Experiencia");
        boolean experiencia = lectorTeclado.nextBoolean();

        //evaluación del candidato
        boolean resultadoEvaluacion = edad<40 && salario<40000 && experiencia;
        System.out.println("El resultado de la evaluación es que el candidato es: " + resultadoEvaluacion);

        //cerrar flujo de datos -> buena práctica
        lectorTeclado.close();
    }
}