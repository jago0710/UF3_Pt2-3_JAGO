package Ex4;

import java.util.ArrayList;

public class Cliente {
    private String dni;
    private String nombre;
    private float precioPorMinuto;
    private ArrayList<Llamada> listLlamadas;

    public Cliente(String dni, String nombre, float precioPorMinuto) {
        this.dni = dni;
        this.nombre = nombre;
        this.precioPorMinuto = precioPorMinuto;
        listLlamadas = new ArrayList<>();
    }

    public ArrayList<Llamada> getListLlamadas() {
        return listLlamadas;
    }

    public void addLlamada(Llamada llamada){
        listLlamadas.add(llamada);
    }

    public float getPrecioPorMinuto() {
        return precioPorMinuto;
    }

    public void setPrecioPorMinuto(float precioPorMinuto) {
        this.precioPorMinuto = precioPorMinuto;
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

    @Override
    public String toString() {
        return "Cliente [" +
                "dni = " + dni +
                ", nombre = " + nombre +
                ", precio x minuto = " + precioPorMinuto +
                "]";
    }
}
