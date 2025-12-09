package Ejercicio3;

public class CalculoNotas {
    public void notaMedia(double[][] array) {

        double acumNota = 0;

        for (double[] item : array) {
            for (double anItem : item) {
                acumNota += anItem;
            }
        }

        double notaMedia = acumNota / 100;
        System.out.printf("Nota media de la clase: %.2f\t", notaMedia);

    }

    public void notaAltaBaja(double[][] array) {
        //Nota más alta
        double notaAlta = 0, notaBaja = array[0][0];
        for (double[] item : array) {
            for (double anItem : item) {
                if (anItem > notaAlta) {
                    notaAlta = anItem;
                }

                if (anItem < notaBaja) {
                    notaBaja = anItem;
                }
            }
        }

        System.out.printf("Nota más alta: %.2f\t", notaAlta);
        System.out.println();
        System.out.printf("Nota más baja: %.2f\t", notaBaja);

    }

    public void aprobadosSuspensos(double[][] array) {

        int aprobado = 0, suspenso = 0;

        for (double[] item : array) {
            for (double anItem : item) {
                if (anItem >= 5) {
                    aprobado++;
                } else {
                    suspenso++;
                }
            }
        }

        System.out.println("Alumnos aprobados: " + aprobado);
        System.out.println("Alumnos suspensos: " + suspenso);
    }
}
