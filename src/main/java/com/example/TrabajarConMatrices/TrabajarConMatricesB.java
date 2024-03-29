package com.example.TrabajarConMatrices;

public class TrabajarConMatricesB {
        /*
         * A la primera línea de la matriz lenguajes se debe asignar los siguientes
         * valores en ese orden: [NOMBRE, AÑO, AUTOR, DETALLES, FRAMEWORKS]
         */
        public static void asignarValores() {
                Object[][] lenguajes = new Object[5][5];
                lenguajes[0] = new Object[] { "Java", 1995, "Oracle", "Lenguaje de programación orientado a objetos",
                                "Spring, Hibernate" };
                lenguajes[1] = new Object[] { "Python", 1991, "Guido van Rossum",
                                "Lenguaje de programación interpretado",
                                "Django, Flask" };
                lenguajes[2] = new Object[] { "JavaScript", 1995, "Netscape", "Lenguaje de programación interpretado",
                                "React, Angular" };
                lenguajes[3] = new Object[] { "C", 1972, "Dennis Ritchie", "Lenguaje de programación estructurado",
                                "Ninguno" };
                lenguajes[4] = new Object[] { "PHP", 1995, "Rasmus Lerdorf", "Lenguaje de programación interpretado",
                                "Laravel, Symfony" };
                System.out.println("Matriz de lenguajes:");
                for (int i = 0; i < lenguajes.length; i++) {
                        for (int j = 0; j < lenguajes[i].length; j++) {
                                System.out.print(lenguajes[i][j] + " ");
                        }
                        System.out.println();
                }
        }
}
