import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean next = true;
        while (next) {
            System.out.println("1. Media de notes");
            System.out.println("2. Port pesquer");
            System.out.println("3. Salir");
            System.out.print("INGRESA UNA OPCIO: ");
            int opcio = sc.nextInt();
            switch (opcio) {
                case 1:
                    ArrayList<Float> llistatNotes = new ArrayList<>();
                    Notes.treureNotes(llistatNotes);
                    System.out.println("MEDIA DE LES NOTES: " + Notes.treureMedia(llistatNotes));
                    break;
                case 2:
                    menuVaixell();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    next = false;
                    break;
                default:
                    System.out.println("L'opcio no es correcte");
            }
        }
    }

    public static void menuVaixell() {
        boolean next = true;
        ArrayList<Vaixell> llistatVaixells = new ArrayList<>();
        while (next) {
            System.out.println(llistatVaixells);
            System.out.println("1. Introduir");
            System.out.println("2. Buscar");
            System.out.println("3. Modificar");
            System.out.println("4. Treure(Esborrar)");
            System.out.println("5. Llistat de vell a més nou");
            System.out.println("6. Retornar");
            System.out.print("INGRESA UNA OPCIO: ");
            int opcio = sc.nextInt();
            switch (opcio) {
                case 1:
                    Vaixell.creaVaixell().introduir(llistatVaixells);
                    break;
                case 2:
                    System.out.println(Vaixell.buscar(llistatVaixells));
                    break;
                case 3:
                    Vaixell.modificar(llistatVaixells);
                    break;
                case 4:
                    Vaixell.treure(llistatVaixells);
                    break;
                case 5:

                    break;
                case 6:
                    next = false;
                    break;
                default:
                    System.out.println("L'opcio no es correcte");
            }
        }
    }
}