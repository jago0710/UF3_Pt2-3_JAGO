package Ex2;

import java.util.Scanner;

public class TestVehiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorDeVehiculo GestorDeVehiculo = new GestorDeVehiculo();
        while (true) {
        System.out.println("<><><><><><><><><><><><><><><> \n" +
                "1. Añadir un vehiculo");
        System.out.println("2. Consultar precio de renta");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                GestorDeVehiculo.añadirVehiculo();
                break;
            case 2:
                GestorDeVehiculo.consultarPrecioDeRenta();
                break;
            case 3:
                System.out.println("Cerraste el programa!");
                break;
            default:
                System.out.println("La opción elegida no es válida");
            }
        }
    }
}
