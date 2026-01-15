package Ejercicio3;

/*
**Objetivo:** Crear una clase que simule una cuenta bancaria con operaciones básicas.

**Requisitos:**

1. Crear una clase `CuentaBancaria` con atributos: `titular` (String), `numeroCuenta` (String), `saldo` (double).
2. Crear constructor que inicialice titular y numeroCuenta. El saldo inicial debe ser 0.
3. Crear getters. El saldo NO debe tener setter público.
4. Crear método `void ingresar(double cantidad)` que añada dinero al saldo si la cantidad es positiva.
5. Crear método `boolean retirar(double cantidad)` que retire dinero si hay saldo suficiente y la cantidad es positiva. Devuelve `true` si la operación tiene éxito.
6. Crear método `void transferir(CuentaBancaria destino, double cantidad)` que transfiera dinero a otra cuenta.
7. Crear método `void mostrarInfo()` que muestre titular, número de cuenta y saldo actual.
8. En el `main`, crear dos cuentas y realizar varias operaciones.
 */

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("das", "fs809");
        CuentaBancaria cuenta = new CuentaBancaria("jorge", "sdf089f0s");
        cuenta.ingresar(5000);
        cuenta.retirar(2000);
        cuenta.transferir(cuenta1,1000.0);
        cuenta.mostrarInfo();
        cuenta1.retirar(500);
        cuenta1.mostrarInfo();

    }
}
