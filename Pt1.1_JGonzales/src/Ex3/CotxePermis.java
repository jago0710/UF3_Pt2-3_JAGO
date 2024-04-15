package Ex3;
import Ex1.Coche;
import Ex2.PerimisoConducir;

import java.util.Scanner;

public class CotxePermis {

    public static void modificadorPermiso(PerimisoConducir perimisoConducir){
        System.out.print("Escribe el nombre del dueño del permiso: ");
        String nombreNuevo = sc.next();
        System.out.print("Escribe el tipo de permiso nuevo: ");
        String tipoNuevo = sc.next();
        System.out.print("Ponga la cantidad de puntos: ");
        int puntosNuevos = sc.nextInt();
        perimisoConducir.setNombre(nombreNuevo);
        perimisoConducir.setTipoDePermiso(tipoNuevo);
        perimisoConducir.setPuntos(puntosNuevos);
    }

    public static void modificadorCoche(Coche coche){
        System.out.print("Escribe el modelo nuevo: ");
        String modeloNuevo = sc.next();
        System.out.print("Escribe la matricula nueva: ");
        String matriculaNuevo = sc.next();
        coche.setModelo(modeloNuevo);
        coche.setMatricula(matriculaNuevo);
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Coche coche1 = new Coche("Ioniq", "7878JGZ");
        PerimisoConducir perimisoConducir1 = new PerimisoConducir("Joel", "A", 10);

        System.out.println("1 : Modificar información del Coche \n" +
                "2 : Modifica información del Permiso \n" +
                "0 : Exit");
        System.out.print("Selecciona una opcion:");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                modificadorCoche(coche1);
                System.out.println(coche1);
                break;
            case 2:
                modificadorPermiso(perimisoConducir1);
                System.out.println(perimisoConducir1);
                break;
            case 0:
                System.out.println("Fin del programa");
                break;
        }
    }

}
