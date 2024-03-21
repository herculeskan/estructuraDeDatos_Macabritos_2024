package com.example.BuscarElementos;

public class BuscarElementosE {
    /*
     * Diseñar una función que devuelva la venta cuyo valor se acerque más al valor
     * que le sigue al promedio e invocar la función para probarla.
     */
    public static void obtenerVentaCercanaPromedio(int[] ventas) {
        int totalVentas = 0;
        for (int i = 0; i < ventas.length; i++) {
            totalVentas += ventas[i];
        }
        int promedio = totalVentas / ventas.length;
        int ventaCercana = ventas[0];
        int diferencia = Math.abs(ventas[0] - promedio);
        for (int i = 1; i < ventas.length; i++) {
            if (Math.abs(ventas[i] - promedio) < diferencia) {
                ventaCercana = ventas[i];
                diferencia = Math.abs(ventas[i] - promedio);
            }
        }
        System.out.println("Venta cercana al promedio: " + ventaCercana);
    }
}
