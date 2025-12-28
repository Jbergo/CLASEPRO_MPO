import controller.CampeonatoController;
import model.Campeonato;
import model.Carrera;
import model.Coche;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Coche> coches = new ArrayList<>();
    private static Coche coche;
    private static Carrera carrera;
    private static Campeonato campeonato = new Campeonato();
    private static CampeonatoController campeonatoController = new CampeonatoController();

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

            coche = new Coche(marca, modelo, km);
            coches.add(coche);
        }

        //Numero de carreras
        System.out.println("¿Cuántas carreras se van a realizar?");
        int nCarreras = sc.nextInt();

        for (int i = 0; i < nCarreras; i++) {
            System.out.println("¿Cuántos km va a tener la carrera " + i + "?");
            carrera = new Carrera(sc.nextInt());
            for (Coche coche : coches) {
                carrera.addParticipante(coche);
            }

            campeonato.addCarrera(carrera);
        }

        //Ejecutar campeonato
        ArrayList<Coche> clasificacionFinal = campeonatoController.ejecutarCampeonato(campeonato);

        //Mostrar clasificacion
        for (Coche coche : clasificacionFinal) {
            System.out.println("""
                    
                    """);
        }


        sc.close();
    }
}
