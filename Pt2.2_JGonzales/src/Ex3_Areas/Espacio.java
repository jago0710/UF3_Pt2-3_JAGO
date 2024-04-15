package Ex3_Areas;

public abstract class Espacio {
        String codigo;
        double superficie;
        boolean luzNatural;
        double consumoElectricidad;

        public Espacio(String codigo, double superficie, boolean luzNatural, double consumoElectricidad) {
            this.codigo = codigo;
            this.superficie = superficie;
            this.luzNatural = luzNatural;
            this.consumoElectricidad = consumoElectricidad;
        }

        public double calcularConsumoPorMetroCuadrado() {
            return consumoElectricidad / superficie;
        }
}
