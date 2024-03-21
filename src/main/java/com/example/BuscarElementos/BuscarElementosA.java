package com.example.BuscarElementos;

public class BuscarElementosA {

    public static int buscarVentaMasAlta(int[] ventas) {
        int ventaMasAlta = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > ventaMasAlta) {
                ventaMasAlta = ventas[i];
            }
        }
        System.out.println("La venta más alta es: " + ventaMasAlta);
        return ventaMasAlta;
    }
}
