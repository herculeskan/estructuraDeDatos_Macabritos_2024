package com.example.DeclararyDefinirArreglos;

public class DeclararDefinirD {
    public static void main(String[] args) {
        // Imprime los valores en consola
        DeclararDefinirD objeto = new DeclararDefinirD();
        objeto.definirArreglos();
        objeto.mostrarValores();

    }

    byte[] arregloByte; // Declarar un arreglo de bytes
    Byte[] arregloByteObjeto; // Declarar un arreglo de objetos Byte
    char[] arregloChar; // Declarar un arreglo de caracteres
    Character[] arregloCharObjeto; // Declarar un arreglo de objetos Character
    short[] arregloShort; // Declarar un arreglo de shorts
    Short[] arregloShortObjeto; // Declarar un arreglo de objetos Short
    int[] arregloInt; // Declarar un arreglo de enteros
    Integer[] arregloIntObjeto; // Declarar un arreglo de objetos Integer
    long[] arregloLong; // Declarar un arreglo de longs
    Long[] arregloLongObjeto; // Declarar un arreglo de objetos Long
    float[] arregloFloat; // Declarar un arreglo de floats
    Float[] arregloFloatObjeto; // Declarar un arreglo de objetos Float
    double[] arregloDouble; // Declarar un arreglo de doubles
    Double[] arregloDoubleObjeto; // Declarar un arreglo de objetos Double
    Object[] arregloObject; // Declarar un arreglo de objetos
    String[] arregloString; // Declarar un arreglo de cadenas de texto
    // Definir cada uno de los arreglos anteriores con tamaño de 5 elementos.

    public void definirArreglos() {
        arregloByte = new byte[5]; // Definir un arreglo de bytes
        arregloByteObjeto = new Byte[5]; // Definir un arreglo de objetos Byte
        arregloChar = new char[5]; // Definir un arreglo de caracteres
        arregloCharObjeto = new Character[5]; // Definir un arreglo de objetos Character
        arregloShort = new short[5]; // Definir un arreglo de shorts
        arregloShortObjeto = new Short[5]; // Definir un arreglo de objetos Short
        arregloInt = new int[5]; // Definir un arreglo de enteros
        arregloIntObjeto = new Integer[5]; // Definir un arreglo de objetos Integer
        arregloLong = new long[5]; // Definir un arreglo de longs
        arregloLongObjeto = new Long[5]; // Definir un arreglo de objetos Long
        arregloFloat = new float[5]; // Definir un arreglo de floats
        arregloFloatObjeto = new Float[5]; // Definir un arreglo de objetos Float
        arregloDouble = new double[5]; // Definir un arreglo de doubles
        arregloDoubleObjeto = new Double[5]; // Definir un arreglo de objetos Double
        arregloObject = new Object[5]; // Definir un arreglo de objetos
        arregloString = new String[5]; // Definir un arreglo de cadenas de texto
    }

    // Mostrar los valores de cada arreglo en consola
    public void mostrarValores() {
        System.out.println("Arreglo de bytes");
        for (int i = 0; i < arregloByte.length; i++) {
            System.out.println(arregloByte[i]);
        }
        System.out.println("Arreglo de objetos Byte");
        for (int i = 0; i < arregloByteObjeto.length; i++) {
            System.out.println(arregloByteObjeto[i]);
        }
        System.out.println("Arreglo de caracteres");
        for (int i = 0; i < arregloChar.length; i++) {
            System.out.println(arregloChar[i]);
        }
        System.out.println("Arreglo de objetos Character");
        for (int i = 0; i < arregloCharObjeto.length; i++) {
            System.out.println(arregloCharObjeto[i]);
        }
        System.out.println("Arreglo de shorts");
        for (int i = 0; i < arregloShort.length; i++) {
            System.out.println(arregloShort[i]);
        }
        System.out.println("Arreglo de objetos Short");
        for (int i = 0; i < arregloShortObjeto.length; i++) {
            System.out.println(arregloShortObjeto[i]);
        }
        System.out.println("Arreglo de enteros");
        for (int i = 0; i < arregloInt.length; i++) {
            System.out.println(arregloInt[i]);
        }
        System.out.println("Arreglo de objetos Integer");
        for (int i = 0; i < arregloIntObjeto.length; i++) {
            System.out.println(arregloIntObjeto[i]);
        }
        System.out.println("Arreglo de longs");
        for (int i = 0; i < arregloLong.length; i++) {
            System.out.println(arregloLong[i]);
        }
        System.out.println("Arreglo de objetos Long");
        for (int i = 0; i < arregloLongObjeto.length; i++) {
            System.out.println(arregloLongObjeto[i]);
        }
        System.out.println("Arreglo de floats");
        for (int i = 0; i < arregloFloat.length; i++) {
            System.out.println(arregloFloat[i]);
        }
        System.out.println("Arreglo de objetos Float");
        for (int i = 0; i < arregloFloatObjeto.length; i++) {
            System.out.println(arregloFloatObjeto[i]);
        }
    }
}
