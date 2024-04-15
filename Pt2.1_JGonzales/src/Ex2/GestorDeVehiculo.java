package Ex2;
import java.util.Scanner;

public class GestorDeVehiculo {
    public static Scanner sc = new Scanner(System.in);
    private Vehiculo[] vehiculos;
    private int contadorVehiculos;

    public GestorDeVehiculo() {
        vehiculos = new Vehiculo[10];
        contadorVehiculos = 0;
    }

    public void añadirVehiculo() {
        System.out.print("Ingresa el tipo de vehiculo [Coche, Microbus, Furgoneta o Camion]: ");
        String tipo = sc.next().toLowerCase();
        System.out.print("Ingresa la matricula: ");
        String matricula = sc.next();

        if (tipo.equalsIgnoreCase("coche")) {
            System.out.print("Ingresa el número de asientos: ");
            int asientos = sc.nextInt();
            vehiculos[contadorVehiculos] = new Coche(matricula, asientos);
        } else if (tipo.equalsIgnoreCase("microbus")) {
            System.out.print("Ingresa el número de asientos: ");
            int asientos = sc.nextInt();
            vehiculos[contadorVehiculos] = new Microbus(matricula, asientos);
        } else if (tipo.equalsIgnoreCase("furgoneta")) {
            System.out.print("Ingresa el peso máximo: ");
            double pesoMax = sc.nextDouble();
            vehiculos[contadorVehiculos] = new Furgoneta(matricula, pesoMax);
        } else if (tipo.equalsIgnoreCase("camion")) {
            System.out.print("Ingresa el peso máximo: ");
            double pesoMax = sc.nextDouble();
            vehiculos[contadorVehiculos] = new Camion(matricula, pesoMax);
        }
        contadorVehiculos++;
        System.out.println("Vehiculo añadido con exito!");
    }

    public void consultarPrecioDeRenta() {
        System.out.print("Ingresa la matricula: ");
        String matricula = sc.next();

        for (int i = 0; i < contadorVehiculos; i++) {
            if (vehiculos[i].getMatricula().equals(matricula)) {
                System.out.print("Ingresa cuantos dias quieres de renta: ");
                int dias = sc.nextInt();
                double precioDeRenta = vehiculos[i].calculateRentalPrice(dias);
                System.out.println("Precio de renta: " + precioDeRenta + "€");
            }
        }
        System.out.println("No existe ese vehiculo!");
    }
}
