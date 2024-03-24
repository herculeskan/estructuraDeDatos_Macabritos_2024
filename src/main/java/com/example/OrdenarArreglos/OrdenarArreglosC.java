package com.example.OrdenarArreglos;

public class OrdenarArreglosC {
    // Diseñar una función que permite desordenar las ventas e invocar la función
    // para probarla.
    public static void desordenarVentas(int[] ventas) {
        for (int i = 0; i < ventas.length - 1; i++) {
            int j = (int) (Math.random() * ventas.length);
            int aux = ventas[i];
            ventas[i] = ventas[j];
            ventas[j] = aux;
        }
        System.out.println("Ventas desordenadas:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println(ventas[i]);
        }
    }
}
