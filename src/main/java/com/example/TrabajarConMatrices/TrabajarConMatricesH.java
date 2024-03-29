package com.example.TrabajarConMatrices;

public class TrabajarConMatricesH {
    /*
     * Realizar una función que reciba como parámetro las coordenadas (fila,
     * columna) y retorne el valor en esa coordinada y el registro (fila) completo
     * con ojos datos de ese lenguaje, si las coordinadas son erradas (no existen en
     * la matriz lenguajes) entonces, debe retornar una excepción con un mensaje
     * informando el problema.
     */
    public static Object[] buscarLenguaje(int fila, int columna) {
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
        if (fila < 0 || fila >= lenguajes.length || columna < 0 || columna >= lenguajes[0].length) {
            throw new RuntimeException("Las coordenadas no existen en la matriz lenguajes");
        }
        return new Object[] { lenguajes[fila][columna], lenguajes[fila] };
    }
}
