package com.example.OrdenarArreglos;

public class OrdenarArreglosD {
    /*
     * Diseñar una función que permita ordenar las ventas primero las partes y luego
     * en impares e invocar la función para probarla
     */
    public static void ordenarVentasPartesImpares(int[] ventas) {
        for (int i = 0; i < ventas.length - 1; i++) {
            for (int j = i + 1; j < ventas.length; j++) {
                if (ventas[i] % 2 == 0 && ventas[j] % 2 != 0) {
                    int aux = ventas[i];
                    ventas[i] = ventas[j];
                    ventas[j] = aux;
                }
            }
        }
        System.out.println("Ventas ordenadas primero las partes y luego las impares:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println(ventas[i]);
        }
    }
}
