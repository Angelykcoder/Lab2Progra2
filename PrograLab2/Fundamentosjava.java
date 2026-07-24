import java.util.Scanner;

public class Fundamentosjava {

    public static void main(String[] args) {

        // Un solo Scanner para todo el programa (se reutiliza en vez de crear uno por ejercicio)
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1
        System.out.println();
        System.out.println("Ejercicio 1 ");
        System.out.println("Hola Mundo");

        // Ejercicio 2
                System.out.println();
        System.out.println("Ejercicio 2 ");
        System.out.println("DIEGO");

        // Ejercicio 3
                System.out.println();
        System.out.println("Ejercicio 3 ");
        int numeroEntero = 20;
        System.out.println(numeroEntero);

        // Ejercicio 4
                System.out.println();
        System.out.println("Ejercicio 4 ");
        double numeroDecimal = 23.5;
        System.out.println(numeroDecimal);

        // Ejercicio 5
                System.out.println();
        System.out.println("Ejercicio 5 ");
        String ciudad = "Guatemala";
        System.out.println(ciudad);

        // Ejercicio 6
                System.out.println();
        System.out.println("Ejercicio 6 ");
        double suma = numeroEntero + numeroDecimal;
        System.out.println("El resultado es " + suma);

        // Ejercicio 7
                System.out.println();
        System.out.println("Ejercicio 7 ");
        double resta = numeroEntero - numeroDecimal;
        System.out.println("El resultado es " + resta);

        // Ejercicio 8
                System.out.println();
        System.out.println("Ejercicio 8 ");
        double multiplicacion = numeroEntero * numeroDecimal;
        System.out.println("El resultado es " + multiplicacion);

        // Ejercicio 9
                System.out.println();
        System.out.println("Ejercicio 9 ");
        double division = numeroEntero / numeroDecimal;
        System.out.println("El resultado es " + division);

        // Ejercicio 10
                System.out.println();
        System.out.println("Ejercicio 10 ");
        System.out.println("Los resultados son:");
        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Multiplicación = " + multiplicacion);
        System.out.println("División = " + division);

        // Ejercicio 11
                System.out.println();
        System.out.println("Ejercicio 11 ");
        int numero1 = 15;
        int numero2 = 10;

        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else {
            System.out.println(numero1 + " es menor que " + numero2);
        }

        // Ejercicio 12
                System.out.println();
        System.out.println("Ejercicio 12 ");
        int numeroNegativo = -15;

        if (numeroNegativo > 0) {
            System.out.println(numeroNegativo + " es un número positivo");
        } else {
            System.out.println(numeroNegativo + " es un número negativo");
        }

        // Ejercicio 13
                System.out.println();
        System.out.println("Ejercicio 13 ");
        int numeroParImpar = 10;

        if (numeroParImpar % 2 == 0) {
            System.out.println(numeroParImpar + " es un número par");
        } else {
            System.out.println(numeroParImpar + " es un número impar");
        }

        // Ejercicio 14
                System.out.println();
        System.out.println("Ejercicio 14 ");
        int valor = 5;
        System.out.println("El valor actual es: " + valor);
        valor = 12;
        System.out.println("El valor guardado es: " + valor);

        // Ejercicio 15
                System.out.println();
        System.out.println("Ejercicio 15 ");
        String saludo = "Hola";
        String nombre = "Dulce";
        System.out.println(saludo + " " + nombre);

        // Ejercicio 16
                System.out.println();
        System.out.println("Ejercicio 16 ");
        int longitudNombre = nombre.length();
        System.out.println("El nombre  " + nombre + " tiene " + longitudNombre + " letras.");

        // Ejercicio 17
                System.out.println();
        System.out.println("Ejercicio 17 ");
        String textoMayusculas = nombre.toUpperCase();
        System.out.println(textoMayusculas);

        // Ejercicio 18
                System.out.println();
        System.out.println("Ejercicio 18 ");
        String textoOriginal = "BUEN DIA";
        String textoMinusculas = textoOriginal.toLowerCase();
        System.out.println(textoMinusculas);

        // Ejercicio 19
                System.out.println();
        System.out.println("Ejercicio 19 ");
        String texto1 = "DIEGO";
        String texto2 = "Rachell";
        // Los String se comparan con equals(), no con == (== compara referencias, no contenido)
        if (texto1.equals(texto2)) {
            System.out.println("los textos coinciden");
        } else {
            System.out.println("los textos no coinciden");
        }

        // Ejercicio 20
                System.out.println();
        System.out.println("Ejercicio 20 ");
        char primeraLetra = texto1.charAt(0);
        System.out.println(" la primer letra del texto es " + primeraLetra);

        // Ejercicio 21
                System.out.println();
        System.out.println("Ejercicio 21 ");
        System.out.println("los numero del 1 al 10 son: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Ejercicio 22
                System.out.println();
        System.out.println("Ejercicio 22 ");
        System.out.println("los numero del 10 al 1 son: ");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Ejercicio 23
                System.out.println();
        System.out.println("Ejercicio 23 ");
        System.out.println("los numeros pares del 1 al 20 son:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Ejercicio 24
                System.out.println();
        System.out.println("Ejercicio 24 ");
        System.out.println("los numeros impares del 1 al 20 son:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // Ejercicio 25
                System.out.println();
        System.out.println("Ejercicio 25 ");
        System.out.println("suma de numeros del 1 al 5: ");
        int sumaAcumulada = 0;
        for (int i = 1; i <= 5; i++) {
            sumaAcumulada += i;
        }
        System.out.println(sumaAcumulada);

        // Ejercicio 26
                System.out.println();
        System.out.println("Ejercicio 26 ");
        System.out.println("suma de numeros del 1 al 5 con while: ");
        int contador = 1;
        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        // Ejercicio 27
                System.out.println();
        System.out.println("Ejercicio 27 ");
        System.out.println(" repetir la palabra Carro 5 veces ");
        for (int i = 1; i <= 5; i++) {
            System.out.println(" Carro ");
        }

        // Ejercicio 28
                System.out.println();
        System.out.println("Ejercicio 28 ");
        int tabla = 5;
        System.out.println("--- TABLA DEL " + tabla + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }

        // Ejercicio 29
                System.out.println();
        System.out.println("Ejercicio 29 ");
        System.out.println("Los cuadrados ");
        for (int i = 1; i <= 5; i++) {
            int cuadrado = i * i;
            System.out.println("El cuadrado de " + i + " es: " + cuadrado);
        }

        // Ejercicio 30
                System.out.println();
        System.out.println("Ejercicio 30 ");
        System.out.println("Los cubos ");
        for (int i = 1; i <= 5; i++) {
            int cubo = i * i * i;
            System.out.println("El cubo de " + i + " es: " + cubo);
        }

        // Ejercicio 31
                System.out.println();
        System.out.println("Ejercicio 31 ");
        try {
            System.out.print("Ingresa un numero: ");
            int numeroIngresado = Integer.parseInt(scanner.nextLine());
            System.out.println("El numero ingresado es: " + numeroIngresado);
        } catch (NumberFormatException e) {
            System.out.println("Eso no es un número válido.");
        }

        // Ejercicio 32
                System.out.println();
        System.out.println("Ejercicio 32 ");
        try {
            System.out.print("Ingresa un numero: ");
            int primerNumero = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingresa otro numero: ");
            int segundoNumero = Integer.parseInt(scanner.nextLine());

            int sumaIngresados = primerNumero + segundoNumero;
            System.out.println("la suma es: " + sumaIngresados);
        } catch (NumberFormatException e) {
            System.out.println("Eso no es un número válido.");
        }

        // Ejercicio 33
                System.out.println();
        System.out.println("Ejercicio 33 ");
        System.out.print("Ingrese su nombre ");
        String nombreIngresado = scanner.nextLine();

        try {
            System.out.print("Ingrese su edad ");
            int edad = Integer.parseInt(scanner.nextLine());
            System.out.println("Su nombre es: " + nombreIngresado + " y tiene " + edad + " años ");
        } catch (NumberFormatException e) {
            System.out.println("Eso no es una edad válida.");
        }

        // Ejercicio 34
                System.out.println();
        System.out.println("Ejercicio 34 ");
        try {
            System.out.print("Ingrese un numero ");
            int n1 = Integer.parseInt(scanner.nextLine());
            int doble = n1 * 2;
            System.out.println("El doble del numero es: " + doble);
        } catch (NumberFormatException e) {
            System.out.println("Eso no es un número válido.");
        }

        // Ejercicio 35
                System.out.println();
        System.out.println("Ejercicio 35 ");
        try {
            System.out.print("Ingrese un numero ");
            int n2 = Integer.parseInt(scanner.nextLine());
            int triple = n2 * 3;
            System.out.println("El triple del numero es: " + triple);
        } catch (NumberFormatException e) {
            System.out.println("Eso no es un número válido.");
        }

        // Ejercicio 36
                System.out.println();
        System.out.println("Ejercicio 36 ");
        try {
            System.out.print("Ingrese un numero ");
            int n3 = Integer.parseInt(scanner.nextLine());
            double mitad = n3 / 2.0;
            System.out.println("La mitad  del numero es: " + mitad);
        } catch (NumberFormatException e) {
            System.out.println("Eso no es un número válido.");
        }

        // Ejercicio 37
                System.out.println();
        System.out.println("Ejercicio 37 ");
        System.out.print("Ingrese una palabra ");
        String palabraRepetida = scanner.nextLine();
        for (int i = 1; i <= 3; i++) {
            System.out.println(palabraRepetida);
        }

        // Ejercicio 38
                System.out.println();
        System.out.println("Ejercicio 38 ");
        try {
            System.out.print("Ingrese un numero ");
            int n4 = Integer.parseInt(scanner.nextLine());
            if (n4 >= 10) {
                System.out.println(n4 + " es mayor que 10");
            } else {
                System.out.println(n4 + " es menor que 10 ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Eso no es un número válido.");
        }

        // Ejercicio 39
                System.out.println();
        System.out.println("Ejercicio 39 ");
        try {
            System.out.print("Ingrese un numero ");
            int n5 = Integer.parseInt(scanner.nextLine());
            if (n5 < 0) {
                System.out.println(n5 + " es menor que 0 ");
            } else {
                System.out.println(n5 + " es mayor que 0 ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Eso no es un número válido.");
        }

        // Ejercicio 40
                System.out.println();
        System.out.println("Ejercicio 40 ");
        System.out.print("Ingrese una palabra ");
        String palabraFinal = scanner.nextLine();
        int longitudPalabra = palabraFinal.length();
        System.out.println("La palabra " + palabraFinal + " tiene " + longitudPalabra + " letras ");

        scanner.close();
    }
}