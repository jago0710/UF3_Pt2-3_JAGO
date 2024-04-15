package Ex3_Areas;

public class Gimnasio extends Espacio{
    boolean tieneDuchas;
    int numeroGradas;

    public Gimnasio(String codigo, double superficie, boolean luzNatural, double consumoElectricidad,
                    boolean tieneDuchas, int numeroGradas) {
        super(codigo, superficie, luzNatural, consumoElectricidad);
        this.tieneDuchas = tieneDuchas;
        this.numeroGradas = numeroGradas;
    }

    public double calcularEspacioPorEstudiante() {
        return superficie / (numeroGradas + 1); // 1m² por estudiante
    }
}
