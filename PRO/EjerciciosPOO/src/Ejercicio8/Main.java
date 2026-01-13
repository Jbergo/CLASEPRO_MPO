package Ejercicio8;

/*
Crea una clase Empleado con atributos nombre, puesto y salario.
En el método main, crea un array de 5 empleados, inicialízalos con datos
y luego muestra: todos los empleados, el empleado con mayor salario y el salario promedio.
 */

public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[5];
        empleados[0] = new Empleado("Ana", "Programadora", 35000);
        empleados[1] = new Empleado("Luis", "Diseñador", 28000);
        empleados[2] = new Empleado("Marta", "Project Manager", 42000);
        empleados[3] = new Empleado("Carlos", "Tester", 32000);
        empleados[4] = new Empleado("Elena", "Analista", 26000);

        int acum = 1;
        Empleado salario = empleados[0];
        double promedio = 0;
        System.out.println("Lista de empleados");
        for (Empleado empleado : empleados) {
            System.out.println(acum + " " + empleado.getNombre() + " - " + empleado.getPuesto() + " - " + empleado.getSalario() + " euros");

            if (empleado.getSalario() > salario.getSalario()) {
                salario = empleado;
            }

            promedio += empleado.getSalario();
        }

        System.out.println("Empleado con mayor salario: " + salario.getNombre() + " - " + salario.getSalario());
        System.out.println("Salario promedio: " + promedio/empleados.length);
    }
}
