import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDobleCircular lista = new ListaDobleCircular();
        int opcion, dato;

        do {
            System.out.println("\n========================================");
            System.out.println(" LISTA DOBLEMENTE ENLAZADA CIRCULAR ");
            System.out.println("========================================");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar al inicio");
            System.out.println("4. Eliminar al final");
            System.out.println("5. Buscar elemento");
            System.out.println("6. Imprimir lista");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese dato: ");
                    dato = sc.nextInt();
                    lista.insertarInicio(dato);
                    lista.imprimir();
                    break;

                case 2:
                    System.out.print("Ingrese dato: ");
                    dato = sc.nextInt();
                    lista.insertarFinal(dato);
                    lista.imprimir();
                    break;

                case 3:
                    lista.eliminarInicio();
                    lista.imprimir();
                    break;

                case 4:
                    lista.eliminarFinal();
                    lista.imprimir();
                    break;

                case 5:
                    System.out.print("Ingrese dato a buscar: ");
                    dato = sc.nextInt();
                    lista.buscar(dato);
                    break;

                case 6:
                    lista.imprimir();
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 7);
    }
}
