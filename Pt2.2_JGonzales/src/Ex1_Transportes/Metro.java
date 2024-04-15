package Ex1_Transportes;

public class Metro extends Transporte {

    private float precioBillete;

    public Metro(){
    }
    public Metro(int identificador, int kmXHora, float precioBillete) {
        super(identificador, kmXHora);
        this.precioBillete = precioBillete;
    }

    public float getPrecioBillete() {
        return precioBillete;
    }

    public void setPrecioBillete(float precioBillete) {
        this.precioBillete = precioBillete;
    }

    public float aumentoPrecioBillete(){
        return precioBillete + 1;
    }

}
