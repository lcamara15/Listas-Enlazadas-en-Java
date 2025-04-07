// Listas Enalazadas en Java - Segunda Evaluación Parcial
// Nombre: Lourdes María Cámara Illescas
// Carné: 202403284
// Curso: Estructura de Datos
// Docente: Ing. Brandon Chitay

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class EjecutarLista {
    public static void main(String[] args) {
        
        // Se crea un escáner para leer datos desde teclado

        Scanner sc = new Scanner(System.in);

        // Se crea una instancia de la lista enlazada personalizada

        ListaSimple lista = new ListaSimple();

        // Bienvenida al usuario

        System.out.print("Por favor, ingresa tu nombre para comenzar: ");
        String usuario = sc.nextLine().trim();
        System.out.println("\n¡Hola " + usuario + "! Bienvenido/a a tu programa de listas enlazadas.\n");

        int opcion;
        do {

            // Menú de opciones para manipular la lista enlazada

            System.out.println("\n>>>>> MENÚ DE OPCIONES <<<<<");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Insertar en posición");
            System.out.println("4. Eliminar valor");
            System.out.println("5. Verificar si se encuentra número y mostrar posición");
            System.out.println("6. Invertir lista");
            System.out.println("7. Mostrar lista");
            System.out.println("8. Cargar números desde archivo");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el valor: ");
                    lista.insertarInicio(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Ingresa el valor: ");
                    lista.insertarFinal(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Valor a insertar: ");
                    int valor = sc.nextInt();
                    System.out.print("Posición (comenzando en 0): ");
                    int pos = sc.nextInt();
                    lista.insertarEn(valor, pos);
                    break;
                case 4:
                    System.out.print("Valor a eliminar: ");
                    lista.eliminar(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Valor a buscar: ");
                    int valorBuscado = sc.nextInt();
                    int posicion = lista.buscarPosicion(valorBuscado);
                    if (posicion != -1) {
                        System.out.println("Sí está en la lista, en la posición: " + posicion);
                    } else {
                        System.out.println("No está en la lista.");
                    }
                    break;
                case 6:
                    lista.invertir();
                    System.out.println("Lista invertida.");
                    break;
                case 7:
                    lista.mostrar();
                    break;
                case 8:
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Ingresa el nombre del archivo: ");
                    String archivo = sc.nextLine().trim();
                    try {
                        Scanner lector = new Scanner(new File(archivo));
                        while (lector.hasNextInt()) {
                            int numero = lector.nextInt();
                            lista.insertarFinal(numero);
                        }
                        lector.close();
                        System.out.println("Datos cargados exitosamente.");
                    } catch (FileNotFoundException e) {
                        System.out.println("Archivo no encontrado. Por favor, asegúrate de que esté en la carpeta correcta.");
                    }
                    break;
                case 0:
                    System.out.println("\nGracias por usar el programa, " + usuario + ". ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}



