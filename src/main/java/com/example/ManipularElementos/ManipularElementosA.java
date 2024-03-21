package com.example.ManipularElementos;

public class ManipularElementosA {
    // Mostrar los elementos del arreglo dataStructs con su equivalente elemento del
    // arreglo características.Mostrar los elementos del arreglo dataStructs con su
    // equivalente elemento del arreglo características.

    public static void main(String[] args) {
        // Arreglo de dataStrucs
        String[] dataStructs = { "Arreglo", "Lista", "Pila", "Cola", "Árbol", "Grafo" };
        // Las características de cada estructura de datos
        String[] caracteristicas = { "Estático", "Dinámico", "LIFO", "FIFO", "Jerárquico", "No lineal" };
        // Revisa si ambos arreglos tienen la misma longitud
        if (dataStructs.length != caracteristicas.length) {
            System.out.println("Los arreglos no tienen la misma longitud");
            return;
        }
        // Imprimir elementos de ambos arreglos
        for (int i = 0; i < dataStructs.length; i++) {
            System.out.println(dataStructs[i] + " es " + caracteristicas[i]);
        }
    }
}
