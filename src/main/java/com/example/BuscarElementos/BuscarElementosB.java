package com.example.BuscarElementos;

public class BuscarElementosB {
    // Diseñar una función que permita buscar la venta más baja
    public static void buscarVentaMasBaja(int[] ventas) {
        int ventaMasBaja = ventas[0];
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] < ventaMasBaja) {
                ventaMasBaja = ventas[i];
            }
        }
        System.out.println("La venta más baja es: " + ventaMasBaja);
    }

}
