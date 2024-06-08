# Java

## Introducción

Java es un lenguaje de programación de propósito general, concurrente, orientado a objetos que fue diseñado específicamente para tener tan pocas dependencias de implementación como fuera posible.
Su intención es permitir que los desarrolladores de aplicaciones escriban el programa una vez y lo ejecuten en cualquier dispositivo (conocido en inglés como WORA, o "write once, run anywhere"), lo que quiere decir que el código que es ejecutado en una plataforma no tiene que ser recompilado para correr en otra. Java es, a partir de **2012**, uno de los lenguajes de programación más populares en uso, particularmente para aplicaciones de cliente-servidor de web, con unos 10 millones de usuarios reportados.
Convencionalmente se utiliza CamelCase para nombrar las clases, métodos y variables.

### Types of data

Texto = String line;  
Enteros = int number;  
Decimales = double number;  
Booleanos = boolean value;  
Caracteres = char letter;  
Numeros grandes = long number;

### Estructura principal

```java
public class Main {
    public static void main(String[] args) {
        // Código
    }
}
```

### Scanner

Para introducir argumentos proporcionados por usuarios en Java se utiliza el objeto Scanner, el cual se encuentra en el paquete java.util.
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

### Modificador de acceso en Java

En Java, los modificadores de acceso determinan desde dónde otros partes de tu código pueden acceder a los miembros de una clase (atributos y métodos).

- `public`: El miembro es accesible desde cualquier otra clase.
- Sin modificador (también conocido como "**package-private**"): El miembro es accesible solo desde otras clases en el mismo paquete.
- `package-private`. Esto significa que solo pueden ser accedidos desde otras clases en el mismo paquete.
- `private`: El miembro es accesible solo desde la misma clase.
- `protected`: El miembro es accesible dentro de su propia clase que están en el mismo paquete, y también en las subclases, incluso si están en paquetes diferentes.

```java
int valorUno;
String valorTres;
public BigInteger valorPublico;
private double valorPrivado;
```

Es una buena práctica de programación hacer los atributos de una clase `private` y proporcionar métodos `public` para acceder y modificarlos (conocidos como getters y setters). Esto se llama encapsulación y ayuda a mantener la seguridad y la flexibilidad del código.

La principal diferencia entre `protected` y "package-private" es que `protected` permite el acceso a las subclases, incluso si están en paquetes diferentes, mientras que "package-private" no lo permite.

### Polimorfismo

El polimorfismo en POO es la cpacidad que se le da a un método, de comportarse de manera difernete de acuerdo a la instancia creada, esto se logra gracias a la herencia y a la sobreescritura de métodos.
Con la palabra reservada @Override se puede sobreescribir un método de la clase padre asbtarct en la clase hija.

```java
public abstract class Padre {
   // Polimorfismo, solo permite declararlo
   public abstract void Operaciones();
}

// Clase hija
@Override
public void Operaciones() {
   System.out.println("Resta finalizada");
}
```

### Super

La palabra reservada super se usa para acceder a un elemento en la clase padre. Uno de los usos mas frecuente que le damos a la palabra super, es poder invocar al constructor de ese padre.
Con ello podremos reducir la cantidad de codigo que escribimos.

### Ámbito de variables en Java

El ámbito de una variable define su alcanze de uso, es decir indicaenq ue secciones de código una variable estará disponible.
En java tenemos tres tipos de ambito que pueden aplicar a una variable

- Local
  Las variables de ambito local son aquellas que se declaran dentro de un metodo, constructor o bloque de codigo, y solo pueden ser usadas dentro de ese metodo, constructor o bloque de codigo.
  Deven de ser inicializadas antes de ser usadas.

- Global
  Las variables de ambito global son aquellas que se declaran fuera de un metodo, constructor o bloque de codigo, y pueden ser usadas en cualquier parte de la clase.

- Estático
  Las variables de ambito estatico son aquellas que se declaran con la palabra reservada static, y pueden ser usadas en cualquier parte de la clase. Tambien se les conoce como variables de clase.

## Es un número?

En Java se puede verificar si una variable de entrada es un número con hasNextInt de la clase Scanner, como en el siguiente código, o mediante el uso de expresiones regulares, que viene por defecto en Java, no se podra utilizar con Scanner.

