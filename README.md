# Lab2Progra2

Laboratorio 2 del curso de Programación 2. Ejercicios en Java sobre fundamentos del lenguaje, arreglos/métodos y Programación Orientada a Objetos.

## Estructura

```
PrograLab2/
├── Fundamentosjava.java   # Fundamentos de Java (40 ejercicios)
├── ArreglosMetodos.java   # Arreglos y métodos
└── POO/                   # Programación Orientada a Objetos
    ├── Persona.java
    ├── Auto.java
    ├── Producto.java
    ├── Cuenta.java
    ├── SaldoInsuficienteException.java
    └── Main.java
```

## Contenido

- **Fundamentosjava.java**: tipos de datos, entrada con `Scanner`, condicionales, ciclos y manejo básico de excepciones.
- **ArreglosMetodos.java**: creación y recorrido de arreglos, búsqueda de mayor/menor, métodos reutilizables.
- **POO/**: clases con encapsulamiento, constructores sobrecargados, validaciones y una excepción personalizada (`SaldoInsuficienteException`).

## Ejecución

Requiere JDK 8+.

```bash
# Fundamentos y arreglos
javac Fundamentosjava.java && java Fundamentosjava
javac ArreglosMetodos.java && java ArreglosMetodos

# POO (ejecutar desde PrograLab2/)
javac POO/*.java && java POO.Main
```

## Autora

[Angelykcoder](https://github.com/Angelykcoder)
