package Ex1_Transportes;

public class Bicicleta extends Transporte{

    private int numeroDeMarchas;

    public Bicicleta(){
    }
    public Bicicleta(int identificador, int kmXHora, int numeroDeMarchas) {
        super(identificador, kmXHora);
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }
}
