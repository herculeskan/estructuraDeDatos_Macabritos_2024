package com.example.BuscarElementos;

public class BuscarElementosD {
    /*
     * Diseñar una función que permita obtener el promedio de las ventas e invocar
     * la función para probarla.
     */
    public static void obtenerPromedioVentas(int[] ventas) {
        int totalVentas = 0;
        for (int i = 0; i < ventas.length; i++) {
            totalVentas += ventas[i];
        }
        System.out.println("Promedio de ventas: " + totalVentas / ventas.length);
    }
}
