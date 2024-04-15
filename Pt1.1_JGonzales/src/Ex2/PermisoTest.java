package Ex2;

public class PermisoTest {
    public static void main(String[] args) {
        PerimisoConducir permiso1 = new PerimisoConducir("Joel", "B", 12);
        PerimisoConducir permiso2 = new PerimisoConducir("Jago", "A", 8);
        permiso1.imprimirPermiso();
        permiso2.imprimirPermiso();
        System.out.println("A permiso de Joel le bajaron 4 puntos a los 12 que tenia y ahora tiene (8)");
        permiso1.restarPuntos(permiso1,4);
        permiso1.imprimirPermiso();
    }
}
