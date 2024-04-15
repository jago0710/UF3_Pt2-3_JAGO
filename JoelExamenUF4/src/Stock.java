import java.util.ArrayList;

public class Stock {

    private ArrayList<Personatge> llistaPersonatges;
    private int pressupost = 1000;
    private int gastat = 0;

    public Stock(){
    }

    public Stock(ArrayList<Personatge> llistaPersonatges) {
        this.llistaPersonatges = llistaPersonatges;
    }

    public Stock(ArrayList<Personatge> llistaPersonatges, int pressupost, int gastat) {
        this.llistaPersonatges = llistaPersonatges;
        this.pressupost = pressupost;
        this.gastat = gastat;
    }

    public int getPressupost() {
        return pressupost;
    }

    public void setPressupost(int pressupost) {
        this.pressupost = pressupost;
    }

    public int getGastat() {
        return gastat;
    }

    public void setGastat(int gastat) {
        this.gastat = gastat;
    }

    public boolean comprarPersonatge(Personatge personatge){
        if (getPressupost() > personatge.getPreuDeCompra()){
            llistaPersonatges.add(personatge);
            setPressupost(getPressupost() - (int) personatge.getPreuDeCompra());
            setGastat(getGastat() + (int) personatge.getPreuDeCompra());
            System.out.println("Compra correcta");
            return true;
        } else {
            System.out.println("Compra cancelada");
            System.out.println("No tens suficents diners, et falten " + (getPressupost() - (int) personatge.getPreuDeCompra()) + " de diners");
            return false;
        }
    }

    public void inventari(){
        System.out.println(llistaPersonatges);
    }

    public static void consultarInventari(ArrayList<Personatge> personatgesComprats){
        System.out.println(personatgesComprats);
    }

}
