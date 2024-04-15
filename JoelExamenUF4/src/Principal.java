import com.sun.tools.javac.Main;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Personatge obrer = new Obrer("Pedro", 5, 500.00f, false, 10, "pedra");
        Personatge obrer1 = new Obrer("Lius", 5, 500.00f, false, 10, "pedra");
        Personatge pagès = new Pagès("Lucas", 4, 400.00f, false, 10, 170);
        Personatge pagès1 = new Pagès("Lucas1", 4, 400.00f, false, 10, 170);
        Personatge soldat = new Soldat("Martin1", 7, 700.00f, false, "terra", 4, true);
        Personatge soldat1 = new Soldat("Martin", 7, 700.00f, false, "terra", 4, true);
        Personatge politic = new Politic("Joan1", 8, 500.00f, false, "PPP", "Important");
        Personatge politic1 = new Politic("Joan", 8, 500.00f, false, "PPP", "Important");
        ArrayList<Personatge> llistatPersonatges = new ArrayList<>();
        Stock stock = new Stock(llistatPersonatges);
        stock.comprarPersonatge(obrer);
        stock.comprarPersonatge(pagès);
        stock.comprarPersonatge(soldat);
        System.out.println("Personatges comprats: ");
        stock.inventari();
        System.out.println("Pressupost que ens queda: " + stock.getPressupost());

    }
}
