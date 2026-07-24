Lab2Progra2

Laboratorio 2 del curso de Programación 2. Contiene ejercicios prácticos en Java que cubren fundamentos del lenguaje, manejo de arreglos y métodos, y Programación Orientada a Objetos (POO).

📁 Estructura del proyecto
Lab2Progra2/
└── PrograLab2/
    ├── Fundamentosjava.java     # Ejercicios 1-40: fundamentos de Java
    ├── ArreglosMetodos.java     # Ejercicios de arreglos y métodos
    └── POO/                     # Ejercicios de Programación Orientada a Objetos
        ├── Persona.java
        ├── Auto.java
        ├── Cuenta.java
        ├── Producto.java
        ├── SaldoInsuficienteException.java
        └── Main.java
📄 Descripción de los archivos
Fundamentosjava.java

Batería de 40 ejercicios introductorios que recorren los fundamentos de Java: impresión en consola, tipos de datos primitivos, entrada de datos con Scanner, estructuras condicionales, ciclos (for, while), operaciones con cadenas de texto y manejo básico de excepciones (try-catch con NumberFormatException).

ArreglosMetodos.java

Dividido en dos bloques:

Bloque 1 — Arreglos (vectores): creación de arreglos, suma de elementos, búsqueda de mayor/menor, conteo de elementos y recorridos con for tradicional y for-each.
Bloque 2 — Métodos: ejercicios enfocados en la creación y reutilización de métodos.
POO/ — Programación Orientada a Objetos

Conjunto de clases que aplican los pilares de la POO (encapsulamiento, validación de datos y manejo de excepciones personalizadas):

Clase	Descripción
Persona	Modela una persona con nombre y edad, incluye constructores sobrecargados y validaciones.
Auto	Simula un auto con marca y velocidadActual; permite acelerar y frenar sin bajar de 0.
Producto	Representa un producto con nombre y precio, con validación de valores negativos.
Cuenta	Simula una cuenta bancaria con depósitos y retiros, lanzando SaldoInsuficienteException cuando corresponde.
SaldoInsuficienteException	Excepción personalizada (checked exception) para manejar retiros que excedan el saldo disponible.
Main	Clase principal que instancia y prueba todas las clases anteriores.
▶️ Cómo ejecutar

Requisitos: tener instalado el JDK (Java Development Kit), versión 8 o superior.

Fundamentos y arreglos

Desde la carpeta PrograLab2:

bash
javac Fundamentosjava.java
java Fundamentosjava
bash
javac ArreglosMetodos.java
java ArreglosMetodos
Programación Orientada a Objetos

Como las clases usan el paquete POO, se debe compilar y ejecutar desde la carpeta raíz PrograLab2:

bash
javac POO/*.java
java POO.Main
🛠️ Conceptos aplicados
Encapsulamiento (atributos privados con getters y setters)
Constructores sobrecargados y reutilización de constructores (this(...))
Validación de datos de entrada
Excepciones personalizadas (checked exceptions)
Manejo de errores con try-catch
Arreglos, ciclos y métodos reutilizables
