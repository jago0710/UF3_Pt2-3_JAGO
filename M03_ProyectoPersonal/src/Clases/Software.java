package Clases;

public class Software extends Producto{
    private String version;
    private String tipo; //sistema operativo, suite de productividad, software de diseño gráfico, software de seguridad, juegos
    private int tamaño;

    public Software(String nombre, String origen, int precio, int codigo, String version, String tipo, int tamaño) {
        super(nombre, origen, precio, codigo);
        this.version = version;
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Clases.Software [" +
                "version = " + version +
                ", tipo = " + tipo +
                ", tamaño = " + tamaño +
                "]";
    }

    @Override
    public void mostrar() {
        System.out.print("Nonme: " + super.getNombre() + ", Origen: " + super.getOrigen() + ", Precio: " + getPrecio());
    }
}
