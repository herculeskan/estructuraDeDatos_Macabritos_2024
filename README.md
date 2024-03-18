# Ejercicios de estructuras de datos
<!-- You have some errors, warnings, or alerts. If you are using reckless mode, turn it off to see inline alerts.
* ERRORs: 0
* WARNINGs: 0
* ALERTS: 1 -->

<h2>Trabajo 1 </h2>


<h3>Estructura de datos</h3>


Universidad de Cartagena 


![Escudo de la UDC](https://w7.pngwing.com/pngs/1014/299/png-transparent-university-of-cartagena-united-states-research-employment-united-states-emblem-label-logo.png)


Carlos Esteban Lara Gil
Diego Andrés Arias Hernandez
Yeshua Martínez Chavez
Jeraldo de Jesus Morales Morales

Prof. John Arrieta

Cartagena de indias 9 de Marzo

Ingeniería de Software sede Piedra Bolívar


[TOC]


<h3>**Introducción.**</h3>


Con este primer trabajo se busca abordar lo principal de las estructuras de datos, lo cuál son arreglos y matrices que le dan sentido a nuestra estructura de datos usando el lenguaje de programación tipado fuerte más popular y estructurado que es Java ya que al ser un lenguaje cuyo paradigma es la programación orientada a objetos la hace más sencillo y legible la estructura de datos.

<h3>**Objetivos**</h3>


En este trabajo se abordan: _Las funciones, las matrices y los arreglos_. Se busca que el estudiante alcance la plena comprensión de estos temas ya que es importante para en el futuro poder generar bases de datos estables y fuertes.

Aprender a documentar y llevar un proyecto en el semestre nos ayuda también a que estemos en un ambiente de programación más acercado a lo que es un trabajo en el mundo real con los retos que implica una organización empresarial.

El estudiante será capaz de implementar funciones y arreglos para poder arreglar un código o crearlo acorde a las necesidades del proyecto donde se encuentre a futuro. Por lo tanto, el estudiante será capaz de usar operadores del mundo real para representarlos en el mundo simbólico dando la posibilidad de aplicar el conocimiento adquirido para resolver problemas de programación.

<h3>**Justificación**.</h3>


Las matrices y arreglos son fundamentales para la programación y dan la posibilidad de que el estudiante después del trabajo pueda crear aplicaciones robustas y más eficientes a la altura de la ingeniería que aprenden.

La práctica de la programación poniendo manos a la obra permite que por medio de la práctica ejercitar el talento del estudiante mediante el enfoque práctico la educación se vuelve más disciplinada, lo que permite la mejora de las habilidades y la confianza de trabajar en un proyecto grande

<h3>Desarrollo</h3>




1. Declarar y definir arreglos.
1. Declarar un arreglo por cada uno de los tipos de datos primitivos (byte, Byte, char, Character, short, Short, int, Integer, long, Long, float, Float, double, Double, Object, String. 
2. Definir cada uno de los arreglos anteriores con tamaño de 5 elementos.
3. Asignar valores a cada arreglo usando la notación de posiciones o índices
4. Mostrar los valores de cada Arreglo 
5. Declarar y definir otro arreglo de tipo String en una variable llamada dataStructs, e inicializarlo con los siguientes datos, usando la sintaxis de llaves. 
    1. Lista
    2. Cola
    3. Pilas
    4. Mapas
    5. Conjuntos
6. Declarar y definir otro arreglo de tipo String en una variable llamada características, con 5 elementos. 
7.  Ingresar los siguientes datos por teclado:
    6. Simples, Circulares y Enlazadas 
    7. Primero en entrar, Primero en Salir. Último en entrar, Primero en salir
    8. Primero en entrar, Último en salir
    9. Parejas de clave y valor
    10. Elementos no repetidos 

<h4> 2. Manipular los elementos dentro de arreglos:</h4>




1. Mostrar los elementos del arreglo _dataStructs_ con su equivalente elemento del arreglo características.
2. Declarar un arreglo de enteros en una variable llamada ventas
3. Inicializar el arreglo ventas con una cantidad aleatoria de elementos. 
4. Llenar el arreglo ventas con valores aleatorios entre 1 y 1000

 



5. Mostrar la cantidad de ventas
6. Mostrar el valor de cada una de las ventas
7. Mostrar el total de ventas
8. Mostrar el promedio de las ventas. 

<h4>3. Buscar elementos en un arreglo:</h4>




1. Diseñar una función que permita buscar la venta más alta e invocar la función para probarla.
2.  Diseñar una función que permita buscar la venta más baja e invocar la función para probarla.
3. Diseñar una función que permita obtener el total de las ventas e invocar la función para probarla. 
4. Diseñar una función que permita obtener el promedio de las ventas e invocar la función para probarla. 
5. Diseñar una función que devuelva la venta cuyo valor se acerque más al valor que le sigue al promedio e invocar la función para probarla. 

	

<h4>4. Ordenar arreglos</h4>




1.  Diseñar una función que permita ordenar las ventas de forma descendente e invocar la función para probarla.
2.  Diseñar una función que permita ordenamiento que permita ordenar las ventas de forma ascendente e invocar la función para probarla.
3. Diseñar una función que permite desordenar las ventas e invocar la función para probarla.
4. Diseñar una función que permita ordenar las ventas primero las partes y luego en impares e invocar la función para probarla

<h4>5. Trabajar con Matrices (tablas o arreglos multidimensionales)</h4>




1. Declarar e inicializar una matriz de 5 x 8 de tipo Object en una variable llamada lenguajes 
2.  A la primera línea de la matriz lenguajes se debe asignar los siguientes valores en ese orden: [NOMBRE, AÑO, AUTOR, DETALLES, FRAMEWORKS] 
3. Realizar una función llamada _infoLenguajes_ que permita llenar la matriz lenguajes con datos por teclado a partir de la segunda fila. 
4. Realizar una función que reciba como parámetro el nombre de un lenguaje y retorna verdadero si este se encuentra dentro de la matriz lenguajes, de lo contrario retorna falso. 
5. Realizar una función que reciba como parámetro el nombre de un lenguaje y retorna las coordenadas (fila, columna) si este se encuentra encuentra dentro de la matriz lenguajes, de lo contrario retorna null. 
6. Realizar una función que reciba como parámetro una fila y retorne el registro completo (datos en la fila) del lenguaje en esa fila. Si la fila está errada (no existe en la matriz lenguajes) entonces, debe retornar una excepción con un mensaje informando el problema
7. Realizar una función que reciba como parámetro una columna y retorne un todos los datos en esa columna. Si la columna está errada (no existe en la matriz lenguajes) entonces, debe retornar una excepción con un mensaje informando el problema. 
8.  Realizar una función que reciba como parámetro las coordenadas (fila, columna) y retorne el valor en esa coordinada y el registro (fila) completo con ojos datos de ese lenguaje, si las coordinadas son erradas (no existen en la matriz lenguajes) entonces, debe retornar una excepción con un mensaje informando el problema. 
9. lenguaje y retorna las coordenadas (fila, columna) si este se encuentra dentro de la matriz lenguajes, de lo contrario retorna null. 
10. Realizar una función que permita mostrar los datos de la matriz lenguajes según la siguiente logia:
    1. La función de debe recibir como parámetro un arreglo con 5 elementos de tipo boolean
    2. Al invocar la función se debe mostrar solo la información de la matriz lenguajes de acuerdo al valor (false o true) que tenga el arreglo que recibe como parámetro. Por ejemplo:

Debe mostrar los nombres de los lenguajes, los autores, los frameworks
