import java.util.Scanner;

public class EjerciciosT3 {
    Scanner sc = new Scanner(System.in);

    public void ejercicio1() {
        /*
         Crea un programa que pida la edad del usuario y
         determine si es mayor de edad (18 años o más).
         Muestra un mensaje indicando si puede votar o no.
        */

        System.out.println("Introduce tu edad:");
        int edad = sc.nextInt();

        if (edad >= 0) {
            if (edad >= 18) {
                System.out.println("Eres mayor de edad");
            } else {
                int resultado = 18 - edad;
                System.out.println("Te faltan " + resultado + " para ser mayor de edad");
            }
        } else {
            System.out.println("Edad no válida");
        }
        sc.close();
    }

    public void ejercicio2() {
        /*
        Desarrolla un programa que pida un número al usuario y
        determine si es positivo, negativo o cero.
        Muestra el resultado por consola.
        */

        System.out.println("Introuce un número");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("El número es 0.");
        } else if (num < 0) {
            System.out.println("Número negativo.");
        } else {
            System.out.println("Número positivo.");
        }
        sc.close();
    }

    public void ejercicio3() {
        /*
         Escribe un programa que pida la nota de un examen (entre 0 y 10) y
         determine si el alumno ha aprobado (nota mayor o igual a 5)
         o ha suspendido.
        */

        System.out.println("Escribe un número entre 0-10");
        int num = sc.nextInt();

        if (num <= 10 && num >= 0) {
            if (num >= 5) {
                System.out.println("Has aprbado");
            } else {
                System.out.println("Has suspendido");
            }
        } else {
            System.out.println("NOTA NO VÁLIDA");
        }
        sc.close();
    }

    public void ejercicio4() {
        /*
         Crea un programa que pida el importe de una compra.
         Si el importe es mayor o igual a 100€, aplica un descuento del 10%.
         Muestra el importe original y el importe final a pagar.
        */

        System.out.println("Introduce el importe de tu última compra");
        double importe = sc.nextDouble();

        if (importe >= 100) {
            double descuento = (importe * 10) / 100;
            double resultado = importe - descuento;
            System.out.println(resultado);
        } else {
            System.out.println(importe);
        }
        sc.close();
    }

    public void ejercicio5() {
        /*
         Desarrolla un programa que pida un número entero y
         determine si es par o impar usando el operador módulo.
         Muestra un mensaje personalizado para cada caso.
        */

        System.out.println("Introduce un número entero");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número impar");
        }
        sc.close();
    }

    public void ejercicio6() {
        /*
         Escribe un programa que pida la edad del usuario y
         determine si puede acceder a contenido para mayores de 16 años.
         Si tiene 16 o más años, muestra "Acceso permitido", si no,
         muestra "Acceso denegado".
        */

        System.out.println("Introduce la edad que tienes");
        int edad = sc.nextInt();

        if (edad >= 0) {
            if (edad >= 16) {
                System.out.println("Acceso permitido");
            } else {
                System.out.println("Acceso denegado");
            }
        } else {
            System.out.println("Edad no válida");
        }

        sc.close();
    }

    public void ejercicio7() {
        /*
         Crea un programa que pida una nota numérica (0-10) y
         determine la calificación: Suspenso (0-4), Aprobado (5-6),
         Notable (7-8) o Sobresaliente (9-10).
        */

        System.out.println("Introduce una nota entre 0-10");
        double nota = sc.nextDouble();

        if (nota <= 10 && nota >= 0) {
            if (nota <= 4) {
                System.out.println("Suspenso");
            } else if (nota <= 6) {
                System.out.println("Aprobado");
            } else if (nota <= 8) {
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }
        } else {
            System.out.println("Nota no válida");
        }
        sc.close();
    }

    public void ejercicio8() {
        /*
         Desarrolla un programa que pida dos números al usuario y
         determine cuál es mayor, o si son iguales.
         Muestra el resultado por consola.
        */

        System.out.println("Introduce dos números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
        } else {
            System.out.println(num1 + " es igual que " + num2);
        }
        sc.close();

    }

    public void ejercicio9() {
        /*
         Escribe un programa que pida el peso (en kg) y la altura
         (en metros) del usuario. Calcula el IMC (peso / altura²) y
         determina si está en peso normal (IMC entre 18.5 y 24.9),
         por debajo del peso normal (IMC menor a 18.5) o por encima
         del peso normal (IMC mayor a 24.9).
        */

        System.out.println("Introduce tu peso en kg");
        double peso = sc.nextDouble();
        System.out.println("Introduce tu altura en m");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc < 18.5) {
            System.out.println("Por debajo del peso normal");
        } else {
            System.out.println("Por encima del peso normal");
        }
        sc.close();
    }

    public void ejercicio10() {
        /*
         Crea un programa que pida la altura del usuario (en cm) y
         determine si puede subir a una atracción.
         La altura mínima es 120 cm y la máxima es 200 cm.
         Si está dentro del rango, muestra "Puedes subir", si no,
         indica el motivo (demasiado bajo o demasiado alto).
        */

        System.out.println("Introduce tu altura en cm");
        int altura = sc.nextInt();

        if (altura >= 120 && altura <= 200) {
            System.out.println("Puedes subir");
        } else if (altura > 200) {
            System.out.println("Eres muy alto");
        } else {
            System.out.println("Eres muy bajo");
        }
        sc.close();
    }

    public void ejercicio11() {
        /*
        Desarrolla un programa que pida el importe de una compra y
        si el cliente es socio (true/false).
        Aplica descuentos según estas reglas: Si es socio Y la
        compra es mayor o igual a 200€, descuento del 20%.
        Si es socio Y la compra es menor de 200€, descuento del 10%.
        Si NO es socio pero la compra es mayor o igual a 300€,
        descuento del 5%. En cualquier otro caso, no hay descuento.
        Muestra el importe original, el descuento aplicado y el
        importe final.
         */

        System.out.println("Introduce el importe de la compra");
        double importe = sc.nextDouble();
        System.out.println("¿Eres cliente? (True/false)");
        boolean esCliente = sc.nextBoolean();

        double importeFinal = 0, descuento = 0;
        if (esCliente && importe >= 200) {
            descuento = importe * 0.2;
            importeFinal = importe - descuento;
        } else if (esCliente && importe < 200) {
            descuento = importe * 0.1;
            importeFinal = importe - descuento;
        } else if (!esCliente && importe >= 300) {
            descuento = importe * 0.05;
            importeFinal = importe - descuento;
        } else {
            System.out.println("No aplica descuento");
        }

        System.out.println("Importe original: " + importe);
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Importe final: " + importeFinal);

        sc.close();
    }

    public void ejercicio12() {
        /*
        Crea un programa que pida al usuario crear una contraseña.
        La contraseña debe cumplir estos requisitos: tener al menos
        8 caracteres de longitud, contener al menos un número, y
        NO puede ser "12345678" o "password". El programa debe
        verificar cada condición por separado usando operadores
        lógicos y mostrar si la contraseña es válida o no,
        indicando qué requisitos no cumple.
        Nota: Para este ejercicio, asume que tienes funciones
        auxiliares como longitudCadena(texto), contienNumero(texto).
        */

        System.out.println("Crea una contraseña:");
        String contrasenia = sc.next();

        if (contrasenia.length() < 8) { /*en vez de .length() -> longitudCadena(texto)*/
            System.out.println("La contraseña no cumple con la longitud");
        } else if (!contrasenia.contains("numero")) { /*en vez de .contains("numero") -> contienNumero(texto)*/
            System.out.println("La contraseña no contiene un número");
        } else if (contrasenia.equals("12345678") || contrasenia.equals("password")) {
            System.out.println("Contraseña no válida");
        } else {
            System.out.println("Contraseña creada correctamente");
        }

        sc.close();
    }

    public void ejercicio13() {
        /*
        Escribe un programa para calcular el precio de entrada
        a un museo. Pide la edad del usuario y el día de la semana
        (1=Lunes, 2=Martes... 7=Domingo). Las reglas son:
        Menores de 12 años: entrada gratis. Entre 12 y 17 años:
        5€ (pero gratis los martes). Entre 18 y 64 años: 10€
        (pero 7€ los jueves). 65 años o más: 6€. Usa operadores
        lógicos para determinar el precio correcto y muestra el
        cálculo.
        */

        System.out.println("Edad:");
        int edad = sc.nextInt();
        System.out.println("Día de la semana (1-7):");
        int diaSemana = sc.nextInt();

        if (edad < 12) {
            System.out.println("Entrada gratuíta");
        } else if (edad > 12 && edad <= 17 && diaSemana == 2) {
            System.out.println("Entrada gratuíta");
        } else if (edad > 12 && edad <= 17) {
            System.out.println("La entrada cuesta 5eur.");
        } else if (edad > 18 && edad < 64 && diaSemana == 4) {
            System.out.println("La entrada cuesta 7eur.");
        } else if (edad > 18 && edad < 64) {
            System.out.println("La entrada cuesta 10eur.");
        } else if (edad >= 65) {
            System.out.println("La entrada cuesta 6eur.");
        } else {
            System.out.println("Entrada no permitida");
        }

        sc.close();
    }

    public void ejercicio14() {
        /*
        Desarrolla un programa que determine si una persona es
        elegible para un préstamo bancario.
        Pide: edad, ingresos mensuales (€), y si tiene deudas
        pendientes (true/false). Los requisitos son:
        Edad entre 21 y 65 años, ingresos mensuales de al menos
        1000€, y NO tener deudas pendientes. El programa debe
        evaluar cada condición y mostrar si es elegible o no,
        explicando qué requisitos no cumple.
        */

        System.out.println("Edad");
        int edad = sc.nextInt();
        System.out.println("Ingresos mensuales");
        double ingresosMensuales = sc.nextDouble();
        System.out.println("Deudas pendientes? (true/false)");
        boolean deudasPendientes = sc.nextBoolean();

        if (edad < 21 || edad > 65) {
            System.out.println("No cumple la edad");

        } else if (ingresosMensuales < 1000) {
            System.out.println("No cumple con los ingresos mínimos");

        } else if (deudasPendientes) {
            System.out.println("Tiene deudas");
        } else {
            System.out.println("Elegible para el préstamo");
        }

        sc.close();
    }

    public void ejercicio15() {
        /*
        Crea un programa que calcule el coste de envío de un paquete.
        Pide: peso del paquete (kg), distancia de envío (km), y si es envío urgente
        (true/false). Las reglas son: Precio base: 5€. Si el peso es mayor de 5kg,
        añadir 2€ por cada kg adicional. Si la distancia es mayor de 100km, añadir 10€.
        Si es envío urgente, multiplicar el precio total por 1.5.
        Muestra todos los cálculos paso a paso.
        */

        System.out.println("Peso del paquete (kg)");
        double pesoPaquete = sc.nextDouble();
        System.out.println("Distancia del envío (km)");
        int distancia = sc.nextInt();
        System.out.println("¿Es envío urgente? (true/false)");
        boolean envioUrgente = sc.nextBoolean();

        int precioBase = 5;
        double precioFinal = 0;
        if (pesoPaquete>5&&distancia>100&&envioUrgente){
            int pesoBase = 5;
            double pesoAdicional = pesoPaquete-pesoBase;

            precioFinal=((pesoBase*precioBase)+(pesoAdicional*2)+10)*1.5;

            System.out.println("Precio total: "+precioFinal+". Debido al peso, a la distancia y al envío");

        } else if (pesoPaquete>10&&envioUrgente){
            int pesoBase = 5;
            double pesoAdicional = pesoPaquete-pesoBase;

            precioFinal=((pesoBase*precioBase)+(pesoAdicional*2))*1.5;

            System.out.println("Precio total: "+precioFinal+". Debido al peso y al envío");
        } else if (pesoPaquete>10&&distancia>100){
            int pesoBase = 5;
            double pesoAdicional = pesoPaquete-pesoBase;

            precioFinal=((pesoBase*precioBase)+(pesoAdicional*2))+100;

            System.out.println("Precio total: "+precioFinal+". Debido al peso y a la distancia");
        } else if (distancia>=100&&envioUrgente){
            precioFinal=((pesoPaquete*precioBase)+10)*1.5;

            System.out.println("Precio total: "+precioFinal+". Debido a la distancia y al envío");
        } else if (pesoPaquete>5){
            int pesoBase = 5;
            double pesoAdicional = pesoPaquete-pesoBase;

            precioFinal=(pesoBase*precioBase)+(pesoAdicional*2);

            System.out.println("Precio total: "+precioFinal+". Debido al peso");
        } else if (distancia>100){
            precioFinal=(pesoPaquete*precioBase)+10;

            System.out.println("Precio total: "+precioFinal+". Debido a la distancia");
        } else if (envioUrgente){
            precioFinal=(pesoPaquete*precioBase)*1.5;

            System.out.println("Precio total: "+precioFinal+". Debido al envío");
        } else {
            System.out.println("Opción no contemplada");
        }

        sc.close();
    }
}
