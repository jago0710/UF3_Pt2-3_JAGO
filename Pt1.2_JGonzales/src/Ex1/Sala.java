package Ex1;

public class Sala {

    private int numeroDeTelevision;
    private String tipoDeSala;

    public Sala( int numeroTv, String tipoDeSala){
        setNumeroDeTelevision(numeroTv);
        setTipoDeSala(tipoDeSala);
    }

    public int getNumeroDeTelevision() {
        return numeroDeTelevision;
    }

    public void setNumeroDeTelevision(int numeroDeTelevision) {
        this.numeroDeTelevision = numeroDeTelevision;
    }

    public String getTipoDeSala() {
        return tipoDeSala;
    }

    public void setTipoDeSala(String tipoDeSala) {
        this.tipoDeSala = tipoDeSala;
    }

    @Override
    public String toString() {
        return "Sala [" +
                "numeroDeTelevision = " + numeroDeTelevision +
                ", tipoDeSala = " + tipoDeSala + "]";
    }
}
