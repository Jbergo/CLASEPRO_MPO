import java.util.Scanner;

public class EjerciciosT1 {
    public void ejercicio1(){
        /*
        Crea un programa que defina tres variables: nombre, edad y ciudad.
        Asigna valores a cada una y muestra su contenido en la consola.
         */

        String nombre = "Jorge";
        int edad = 23;
        String ciudad = "Santiago de Compostela";

        System.out.println(nombre + ", "+edad+", "+ciudad);

    }

    public void ejercicio2() {
        /*
        Crea un programa que defina una variable llamada puntuación con valor inicial 0.
        Luego, modifica su valor tres veces y muestra el resultado final.
        */

        int puntuacion = 0;
        System.out.println("Primera puntuación: "+puntuacion);
        puntuacion=2;
        System.out.println("Segunda puntuación: "+puntuacion);
        puntuacion=5;
        System.out.println("Tercera puntuación: "+puntuacion);
        puntuacion=7;
        System.out.println("Cuarta puntuación: "+puntuacion);
    }

    public void ejercicio3 () {
        /*
         Define cinco variables con diferentes tipos de datos
         (String, int, boolean, double, char) y
         muestra tanto su valor como su tipo.
        */

        String nombre = "Jorge";
        int edad = 23;
        boolean esEstudiante = true;
        double altura = 1.70;
        char inicial = 'J';

        System.out.println(nombre+ ": " + nombre.getClass().getSimpleName());
        System.out.println(esEstudiante+ ": " + ((Object)esEstudiante).getClass().getSimpleName());
        System.out.println(edad+ ": " + ((Object)edad).getClass().getSimpleName());
        System.out.println(altura+ ": " + ((Object)altura).getClass().getSimpleName());
        System.out.println(inicial+ ": " + ((Object)inicial).getClass().getSimpleName());

    }

    public void ejercicio4() {
        /*
         Crea un programa que simule la información de un libro usando
         variables con nombres descriptivos.
         Muestra toda la información del libro en la consola.
        */

        String titulo = "Don Quijote de la Mancha";
        String autor = "Miguel de Cervantes";
        int anio = 1605;
        int paginas = 863;
        boolean disponible = true;

        System.out.println("Título: " + titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Año de publicación: "+anio);
        System.out.println("Número de páginas: "+paginas);
        System.out.println("¿Está disponible?: "+disponible);

    }

    public void ejercicio5() {
        /*
        Crea un programa que use constantes para almacenar información que no debe cambiar
        (como el valor de PI o el nombre de una aplicación) y
        variables para información que puede cambiar. Muestra todos los valores.
        */

        final String nombre = "MiApp";
        String version = "1.0.0";
        final double numPI = 3.14159;
        String usuario = "Jorge";

        System.out.println("Aplicación: "+nombre);
        System.out.println("Versión: "+version);
        System.out.println("Valor de PI: "+numPI);
        System.out.println("Usuario: "+usuario);

    }

    public void ejercicio6() {
        /*
         Escribe un programa que declare dos variables numéricas,
         realice las operaciones básicas (suma, resta, multiplicación y división) y
         muestre los resultados por consola.
        */

        int num1 = 30;
        int num2 = 6;

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1*num2;
        double division = num1/(double)num2;

        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multiplicacion);
        System.out.println("División: "+division);

    }

    public void ejercicio7() {
        /*
        Crea un programa que almacene tu información personal (nombre, apellido, edad y ciudad)
        en variables y muestre un mensaje de presentación por consola.
        */

        String nombre = "Jorge";
        String apellido = "Bermúdez";
        int edad = 23;
        String ciudad = "Santiago de Compostela";

        System.out.println("Hola!, soy "+nombre+" "+apellido+", tengo "+
                edad+", y soy de "+ ciudad);

    }

    Scanner sc = new Scanner(System.in);
    public void ejercicio8() {
        /*
        Desarrolla un programa que calcule el área de un rectángulo.
        Declara variables para la base y la altura, y muestra el resultado del cálculo.
        */

        System.out.println("Introduce la base del rectángulo:");
        double base = sc.nextDouble();
        System.out.println("Introduce la altura del rectángulo:");
        double altura = sc.nextDouble();

        double areaRectangulo = base*altura;

        System.out.println("El área del rectángulo es de: "+areaRectangulo);

        sc.close();
    }

    public void ejercicio9() {
        /*
        Escribe un programa que almacene la información de un producto
        (nombre, precio, código y disponibilidad) y
        muestre estos datos formateados por consola.
        */

        String nombre = "Auriculares";
        double precio = 9.99;
        int codigo = 99238;
        boolean disponible = true;

        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Codigo: "+codigo);
        System.out.println("Disponibilidad: "+disponible);

    }

    public void ejercicio10() {
        /*
        Crea un programa que convierta una temperatura de grados Celsius a Fahrenheit.
        Usa una variable para la temperatura en Celsius y
        muestra el resultado de la conversión.

        La fórmula para convertir de Celsius a Fahrenheit es:
                F = C × 9/5 + 32
        */

        System.out.println("Introduce los grados Celsius:");
        double gradosCelsius = sc.nextDouble();

        double gradosFarenheit = (gradosCelsius * 9/5) + 32;

        System.out.println("El resultado de "+gradosCelsius+" en grados Farenheit es: "+
                gradosFarenheit+" ºF.");

        sc.close();

    }
}
