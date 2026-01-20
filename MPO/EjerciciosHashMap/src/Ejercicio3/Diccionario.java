package Ejercicio3;

import java.util.HashMap;
import java.util.TreeMap;

public class Diccionario {
    private HashMap<String, String> traducciones;

    public Diccionario() {
        traducciones = new HashMap<String, String>();
    }

    public void agregarTraduccion(String espanol, String ingles){
        traducciones.put(espanol, ingles);
    }

    public String traducir(String palabra){
            for (String traduccion: traducciones.values()) {
                if (traducciones.containsKey(palabra)){
                    return traduccion;
                }
            }
            return "No existe";
    }

    public void agregarVariasTraducciones(String[][] traducciones){
        String clave = "";
        String valor = "";

        for (int i = 0; i < traducciones.length; i++) {
            clave = traducciones[i][0];
            valor = traducciones[i][1];
        }
        this.traducciones.put(clave, valor);
    }

    public void listarDiccionario(){
        TreeMap<String, String> traducciones = new TreeMap<>(this.traducciones);
        for (String traduccion : traducciones.keySet()) {
            System.out.println(traduccion + " --> " + traducciones.get(traduccion));
        }
    }

    public int tamanioDiccionario() {
        return traducciones.size();
    }

    public void traducirFrase(String frase) {

        String[] palabras = frase.toLowerCase().split(" ");
        StringBuilder traduccion = new StringBuilder();

        for (String palabra : palabras) {

            if (traducciones.containsKey(palabra)) {
                traduccion.append(traducciones.get(palabra));
            } else {
                traduccion.append(palabra);
            }

            traduccion.append(" ");
        }

        System.out.println(traduccion.toString().trim());
    }


    public HashMap<String, String> getTraducciones() {
        return traducciones;
    }

    public void setTraducciones(HashMap<String, String> traducciones) {
        this.traducciones = traducciones;
    }
}
