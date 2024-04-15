package myApp;

import java.util.Scanner;

import Clases.*;


public class Gestor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Producto[] productos = new Producto[4];
        productos[0] = new Componente("CPU Intel", "EEUU", 250, 1234, "Intel", "CPU");
        productos[1] = new Accesorio("Funda para móvil", "China", 15, 5678, "Negro", "iPhone 12");
        productos[2] = new Periferico("Teclado mecánico", "Taiwán", 100, 9876, "Logitech", "Teclado", 1.2f);
        productos[3] = new Software("Windows 11", "EEUU", 199, 4321, "11.0", "Sistema Operativo", 10);

        int opcion;
        do {
            System.out.println("\n--- Menú de gestión de productos ---");
            System.out.println("1. Mostrar productos");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Productos disponibles ---");
                    for (Producto producto : productos) {
                        producto.mostrar();
                        System.out.println("\n--------------------------------------------------------");
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 2);
        sc.close();
    }
}