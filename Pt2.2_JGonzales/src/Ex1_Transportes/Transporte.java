package Ex1_Transportes;

import java.util.Scanner;

public abstract class Transporte{
    public static Scanner sc = new Scanner(System.in);
    private int identificador;
    private int kmXHora;
    public Transporte(){
    }

    public Transporte(int identificador, int kmXHora) {
        this.identificador = identificador;
        this.kmXHora = kmXHora;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getKmXHora() {
        return kmXHora;
    }

    public void setKmXHora(int kmXHora) {
        this.kmXHora = kmXHora;
    }

    public double calculadorRecorridoEnHoras(int kmXHora, int kmRecorridos){
        return kmRecorridos / kmXHora;
    }

    public float calculadorPreciaAPagar(){
        System.out.print("Introduce la distancia recorrida: ");
        int distanciaRecorrida = sc.nextInt();
        // --> --> --> --> --> --> distanciaRecorrida * kmXHora / ...;
        return (float) distanciaRecorrida * kmXHora / 2; // Temporal
    }


}
