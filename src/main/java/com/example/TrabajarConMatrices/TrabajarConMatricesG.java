package com.example.TrabajarConMatrices;

public class TrabajarConMatricesG {
    /*
     * Realizar una función que reciba como parámetro una columna y retorne un todos
     * los datos en esa columna. Si la columna está errada (no existe en la matriz
     * lenguajes) entonces, debe retornar una excepción con un mensaje informando el
     * problema.
     */
    public static Object[] buscarColumna(int columna) {
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
        if (columna < 0 || columna >= lenguajes[0].length) {
            throw new RuntimeException("La columna no existe en la matriz lenguajes");
        }
        Object[] datosColumna = new Object[lenguajes.length];
        for (int i = 0; i < lenguajes.length; i++) {
            datosColumna[i] = lenguajes[i][columna];
        }
        return datosColumna;

    }
}
