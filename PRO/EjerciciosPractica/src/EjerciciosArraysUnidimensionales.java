import java.util.Scanner;

public class EjerciciosArraysUnidimensionales {
    Scanner sc = new Scanner(System.in);

    public void ejercicio1() {
        /*
        Crea un programa que defina un array llamado frutas con 5 nombres de frutas.
        Luego, muestra todos los elementos del array en la consola, uno por línea.
        */

        String[] frutas = new String[]{"Manzana", "Pera", "Kiwi", "Plátano", "Melocotón"};

        System.out.println("Frutas del array:");
        for (String item : frutas) {
            System.out.println(item);
        }

    }

    public void ejercicio2() {
        /*
        Escribe un programa que cree un array de 6 números enteros.
        Usa un bucle for para recorrer el array y mostrar cada número junto con su posición (índice).
        */

        int[] enteros = new int[]{10, 20, 30, 40, 50, 60};

        int posicion = 0;
        for (int item : enteros) {
            System.out.println("Posición " + posicion + ": " + item);
            posicion++;
        }
    }

    public void ejercicio3() {
        /*
        Desarrolla un programa que cree un array vacío de tamaño 5.
        Usa un bucle for para pedir al usuario que introduzca 5 nombres,
        guardándolos en el array.
        Al final, muestra todos los nombres almacenados.
        */

        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            int contador = 1;
            System.out.println("Introduce el nombre " + contador);
            nombres[i] = sc.next();
            contador++;
        }

        System.out.println("Nombres introducidos:");
        for (String item : nombres) {
            System.out.println(item);
        }

        sc.close();
    }

    public void ejercicio4() {
        /*
        Crea un programa con un array de 7 números.
        Pide al usuario un número a buscar y usa un bucle for
        para recorrer el array.
        Si el número existe, muestra su posición. Si no existe,
        indica que no se encontró.
        */

        int[] numeros = new int[]{5, 12, 8, 3, 15, 9, 6};

        System.out.println("Introduce un número para buscar");
        int buscarNum = sc.nextInt();

        int posicion = 0;
        boolean acierto = true;

        for (int item : numeros) {
            if (buscarNum == item) {
                System.out.println("Posición " + posicion);
                return;
            } else {
                posicion++;
                acierto = false;
            }
        }

        if (!acierto) {
            System.out.println("Número no encontrado");
        }

        sc.close();
    }

    public void ejercicio5() {
        /*
        Escribe un programa que defina un array de 10 números enteros.
        Usa un bucle for para contar cuántos números son mayores
        que 50 y muestra el resultado.
        */

        int[] numeros = new int[]{23, 67, 45, 89, 12, 56, 78, 34, 90, 43};

        int contador = 0;
        for (int item : numeros) {
            int esMayor = item > 50 ? contador++ : contador;
        }
        System.out.println("Resultado: " + contador);

    }

    public void ejercicio6() {
        /*
        Crea un programa con un array de 8 números decimales.
        Recorre el array con un bucle for para calcular la
        suma de todos los elementos.
        Luego, calcula y muestra el promedio.
        */

        double[] numeros = new double[]{4.5, 7.2, 3.8, 9.1, 5.6, 8.3, 6.7, 4.9};

        double suma = 0;
        for (double item : numeros) {
            suma += item;
        }

        double resultado = suma / numeros.length;
        System.out.println("Suma = " + suma);
        System.out.println("Promedio = " + resultado);

    }

    public void ejercicio7() {
        /*
        Desarrolla un programa que cree un array de 6 números.
        Usa bucles for para encontrar el número mayor y
        el número menor del array, y muestra ambos resultados.
        */

        int[] numeros = new int[]{15, 8, 23, 4, 19, 12};

        int menor = numeros[0], mayor = numeros[0];
        for (int item : numeros) {
            if (item > mayor) {
                mayor = item;
            }
            if (item < menor) {
                menor = item;
            }
        }

        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);

    }

    public void ejercicio8() {
        /*
        Crea un programa con un array de 10 palabras (pueden repetirse).
        Pide al usuario una palabra y usa un bucle for para contar
        cuántas veces aparece esa palabra en el array.
        */

        String[] palabras = new String[]
                {"gato", "perro", "gato", "pájaro", "gato", "pez", "perro", "gato", "conejo", "perro"};

        System.out.println("Escribe una palabra");
        String buscarPalabra = sc.next();

        int contador = 0;
        for (String item : palabras) {
            int tienePalabra = item.equalsIgnoreCase(buscarPalabra) ? contador++ : contador;
        }

        System.out.println("Número de veces: " + contador);

        sc.close();
    }

    public void ejercicio9() {
        /*
        Escribe un programa que cree un array de 7 números.
        Usa un bucle for para crear un nuevo array con los
        elementos en orden inverso.
        Muestra ambos arrays: el original y el invertido.
        */

    }
}
