package Ex1;

public class Test {
    public static void main(String[] args) {
        Sala sala1 = new Sala(12, "Moderna");
        Cocina cocina1 = new Cocina(true, 4);
        Casa casa1 = new Casa(75, "Calle Doctor Trueta", sala1, cocina1);

        System.out.println(casa1);
    }
}
