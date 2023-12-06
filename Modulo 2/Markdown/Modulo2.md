# Librerias

En Java, como en muchos otros lenguajes de programación, existe el concepto de librería: una clase o conjunto de ellas que posee métodos y atributos (variables y/o constantes) que nos permiten reutilizar código para un propósito particular.

Para recurrir a una librería interna o externa en Java debemos utilizar la palabra reservada `import` seguida del nombre de la clase y el paquete donde se encuentra.

```java
//bibliotecas importadas
import java.util.Scanner;
```
Nuestros proyectos tienen un apartado JRE System Library que contiene las librerías que ofrece Java.

Algo particular que pasa en Java es que hay clases que no necesitan importarse, como cuando utilizamos System.out.print. Esto se debe a que esta clase se encuentra dentro del paquete java.lang y no necesitamos importarla.

En cambio, con las otras utilidades o librerías debemos hacerlo siempre.
# Scanner
Hay una utilidad que nos ayuda a capturar los datos de la consola, para ello debemos importar la biblioteca `java.util.Scanner`.
```java
//Paquete al que pertecene
package identificadorPaquete;

//Biblote
import java.util.Scanner;

//Declaracion de la clase
public class IdentificadorClase

//La clase scanner para capturar valores del teclado
Scanner identificador = nec Scanner(System.in);
```
| Métodos       | Tipo de Dato | Método        |
|---------------|--------------|---------------|
| nextBoolean() | Boolean      |               |
| nextByte()    | Byte         |               |
| nextDouble()  | Double       |               |
| nextFloat()   | Float        |               |
| nextInt()     | Int          |               |
| nextLong()    | Long         |               |
| nextShort()   | Short        |               |
| next()        | String       |               |
| nextLine()    | String       |               |
| close()       | N/A          |               |

Cada vez que usemos uno de los métodos de la clase Scanner, la consola quedará esperando que el usuario ingrese una información. Es recomendable mostrar por pantalla qué dato debe ingresar:
```java
//Ej de como capturar un numero entero
System.out.println("Ingrese el numero entero");

int indentificadorEntero = indentificador.nextInt();
```

# Casteo 
Muchas veces nos encontraremos con la necesidad
de convertir un tipo de dato a otro tipo; Java al ser un lenguaje de tipado fuerte (cada variable u objeto del programa se definen como poseedores de un tipo de dato específico), nos da las herramientas para poder lograr lo que también se conoce como **conversión de tipos**.

Existen dos tipos de casteo: **implícito y explícito**.

### Casteo implicito 
Esto ocurre cuando necesitamos **un tipo de dato más pequeño en otro más grande**, lo podemos ver con los números; sabemos que un número entero pertenece a los números reales (con decimales), cuando nos encontremos con la necesidad de hacer esto, no tendremos que escribir ningún tipo de código o sentencia.

Algo particular que pasa con los **char**, es que podemos asignarlos directamente a un int o a un numérico más grande ¿Y esto por qué? J**ava devolverá el valor ASCII del carácter dado.**
| Tipo de dato | Variable    | Asignación      |
|--------------|-------------|-----------------|
| byte         | miByte      | `byte miByte = 37;` |
| short        | miShort     | `short miShort = miByte;` |
| int          | miInt       | `int miInt = miShort;` |
| long         | miLong      | `long miLong = miInt;` |
| float        | miFloat     | `float miFloat = miLong;` |
| double       | miDouble    | `double miDouble = miFloat;` |
| char         | miChar      | `char miChar = 'P';` |
| int          | miInt       | `int miInt = miChar;` |

### Casteo explicito
Este caso sucede **cuando queremos asignar un tipo de dato más grande a un tipo de dato más pequeño**, por ejemplo, un numérico decimal a numérico entero. En casos así, necesariamente tenemos que escribir entre **paréntesis** el tipo de dato al que queremos convertir.
Hay que tener en cuenta que lo que pasará es que el número será **truncado cuando hagamos la conversión de un decimal a un entero**
| Tipo de dato | Variable    | Asignación                  |
|--------------|-------------|-----------------------------|
| double       | miDouble2   | `double miDouble2 = 2.9856;` |
| float        | miFloat2    | `float miFloat2 = (float) miDouble2;` |
| long         | miLong2     | `long miLong2 = (long) miFloat2;` |
| int          | miInt2      | `int miInt2 = (int) miLong2;` |
| short        | miShort2    | `short miShort2 = (short) miInt2;` |
| float        | miByte2     | `float miByte2 = (byte) miShort2;` |

