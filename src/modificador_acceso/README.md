# Modificador de acceso en Java

En Java, los modificadores de acceso determinan desde dónde otros partes de tu código pueden acceder a los miembros de una clase (atributos y métodos).

- `public`: El miembro es accesible desde cualquier otra clase.
- Sin modificador (también conocido como "**package-private**"): El miembro es accesible solo desde otras clases en el mismo paquete.
- `package-private`. Esto significa que solo pueden ser accedidos desde otras clases en el mismo paquete.
- `private`: El miembro es accesible solo desde la misma clase.

```java
int valorUno;
String valorTres;
public BigInteger valorPublico;
private double valorPrivado;
```

Es una buena práctica de programación hacer los atributos de una clase `private` y proporcionar métodos `public` para acceder y modificarlos (conocidos como getters y setters). Esto se llama encapsulación y ayuda a mantener la seguridad y la flexibilidad del código.
