package POO;

/**
 * Excepción personalizada (checked exception) que se lanza cuando
 * se intenta retirar de una Cuenta un monto mayor al saldo disponible.
 * Se usa junto con try-catch en Main para manejar el error de forma controlada.
 */
public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
