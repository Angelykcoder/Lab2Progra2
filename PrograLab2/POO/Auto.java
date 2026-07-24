package POO;

public class Auto {

    // Ejercicio 11 y 14: Atributos marca y velocidad (privados -> encapsulamiento)
    private String marca;
    private int velocidadActual;

    // Ejercicio 11 y 12: Constructor con marca. La velocidad siempre inicia en 0.
    public Auto(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("La marca del auto no puede estar vacía.");
        }
        this.marca = marca;
        this.velocidadActual = 0; // Inicia detenido
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    // Ejercicio 15: acelerar (sumar velocidad)
    public void acelerar(int incrementoVelocidad) {
        if (incrementoVelocidad < 0) {
            throw new IllegalArgumentException("El incremento de velocidad debe ser un valor positivo.");
        }
        this.velocidadActual += incrementoVelocidad;
        System.out.println("El auto " + marca + " aceleró a " + velocidadActual + " km/h.");
    }

    // Ejercicio 16: frenar (restar velocidad, sin bajar de 0)
    public void frenar(int decrementoVelocidad) {
        if (decrementoVelocidad < 0) {
            throw new IllegalArgumentException("El decremento de velocidad debe ser un valor positivo.");
        }
        // Reutilización: Math.max evita repetir el if/else para no bajar de 0
        this.velocidadActual = Math.max(0, this.velocidadActual - decrementoVelocidad);
        System.out.println("El auto " + marca + " frenó a " + velocidadActual + " km/h.");
    }

    // Ejercicio 17: Mostrar velocidad actual
    public void mostrarVelocidad() {
        System.out.println("Velocidad actual de " + marca + ": " + velocidadActual + " km/h.");
    }

    // Ejercicio 18: Crear dos autos y compararlos
    public void compararVelocidad(Auto otroAuto) {
        if (otroAuto == null) {
            throw new IllegalArgumentException("No se puede comparar con un auto nulo.");
        }

        if (this.velocidadActual > otroAuto.velocidadActual) {
            System.out.println("El " + this.marca + " es más rápido que el " + otroAuto.marca);
        } else if (this.velocidadActual < otroAuto.velocidadActual) {
            System.out.println("El " + otroAuto.marca + " es más rápido que el " + this.marca);
        } else {
            System.out.println("Ambos autos van a la misma velocidad.");
        }
    }
}
