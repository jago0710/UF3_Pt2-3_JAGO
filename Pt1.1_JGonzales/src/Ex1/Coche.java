package Ex1;

import java.util.concurrent.Callable;

public class Coche {

    private String modelo;
    private String matricula;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void modificarCoche(String modelo, String matricula){
        setModelo(modelo);
        setMatricula(matricula);
    }

    @Override
    public String toString() {
        return "Coche [" +
                "modelo = " + modelo +
                ", matricula = " + matricula +
                "]";
    }
}
