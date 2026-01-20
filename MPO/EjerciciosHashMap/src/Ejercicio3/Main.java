package Ejercicio3;

/*
**Objetivo:** Crear un diccionario bilingüe usando un HashMap para traducir palabras del español al inglés.

**Requisitos:**

1. Crear un `HashMap&lt;String, String&gt;` para almacenar traducciones (español como clave, inglés como valor).
2. Crear método `void agregarTraduccion(String espanol, String ingles)` que añada o actualice una traducción.
3. Crear método `String traducir(String palabra)` que devuelva la traducción o un mensaje si no existe.
4. Crear método `void agregarVariasTraduciones(String[][] traducciones)` que permita añadir múltiples traducciones desde un array bidimensional.
5. Crear método `void listarDiccionario()` que muestre todas las palabras y sus traducciones ordenadas alfabéticamente.
6. Crear método `int tamanioDiccionario()` que devuelva el número de palabras en el diccionario.
7. Crear método `void traducirFrase(String frase)` que traduzca palabra por palabra una frase completa.
8. En el `main`, crear un diccionario, añadir palabras y probar traducciones de palabras y frases.
 */

public class Main {
    public static void main(String[] args) {

        Diccionario diccionario = new Diccionario();
        diccionario.agregarTraduccion("hola", "hello");
        diccionario.agregarTraduccion("coche", "car");
        System.out.println(diccionario.traducir("coche"));
        String[][] datos = {
                {"casa", "house"},
                {"perro", "dog"},
                {"gato", "cat"}
        };
        diccionario.agregarVariasTraducciones(datos);
        diccionario.listarDiccionario();
        System.out.println(diccionario.tamanioDiccionario());
        diccionario.traducirFrase("Hola coche");

    }
}
