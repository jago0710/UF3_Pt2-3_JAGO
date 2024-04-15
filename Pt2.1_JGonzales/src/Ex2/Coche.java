package Ex2;

public class Coche extends Vehiculo{
    private int asientos;

    public Coche(String matricula, int asientos) {
        super(matricula);
        this.asientos = asientos;
    }

    @Override
    public double calculadorPrecioDeRenta(int dias) {
        double precioBase = 10 * dias;
        double precioAsientos = 1.5 * asientos * dias;
        return precioAsientos + precioBase;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

}
