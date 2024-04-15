package Ex1_Transportes;

public class Test {
    public static void main(String[] args) {

        Transporte coche = new Coche(1, 20, "Gasolina", 10.00f, 2.00f);
        Transporte bicicleta = new Bicicleta(2, 2, 6);
        Transporte metro = new Metro(3, 40, 2.20f);

        Transporte[] tiposTransportes = new Transporte[3];
        tiposTransportes[0] = coche;
        tiposTransportes[1] = bicicleta;
        tiposTransportes[2] = metro;

        System.out.println("precio a pagar del coche: " + tiposTransportes[0].calculadorPreciaAPagar());
        System.out.println("precio a pagar de la bicicleta: " + tiposTransportes[1].calculadorPreciaAPagar());
        System.out.println("precio a pagar del metro: " + tiposTransportes[2].calculadorPreciaAPagar());

        System.out.println(metro.calculadorRecorridoEnHoras(14, 32));
    }
}
