package com.example.DeclararyDefinirArreglos;

public class DeclararDefinirC {

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

        // Asignar valores a cada arreglo usando la notación de posiciones o índices

        arregloByte[0] = 1;
        arregloByte[1] = 2;
        arregloByte[2] = 3;
        arregloByte[3] = 4;
        arregloByte[4] = 5;

        arregloByteObjeto[0] = Byte.valueOf("1");
        arregloByteObjeto[1] = Byte.valueOf("2");
        arregloByteObjeto[2] = Byte.valueOf("3");
        arregloByteObjeto[3] = Byte.valueOf("4");
        arregloByteObjeto[4] = Byte.valueOf("5");

        arregloChar[0] = 'a';
        arregloChar[1] = 'b';
        arregloChar[2] = 'c';
        arregloChar[3] = 'd';
        arregloChar[4] = 'e';

        arregloCharObjeto[0] = Character.valueOf('a');
        arregloCharObjeto[1] = Character.valueOf('b');
        arregloCharObjeto[2] = Character.valueOf('c');
        arregloCharObjeto[3] = Character.valueOf('d');
        arregloCharObjeto[4] = Character.valueOf('e');

        arregloShort[0] = 1;
        arregloShort[1] = 2;
        arregloShort[2] = 3;
        arregloShort[3] = 4;
        arregloShort[4] = 5;

        arregloShortObjeto[0] = Short.valueOf("1");
        arregloShortObjeto[1] = Short.valueOf("2");
        arregloShortObjeto[2] = Short.valueOf("3");
        arregloShortObjeto[3] = Short.valueOf("4");
        arregloShortObjeto[4] = Short.valueOf("5");

        arregloInt[0] = 1;
        arregloInt[1] = 2;
        arregloInt[2] = 3;
        arregloInt[3] = 4;
        arregloInt[4] = 5;

        arregloIntObjeto[0] = Integer.valueOf("1");
        arregloIntObjeto[1] = Integer.valueOf("2");
        arregloIntObjeto[2] = Integer.valueOf("3");
        arregloIntObjeto[3] = Integer.valueOf("4");
        arregloIntObjeto[4] = Integer.valueOf("5");

        arregloLong[0] = 1L;
        arregloLong[1] = 2L;
        arregloLong[2] = 3L;
        arregloLong[3] = 4L;
        arregloLong[4] = 5L;

        arregloLongObjeto[0] = Long.valueOf("1");
        arregloLongObjeto[1] = Long.valueOf("2");
        arregloLongObjeto[2] = Long.valueOf("3");
        arregloLongObjeto[3] = Long.valueOf("4");
        arregloLongObjeto[4] = Long.valueOf("5");

        arregloFloat[0] = 1.0f;
        arregloFloat[1] = 2.0f;
        arregloFloat[2] = 3.0f;
        arregloFloat[3] = 4.0f;
        arregloFloat[4] = 5.0f;

        arregloFloatObjeto[0] = Float.valueOf("1.0");
        arregloFloatObjeto[1] = Float.valueOf("2.0");
        arregloFloatObjeto[2] = Float.valueOf("3.0");
        arregloFloatObjeto[3] = Float.valueOf("4.0");
        arregloFloatObjeto[4] = Float.valueOf("5.0");

        arregloDouble[0] = 1.0;
        arregloDouble[1] = 2.0;
        arregloDouble[2] = 3.0;
        arregloDouble[3] = 4.0;
        arregloDouble[4] = 5.0;

        arregloDoubleObjeto[0] = Double.valueOf("1.0");
        arregloDoubleObjeto[1] = Double.valueOf("2.0");
        arregloDoubleObjeto[2] = Double.valueOf("3.0");
        arregloDoubleObjeto[3] = Double.valueOf("4.0");
        arregloDoubleObjeto[4] = Double.valueOf("5.0");

        arregloObject[0] = new Object();
        arregloObject[1] = new Object();
        arregloObject[2] = new Object();
        arregloObject[3] = new Object();
        arregloObject[4] = new Object();

        arregloString[0] = "Hello";
        arregloString[1] = "World";
        arregloString[2] = "GitHub";
        arregloString[3] = "Copilot";
        arregloString[4] = "Java";
    }
}