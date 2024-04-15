public class Soldat extends Personatge implements Venda{
    private String especialitat; //(terra, mar o aire)
    private int anysDeExperiencia;
    private boolean anatALaGuerra;

    public Soldat() {
    }

    public Soldat(String nom, int poder, float preuDeCompra, boolean venut, String especialitat, int anysDeExperiencia, boolean anatALaGuerra) {
        super(nom, poder, preuDeCompra, venut);
        this.especialitat = especialitat;
        this.anysDeExperiencia = anysDeExperiencia;
        this.anatALaGuerra = anatALaGuerra;
    }

    public String getEspecialitat() {
        return especialitat;
    }

    public void setEspecialitat(String especialitat) {
        this.especialitat = especialitat;
    }

    public int getAnysDeExperiencia() {
        return anysDeExperiencia;
    }

    public void setAnysDeExperiencia(int anysDeExperiencia) {
        this.anysDeExperiencia = anysDeExperiencia;
    }

    public boolean isAnatALaGuerra() {
        return anatALaGuerra;
    }

    public void setAnatALaGuerra(boolean anatALaGuerra) {
        this.anatALaGuerra = anatALaGuerra;
    }

    @Override
    public String toString() {
        return "Soldat {" +
                "especialitat: " + especialitat +
                ", anysDeExperiencia: " + anysDeExperiencia +
                ", anatALaGuerra:" + anatALaGuerra +
                '}';
    }

    @Override
    public void realitzaVenda() {

    }
}
