package Ex2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Joel", "Gonzales", 21, "5523467H");
        Alumno alumno2 = new Alumno("Jael", "Bustillos", 24, "4213445A");
        Modulo modulo1 = new Modulo("M02");
        Modulo modulo2 = new Modulo("M03");
        Modulo modulo3 = new Modulo("M04");
        Modulo modulo4 = new Modulo("M010");

        ArrayList<Modulo> listModulos1 = new ArrayList<>();
        Matricula matricula1 = new Matricula(alumno1, listModulos1, 7);
        listModulos1.add(modulo1);
        listModulos1.add(modulo2);
        listModulos1.add(modulo3);
        System.out.println(matricula1);

        ArrayList<Modulo> listModulos2 = new ArrayList<>();
        Matricula matricula2 = new Matricula(alumno2, listModulos2, 10);
        listModulos2.add(modulo1);
        listModulos2.add(modulo4);
        listModulos2.add(modulo3);
        System.out.println(matricula2);
    }

}
