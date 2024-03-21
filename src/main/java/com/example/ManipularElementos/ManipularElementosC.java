package com.example.ManipularElementos;

//Inicializar el arreglo ventas con una cantidad aleatoria de elementos. 
// Importamos la clase Random
import java.util.Random;

public class ManipularElementosC {

    // Se crea el objeto random
    Random random = new Random();
    // inicializar ventas con una cantidad aleatoria de elementos
    int[] ventas = new int[random.nextInt(10)];
}