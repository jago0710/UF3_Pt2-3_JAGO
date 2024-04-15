public class Pagès extends Personatge{
    private int horesTreballaDia;
    private float metrosCultivaAlDia;

    public Pagès(){
    }

    public Pagès(String nom, int poder, float preuDeCompra, boolean venut, int horesTreballaDia, float metrosCultivaAlDia) {
        super(nom, poder, preuDeCompra, venut);
        this.horesTreballaDia = horesTreballaDia;
        this.metrosCultivaAlDia = metrosCultivaAlDia;
    }

    public int getHoresTreballaDia() {
        return horesTreballaDia;
    }

    public void setHoresTreballaDia(int horesTreballaDia) {
        this.horesTreballaDia = horesTreballaDia;
    }

    public float getMetrosCultivaAlDia() {
        return metrosCultivaAlDia;
    }

    public void setMetrosCultivaAlDia(float metrosCultivaAlDia) {
        this.metrosCultivaAlDia = metrosCultivaAlDia;
    }


    @Override
    public String toString() {
        return "Pagès {" +
                "horesTreballaDia: " + horesTreballaDia +
                ", metrosCultivaAlDia: " + metrosCultivaAlDia +
                '}';
    }
}
