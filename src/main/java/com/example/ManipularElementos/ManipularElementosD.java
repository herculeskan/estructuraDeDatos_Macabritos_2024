package com.example.ManipularElementos;

import java.util.Random;

public class ManipularElementosD {

    // Inicializar el arreglo ventas con una cantidad aleatoria de elementos.
    // Importamos la clase Random

    // Se crea el objeto random
    Random random = new Random();
    // inicializar ventas con una cantidad aleatoria de elementos
    int cantidad = random.nextInt(100) + 1;
    int[] ventas = new int[cantidad];
}
