public class Main {
    /*
    Realizar el juego de bonoloto.
    Para ello el sistema contará con dos cadenas de números
        - Números del sistema
        - Números del usuario
    De primeras, el sistema guardará 5 números aleatorios entre 1-20
    El sistema pedirá al usuario que introduzca sus números

    El sistema deberá decidir si he ganado un premio. Para ello los premios se reparten de la siguiente
    forma:
        5 aciertos -> 1 millón de euros
        4 aciertos -> 10 mil
        3 aciertos -> mil
        1-2 -> 10 euros
        0 -> prueba suerte la siguiente vez

    Números del sistema -> 9,12,3,5,11
    Números del usuario -> 12,9,6,10,3
    */

    public static void main(String[] args) {
        Bonoloto bonoloto = new Bonoloto();
        bonoloto.sorteoNum();
        bonoloto.comprobarNum();
    }
}
