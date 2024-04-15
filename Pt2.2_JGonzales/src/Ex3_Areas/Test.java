package Ex3_Areas;

public class Test {
    public static void main(String[] args) {
        // Ejemplo de uso
        Despacho despacho = new Despacho("Despacho Directivo", 20, true, 200, 1, true);
        System.out.println("Consumo por metro cuadrado del despacho: " + despacho.calcularConsumoPorMetroCuadrado());

        Aula aula = new Aula("Aula Informática", 50, true, 300, 30, true, 25, true);
        System.out.println("Espacio por estudiante en el aula: " + aula.calcularEspacioPorEstudiante());

        Laboratorio laboratorio = new Laboratorio("Laboratorio de Química", 100, false, 400, 10);
        System.out.println("Consumo por metro cuadrado del laboratorio: " + laboratorio.calcularConsumoPorMetroCuadrado());

        Gimnasio gimnasio = new Gimnasio("Gimnasio Principal", 200, false, 500, true, 50);
        System.out.println("Espacio por estudiante en el gimnasio: " + gimnasio.calcularEspacioPorEstudiante());
    }
}