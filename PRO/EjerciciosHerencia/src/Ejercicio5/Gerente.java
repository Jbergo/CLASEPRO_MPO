package Ejercicio5;

public class Gerente extends Empleado{
    private double bonus;

    public Gerente(String nombre, double salarioBase, double bonus) {
        super(nombre, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcularSalarioTotal() {
        return getSalarioBase()+bonus;
    }
}
