package POO;

public class Persona {

    // Ejercicio 1 y 5: Atributos nombre y edad (privados -> encapsulamiento)
    private String nombre;
    private int edad;

    // Ejercicio 7: Constructor con solo nombre.
    // Reutilización: en lugar de repetir la lógica de validación,
    // este constructor llama al constructor con nombre y edad (this(...)),
    // pasando 0 como edad por defecto.
    public Persona(String nombre) {
        this(nombre, 0);
    }

    // Ejercicio 8: Constructor con nombre y edad, con validaciones básicas.
    public Persona(String nombre, int edad) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre de la persona no puede estar vacío.");
        }
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters: permiten leer/asignar los atributos de forma controlada
    // (reemplazan el acceso directo p1.nombre / p1.edad = 25 del código original).
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreNuevo) {
        if (nombreNuevo == null || nombreNuevo.isBlank()) {
            throw new IllegalArgumentException("El nombre de la persona no puede estar vacío.");
        }
        this.nombre = nombreNuevo;
    }

    public int getEdad() {
        return edad;
    }

    // Ejercicio 5: método para asignar edad de forma segura (con validación)
    public void setEdad(int edadNueva) {
        if (edadNueva < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edadNueva;
    }

    // Ejercicio 6: Mostrar nombre y edad
    public void mostrarDatos() {
        System.out.println("Persona -> Nombre: " + nombre + " | Edad: " + edad);
    }
}
