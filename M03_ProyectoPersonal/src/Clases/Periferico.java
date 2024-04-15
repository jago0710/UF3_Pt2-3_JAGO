package Clases;

public class Periferico extends Producto{

    private String marca;
    private String tipo; //teclado, ratón, monitor, impresora, escáner, altavoces, micrófono, cámara web, etc.
    private float peso;

    public Periferico(String nombre, String origen, int precio, int codigo, String marca, String tipo, float peso) {
        super(nombre, origen, precio, codigo);
        this.marca = marca;
        this.tipo = tipo;
        this.peso = peso;
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Clases.Periferico [" +
                "marca = " + marca +
                ", tipo = " + tipo +
                ", peso = " + peso +
                "]";
    }

    @Override
    public void mostrar() {
        System.out.print("Nonme: " + super.getNombre() + ", Origen: " + super.getOrigen() + ", Precio: " + getPrecio());
    }
}
