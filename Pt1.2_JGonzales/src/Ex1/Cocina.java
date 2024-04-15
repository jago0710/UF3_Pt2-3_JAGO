package Ex1;

public class Cocina {

    private boolean esIndependiente;
    private int nuemeroDeFogones;

    public Cocina(boolean esIndependiente, int nuemeroDeFogones) {
        this.esIndependiente = esIndependiente;
        this.nuemeroDeFogones = nuemeroDeFogones;
    }

    public boolean isEsIndependiente() {
        return esIndependiente;
    }

    public void setEsIndependiente(boolean esIndependiente) {
        this.esIndependiente = esIndependiente;
    }

    public int getNuemeroDeFogones() {
        return nuemeroDeFogones;
    }

    public void setNuemeroDeFogones(int nuemeroDeFogones) {
        this.nuemeroDeFogones = nuemeroDeFogones;
    }

    @Override
    public String toString() {
        return "Cocina [" +
                "esIndependiente = " + esIndependiente +
                ", nuemeroDeFogones = " + nuemeroDeFogones + "]";
    }
}
