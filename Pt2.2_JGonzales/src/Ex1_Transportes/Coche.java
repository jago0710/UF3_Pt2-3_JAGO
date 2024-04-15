package Ex1_Transportes;

public class Coche extends Transporte{

    private String tipoCombustible;
    private float precioPorLitro;
    private float combustibleGastaXKm;

    public Coche(){
    }
    public Coche(int identificador, int kmXHora, String tipoCombustible, float precioPorLitro, float combustibleGastaXKm) {
        super(identificador, kmXHora);
        this.tipoCombustible = tipoCombustible;
        this.precioPorLitro = precioPorLitro;
        this.combustibleGastaXKm = combustibleGastaXKm;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public float getPrecioPorLitro() {
        return precioPorLitro;
    }

    public void setPrecioPorLitro(float precioPorLitro) {
        this.precioPorLitro = precioPorLitro;
    }

    public float getCombustibleGastaXKm() {
        return combustibleGastaXKm;
    }

    public void setCombustibleGastaXKm(float combustibleGastaXKm) {
        this.combustibleGastaXKm = combustibleGastaXKm;
    }
}
