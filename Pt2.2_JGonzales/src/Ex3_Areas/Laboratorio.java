package Ex3_Areas;

public class Laboratorio extends Espacio{
    int numeroEncendedoresBunsen;

    public Laboratorio(String codigo, double superficie, boolean luzNatural, double consumoElectricidad,
                       int numeroEncendedoresBunsen) {
        super(codigo, superficie, luzNatural, consumoElectricidad);
        this.numeroEncendedoresBunsen = numeroEncendedoresBunsen;
    }
}
