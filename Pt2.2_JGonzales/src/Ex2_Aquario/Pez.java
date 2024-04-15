package Ex2_Aquario;

public class Pez extends Organismo{

    private String procedencia;
    private char dieta; //("W" Algues, "O" Omnívor, "L" Fulles) ??
    private float longitudadCm;

    public Pez(String nombre, String familia, char tipoDeLuz, int tempMaxTolerada, int tempMinTolerada, float phMaxTolerada, float phMinTolerada, String procedencia, char dieta, float longitudadCm) {
        super(nombre, familia, tipoDeLuz, tempMaxTolerada, tempMinTolerada, phMaxTolerada, phMinTolerada);
        this.procedencia = procedencia;
        this.dieta = dieta;
        this.longitudadCm = longitudadCm;
    }

    public String buscarTipoDeDieta(){
        switch (dieta){
            case 'W':
                return "Algas";
            case 'O':
                return "Omnivoro";
            case 'L':
                return "Folles";
            default:
                return "La dieta ingresada no existe";
        }
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public char getDieta() {
        return dieta;
    }

    public void setDieta(char dieta) {
        this.dieta = dieta;
    }

    public float getLongitudadCm() {
        return longitudadCm;
    }

    public void setLongitudadCm(float longitudadCm) {
        this.longitudadCm = longitudadCm;
    }

}
