package Ex1;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        ObjetoGeometrico objetoGeometrico1 = new ObjetoGeometrico();
        Circulo circulo1 = new Circulo(14.0f, 12.0f, Color.BLACK, 6.0f);
        System.out.println(objetoGeometrico1);
        System.out.println(
                "Area: " + circulo1.area() + "\n" +
                "Perimetro: " + circulo1.perimetro() + "\n");
/*--><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><--*/
        Cuadrado cuadrado1 = new Cuadrado(4.20f);
        System.out.println(cuadrado1);
        System.out.println(
                "Area: " + cuadrado1.area() + "\n" +
                "Perimetro: " + cuadrado1.perimetro());
    }
}
