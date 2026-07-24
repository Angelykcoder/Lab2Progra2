package POO;

public class Main {
    public static void main(String[] args) {

        // ===== Ejercicios 1-10: PRUEBA DE PERSONAS =====
        System.out.println("=== PRUEBA DE PERSONAS ===");
        try {
            // Ejercicio 2, 3 y 4: crear objeto y asignar/mostrar nombre
            Persona persona1 = new Persona("Carlos"); // Constructor con solo nombre (Ejercicio 7)
            persona1.setEdad(25); // Ejercicio 5: asignar edad de forma controlada (con validación)
            System.out.println("Nombre desde el objeto: " + persona1.getNombre());
            persona1.mostrarDatos();

            // Ejercicio 9 y 10: crear varias personas y mostrar sus datos
            Persona persona2 = new Persona("Ana", 30); // Constructor con nombre y edad (Ejercicio 8)
            Persona persona3 = new Persona("Luis", 19);
            persona2.mostrarDatos();
            persona3.mostrarDatos();

            // Ejemplo de validación: intentar crear una persona con edad negativa
            Persona personaInvalida = new Persona("Pedro", -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear/modificar una persona: " + e.getMessage());
        }

        // ===== Ejercicios 11-18: PRUEBA DE AUTOS =====
        System.out.println("\n=== PRUEBA DE AUTOS ===");
        try {
            Auto auto1 = new Auto("Toyota"); // Ejercicio 11 y 12
            Auto auto2 = new Auto("Ford");

            auto1.acelerar(80); // Ejercicio 15
            auto1.frenar(20);   // Ejercicio 16
            auto1.mostrarVelocidad(); // Ejercicio 17

            auto2.acelerar(100);
            auto1.compararVelocidad(auto2); // Ejercicio 18
        } catch (IllegalArgumentException e) {
            System.out.println("Error con los autos: " + e.getMessage());
        }

        // ===== Ejercicios 19-23: PRUEBA DE PRODUCTOS =====
        System.out.println("\n=== PRUEBA DE PRODUCTOS ===");
        try {
            // Ejercicio 22: crear varios productos
            Producto producto1 = new Producto("Laptop", 850.50);
            Producto producto2 = new Producto("Mouse", 15.00);
            Producto producto3 = new Producto("Teclado", 45.90);

            producto1.mostrarProducto(); // Ejercicio 21 y 23
            producto2.mostrarProducto();
            producto3.mostrarProducto();
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear un producto: " + e.getMessage());
        }

        // ===== Ejercicios 24-29: PRUEBA DE CUENTAS BANCARIAS =====
        System.out.println("\n=== PRUEBA DE CUENTAS BANCARIAS ===");
        // Ejercicio 29: crear varios objetos cuenta
        Cuenta cuenta1 = new Cuenta(500.0);
        Cuenta cuenta2 = new Cuenta(100.0);

        cuenta1.mostrarSaldo();
        cuenta1.depositar(200.0);

        // Ejercicio 28: validar que no retire más de lo disponible.
        // Como retirar() puede lanzar SaldoInsuficienteException, se usa try-catch
        // para manejar el error sin detener el programa.
        try {
            cuenta1.retirar(1000.0); // Intento de retirar más de lo disponible (debe fallar)
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            cuenta1.retirar(300.0); // Retiro válido
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("---");
        cuenta2.mostrarSaldo();
        cuenta2.depositar(50.0);
    }
}
