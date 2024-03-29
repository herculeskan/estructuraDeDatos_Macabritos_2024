package com.example.TrabajarConMatrices;

public class TrabajarConMatricesE {
    /*
     * Realizar una función que reciba como parámetro el nombre de un lenguaje y
     * retorna las coordenadas (fila, columna) si este se encuentra encuentra dentro
     * de la matriz lenguajes, de lo contrario retorna null.
     */
    public static int[] buscarLenguaje(String nombreLenguaje) {
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
            if (lenguajes[i][0].equals(nombreLenguaje)) {
                return new int[] { i, 0 };
            }
        }
        return null;
    }
}
