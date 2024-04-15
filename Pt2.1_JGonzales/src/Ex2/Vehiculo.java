package Ex2;

public abstract class Vehiculo {

    private String matricula;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public double calculateRentalPrice(int dias) {
        return 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public abstract double calculadorPrecioDeRenta(int days);
}
