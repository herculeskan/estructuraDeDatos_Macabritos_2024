package com.example.TrabajarConMatrices;

public class TrabajarConMatricesF {
    /*
     * Realizar una función que reciba como parámetro una fila y retorne el registro
     * completo (datos en la fila) del lenguaje en esa fila. Si la fila está errada
     * (no existe en la matriz lenguajes) entonces, debe retornar una excepción con
     * un mensaje informando el problema
     */
    public static Object[] buscarLenguaje(int fila) {
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
        if (fila < 0 || fila >= lenguajes.length) {
            throw new RuntimeException("La fila no existe en la matriz lenguajes");
        }
        return lenguajes[fila];
    }
}
