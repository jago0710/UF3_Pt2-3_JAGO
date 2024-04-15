package Ex1;

public class Casa {

    private double superficie;
    private String direccion;
    private Sala salaCasa;
    private Cocina cocinaCasa;

    public Casa(double superficie, String direccion, Sala salaCasa, Cocina cocinaCasa) {
        this.superficie = superficie;
        this.direccion = direccion;
        this.salaCasa = salaCasa;
        this.cocinaCasa = cocinaCasa;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Sala getSalaCasa() {
        return salaCasa;
    }

    public void setSalaCasa(Sala salaCasa) {
        this.salaCasa = salaCasa;
    }

    public Cocina getCocinaCasa() {
        return cocinaCasa;
    }

    public void setCocinaCasa(Cocina cocinaCasa) {
        this.cocinaCasa = cocinaCasa;
    }

    @Override
    public String toString() {
        return "Casa [" +
                "superficie = " + superficie +
                ", direccion = " + direccion +
                ", \n   salaCasa = " + salaCasa +
                ", \n   cocinaCasa = " + cocinaCasa +
                ']';
    }
}
