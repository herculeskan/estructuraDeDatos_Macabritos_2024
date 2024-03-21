package com.example.ManipularElementos;

import java.util.Random;

public class ManipularElementosE {

    // Inicializar el arreglo ventas con una cantidad aleatoria de elementos.
    // Importamos la clase Random

    // Se crea el objeto random
    public static void main(String[] args) {

        Random random = new Random();
        // inicializar ventas con una cantidad aleatoria de elementos
        int cantidad = random.nextInt(100) + 1;
        int[] ventas = new int[cantidad];
        // Mostrar la cantidad de ventas

        System.out.println("Cantidad de ventas: " + ventas.length);
    }

}