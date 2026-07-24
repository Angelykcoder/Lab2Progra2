package POO;

public class Cuenta {

    // Ejercicio 24: Atributo saldo (privado -> encapsulamiento)
    private double saldo;

    // Ejercicio 24: Constructor con saldo inicial
    public Cuenta(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    // Ejercicio 25: Método para depositar
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser mayor a 0.");
        }
        saldo += monto;
        System.out.printf("Depósito exitoso de $%.2f. Nuevo saldo: $%.2f%n", monto, saldo);
    }

    // Ejercicio 26 y 28: Método para retirar, validando que no se retire
    // más de lo disponible. En vez de solo imprimir un mensaje de error,
    // se lanza una excepción propia (SaldoInsuficienteException) para que
    // quien use la clase pueda manejarla con try-catch (ver Main.java).
    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser mayor a 0.");
        }
        if (monto > saldo) {
            throw new SaldoInsuficienteException(
                "Saldo insuficiente para retirar $" + monto + ". (Disponible: $" + saldo + ")"
            );
        }
        saldo -= monto;
        System.out.printf("Retiro exitoso de $%.2f. Saldo restante: $%.2f%n", monto, saldo);
    }

    // Ejercicio 27: Mostrar saldo
    public void mostrarSaldo() {
        System.out.printf("Saldo actual en la cuenta: $%.2f%n", saldo);
    }
}
