package Ex2;

public abstract class Publicacion {

    private String código;
    private String titulo;
    private int añoPublicacion;

    public Publicacion(String código, String titulo, int añoPublicacion) {
        this.código = código;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public String toString() {
        return "Publicacion {" +
                "código = " + código +
                ", titulo = " + titulo +
                ", añoPublicacion = " + añoPublicacion +
                '}';
    }
}
