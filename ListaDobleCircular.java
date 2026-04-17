public class ListaDobleCircular {
    Nodo head = null;

    public void insertarInicio(int dato) {
    Nodo nuevo = new Nodo(dato);

    if (head == null) {
        // lista vacía
        nuevo.siguiente = nuevo;
        nuevo.anterior = nuevo;
        head = nuevo;
    } else {
        Nodo ultimo = head.anterior;

        nuevo.siguiente = head;
        nuevo.anterior = ultimo;

        ultimo.siguiente = nuevo;
        head.anterior = nuevo;

        head = nuevo;
    }
}
public void imprimir() {
    if (head == null) {
        System.out.println("La lista está vacía");
        return;
    }

    Nodo actual = head;

    System.out.print("Lista: ");

    do {
        System.out.print(actual.dato + " <-> ");
        actual = actual.siguiente;
    } while (actual != head);

    System.out.println("(circular -> " + head.dato + ")");
}

public void eliminarInicio() {
    if (head == null) {
        System.out.println("Lista vacía");
        return;
    }

    if (head.siguiente == head) {
        head = null;
    } else {
        Nodo ultimo = head.anterior;

        head = head.siguiente;

        head.anterior = ultimo;
        ultimo.siguiente = head;
    }
}

public void eliminarFinal() {
    if (head == null) {
        System.out.println("Lista vacía");
        return;
    }

    if (head.siguiente == head) {
        head = null;
    } else {
        Nodo ultimo = head.anterior;
        Nodo penultimo = ultimo.anterior;

        penultimo.siguiente = head;
        head.anterior = penultimo;
    }
}

public void buscar(int valor) {
    if (head == null) {
        System.out.println("No encontrado");
        return;
    }

    Nodo actual = head;

    do {
        if (actual.dato == valor) {
            System.out.println("Encontrado");
            return;
        }
        actual = actual.siguiente;
    } while (actual != head);

    System.out.println("No encontrado");
}
public void insertarFinal(int dato) {
    Nodo nuevo = new Nodo(dato);

    if (head == null) {
        nuevo.siguiente = nuevo;
        nuevo.anterior = nuevo;
        head = nuevo;
    } else {
        Nodo ultimo = head.anterior;

        nuevo.siguiente = head;
        nuevo.anterior = ultimo;

        ultimo.siguiente = nuevo;
        head.anterior = nuevo;
    }
}

}
