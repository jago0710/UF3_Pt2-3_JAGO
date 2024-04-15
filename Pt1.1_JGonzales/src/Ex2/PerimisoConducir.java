package Ex2;

public class PerimisoConducir {

    private String nombre;
    private String tipoDePermiso;
    private int puntos;

    public PerimisoConducir(String nombre, String tipoDePermiso, int puntos) {
        this.nombre = nombre;
        this.tipoDePermiso = tipoDePermiso;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDePermiso() {
        return tipoDePermiso;
    }

    public void setTipoDePermiso(String tipoDePermiso) {
        this.tipoDePermiso = tipoDePermiso;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void imprimirPermiso(){
        System.out.println("PerimisoConducir [" +
                "nombre = " + nombre +
                ", tipoDePermiso = " + tipoDePermiso +
                ", puntos = " + puntos + "]");
    }

    @Override
    public String toString() {
        return "PerimisoConducir [" +
                "nombre = " + nombre +
                ", tipoDePermiso = " + tipoDePermiso +
                ", puntos = " + puntos + "]";
    }

    public void restarPuntos(PerimisoConducir perimisoConducir, int puntos){
        int puntosActuales = perimisoConducir.getPuntos();
        int puntosRestados = puntosActuales - puntos;
        perimisoConducir.setPuntos(puntosRestados);
    }

}
