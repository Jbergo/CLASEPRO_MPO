package Ejercicio5;

/*
Crea una clase Empleado con atributos nombre y salarioBase.
Crea dos clases hijas: Gerente (con atributo bonus) y Desarrollador (con atributo lenguajePrincipal).
Implementa un método calcularSalarioTotal() en Gerente que sume el bonus al salario base.
Crea objetos de ambos tipos y muestra su información completa.
 */

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana García", 40000, 10000);
        System.out.println("Empleado: " + gerente.getNombre());
        System.out.println("Puesto: Gerente");
        System.out.println("Bonus: " + gerente.getBonus());
        System.out.println("Salario Total: " + gerente.calcularSalarioTotal());

        Desarrollador desarrollador = new Desarrollador("Luis Martínez", 35000, "Java");
        System.out.println("Empleado: " + desarrollador.getNombre());
        System.out.println("Puesto: Desarrollador");
        System.out.println("Bonus: " + desarrollador.getLenguajePrincipal());
    }
}
