package Ex2;

public class Revista  extends  Publicacion{
    private String nombre;

    public Revista(String código, String titulo, int añoPublicacion, String nombre) {
        super(código, titulo, añoPublicacion);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Revista {" +
                "nombre = " + nombre +
                "}";
    }

}
