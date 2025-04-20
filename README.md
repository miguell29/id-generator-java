# Generador de ID Único

Este repositorio contiene el código fuente de un programa simple en Java diseñado para generar un ID único para una persona, combinando datos personales con un número aleatorio.

## Descripción del Ejercicio (Consigna Original)

La consigna del ejercicio resuelto en este proyecto fue la siguiente:

Debes crear un programa que genere un ID único para cada persona. Para ello, el programa debe solicitar al usuario su nombre, apellido y año de nacimiento a través de la consola. Luego, debes generar un número aleatorio de cuatro dígitos entre 1 y 9999 y, si ese número tiene menos de cuatro dígitos, deberás completarlo con ceros a la izquierda.
El ID único se construirá de la siguiente manera:
*   Tomar los dos primeros caracteres del nombre (en mayúscula).
*   Tomar los dos primeros caracteres del apellido.
*   Tomar los dos últimos dígitos del año de nacimiento.
*   Agregar el número aleatorio generado al final.

Por ejemplo, si el nombre es Juan, el apellido es Pérez y el año de nacimiento es 1995, el formato del ID único sería algo como: JUPE95XXXX, donde XXXX es el número aleatorio de cuatro dígitos.

Además, tu programa debe imprimir un mensaje de saludo al usuario junto con su nuevo ID.

## Tecnologías Utilizadas

*   **Lenguaje de Programación:** Java

## Prerrequisitos

Para compilar y ejecutar este programa, necesitas tener instalado el **Java Development Kit (JDK)** en tu sistema. Puedes descargarlo desde el sitio oficial de Oracle o utilizar alguna distribución Open Source como OpenJDK.



## Posibles Mejoras al Programa

El programa actual cumple con la consigna original, generando un ID basado en la entrada del usuario y un número aleatorio. Sin embargo, existen varias formas de hacerlo más robusto, útil o amigable. Aquí tienes una lista de posibles mejoras, ordenadas aproximadamente por su complejidad, desde las más sencillas hasta las más avanzadas:

### 1. Validación de Entrada Básica

*   **Descripción:** Asegurarse de que los datos ingresados por el usuario sean razonables. Por ejemplo, verificar que el nombre y apellido no estén vacíos, y que el año de nacimiento sea un número positivo y dentro de un rango realista (ej: no en el futuro, no un año ridículamente antiguo).
*   **Beneficio:** Hace que el programa sea menos propenso a errores causados por entradas inválidas.

### 2. Manejo de Errores (Try-Catch)

*   **Descripción:** Implementar bloques `try-catch` para manejar posibles excepciones, como si el usuario ingresa texto en lugar de un número para el año de nacimiento.
*   **Beneficio:** Evita que el programa termine de forma abrupta ante errores de entrada.

### 3. Generar Múltiples IDs (Bucle)

*   **Descripción:** Modificar el programa para que, después de generar un ID, pregunte al usuario si desea generar otro, permitiendo la generación de múltiples IDs sin tener que reiniciar la aplicación cada vez.
*   **Beneficio:** Mejora la usabilidad si se necesitan generar varios IDs en una sesión.

### 4. Garantizar Unicidad (en Memoria)

*   **Descripción:** Si se implementa la generación de múltiples IDs (mejora #3), se podrían almacenar los IDs generados *durante la ejecución actual* en una estructura de datos (como un `ArrayList` o `HashSet`). Antes de asignar un nuevo ID, verificar si ya existe en esta lista. Si el ID generado (incluyendo el número aleatorio) ya existe, regenerar solo la parte aleatoria hasta obtener un ID único para esa sesión.
*   **Beneficio:** Aunque no garantiza unicidad histórica, evita duplicados *mientras el programa se está ejecutando*.

### 5. Persistencia Simple (Guardar en Archivo)

*   **Descripción:** Añadir la funcionalidad de guardar los IDs generados en un archivo de texto plano (ej: `ids_generados.txt`). Cada vez que se genera un nuevo ID, se añade al archivo.
*   **Beneficio:** Los IDs generados persisten incluso después de que el programa termina su ejecución.

### 6. Garantizar Unicidad (Persistente)

*   **Descripción:** Combinar las mejoras #4 y #5. Al iniciar el programa, cargar todos los IDs existentes desde el archivo de persistencia. Al generar un nuevo ID, verificar si ya existe tanto en la lista cargada en memoria como en el archivo. Si se encuentra un duplicado, regenerar la parte aleatoria del ID.
*   **Beneficio:** Asegura que cada ID generado sea único a lo largo del tiempo y entre diferentes ejecuciones del programa.

### 7. Refactorización Orientada a Objetos (POO)

*   **Descripción:** Reestructurar el código utilizando principios de POO. Crear clases dedicadas, como una clase `Persona` (que contenga nombre, apellido, año de nacimiento) y una clase `GeneradorId` (que contenga la lógica para crear y validar IDs).
*   **Beneficio:** Mejora la organización, modularidad y mantenibilidad del código, haciéndolo más fácil de entender y expandir en el futuro.

### 8. Uso de una Base de Datos Ligera

*   **Descripción:** En lugar de un archivo de texto plano, utilizar una base de datos embebida en Java (como SQLite) para almacenar los IDs. Esto facilita la gestión de grandes cantidades de IDs y la verificación de unicidad.
*   **Beneficio:** Proporciona una solución más robusta y escalable para la persistencia y la gestión de la unicidad.

### 9. Interfaz Gráfica de Usuario (GUI)

*   **Descripción:** Reemplazar la interacción por consola con una interfaz visual utilizando librerías como Swing o JavaFX.
*   **Beneficio:** Hace que el programa sea más amigable y accesible para usuarios que no están cómodos con la línea de comandos. (Esta es una mejora de una complejidad significativamente mayor que las anteriores).

---

¡Siéntete libre de experimentar con cualquiera de estas mejoras para seguir practicando y profundizando tus conocimientos en Java! ¡Buen trabajo!

*   **Descripción:** Reemplazar la interacción por consola con una interfaz visual utilizando librerías como Swing o JavaFX.
*   **Beneficio:** Hace que el programa sea más amigable y accesible para usuarios que no están cómodos con la línea de comandos. (Esta es una mejora de una complejidad significativamente mayor que las anteriores).

---

¡Siéntete libre de experimentar con cualquiera de estas mejoras para seguir practicando y profundizando tus conocimientos en Java!
