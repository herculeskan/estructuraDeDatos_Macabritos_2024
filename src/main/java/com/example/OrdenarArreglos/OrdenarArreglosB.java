package com.example.OrdenarArreglos;

public class OrdenarArreglosB {
    // Diseñar una función que permita ordenamiento que permita ordenar las ventas
    // de forma ascendente e invocar la función para probarla.
    public static void ordenarVentasAscendente(int[] ventas) {
        for (int i = 0; i < ventas.length - 1; i++) {
            for (int j = i + 1; j < ventas.length; j++) {
                if (ventas[i] > ventas[j]) {
                    int aux = ventas[i];
                    ventas[i] = ventas[j];
                    ventas[j] = aux;
                }
            }
        }
        System.out.println("Ventas ordenadas de forma ascendente:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println(ventas[i]);
        }
    }
}
