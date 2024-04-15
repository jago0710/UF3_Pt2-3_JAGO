package Clases;

public final class Accesorio extends Producto{
    private String color;
    private String compatibilidad;

    public Accesorio(String nombre, String origen, int precio, int codigo, String color, String compatibilidad) {
        super(nombre, origen, precio, codigo);
        this.color = color;
        this.compatibilidad = compatibilidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompatibilidad() {
        return compatibilidad;
    }

    public void setCompatibilidad(String compatibilidad) {
        this.compatibilidad = compatibilidad;
    }

    @Override
    public String toString() {
        return "Clases.Accesorio [" +
                "color = " + color +
                ", compatibilidad = " + compatibilidad +
                "]";
    }

    @Override
    public void mostrar() {
        System.out.print("Nonme: " + super.getNombre() + ", Origen: " + super.getOrigen() + ", Precio: " + getPrecio());
    }
}
