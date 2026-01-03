import controller.CampeonatoController;
import model.Campeonato;
import model.Carrera;
import model.Coche;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Proyecto: Cuadrado Mágico
 * Descripción: Genera y simula un campeonato con una serie de carreras y coches.
 *
 * @author Jorge Bermúdez
 */

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Coche> coches = new ArrayList<>();
    private static final Campeonato campeonato = new Campeonato();
    private static final CampeonatoController campeonatoController = new CampeonatoController();

    public static void main(String[] args) {

        //Numero de coches que van a participar
        System.out.println("¿Cuántos coches van a participar?");
        int nCoches = sc.nextInt();

        //Crear coches
        for (int i = 0; i < nCoches; i++) {
            System.out.println("Introduce la marca");
            String marca = sc.next();
            System.out.println("Introduce el modelo");
            String modelo = sc.next();
            int km = 0;
            int dorsal = i + 1;

            Coche coche = new Coche(marca, modelo, km, dorsal);
            coches.add(coche);
        }

        //Numero de carreras
        System.out.println("¿Cuántas carreras se van a realizar?");
        int nCarreras = sc.nextInt();

        for (int i = 0; i < nCarreras; i++) {
            System.out.println("¿Cuántos km va a tener la carrera " + (i + 1) + "?");
            Carrera carrera = new Carrera(sc.nextInt());
            for (Coche coche : coches) {
                carrera.addParticipante(coche);
            }

            campeonato.addCarrera(carrera);
        }

        //Ejecutar campeonato
        campeonatoController.ejecutarCampeonato(campeonato);

        sc.close();
    }
}
