# Patrones de diseño

En programación, los patrones de diseño constituyen soluciones **generales** y **reusables** que resultan de utilidad para resolver un problema común en el diseño de software. Podemos considerarlos como "recetas" que nos ofrecen una manera eficiente de encarar el diseño; lo cual permite desarrollar código robusto, flexible y mantenible. 

Los tres tipos de patrones más importantes son:


- Patrones creacionales.

- Patrones estructurales.

- Patrones de comportamiento.


## Patrones de diseño creacionales

Se utilizan para crear objetos y manejar la creación de instancias de clases. Lo que hacen fundamentalmente es **abstraer** el proceso de creación de objetos, permitiendo que el sistema sea independiente justamente de cómo se crean, se componen y se representan.
Para detallar algunos de los más utilizados podemos mencionar:

### Patrón Singleton

Este patrón asegura que una clase sea instanciada una única vez, proporcionando un punto de acceso global a dicha instancia. En mi experiencia lo eh utilizado a menudo para la instanciación de bases de datos, tratándose este de un caso de uso típico del patrón Singleton.

### Patrón Builder

Se utiliza para construir objetos que pueden considerarse complejos, posibilitando su construcción paso a paso y permitiendo diferentes representaciones del objeto final. Un caso de uso podría ser la creación de un objeto que tenga muchas opciones de configuración o parámetros, como un objeto de configuración de una aplicación, donde se puede tener diferentes configuraciones con diferentes combinaciones de opciones.

### Factory

Por medio de este patrón lo que haremos será encapsular la lógica de creación de un objeto, a través de una interfaz que se utiliza para crear instancias de clase derivadas de una clase base. Un caso de uso frecuente se da cuando necesitamos crear diferentes tipos de objetos que implementen una misma interfaz o hereden de una misma clase base, y deseamos que la lógica de creación esté centralizada y sea flexible para agregar o modificar tipos de objetos en el futuro.

## Patrones de diseño estructurales

Como su nombre lo indica, se utilizan con el fin de **organizar** y **estructurar** clases y objetos. Estos patrones describen la forma en que las clases y objetos se combinan para formar estructuras de mayor proporción, garantizando que las diferentes partes del sistema funcionen juntas eficientemente.
Detallemos brevemente algunos de los más utilizados:

### Decorator

Este patrón permite agregar funcionalidad adicional a un objeto dinámicamente, envolviéndolo en un **objeto decorador** que implementa la misma interfaz. Un caso de uso podría ser cuando deseamos agregar comportamiento o características adicionales a un objeto existente sin modificar su estructura interna, como añadir funcionalidades de log o de cache a un servicio o un componente.

### Adapter

Se utiliza con el fin de convertir la interfaz de una clase en otra interfaz que se espera, permitiendo la colaboración entre clases con interfaces incompatibles. Un caso frecuente sucede cuando necesitamos utilizar una clase o componente existente en un nuevo contexto que requiere una interfaz diferente, o bien para integrar diferentes sistemas con interfaces diferentes.

## Patrones de diseño de comportamiento

Estos patrones se utilizan para gestionar la interacción entre objetos y el comportamiento de las clases y objetos. Se centran en el modo en el que los objetos colaboran entre sí para lograr un comportamiento en particular y en la manera en la que se distribuyen las responsabilidades entre ellos. 
Algunos de estos patrones comúnmente utilizados son:

### Observer

Básicamente, lo que permite este patrón es la notificación **automática** a múltiples objetos, cuando un objeto que se encuentra *observado* cambia su estado. Es comúnmente utilizado en la interacción entre las vistas/interfaces gráficas y los modelos de datos. 

### Strategy 

Este patrón permite encapsular algoritmos intercambiables en clases separadas, lo que permite cambiar el comportamiento de un objeto en tiempo de ejecución. Un caso de uso podría ser cuando se desea proporcionar diferentes estrategias o algoritmos para resolver un problema específico, como la selección de un algoritmo de ordenamiento o de cálculo de impuestos en función de la configuración o preferencias del usuario.

😁 Eso es todo por el momento! Como todo, los patrones de diseño se irán interiorizando con la práctica. 

Dejo un código sencillo en donde se aplica el patrón Singleton y una gran recomendación.. La web de [Refactoring guru](https://refactoring.guru/es/design-patterns)

Saludos!

<img src="https://user-images.githubusercontent.com/69772530/231925894-05a49350-fb31-4955-9e8e-761cffcebb01.png" alt="Descripción de la imagen" width="200" height="200">
