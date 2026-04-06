package controller;

import model.Libro;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class APIController {
    private static final String BOOKS_URL = "https://stephen-king-api.onrender.com/api/books";
    private static final String BOOK_URL = "https://stephen-king-api.onrender.com/api/book/";

    public APIController() {
    }

    public List<Libro> obtenerLibros() {
        List<Libro> libros = new ArrayList<>();

        try {
            URL url = new URL(BOOKS_URL);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            StringBuilder respuesta = new StringBuilder();
            String linea;

            while ((linea = br.readLine()) != null) {
                respuesta.append(linea);
            }
            br.close();

            ObjectMapper mapper = new ObjectMapper();
            JsonNode raiz = mapper.readTree(respuesta.toString());
            JsonNode data = raiz.get("data");

            for (JsonNode item : data) {
                Libro libro = mapper.treeToValue(item, Libro.class);
                libros.add(libro);
            }

        } catch (Exception e) {
            System.out.println("Error al importar los libros");
            e.printStackTrace();
        }

        return libros;
    }

    public Libro obtenerLibroPorId(int id) {
        try {
            URL url = new URL(BOOK_URL + id);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            StringBuilder respuesta = new StringBuilder();
            String linea;

            while ((linea = br.readLine()) != null) {
                respuesta.append(linea);
            }
            br.close();

            ObjectMapper mapper = new ObjectMapper();
            JsonNode raiz = mapper.readTree(respuesta.toString());
            JsonNode data = raiz.get("data");
            return mapper.treeToValue(data, Libro.class);

        } catch (Exception e) {
            System.out.println("Error con la búsqueda del libro");
            e.printStackTrace();
        }

        return null;
    }
}