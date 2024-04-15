package Ex2_Aquario;

public class Test {
    public static void main(String[] args) {
        Pez pez = new Pez("Nemo", "Pomacentridae", 'M', 5, 12, 12.27f, 8.00f, "Africa", 'W', 0.11f);
        System.out.println(
                "PEZ = " + pez + "\n" +
                        "Margenes de acidez: " + pez.buscarMargenesAcidez() + "\n" +
                        "Margenes de temperatura: " + pez.buscarMargenesTemparatura() + "\n" +
                        "Tipo de dieta: " + pez.buscarTipoDeDieta() + "\n" +
                        "Tipo de Luz: " + pez.buscarTipoDeLuz() + "\n"
        );

        Planta planta = new Planta("Anubias", "Araceae", 'L', 2, 5, 5.00f, 7.00f, 'B');
        System.out.println(
                "PLANTA = " + planta + "\n" +
                        "Margenes de acidez: " + planta.buscarMargenesAcidez() + "\n" +
                        "Margenes de temperatura: " + planta.buscarMargenesTemparatura() + "\n" +
                        "Tipo de planta: " + planta.buscarTipoDePlanta()
        );
    }
}