package com.example.OrdenarArreglos;

public class OrnedarArreglosA {
    // Diseñar una función que permita ordenar las ventas de forma descendente e
    // invocar la función para probarla.
    public static void ordenarVentasDescendente(int[] ventas) {
        for (int i = 0; i < ventas.length - 1; i++) {
            for (int j = i + 1; j < ventas.length; j++) {
                if (ventas[i] < ventas[j]) {
                    int aux = ventas[i];
                    ventas[i] = ventas[j];
                    ventas[j] = aux;
                }
            }
        }
        System.out.println("Ventas ordenadas de forma descendente:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println(ventas[i]);
        }
    }
}
