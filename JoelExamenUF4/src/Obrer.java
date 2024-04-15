public class Obrer extends Personatge {

    private int horesTreballaDia;
    private String sector; //(ferro, pedra o industrial)


    public Obrer(String nom, int poder, float preuDeCompra, boolean venut, int horesTreballaDia, String sector) {
        super(nom, poder, preuDeCompra, venut);
        this.horesTreballaDia = horesTreballaDia;
        this.sector = sector;
    }

    public Obrer() {
    }

    public int getHoresTreballaDia() {
        return horesTreballaDia;
    }

    public void setHoresTreballaDia(int horesTreballaDia) {
        this.horesTreballaDia = horesTreballaDia;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String ToString(){
        return "Obrer {" +
                "horesTreballaDia: " + horesTreballaDia +
                ", sector: " + sector +
                '}';
    }

    @Override
    public String toString() {
        return "Obrer{" +
                "horesTreballaDia: " + horesTreballaDia +
                ", sector: " + sector +
                '}';
    }
}
