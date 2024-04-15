public abstract class Personatge    {

    private String nom;
    private int poder;
    private float preuDeCompra;
    private boolean venut = false;

    public Personatge() {
    }

    public Personatge(String nom, int poder, float preuDeCompra, boolean venut) {
        this.nom = nom;
        this.poder = poder;
        this.preuDeCompra = preuDeCompra;
        this.venut = venut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public float getPreuDeCompra() {
        return preuDeCompra;
    }

    public void setPreuDeCompra(float preuDeCompra) {
        this.preuDeCompra = preuDeCompra;
    }

    public boolean isVenut() {
        return venut;
    }

    public void setVenut(boolean venut) {
        this.venut = venut;
    }

    @Override
    public String toString() {
        return "Personatge {" +
                "nom: " + nom +
                ", poder: " + poder +
                ", preuDeCompra: " + preuDeCompra +
                ", venut: " + venut +
                '}';
    }
}
