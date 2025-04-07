# Listas-Enlazadas-en-Java:

El proyecto desarrollado tiene como finalidad construir y manipular una lista enlazada simple desde cero, aplicando los principios de programación orientada a objetos y el uso de referencias en memoria dinámica. La solución se basa en el manejo explícito de la memoria dinámica a través de la creación de nodos enlazados mediante referencias, lo que permite operaciones eficientes de inserción, eliminación, búsqueda y reversión de elementos, utilizando únicamente clases propiamente definidas, sin recurrir a estructuras dinámicas ya implementadas en Java. La aplicación funciona desde consola e incluye un menú interactivo que permite al usuario realizar diversas operaciones con los nodos de la lista, como insertar, eliminar, buscar, invertir, mostrar los elementos y cargar los datos automáticamente desde un archivo de texto externo.

# ¿Cómo ejecutar el programa? 

1. Verificar que Java esté instalado en el equipo.
2. Guardar los archivos Elemento.java, ListaSimple.java y EjecutarLista.java en la misma carpeta.
3. Desde la terminal o consola, navegar a esa carpeta.
4. Compilar todos los archivos con: javac *.java
5. Luego, ejecutar el programa principal con: java EjecutarLista
6. Si se desea cargar datos desde un archivo, crear un archivo de texto con los números separados por espacios o líneas y guardarlos en la misma carpeta.

# Propósito de cada clase:

# Elemento.java:
Define un nodo individual de la lista. Cada nodo almacena un valor (int) y una referencia al siguiente nodo.

# ListaSimple.java: 
Contiene toda la lógica para gestionar la lista enlazada. Incluye métodos para:
- Agregar elementos al inicio, final o en una posición específica.
- Eliminar nodos por valor.
- Buscar elementos por valor y obtener su posición.
- Invertir el orden de los nodos.
- Imprimir la lista completa.

# EjecutarLista.java:
Es la clase principal que inicia el programa. Presenta un menú que guía al usuario en cada operación. También permite cargar datos desde un archivo .txt, lo que facilita la carga masiva de valores.

# Ejemplos de uso:

# Ingreso manual:

# Entrada:

Opción 1 → valor: 3
Opción 2 → valor: 0
Opción 3 → valor: 4 → Posición: 2

# Resultado:
Lista: 3 -> 4 -> 0 -> null

# Cargar archivo txt:

# Contenido del archivo:
3 0 4 6 5 1 

# Desde el programa:
# Opción 8:
Nombre del archivo: DPI.txt 

# Resultado esperado al mostrar lista:
Lista: 3 -> 0 -> 4 -> 6 -> 5 -> 1 -> null

# Consideraciones:

- No se usó ninguna estructura dinámica como ArrayList, LinkedList, Queue, etc.
- Se trabajó únicamente con clases creadas manualmente y referencias entre objetos.
- El uso de Scanner está enfocado exclusivamente en la lectura de datos (teclado o archivo).

# Agradecimiento:

Este proyecto fue una excelente oportunidad para reforzar el manejo de estructuras de datos dinámicas y referencias en Java. Le agradezco mucho Ingeniero Chitay, por plantear desafíos que realmente fortalecen nuestra lógica de programación y comprensión del funcionamiento interno de las listas enlazadas. 
