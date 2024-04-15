package Ex3_Areas;

public class Despacho extends Espacio{
    int numeroTaules;
    boolean maquinaCafe;

    public Despacho(String codigo, double superficie, boolean luzNatural, double consumoElectricidad,
                    int numeroTaules, boolean maquinaCafe) {
        super(codigo, superficie, luzNatural, consumoElectricidad);
        this.numeroTaules = numeroTaules;
        this.maquinaCafe = maquinaCafe;
    }
}
