package Clases;

public class Componente extends Producto {

    private String marca;
    private String tipo; //CPU, GPU, RAM, HDD, SSD

    public Componente(String nombre, String origen, int precio, int codigo, String marca, String tipo) {
        super(nombre, origen, precio, codigo);
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Clases.Componente [" +
                "marca = " + marca +
                ", tipo = " + tipo +
                "]";
    }

    @Override
    public void mostrar() {
        System.out.print("Nonme: " + super.getNombre() + ", Origen: " + super.getOrigen() + ", Precio: " + getPrecio());
    }
}
