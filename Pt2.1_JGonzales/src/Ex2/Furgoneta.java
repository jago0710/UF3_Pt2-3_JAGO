package Ex2;

public class Furgoneta extends Vehiculo{
    private double pesoMax;

    public Furgoneta(String matricula, double pesoMax) {
        super(matricula);
        this.pesoMax = pesoMax;
    }

    @Override
    public double calculadorPrecioDeRenta(int dias) {
        double precioBase = 10 * dias;
        double precioXPeso = 20 * pesoMax;
        return precioBase + precioXPeso;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }
}
