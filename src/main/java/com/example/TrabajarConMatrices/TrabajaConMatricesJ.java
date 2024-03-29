package com.example.TrabajarConMatrices;

public class TrabajaConMatricesJ {
    /*
     * Realizar una función que permita mostrar los datos de la matriz lenguajes
     * según la siguiente logia: 1. La función de debe recibir como parámetro un
     * arreglo con 5 elementos de tipo boolean 2. Al invocar la función se debe
     * mostrar solo la información de la matriz lenguajes de acuerdo al valor (false
     * o true) que tenga el arreglo que recibe como parámetro. Por ejemplo:
     */
    public static void mostrarLenguajes(boolean[] mostrar) {
        Object[][] lenguajes = new Object[5][5];
        lenguajes[0] = new Object[] { "Java", 1995, "Oracle", "Lenguaje de programación orientado a objetos",
                "Spring, Hibernate" };
        lenguajes[1] = new Object[] { "Python", 1991, "Guido van Rossum", "Lenguaje de programación interpretado",
                "Django, Flask" };
        lenguajes[2] = new Object[] { "JavaScript", 1995, "Netscape", "Lenguaje de programación interpretado",
                "React, Angular" };
        lenguajes[3] = new Object[] { "C", 1972, "Dennis Ritchie", "Lenguaje de programación estructurado", "Ninguno" };
        lenguajes[4] = new Object[] { "PHP", 1995, "Rasmus Lerdorf", "Lenguaje de programación interpretado",
                "Laravel, Symfony" };
        for (int i = 0; i < lenguajes.length; i++) {
            if (mostrar[i]) {
                System.out.println("Lenguaje: " + lenguajes[i][0]);
                System.out.println("Año de creación: " + lenguajes[i][1]);
                System.out.println("Creador: " + lenguajes[i][2]);
                System.out.println("Descripción: " + lenguajes[i][3]);
                System.out.println("Frameworks: " + lenguajes[i][4]);
                System.out.println();
            }
        }

    }
}