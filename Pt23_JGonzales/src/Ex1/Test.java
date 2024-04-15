package Ex1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Persona> cantantes = new ArrayList<>();
        Persona cantante1 = new CantanteOpera("Luciano Pavarotti", 54);
        Persona cantante2 = new CantanteOpera("Maria Callas", 67);
        Persona cantante3 = new CantanteOpera("Plácido Domingo", 80);
        Persona cantante4 = new CantanteOpera("Montserrat Caballé", 85);
        Persona cantante5 = new CantanteOpera("Andrea Bocelli", 62);
        cantantes.add(cantante1);
        cantantes.add(cantante2);
        cantantes.add(cantante3);
        cantantes.add(cantante4);
        cantantes.add(cantante5);
        Canario canario1 = new Canario("amarillo", "España");

        canario1.canta();
        cantante1.canta();
        cantante2.canta();
        cantante3.canta();
        cantante4.canta();
        cantante5.canta();
    }
}
