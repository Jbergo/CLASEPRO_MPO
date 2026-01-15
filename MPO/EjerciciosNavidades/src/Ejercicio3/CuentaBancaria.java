package Ejercicio3;

public class CuentaBancaria {
    private String titular, numCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numCuenta) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double cantidad){
        if (cantidad > 0) {
            setSaldo(saldo+=cantidad);
        }
    }

    public boolean retirar(double cantidad){
        if (cantidad>0&&getSaldo()>0){
            setSaldo(saldo-=cantidad);
            return true;
        }
        return false;
    }

    public void transferir(CuentaBancaria destino, double cantidad){
        if (cantidad > 0){
            setSaldo(saldo-=cantidad);
            destino.setSaldo(cantidad);
        }
    }

    public void mostrarInfo(){
        System.out.println("titular = " + getTitular());
        System.out.println("numCuenta = " + getNumCuenta());
        System.out.println("saldo = " + getSaldo());
    }
}