Ahora bien, al contrario de lo que pasa de un char a un int, **la conversión de int a char no es compatible por si sola**, por lo que tendremos que hacerla de forma explícita.

```java
int miInt2 = (int) miLong2;
char miChar = (char) miInt2;
```
![](../Pdf/Pic/Sin%20título%202.png)

# Clase String 
### String y qué podemos hacer
Anteriormente habíamos conocidos los datos primitivos en Java y el tipo de dato string que nos ayuda representar una cadena de caracteres. Ahora bien, los string no son un tipo de dato primitivo sino un `objeto`.

Por ahora, solo diremos que los objetos son u`n tipo de dato más complejo, que posee atributos (variables y/o constantes) y métodos que nos serán de gran utilidad a lo largo del desarrollo del software`.

### Metodos

| Tipo          | Método                    | Descripción                                                                                     |
|---------------|---------------------------|-------------------------------------------------------------------------------------------------|
| Char          | charAt(int index)         | Devuelve el valor de carácter en el índice especificado.                                         |
| String        | concat(String str)        | Concatena la cadena especificada al final de esta cadena.                                          |
| Boolean       | contains(CharSequence s)  | Devuelve verdadero si y solo si esta cadena contiene la secuencia especificada de valores de caracteres. |
| Boolean       | endsWith(String suffix)    | Prueba si esta cadena termina con el sufijo especificado.                                          |
| Boolean       | equals(Object anObject)   | Compara esta cadena con el objeto especificado.                                                    |
| Boolean       | equalsIgnoreCase(String anotherString) | Compara esta cadena con otra cadena, ignorando las consideraciones de caso.                    |
| Static String | format(String format, Object... args) | Devuelve una cadena formateada utilizando la cadena de formato y los argumentos especificados. |
| Int           | indexOf(int ch)           | Devuelve el índice dentro de esta cadena de la primera aparición del carácter especificado.       |
| Boolean       | isEmpty()                 | Devuelve verdadero si, y solo si, length() es 0.                                                   |
| Static String | join(CharSequence delimiter, CharSequence... elements) | Devuelve una nueva cadena compuesta por copias de los elementos CharSequence unidas con una copia del delimitador especificado. |
| Int           | lastIndexOf(int ch)       | Devuelve el índice dentro de esta cadena de la última aparición del carácter especificado.        |
| Int           | length()                  | Devuelve la longitud de esta cadena.                                                                |
| String        | replace(char oldChar, char newChar) | Devuelve una cadena resultante de reemplazar todas las apariciones de oldChar en esta cadena por newChar. |
| String        | toLowerCase()             | Convierte todos los caracteres de esta cadena a minúsculas utilizando las reglas de la configuración regional predeterminada. |
| String        | toUpperCase()             | Convierte todos los caracteres de esta cadena a mayúsculas utilizando las reglas de la configuración regional predeterminada. |
| Static String | valueOf(objeto o dato primitivo b) | Devuelve la representación de cadena del argumento enviado.                                    |
| Static String | trim()                    | Devuelve una cadena cuyo valor es esta cadena, con cualquier espacio en blanco inicial y final eliminado. |
| String        | substring(int beginIndex)  | Devuelve una cadena que es una subcadena de esta cadena.                                           |
| Char[]        | substring(int beginIndex, int endIndex) | Devuelve una cadena que es una subcadena de esta cadena.                                        |
| String        | toLowerCase()             | Convierte todos los caracteres de esta cadena a minúsculas utilizando las reglas de la configuración regional predeterminada. |
| String        | toUpperCase()             | Convierte todos los caracteres de esta cadena a mayúsculas utilizando las reglas de la configuración regional predeterminada. |
| Static String | valueOf(objeto o dato primitivo b) | Devuelve la representación de cadena del argumento enviado.                                    |

### ¿Por qué usar el método equals?
En Java, los `operadores relacionales` comparan bit a bit y en los objetos (que profundizaremos más adelante) se compara no el valor, sino la posición de memoria, por lo que si comparamos dos cadenas de texto introducidas por el teclado con el operador relación ==, nos devolverá false.

