package com.example.TrabajarConMatrices;

public class TrabajarConMatricesC {
    /*
     * Realizar una función llamada _infoLenguajes_ que permita llenar la matriz
     * lenguajes con datos por teclado a partir de la segunda fila.
     */
    public static void infoLenguajes() {
        Object[][] lenguajes = new Object[5][5];
        lenguajes[0] = new Object[] { "Java", 1995, "Oracle", "Lenguaje de programación orientado a objetos",
                "Spring, Hibernate" };
        System.out.println("Matriz de lenguajes:");
        for (int i = 0; i < lenguajes.length; i++) {
            for (int j = 0; j < lenguajes[i].length; j++) {
                System.out.print(lenguajes[i][j] + " ");
            }
            System.out.println();
        }
    }

}
