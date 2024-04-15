package Ex2;

public class Microbus extends Vehiculo{
    private int asientos;

    public Microbus(String matricula, int asientos) {
        super(matricula);
        this.asientos = asientos;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    @Override
    public double calculadorPrecioDeRenta(int dias) {
        double precioBase = 10 * dias;
        double precioAsientos = 2 * asientos;
        return precioAsientos + precioBase;
    }
}
