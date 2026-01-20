package Ejercicio1;

/*
**Objetivo:** Crear un programa que gestione una agenda de contactos usando un HashMap donde la clave sea el nombre y el valor sea el número de teléfono.

**Requisitos:**

1. Crear un `HashMap&lt;String, String&gt;` para almacenar contactos (nombre como clave, teléfono como valor).
2. Crear método `void agregarContacto(String nombre, String telefono)` que añada o actualice un contacto.
3. Crear método `String buscarContacto(String nombre)` que devuelva el teléfono del contacto o un mensaje si no existe.
4. Crear método `boolean eliminarContacto(String nombre)` que elimine un contacto si existe.
5. Crear método `void listarContactos()` que muestre todos los contactos en la agenda.
6. Crear método `int contarContactos()` que devuelva el número total de contactos.
7. Crear método `boolean existeContacto(String nombre)` que verifique si un contacto existe.
8. En el `main`, crear una agenda, añadir varios contactos, buscar, eliminar y listar.
 */

public class Main {
    public static void main(String[] args) {
        AgendaContactos contacto = new AgendaContactos();
        contacto.agregarContacto("Jorge", "699492551");
        System.out.println(contacto.contarContactos());
        contacto.listarContactos();
        System.out.println(contacto.buscarContacto("Jorge"));
        System.out.println(contacto.existeContacto("Jorge"));
        System.out.println(contacto.eliminarContacto("Jorge"));
    }
}
