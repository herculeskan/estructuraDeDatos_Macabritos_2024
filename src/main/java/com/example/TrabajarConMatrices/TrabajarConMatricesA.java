package com.example.TrabajarConMatrices;

public class TrabajarConMatricesA {
    /*
     * Declarar e inicializar una matriz de 5 x 8 de tipo Object en una variable
     * llamada lenguajes
     */
    public static void declararMatriz() {
        Object[][] lenguajes = { { "Java", 1, "Oracle" }, { "Python", 2, "Guido van Rossum" },
                { "JavaScript", 3, "Netscape" }, { "C", 4, "Dennis Ritchie" }, { "PHP", 5, "Rasmus Lerdorf" } };
        System.out.println("Matriz de lenguajes:");
        for (int i = 0; i < lenguajes.length; i++) {
            for (int j = 0; j < lenguajes[i].length; j++) {
                System.out.print(lenguajes[i][j] + " ");
            }
            System.out.println();
        }
    }
}