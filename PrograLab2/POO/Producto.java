package POO;

public class Producto {

    // Ejercicio 19 y 20: Atributos nombre y precio (privados -> encapsulamiento)
    private String nombre;
    private double precio;

    // Ejercicio 19 y 20: Constructor con nombre y precio, con validaciones
    public Producto(String nombre, double precio) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Ejercicio 23: Método para mostrar producto
    public void mostrarProducto() {
        System.out.printf("Producto: %s | Precio: $%.2f%n", nombre, precio);
    }
}
