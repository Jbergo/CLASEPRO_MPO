import java.util.Scanner;

public class Practica {
    Scanner sc = new Scanner(System.in);

    public void asteriscos(){
        System.out.println("Indica el tamaño del cuadrado");
        int tamanio = sc.nextInt();

        for (int i = 0; i < tamanio; i++) { /*FILAS*/
            for (int j = 0; j < tamanio; j++) { /*COLUMNAS*/
                if (i==0||i==tamanio-1) {
                    System.out.print("* ");
                } else if(j==0||j==tamanio-1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    public void factorial(){

        int factorial = 1;
        for (int i = 1; i <=4; i++) {
            factorial=factorial*i;
        }

        System.out.println("El factorial del número es: "+factorial);
    }
    
    public void palindromo() {
        /*
        si se puede leer de izq a der que de der a izq
        por ejemplo: ana, oso, allivessevilla 
        * */
        
        String palabra = "allivessevilla";
        boolean esPalindromo = true;

        for (int i = 0; i < palabra.length()/2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length()-1-i)){
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo){
            System.out.println("Palabra palíndroma");
        } else {
            System.out.println("La palabra no es palíndroma");
        }
    }

    public void forEach (){

        String[] diasSemana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
//        for (int i = 0; i < 7; i++) {
//            if (i%2==0){ /*SACAR DIAS PARES*/
//                System.out.println(diasSemana[i]);
//            }
//        }

        for (String item : diasSemana){
            System.out.println(item);
        }
    }
}