Java nos entrega un método `equals` que solventa este problema.

# Libreria Math
Muchas veces nos vemos en la necesidad de hacer operaciones matemáticas, cálculos, usar constantes, etc.

Ahora bien, en el módulo anterior aprendimos operadores aritméticos, pero se hace un poco complejo hacer, por ejemplo, la raíz cuadrada de un número, el exponencial de un número u cualquier otra operación matemática.

Java nos proporciona una librería llamada Math `para realizar la mayoría de estas operaciones y dos constantes importantes`.

Para poder incluir una biblioteca o librería deberíamos importarla, pero `Math pertenece al paquete Lang por lo que no es necesario hacerlo`.

### Constantes
| Tipo            | Método | Descripción                                       |
|-----------------|--------|---------------------------------------------------|
| Static double   | E      | Devuelve el valor más aproximado del número e.     |
| Static double   | PI     | Devuelve el valor más aproximado del número PI.    |

### Metodos
| Tipo            | Método                     | Descripción                                                                      |
|-----------------|----------------------------|----------------------------------------------------------------------------------|
| Static double   | abs(double a)              | Devuelve el valor absoluto de un valor double introducido como parámetro.        |
| Static float    | abs(float a)               | Devuelve el valor absoluto de un valor float introducido como parámetro.         |
| Static int      | abs(int a)                 | Devuelve el valor absoluto de un valor Entero introducido como parámetro.        |
| Static long     | abs(long a)                | Devuelve el valor absoluto de un valor long introducido como parámetro.          |
| Static double   | acos(double a)             | Devuelve el arco coseno de un valor introducido como parámetro.                  |
| Static int      | addExact(int x, int y)     | Devuelve la suma de sus argumentos, lanzando una excepción si el resultado desborda un int. |
| Static long     | addExact(long x, long y)   | Devuelve la suma de sus argumentos, lanzando una excepción si el resultado se desborda a long. |
| Static double   | asin(double a)             | Devuelve el arco seno de un valor introducido.                                   |
| Static double   | atan(double a)             | Devuelve el arco tangente de un valor introducido.                                |
| Static double   | cbrt(double a)             | Devuelve la raíz cúbica de un double.                                            |
| Static double   | cos(double a)              | Devuelve el coseno trigonométrico de un ángulo.                                   |
| Static double   | exp(double a)              | Devuelve el número e de Euler elevado a la potencia de un double valor.           |
| Static double   | log(double a)              | Devuelve el logaritmo natural (base e) de un double valor.                         |
| Static double   | log10(double a)            | Devuelve el logaritmo de base 10 de un double valor.                               |
| Static int      | multiplyExact(int x, int y) | Devuelve el producto de los argumentos, lanzando una excepción si el resultado desborda un int. |
| Static double   | max(double a, double b)    | Devuelve el mayor de dos valores double.                                          |
| Static float    | max(float a, float b)      | Devuelve el mayor de dos valores float.                                            |
| Static int      | max(int a, int b)          | Devuelve el mayor de dos valores Enteros.                                          |
| Static long     | max(long a, long b)        | Devuelve el mayor de dos valores long.                                             |
| Static double   | min(double a, double b)    | Devuelve el menor de dos valores double.                                           |
| Static float    | min(float a, float b)      | Devuelve el menor de dos valores float.                                            |
| Static int      | min(int a, int b)          | Devuelve el menor de dos valores enteros.                                          |
| Static long     | min(long a, long b)        | Devuelve el menor de dos valores long.                                             |
| Static double   | pow(double a, double b)    | Devuelve el valor del primer argumento elevado a la potencia del segundo argumento. |
| Static double   | random()                   | Devuelve un double valor con un signo positivo, mayor o igual que 0.0 y menor que 1.0. |
| Static double   | round(double a)            | Devuelve el long redondeado más cercano al double introducido.                     |
| Static float    | round(float a)             | Devuelve el int más cercano y redondeado al float introducido.                     |
| Static double   | sin(double a)              | Devuelve el seno trigonométrico de un ángulo.                                     |
| Static double   | sqrt(double a)             | Devuelve la raíz cuadrada positiva correctamente redondeada de un double valor.    |
| Static double   | tan(double a)              | Devuelve la tangente trigonométrica de un ángulo.                                  |
