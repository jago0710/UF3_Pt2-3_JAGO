import javax.sound.midi.Soundbank;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Vaixell {

    private String nom;
    private float preu;
    private int edat;

    public Vaixell(String nom, float preu, int edat) {
        this.nom = nom;
        this.preu = preu;
        this.edat = edat;
    }

    public static Scanner sc = new Scanner(System.in);

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Vaixell {" +
                "nom = " + nom +
                ", preu = " + preu +
                ", edat = " + edat + "}";
    }

    public static Vaixell creaVaixell() {
        System.out.println("Et demanen dades pel vaixell");
        System.out.print("Introdueix nom: ");
        String nom = sc.next();
        System.out.print("Introdueix preu: ");
        float preu = sc.nextFloat();
        System.out.print("Introdueix edad: ");
        int edat = sc.nextInt();
        Vaixell vaixell = new Vaixell(nom, preu, edat);
        return vaixell;
    }

    public void introduir(ArrayList<Vaixell> llistatVaixells) {
        llistatVaixells.add(this);
    }

    public static Vaixell buscar(ArrayList<Vaixell> llistatVaixell) {
        System.out.println("NECESITEM LES SEGÜENTS DADES");
        System.out.print("Introdueix el nom: ");
        String nomBuscat = sc.next();
        System.out.print("Introdueix el preu: ");
        float preuBuscat = sc.nextFloat();
        System.out.print("Introdueix el edat: ");
        int edatBuscat = sc.nextInt();
        Vaixell vaixell = null;
        for (int i = 0; i < llistatVaixell.size(); i++) {
            if (nomBuscat.equals(llistatVaixell.get(i).getNom()) && preuBuscat == llistatVaixell.get(i).getPreu() && edatBuscat == llistatVaixell.get(i).getEdat()){
                vaixell = llistatVaixell.get(i);
            }
        }
        return vaixell;
    }

    public static void modificar(ArrayList<Vaixell> llistatVaixell) {
        Vaixell vaixell = buscar(llistatVaixell);
        boolean next = true;
        while (next) {
            System.out.println("1. Modificar el nom");
            System.out.println("2. Modificar el preu");
            System.out.println("3. Modificar l'edat");
            System.out.println("4. Retornar");
            System.out.print("INGRESA UNA OPCIO : ");
            int opció = sc.nextInt();
            switch (opció) {
                case 1:
                    System.out.print("Introdueix el nom nou: ");
                    String nomNou = sc.next();
                    vaixell.setNom(nomNou);
                    break;
                case 2:
                    System.out.print("Introdueix el preu nou: ");
                    int preuNou = sc.nextInt();
                    vaixell.setPreu(preuNou);
                    break;
                case 3:
                    System.out.print("Introdueix l'edat nova: ");
                    int edatNova = sc.nextInt();
                    vaixell.setEdat(edatNova);
                    break;
                case 4:
                    next = false;
                    break;
                default:
                    System.out.println("L'opcio no es correcte");
            }
        }
    }

    public static void treure(ArrayList<Vaixell> llistatVaixell) {
        Vaixell vaixellPerTreure = buscar(llistatVaixell);
        for (Vaixell vaixell : llistatVaixell) {
            if (vaixell.equals(vaixellPerTreure)) {
                llistatVaixell.remove(vaixell);
                break;
            } else {
                System.out.println("El Vaixell que busques no existeix");
            }
        }
    }

//    public static void llistarDeVellaMesnou(ArrayList<Vaixell> llistatVaixell){
//        int[] llistaDeEdats = null;
//        for (Vaixell vaixell : llistatVaixell) {
//            llistatVaixell.get(vaixell).setEdat();
//        }
//    }



}
