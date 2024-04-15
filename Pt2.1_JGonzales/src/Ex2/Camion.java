package Ex2;

public class Camion extends Vehiculo{

    private double pesoMax;

    public Camion(String matricula, double pesoMax) {
        super(matricula);
        this.pesoMax = pesoMax;
    }

    @Override
    public double calculadorPrecioDeRenta(int days) {
        double precioBase = 10 * days;
        double precioXPeso = 20 * pesoMax;
        double precioCamion = 40;
        return precioBase + precioCamion + precioXPeso;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }
}
