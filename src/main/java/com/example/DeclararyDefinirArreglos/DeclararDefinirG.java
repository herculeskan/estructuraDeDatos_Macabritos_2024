package com.example.DeclararyDefinirArreglos;

import java.util.Scanner;

public class DeclararDefinirG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Select data structure type
        System.out.println("Seleccione el tipo de estructura de datos (1-3):");
        System.out.println("1. Simples");
        System.out.println("2. Circulares");
        System.out.println("3. Enlazadas");
        int estructuraTipoDato = scanner.nextInt();

        // Selecciona la estructura y ordena si es aplicable
        int tipoOrden = 0;
        if (estructuraTipoDato == 1 || estructuraTipoDato == 2) {
            System.out.println("Seleccione el tipo de ordenamiento (1-3):");
            System.out.println("1. Primero en entrar, Primero en Salir (FIFO)");
            System.out.println("2. Último en entrar, Primero en salir (LIFO)");
            System.out.println("3. Primero en entrar, Último en salir (FILO)");
            tipoOrden = scanner.nextInt();
        }

        // Estructura clave-valor si esta aplicada
        int estructuraClaveValor = 0;
        if (estructuraTipoDato == 3) {
            System.out.println("Seleccione la estructura para pares clave-valor (1-2):");
            System.out.println("1. Diccionario");
            System.out.println("2. Tabla hash");
            estructuraClaveValor = scanner.nextInt();
        }

        // Estructuras no repetidas
        System.out.println("Seleccione la estructura para elementos no repetidos (1-2):");
        System.out.println("1. Conjunto");
        System.out.println("2. Lista ordenada");
        int estructuraNoRepetida = scanner.nextInt();

        // Resultado que se meustra en pantalla
        System.out.println("\nResultados:");
        System.out.println("Tipo de estructura de datos: " + estructuraTipoDato);
        if (estructuraTipoDato == 1 || estructuraTipoDato == 2) {
            System.out.println("Tipo de ordenamiento: " + tipoOrden);
        }
        if (estructuraTipoDato == 3) {
            System.out.println("Tipo de estructura para pares clave-valor: " + estructuraClaveValor);
        }
        System.out.println("Tipo de estructura para elementos no repetidos: " + estructuraNoRepetida);

        scanner.close();
    }
}
