package Ex4;

public class Llamada {

    private int duracionMinutos;
    private String destino;

    public Llamada(int duracionMinutos, String destino) {
        this.duracionMinutos = duracionMinutos;
        this.destino = destino;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Llamada [" +
                "duracionMinutos = " + duracionMinutos +
                ", destino = " + destino +
                "]";
    }
}
