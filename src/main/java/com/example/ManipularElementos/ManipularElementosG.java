package com.example.ManipularElementos;

import java.util.Random;

public class ManipularElementosG {
    public static void main(String[] args) {

        Random random = new Random();
        // inicializar ventas con una cantidad aleatoria de elementos
        int cantidad = random.nextInt(100) + 1;
        int[] ventas = new int[cantidad];

        // meterle valores aleatorios a las ventas
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = random.nextInt(1000) + 1;
            // Imprimir los valores de cada venta
            System.out.println("venta # " + (i + 1) + ": " + ventas[i]);
        }
        // imprimir el total de ventas
        System.out.println("Total de ventas: " + ventas.length);
        // Suma de cada una de las ventas
        int suma = 0;
        for (int i = 0; i < ventas.length; i++) {
            suma += ventas[i];
        }
        System.out.println("Suma de ventas: " + suma);

    }
}
