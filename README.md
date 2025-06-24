# Práctica 5: Herencia, Genéricos e Interfaces Funcionales. 📌

Nombre:

NumCuenta:

En esta práctica se trabajará con tipos genéricos, la herencia (incluyendo clases abstractas) y el uso de interfaces funcionales.

## Autores 😊
* **Salvador López Mendoza** - *Titular* - [Correo](slm@ciencias.unam.mx)
* **Gerardo Emiliano Figueroa Sandoval** - *Teoría* - [Emiliano-Fs](https://github.com/Emiliano-FS)
* **Ramsés Antonio López Soto** - *Laboratorio* - [ramseslopez](https://github.com/ramseslopez)
  
## Objetivos 🚀

- Entender qué son y para que sirven los tipos genéricos.
- Comprender el concepto de herencia y clases abstractas.
- Entender el uso de las interfaces funcionales.

### Pre-requisitos 📋

- Sistema Operativo Linux (Ubuntu, Debian, Fedora, etc.)
- Git versión 2.43.0
- Java versión 21.0.7
- Perfil de GitHub
- Apache Maven 3.8.7

### Instalación 🔧

- Git

Para instalar la versión más reciente de Git:

```bash
sudo apt-get install git

```
Una vez finaliado, verifica la versión instalada.

```
git -v
```

- Java
  
Instala Java con el siguiente comando:

```
sudo apt-get install openjdk-21-jre
```

Al finalizar, verifica la versión instalada.

```
java --version
```
y también del compilador:

```
javac --version
``` 

- Maven 

Instala maven con el siguiente comando:

```
sudo apt-get install maven
```

Al finalizar verifica la versión:

```
mvn -v
```


## Recursos 📖

Puedes encontrar más información de los recursos a utilizar en:

- [Tutorial Maven](https://jcodepoint.com/tutoriales/tutorial-de-maven/)

## Ejercicio ⌨️

Lee con mucha atención las instrucciones:

### Polígonos Regulares

Esta práctica consiste en implementar una pequeña jerarquía de clases de polígonos regulares. Deberás de completar los siguientes métodos por clase

* `PoligonoRegular`:

    - `PoligonoRegular(int lados, N longitud)`: 

    Debe inicializar los atributos con los parámetros que se deseen, pero el número de lados no debe de ser menor a 3 y la longitud no debe ser menor que 1.

    - `int obtenerLados()`:

    Devuelve el número de lados del polígono regular.

    - `N obtenerLongitud()`: 

    Obtiene la longitd de los lados del polígono regular.

    - `N calcularPerimetro()` :

    Calcula el perímetro del polígono regular. Debe devolver el perímetro como un tipo `N`, es decir; si fue `Integer`, debe devolver `Integer`, etc.

    - `boolean equals(Object o)`:

    VErifica si dos polígonos regulares son iguales tomando en cuenta el número de lados, la longitud y el tipo `N` de estos.

    - `String toString()`:

    Devuelve el polígono regular en formato de cadena.

    - `Double calcularArea();` y `String colorear(String str)` son abstractos.

* `Triangulo`:

    - `Triangulo(N longitud)`: 

    Inicializa la figura con tres lados y un tipo `N`.

    - `Double calcularArea()`: 

    Calcula el área del triángulo.

    - `String colorear(String str)` :

    Debe colorear el triángulo de color rojo usando la interface `Coloreable`.


* `Cuadrado`:

    - `Cuadrado(N longitud)`: 

    Inicializa la figura con cuatro lados y un tipo `N`.

    - `Double calcularArea()`: 

    Calcula el área del cuadrado.

    - `String colorear(String str)` :

    Debe colorear el triángulo de color verde usando la interface `Coloreable`.

* `Pentagono`:

    - `Pentagono(N longitud)`: 

    Inicializa la figura con tres lados y un tipo `N`.

    - `Double calcularArea()`: 

    Calcula el área del pentágono.

    - `String colorear(String str)` :

    Debe colorear el triángulo de color amarillo usando la interface `Coloreable`.

El método `calcularArea()` debe de implementarse usando la interfaz funcional `Calculable` y una lambda que contenga en su cuerpo las instrucciones necesarias para el cálculo usando **SOLAMENTE LOS ATRIBUTOS PROPORCIONADOS**.

**LOS ÚNICOS ARCHIVOS QUE SE PUEDEN MODIFICAR SON `PoligonoRegular`, `Triangulo`, `Cuadrado` y `Pentagono`**.

También debes colocar tu nombre en los archivos donde de encuentra la etiqueta `@author` y generar la documentación html de la práctica:

```
mvn javadoc:javadoc
```

Una vez terminada la implementación, debes compilar

```
mvn compile
```

 y ejecutar las pruebas unitarias para verificar que todo lo que hiciste es correcto:

```
mvn test
```

Al final, ejecuta el archivo `Practica4.java`:

```
mvn install

java -jar target/Practica5.jar
```

## Intrucciones

* La práctica se entrega de forma individual.
* Debes de clonar el este repositorio con el comando `git clone`, agregar tu nombre en la parte de `Nombre: ` y seguido de tu número de cuenta en `NumCuenta: `.
* El código debe ser legible y el nombre varialbes y métodos debe ser adecuado. Debes de seguir las reglas correspondientes.
* Sube la solución de la práctica antes de las 23:59 del día de mañana con los comandos `git add`, `git commit` y `git push`.
* Una vez en el repositorio, debes de entregar en el Classroom la liga **HTTPS** que direcciona a tu repositorio.
* La calificación se determinará dependiendo del número de pruebas que pasen.
* Ningún tipo de copia y/o plagio será tolerado.

## Licencia 📄

Este proyecto está bajo la Licencia MIT - mira el archivo [LICENSE.md](LICENSE.md) para más detalles.