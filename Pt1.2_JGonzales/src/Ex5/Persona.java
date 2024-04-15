package Ex5;
import java.util.ArrayList;

public class Persona {
    private String dni;
    private String nombre;
    private ArrayList<Contrato> contratos = new ArrayList<Contrato>();

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }

    public void subirContrato(Contrato contrato){
        contratos.add(contrato);
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String dni, String nombre) {
        setDni(dni);
        setNombre(nombre);
    }
    public void imprimirContractes() {
        ArrayList<Contrato> contratos = getContratos();
        for (Contrato contrato : contratos) {
            System.out.println(contrato);
        }
    }

    @Override
    public String toString() {
        return "Persona [" +
                "Dni = " + dni +
                ", Nombre = " + nombre +
                ", Contratos=" + contratos + "]";
    }
}

