package Ex3_Areas;

public class Aula extends Espacio{
    int aforoMaximo;
    boolean cadiresPala;
    int numeroOrdenadores;
    boolean conectoresRed;

    public Aula(String codigo, double superficie, boolean luzNatural, double consumoElectricidad,
                int aforoMaximo, boolean cadiresPala, int numeroOrdenadores, boolean conectoresRed) {
        super(codigo, superficie, luzNatural, consumoElectricidad);
        this.aforoMaximo = aforoMaximo;
        this.cadiresPala = cadiresPala;
        this.numeroOrdenadores = numeroOrdenadores;
        this.conectoresRed = conectoresRed;
    }

    public double calcularEspacioPorEstudiante() {
        return superficie / aforoMaximo;
    }
}
