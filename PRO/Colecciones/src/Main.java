public class Main {
    public static void main(String[] args) {
        int numero = 2;

        //definir el array según el número de elementos.
        int [] numeros = new int[6]; //array de 6 numeros enteros -> posiciones: [0,1,2,3,4,5]
        int[] numerosConcretos = new int[]{5,3,14,50,5,2,4,156,13,8,25,165,156,4,615};
        Integer[] numerosConcretos2 = new Integer[]{5,3,14,50};
        //guardar array de varios tipos de elementos
        Object[] cosas = new Object[5];
        Object[] cosasConcretas = new Object[]{"hola",1, false};

        //mostrar todos los elementos del array
        //Recorrer array desde una posición inicial hasta una final
        //Modificar el valor de las posiciones
        /*
        for (int i = 0; i < numerosConcretos.length; i++) {
            System.out.println("Elemento "+i+":"+numerosConcretos[i]);
        }
        */

        //utilizado para recorrer el valor de las posiciones
        //no se puede cambiar el valor de la variable (variable solo de read-only)
        for ( int data : numerosConcretos) {
            System.out.println("Elemento: " +data);
        }
    }
}
