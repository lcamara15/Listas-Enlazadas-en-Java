// Implementación de una lista enlazada simple

public class ListaSimple {
    private Elemento inicio; // Primer nodo de la lista

    // Agrega un nodo al final

    public void insertarFinal(int valor) {
        Elemento nuevo = new Elemento(valor);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Elemento actual = inicio;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Agrega un nodo al inicio

    public void insertarInicio(int valor) {
        Elemento nuevo = new Elemento(valor);
        nuevo.siguiente = inicio;
        inicio = nuevo;
    }

    // Inserta un nodo en la posición indicada

    public void insertarEn(int valor, int posicion) {
        if (posicion <= 0) {
            insertarInicio(valor);
            return;
        }

        Elemento nuevo = new Elemento(valor);
        Elemento actual = inicio;
        for (int i = 0; actual != null && i < posicion - 1; i++) {
            actual = actual.siguiente;
        }

        if (actual == null) {
            insertarFinal(valor);
        } else {
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }

    // Elimina el primer nodo que contenga el valor dado

    public void eliminar(int valor) {
        if (inicio == null) return;

        if (inicio.valor == valor) {
            inicio = inicio.siguiente;
            return;
        }

        Elemento actual = inicio;
        while (actual.siguiente != null && actual.siguiente.valor != valor) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    // Verifica si un valor está en la lista o no

    public boolean contiene(int valor) {
        Elemento actual = inicio;
        while (actual != null) {
            if (actual.valor == valor) return true;
            actual = actual.siguiente;
        }
        return false;
    }

    // Devuelve la posición del valor si está en la lista, o -1 si es que no se encuentra

    public int buscarPosicion(int valor) {
        Elemento actual = inicio;
        int posicion = 0;

        while (actual != null) {
            if (actual.valor == valor) {
                return posicion;
            }
            actual = actual.siguiente;
            posicion++;
        }

        return -1;
    }

    // Imprime los valores de la lista

    public void mostrar() {
        Elemento actual = inicio;
        System.out.print("Lista: ");
        while (actual != null) {
            System.out.print(actual.valor + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Invierte el orden de los nodos en la lista
    
    public void invertir() {
        Elemento anterior = null;
        Elemento actual = inicio;
        Elemento siguiente;

        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }

        inicio = anterior;
    }
}

