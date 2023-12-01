# Variables en Java
### Definición de variables en Java
Identificador (nombre)
- Puede comenzar con "_" o "$".
- No puede utilizar caracteres "%" o "*" o "@" pues son reservados para otras operaciones.
- Puede incluir, pero no comenzar por un número.
- No puede incluir el carácter espacio en blanco.
- Distingue entre mayúsculas y minúsculas.
- No se pueden utilizar las palabras reservadas como identificadores.

# Tipos de dato:
| Tipo de Dato | Tamaño en Bytes | Rango de Valores                                           |
|--------------|------------------|------------------------------------------------------------|
| Boolean      | 1                | true o false                                               |
| Char         | 2                | Unicode; comprende el código ASCII                          |
| Byte         | 1                | Valor entero entre -128 y 127                               |
| Short        | 2                | Valor entero entre -32768 y 32767                           |
| Int          | 4                | Valor entero entre -2.147.483.648 y 2.147.483.647           |
| Long         | 8                | Valor entre -9.223.372.036.854.775.808 y 9.223.372.036.854.775.807 |
| Float        | 4                | De -3.402823E38 a -1.401298E-45 y de 1.401298E-45 a 3.402823E38 |
| Double       | 8                | De -1.79769313486232E308 a -4.94065645841247E-324 y de 4.94065645841247E-324 a 1.79769313486232E308 |


# Palabras reservadas
![](../Pic/Sin%20título%203.png)

# Operadores 
### Operadores artimeticos
| Operador | Descripción           | Ejemplo          | Resultado (ejemplo)  |
|----------|-----------------------|------------------|-----------------------|
| +        | Suma                  | 3 + 5            | 8                     |
| -        | Resta                 | 7 - 4            | 3                     |
| *        | Multiplicación        | 2 * 6            | 12                    |
| /        | División              | 8 / 2            | 4                     |
| %        | Módulo (Residuo)      | 9 % 4            | 1                     |
| **       | Potencia              | 2 ** 3           | 8                     |

### Operadores logicos
| Operador | Utilización   | Resultado                                            |
|----------|---------------|-------------------------------------------------------|
| &&       | op1 && op2    | True si op1 y op2 son true. Si op1 es false, no se evalúa op2.   |
| \|\|      | op1 \|\| op2   | True si op1 y op2 son true. Si op1 es true, no se evalúa op2.    |
| !        | !op           | True si op es false, false si op es true.                           |
| &        | op1 & op      | True si op1 y op2 son true, siempre se evalúa op2.            |
| \|       | op1 \| op2    | True si op1 u op2 son true, siempre se evalúa op2.           |


### Operadores de asignacion 
| Operador | Utilización | Expresión Equivalente   |
|----------|-------------|--------------------------|
| =        | op1 = op2   | op1 = op2                |
| +=       | op1 += op2  | op1 = op1 + op2          |
| -=       | op1 -= op2  | op1 = op1 - op2          |
| *=       | op1 *= op2  | op1 = op1 * op2          |
| /=       | op1 /= op2  | op1 = op1 / op2          |
| %=       | op1 %= op2  | op1 = op1 % op2          |


### Operadores de incremento y decremento
| Operador           | Descripción                                          | Ejemplo                      |
|--------------------|------------------------------------------------------|------------------------------|
| `++` (Prefijo)     | Incrementa el valor de la variable antes de su uso.  | `int x = 5; int y = ++x;`    |
| `++` (Sufijo)      | Incrementa el valor de la variable después de su uso.| `int a = 8; int b = a++;`    |
| `--` (Prefijo)     | Decrementa el valor de la variable antes de su uso.  | `int m = 10; int n = --m;`   |
| `--` (Sufijo)      | Decrementa el valor de la variable después de su uso.| `int p = 12; int q = p--;`   |

### Operadores de comparacion 
| Operador | Uso            | Resultado Verdadero si    |
|----------|----------------|---------------------------|
| >        | op1 > op2      | op1 es mayor que op2      |
| >=       | op1 >= op2     | op1 es mayor o igual que op2 |
| <        | op1 < op2      | op1 es menor que op2      |
| <=       | op1 <= op2     | op1 es menor o igual que op2 |
| ==       | op1 == op2     | op1 y op2 son iguales     |
| !=       | op1 != op2     | op1 y op2 son diferentes  |

| Operador | Utilización | Resultado                                 |
|----------|-------------|--------------------------------------------|
| `>>`     | op1 >> op2  | Desplaza los bits de op1 a la derecha una distancia op2 |
| `<<`     | op1 << op2  | Desplaza los bits de op1 a la izquierda una distancia op2 |
| `&`      | op1 & op2   | Operador AND a nivel de bits                |
| `|`      | op1 \| op2  | Operador OR a nivel de bits                 |
| `^`      | op1 ^ op2   | Operador XOR a nivel de bits (1 si solo uno de los operandos es 1) |
| `~`      | ~op         | Operador complemento (invierte el valor de cada bit) |

