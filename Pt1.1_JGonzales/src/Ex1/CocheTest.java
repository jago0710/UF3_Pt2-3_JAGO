package Ex1;

class CocheTest {
    public static void main(String[] args) {
        System.out.println("Información de Coche 1");
        Coche coche1 = new Coche("Focus", "4414RRR");
        System.out.println(coche1);
        System.out.println(coche1.getModelo());
        coche1.setModelo("Civic");
        System.out.println(coche1.getModelo());
        coche1.setMatricula("1112EEE");
        System.out.println(coche1);



        System.out.println();
        System.out.println("Información de Coche 2");
        Coche coche2 = new Coche("Ioniq", "5555AAA");
        System.out.println(coche2);
        System.out.println(coche2.getMatricula());
        coche2.setMatricula("7777ZZZ");
        System.out.println(coche2.getMatricula());
        System.out.println(coche2);
    }

}