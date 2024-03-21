package com.example.BuscarElementos;

public class BuscarElementosC {
    /*
     * Diseñar una función que permita obtener el total de las ventas e invocar la
     * función para probarla.
     * 
     */
    public static void obtenerTotalVentas(int[] ventas) {
        int totalVentas = 0;
        for (int i = 0; i < ventas.length; i++) {
            totalVentas += ventas[i];
        }
        System.out.println("Total de ventas: " + totalVentas);
    }

}