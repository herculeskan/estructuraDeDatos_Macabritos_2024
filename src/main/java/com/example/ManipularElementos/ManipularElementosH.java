package com.example.ManipularElementos;

import java.util.Random;

/*// - Importar venta más alta 
import com.example.BuscarElementos.BuscarElementosA;
// Importar venta más baja
import com.example.BuscarElementos.BuscarElementosB;
// Importar total de ventas
import com.example.BuscarElementos.BuscarElementosC;
 // Importar promedio de ventas
import com.example.BuscarElementos.BuscarElementosD;
*/

// Importar venta cercana al promedio
import com.example.BuscarElementos.BuscarElementosE;

public class ManipularElementosH {
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
        /*
         * // imprimir el total de ventas
         * BuscarElementosA.buscarVentaMasAlta(ventas);
         *
         * // Imprimir la venta más baja
         * BuscarElementosB.buscarVentaMasBaja(ventas);
         * // Imprimir el total de ventas
         * BuscarElementosC.obtenerTotalVentas(ventas);
         * BuscarElementosD.obtenerPromedioVentas(ventas);
         * 
         * // Buscar elementos cercano al promedio
         * BuscarElementosE.obtenerVentaCercanaPromedio(ventas);
         */
    }
}