public class ArreglosMetodos {
    
    public static void main(String[] args) {

        System.out.println("=== BLOQUE 1: ARREGLOS (VECTORES) ===\n");

        // 1. Crear arreglo de 3 números e imprimirlos
        int[] num3 = {10, 20, 30};
        System.out.print("Arreglo de 3 números: ");
        for (int n : num3) System.out.print(n + " ");
        System.out.println();

        // 2. Crear arreglo de 5 números e imprimirlos
        int[] num5 = {5, 12, 8, 25, 3};
        System.out.print("Arreglo de 5 números: ");
        for (int n : num5) System.out.print(n + " ");
        System.out.println();

        // 3. Sumar elementos de un arreglo pequeño
        int suma = 0;
        for (int n : num3) suma += n;
        System.out.println("Suma de arreglo pequeño (10+20+30): " + suma);

        // 4. Mostrar el mayor de un arreglo de 3 números
        int mayor3 = num3[0];
        for (int n : num3) if (n > mayor3) mayor3 = n;
        System.out.println("Mayor de arreglo de 3 números: " + mayor3);

        // 5. Mostrar el menor de un arreglo
        int menor = num5[0];
        for (int n : num5) if (n < menor) menor = n;
        System.out.println("Menor del arreglo de 5 números: " + menor);

        // 6. Contar cuántos elementos tiene el arreglo
        System.out.println("Cantidad de elementos en el arreglo num5: " + num5.length);

        // 7. Imprimir cada elemento con 'for' tradicional
        System.out.print("Imprimiendo con 'for' tradicional: ");
        for (int i = 0; i < num5.length; i++) {
            System.out.print(num5[i] + " ");
        }
        System.out.println("\n");

        // 8. Crear un arreglo de nombres e imprimirlos
        String[] nombres = {"Ana", "Carlos", "Sofía", "Diego"};
        System.out.print("Arreglo de nombres: ");
        for (String nombre : nombres) System.out.print(nombre + " ");
        System.out.println();

        // 9. Mostrar el primer elemento del arreglo
        System.out.println("Primer nombre: " + nombres[0]);

        // 10. Mostrar el último elemento
        System.out.println("Último nombre: " + nombres[nombres.length - 1]);


        System.out.println("\n=== BLOQUE 2: PRUEBA DE MÉTODOS ===\n");

        // Probamos los métodos creados abajo
        imprimirHola();                           // Mét. 1
        imprimirNumero(42);                        // Mét. 2
        sumarImprimir(10, 5);                      // Mét. 3
        restarImprimir(10, 5);                     // Mét. 4
        multiplicarImprimir(4, 3);                 // Mét. 5
        dividirImprimir(20, 4);                    // Mét. 6
        System.out.println("Número fijo: " + obtenerNumeroFijo()); // Mét. 7
        System.out.println("Suma retornada: " + sumar(15, 25));    // Mét. 8
        System.out.println("El mayor de dos números es: " + obtenerMayor(18, 9)); // Mét. 9
        System.out.println("¿El 8 es par? " + esPar(8));          // Mét. 10
        imprimirTexto("Aprender Java es paso a paso.");             // Mét. 11
        saludar("María");                          // Mét. 12
        imprimirDel1Al5();                         // Mét. 13
        imprimirParesDel2Al10();                    // Mét. 14
        System.out.println("El doble de 7 es: " + calcularDoble(7)); // Mét. 15
        System.out.println("El triple de 7 es: " + calcularTriple(7)); // Mét. 16
        System.out.println("Mayúsculas: " + aMayusculas("java"));   // Mét. 17
        System.out.println("Cantidad de caracteres de 'Programación': " + contarCaracteres("Programación")); // Mét. 18
        compararNumeros(10, 20);                   // Mét. 19
        System.out.println("¿El 15 es positivo? " + esPositivo(15)); // Mét. 20
    }

    // =======================================================
    // DEFINICIÓN DE LOS MÉTODOS (FUNCIONES)
    // =======================================================

    // Método 1: Imprimir "Hola"
    public static void imprimirHola() {
        System.out.println("Hola");
    }

    // Método 2: Recibir un número e imprimirlo
    public static void imprimirNumero(int num) {
        System.out.println("El número ingresado es: " + num);
    }

    // Método 3: Sumar dos números (imprime directamente)
    public static void sumarImprimir(int a, int b) {
        System.out.println("Suma de " + a + " + " + b + " = " + (a + b));
    }

    // Método 4: Restar dos números
    public static void restarImprimir(int a, int b) {
        System.out.println("Resta de " + a + " - " + b + " = " + (a - b));
    }

    // Método 5: Multiplicar dos números
    public static void multiplicarImprimir(int a, int b) {
        System.out.println("Multiplicación de " + a + " * " + b + " = " + (a * b));
    }

    // Método 6: Dividir dos números
    public static void dividirImprimir(double a, double b) {
        if (b != 0) {
            System.out.println("División de " + a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }

    // Método 7: Retornar un número fijo
    public static int obtenerNumeroFijo() {
        return 100;
    }

    // Método 8: Retornar la suma de dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método 9: Retornar el mayor de dos números
    public static int obtenerMayor(int a, int b) {
        return (a > b) ? a : b;
    }

    // Método 10: Indicar si un número es par
    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    // Método 11: Recibir un texto e imprimirlo
    public static void imprimirTexto(String texto) {
        System.out.println(texto);
    }

    // Método 12: Recibir nombre y saludar
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido/a.");
    }

    // Método 13: Imprimir números del 1 al 5
    public static void imprimirDel1Al5() {
        System.out.print("Números del 1 al 5: ");
        for (int i = 1; i <= 5; i++) System.out.print(i + " ");
        System.out.println();
    }

    // Método 14: Imprimir números pares (del 2 al 10 como ejemplo)
    public static void imprimirParesDel2Al10() {
        System.out.print("Pares del 2 al 10: ");
        for (int i = 2; i <= 10; i += 2) System.out.print(i + " ");
        System.out.println();
    }

    // Método 15: Calcular el doble de un número
    public static int calcularDoble(int num) {
        return num * 2;
    }

    // Método 16: Calcular el triple
    public static int calcularTriple(int num) {
        return num * 3;
    }

    // Método 17: Convertir texto a mayúsculas
    public static String aMayusculas(String texto) {
        return texto.toUpperCase();
    }

    // Método 18: Contar caracteres de una cadena
    public static int contarCaracteres(String texto) {
        return texto.length();
    }

    // Método 19: Comparar dos números
    public static void compararNumeros(int a, int b) {
        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else if (a < b) {
            System.out.println(a + " es menor que " + b);
        } else {
            System.out.println(a + " y " + b + " son iguales");
        }
    }

    // Método 20: Validar si un número es positivo
    public static boolean esPositivo(int num) {
        return num > 0;
    }
}