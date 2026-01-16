package Ejercicio7;

public class Empleado {
    private String nombre, dni;
    private double salarioBase;
    private int horasExtra;

    public Empleado(String nombre, String dni, double salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.salarioBase = salarioBase;
        this.horasExtra = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public void agregarHorasExtras(int horas) {
        setHorasExtra(horasExtra += horas);
    }

    public double calcularSalarioTotal() {
        return getSalarioBase() + 20 * getHorasExtra();
    }

    public void aplicarAumento(double porcentaje){
        setSalarioBase(salarioBase+=(porcentaje/100));
    }

    public void resetearHorasExtra(){
        setHorasExtra(0);
    }

    public void mostrarInforme() {
        System.out.println("nombre = " + nombre);
        System.out.println("dni = " + dni);
        System.out.println("salarioBase = " + salarioBase);
        System.out.println("horasExtra = " + horasExtra);
        System.out.println("salario total = " + calcularSalarioTotal());
    }
}
