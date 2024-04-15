package Ex2;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro(String código, String titulo, int añoPublicacion, boolean prestado) {
        super(código, titulo, añoPublicacion);
        this.prestado = prestado;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void retornar() {
        prestado = false;
    }

    @Override
    public void prestar() {
        prestado = true;
    }

    @Override
    public boolean prestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return "Libro {" +
                "prestado = " + prestado +
                "}";
    }
}
