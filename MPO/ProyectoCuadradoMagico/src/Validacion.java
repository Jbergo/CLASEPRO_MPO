public class Validacion {

    public boolean esMagico(int[][] cuadradoMagico) {
        int consMagica = 0;

        //Constante magica de la primera fila
        for (int i = 0; i < cuadradoMagico.length; i++) {
            consMagica += cuadradoMagico[0][i];
        }

        //Validar el resto de filas
        return validarFilas(cuadradoMagico, consMagica)
                && validarColumnas(cuadradoMagico, consMagica)
                && validarDiagonalPrincipal(cuadradoMagico, consMagica)
                && validarDiagonalSecundaria(cuadradoMagico, consMagica);

    }

    private boolean validarFilas(int[][] cuadradoMagico, int consMagica) {
        int compConsMagico = 0;

        for (int[] item : cuadradoMagico) {
            compConsMagico = 0;
            for (int anItem : item) {
                compConsMagico += anItem;
            }
            if (compConsMagico != consMagica) {
                return false;
            }
        }

        return true;
    }

    private boolean validarColumnas(int[][] cuadradoMagico, int consMagica) {
        int compConsMagico = 0;

        for (int i = 0; i < cuadradoMagico[0].length; i++) {
            compConsMagico = 0;
            for (int j = 0; j < cuadradoMagico.length; j++) {
                compConsMagico += cuadradoMagico[j][i];
            }
            if (compConsMagico != consMagica) {
                return false;
            }
        }

        return true;
    }

    private boolean validarDiagonalPrincipal(int[][] cuadradoMagico, int consMagica) {
        int compConsMagico = 0;

        for (int i = 0; i < cuadradoMagico.length; i++) {
            compConsMagico += cuadradoMagico[i][i];
        }
        return compConsMagico == consMagica;
    }

    private boolean validarDiagonalSecundaria(int[][] cuadradoMagico, int consMagica) {
        int compConsMagico = 0;

        for (int i = 0; i < cuadradoMagico.length; i++) {
            compConsMagico += cuadradoMagico[i][(cuadradoMagico.length - 1) - i];
        }
        return compConsMagico == consMagica;
    }
}