```java
if (scan.hasNextInt()){
    option = scan.nextInt();
 } else {
    System.out.println("Porfavor ingrese un número\n----------");
    scan.next();
    continue;
 }

 // Ragex
 if (input.matches("^[0-9]*$")) {
       System.out.println("Es un número");
 } else {
       System.out.println("No es un número");
 }
```

El operador `instanceof` en Java se utiliza para verificar si un objeto es una instancia de una clase específica o una subclase de esa clase, o si un objeto implementa una interfaz específica.

```java
String s = "Hola";
if (s instanceof String) {
    System.out.println("s es una instancia de la clase String");
}
```

Es importante mencionar que `null` no es considerado una instancia de ninguna clase, por lo que `null instanceof CualquierClase` siempre devolverá `false`.

### El operador instanceof no funciona con tipos primitivos

Tales como int, char, boolean, float, double, byte, short o long. Solo funciona con objetos.
Por ejemplo, el siguiente código dará un error de compilación:

```java
int i = 5;
if (i instanceof Integer) {
    System.out.println("i es una instancia de la clase Integer");
}
```

Si quieres verificar si una variable es de tipo int, tendrías que usar un objeto Integer en lugar de un int primitivo. Por ejemplo:

```java
Integer i = Integer.valueOf(5);
if (i instanceof Integer) {
System.out.println("i es una instancia de la clase Integer");
}
```

En este caso, el programa imprimirá "i es una instancia de la clase Integer".

### Excepciones

Las excepciones en Java son el medio utilizado para tratar situaciones anómalas que pueden suceder durante la ejecución de un programa.
Es decir el control de errores, algunos casos son:

- Invocar a un método sobre un objeto null
- Intentar abrir un archivo que no existe
- Intentar dividir un número por cero

Las excepciones son objetos que encapsulan información sobre un error que ha ocurrido en un programa. Cuando se produce un error, se lanza una excepción, que puede ser capturada y tratada por el código que la ha lanzado o por otro código que esté preparado para manejarla.

En coclusiónm, una excepción es una situiación aómala que puede tener lugar, cuando ejecutamos un determinado programa.
La forma en eque el programador trate esta anomalía es lo que se conoce como manejo o gestión de excepciones.
Sonnuna forma de ipntantar conseguir que, si un código fuente no se ejecuta correctamente, el programa no se detenga, y controle la situación de error para establecer como deve responder el programa.

```java
try {
    // Código que puede lanzar una excepción
} catch (Excepcion e) {
    // Código que se ejecuta si se lanza la excepción
} finally {
    // Código que se ejecuta siempre, haya o no excepción
}
```

### Hilo o Thread

Un hilo o también conocido como Thread por si tradución al inglés, es una secuencia de instrucciones o flujo de instruccion, que se ejecutan de forma concurrente y simultanea con otras secuencias.
Es decir con ayuda delos hilos podremos ejecutar mas de uno de los procesos al mismo tiempo.

Podemos acceder a su nombre con this.getName()

```java
// Hilo1.java
package lib.hilos.sincronizacion;
public class Hilo1 extends Thread{
    @Override
    public void run (){
    }
}
// Main.java
package src.hilos.sincronizacion;
import lib.hilos.sincronizacion.*;

public class Main {
    public static void main(String[] args){
        Hilo1 tread1 = new Hilo1();
        tread1.start();
    }
}
```

## Sincronización de hilos
La sincronización de hilos permite controlar el tiempo de ejecución de varios hilos ejecutándose de manera simultánea.
Cuya finalidad, es evitar que un hilo provoque el entorpecimiento de otro hilo al momento de estar ejecutando sus respectivas tareas.
O bien para establecer un orden de ejecución en nuestros programas al utilizar hilos

## Constructor 
Un constructor tiene las sigueientes características
Tiene el mismo nommbre de la clase
Es el primer método que se ejecuta
No puede retornar datos
Se ejecuta una unica vez
Tiene por objetivo inicializar objetivos

## La clase Math
Contiene métodos para realizar operaciones y cálculos matemáticos como:
Funciones Hiperbólicas, Trigonométricas conversion de grados a radianes y viceversa
Paso de cordenadas de rectangulares a polares
Ademas, la clase Math tiene una referencia a las dos contantes más utilizdas en las matemáticas con una precisión de 15 decimales, las cuales son:
e=2.718281822459045
pi=3,141592653589793