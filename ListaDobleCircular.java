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

}
