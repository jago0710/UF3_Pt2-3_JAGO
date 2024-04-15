package Ex2_Aquario;

public abstract class Organismo{

    private String nombre;
    private String familia;
    private char tipoDeLuz;   //("H" alta, mitjana "M" i  dbaixa "L") ??
    private int tempMaxTolerada;
    private int tempMinTolerada;
    private float phMaxTolerada;
    private float phMinTolerada;

    public Organismo(String nombre, String familia, char tipoDeLuz, int tempMaxTolerada, int tempMinTolerada, float phMaxTolerada, float phMinTolerada) {
        this.nombre = nombre;
        this.familia = familia;
        this.tipoDeLuz = tipoDeLuz;
        this.tempMaxTolerada = tempMaxTolerada;
        this.tempMinTolerada = tempMinTolerada;
        this.phMaxTolerada = phMaxTolerada;
        this.phMinTolerada = phMinTolerada;
    }

    public String buscarMargenesAcidez(){
        return phMinTolerada + "-" + phMaxTolerada;
    }

    public String buscarMargenesTemparatura(){
        return tempMinTolerada + "-" + tempMaxTolerada;
    }

    public String buscarTipoDeLuz(){
        switch (tipoDeLuz){
            case 'H':
                return "Necesidades altas de luz";
            case 'M':
                return "Necesidades medias de luz";
            case 'L':
                return "Necesidades bajas de luz";
            default:
                return "El tipo de luz ingresada no existe";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public char getTipoDeLuz() {
        return tipoDeLuz;
    }

    public void setTipoDeLuz(char tipoDeLuz) {
        this.tipoDeLuz = tipoDeLuz;
    }

    public int getTempMaxTolerada() {
        return tempMaxTolerada;
    }

    public void setTempMaxTolerada(int tempMaxTolerada) {
        this.tempMaxTolerada = tempMaxTolerada;
    }

    public int getTempMinTolerada() {
        return tempMinTolerada;
    }

    public void setTempMinTolerada(int tempMinTolerada) {
        this.tempMinTolerada = tempMinTolerada;
    }

    public float getPhMaxTolerada() {
        return phMaxTolerada;
    }

    public void setPhMaxTolerada(float phMaxTolerada) {
        this.phMaxTolerada = phMaxTolerada;
    }

    public float getPhMinTolerada() {
        return phMinTolerada;
    }

    public void setPhMinTolerada(float phMinTolerada) {
        this.phMinTolerada = phMinTolerada;
    }

    @Override
    public String toString() {
        return "Organismo [" +
                "nombre = " + nombre +
                ", familia = " + familia +
                ", tipoDeLuz = " + tipoDeLuz +
                ", tempMaxTolerada = " + tempMaxTolerada +
                ", tempMinTolerada = " + tempMinTolerada +
                ", phMaxTolerada = " + phMaxTolerada +
                ", phMinTolerada = " + phMinTolerada +
                ']';
    }
}