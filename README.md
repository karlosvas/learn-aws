# Java

## Introducción

Java es un lenguaje de programación de propósito general, concurrente, orientado a objetos que fue diseñado específicamente para tener tan pocas dependencias de implementación como fuera posible.
Su intención es permitir que los desarrolladores de aplicaciones escriban el programa una vez y lo ejecuten en cualquier dispositivo (conocido en inglés como WORA, o "write once, run anywhere"), lo que quiere decir que el código que es ejecutado en una plataforma no tiene que ser recompilado para correr en otra. Java es, a partir de **2012**, uno de los lenguajes de programación más populares en uso, particularmente para aplicaciones de cliente-servidor de web, con unos 10 millones de usuarios reportados.
Convencionalmente se utiliza CamelCase para nombrar las clases, métodos y variables.

### Types of data

Texto = Sring line;
Enteros = int number;
Decimales = double number;
Booleanos = boolean value;
Caracteres = char letter;
Numeros grandes = long number;

### Scanner

Para introducir argumentos proporcionado por usuarios en java se utiliza el objeto Scanner, el cual se encuentra en el paquete java.util.
Para utilizarlo se debe importar el paquete y crear un objeto de tipo Scanner. A continuación se muestra un ejemplo de como utilizar el objeto Scanner para introducir un número entero proporcionado por el usuario.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        System.out.println("El número introducido es: " + numero);
    }
}
```

### Palabras reservadas

Para crear palabras reservdas como por ejemplo if o for se utiliza el guión antes o depues de declarar la variable, de todos modos se recomienda no utilizar palabras reservadas para nombrar variables.

### Programación estructurada o procedimental

Es un paradigma en programacion orientado a mejorar la claridad, tiempo de desarollo de un programa y la facilidad de mantenimiento. Se basa en el uso de funciones o subrutinas para estructurar el programa.

### Programación orientada a objetos

Las POO es una manera de deiseñar y desarollar software que trata de imitar la relalidad tomando algunos conceptos esenciales de ella, el primero de estos es precisamente el de objeto cuyos rasgos son la identidad el estado y el comportamiento.

- Identidad: Cada objeto es unico.
- Estado: Cada objeto tiene un estado que es representado por sus atributos.
- Comportamiento: Cada objeto puede realizar acciones.
