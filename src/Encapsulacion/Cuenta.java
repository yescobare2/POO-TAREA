package Encapsulacion;

public class Cuenta {
    private String titular;
    private double saldo;

    // Constructor sin saldo negativo
    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = (saldoInicial < 0) ? 0 : saldoInicial;
    }

    // Método para sumar dinero al saldo actual
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito de Q" + monto + " exitoso.");
        }
    }

    // Método para restar dinero validando que no quede en negativo
    public void retirar(double monto) {
        if (monto > 0 && (saldo - monto) >= 0) {
            saldo -= monto;
            System.out.println("Retiro de Q" + monto + " realizado.");
        } else {
            System.out.println("Error: Fondos insuficientes para retirar Q" + monto);
        }
    }

    // Método para visualizar el saldo final
    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo actual: Q" + String.format("%.2f", saldo));
    }
}