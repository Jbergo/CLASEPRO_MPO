public class Matriz {

    public int[][] generarMatriz(int n) {

        //Crear arrays
        int[] listaNum = new int[n * n];
        int[][] cuadradoMagico = new int[n][n];

        //Rellenar listaNum con valores sin repeticion
        rellenarArray(listaNum);

        //Hacer cuadrado magico
        int acum = 0;
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                cuadradoMagico[i][j] = listaNum[acum];
                acum++;
            }
        }

        return cuadradoMagico;
    }

    private void rellenarArray(int[] listaNum) {

        //Rellenar array
        for (int i = 0; i < listaNum.length; i++) {
            listaNum[i] = i + 1;
        }

        //Aleatorizar
        for (int i = 0; i < listaNum.length; i++) {
            int j = (int) (Math.random() * listaNum.length);
            int temp = listaNum[i];
            listaNum[i] = listaNum[j];
            listaNum[j] = temp;
        }

    }
}
