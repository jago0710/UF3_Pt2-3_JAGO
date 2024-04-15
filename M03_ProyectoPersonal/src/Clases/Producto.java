package Clases;


public abstract class Producto implements Visualizable{
    private String nombre;
    private String origen;
    private int precio;
    private int codigo;

    public Producto(String nombre, String origen, int precio, int codigo) {
        this.nombre = nombre;
        this.origen = origen;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Clases.Producto [" +
                "nombre = " + nombre +
                ", origen = " + origen +
                ", precio" + precio +
                ", codigo = " + codigo +
                "]";
    }
}
