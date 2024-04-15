public class Politic extends Personatge implements Venda{

    private String partitPolitic;
    private String posicióDinsElPartit;

    public Politic(){
    }

    public Politic(String nom, int poder, float preuDeCompra, boolean venut, String partitPolitic, String posicióDinsElPartit) {
        super(nom, poder, preuDeCompra, venut);
        this.partitPolitic = partitPolitic;
        this.posicióDinsElPartit = posicióDinsElPartit;
    }

    public String getPartitPolitic() {
        return partitPolitic;
    }

    public void setPartitPolitic(String partitPolitic) {
        this.partitPolitic = partitPolitic;
    }

    public String getPosicióDinsElPartit() {
        return posicióDinsElPartit;
    }

    public void setPosicióDinsElPartit(String posicióDinsElPartit) {
        this.posicióDinsElPartit = posicióDinsElPartit;
    }

    @Override
    public String toString() {
        return "Politic {" +
                "partitPolitic = " + partitPolitic +
                ", posicióDinsElPartit = " + posicióDinsElPartit +
                '}';
    }

    @Override
    public void realitzaVenda() {

    }
}
