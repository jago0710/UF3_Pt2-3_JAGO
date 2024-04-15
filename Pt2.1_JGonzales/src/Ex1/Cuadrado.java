package Ex1;

public class Cuadrado {

    private float costado;

    public Cuadrado(float costado) {
        this.costado = costado;
    }

    public float getCostado() {
        return costado;
    }

    public void setCostado(float costado) {
        this.costado = costado;
    }

    public float perimetro(){
        return (float) (costado * 4);
    }

    public float area(){
        return costado * costado;
    }

    @Override
    public String toString() {
        return "Cuadrado [" +
                "costado = " + costado + "]";
    }
}
