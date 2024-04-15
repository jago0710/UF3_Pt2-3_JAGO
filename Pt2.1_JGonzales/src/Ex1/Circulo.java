package Ex1;

import java.awt.*;

public class Circulo extends ObjetoGeometrico {
    private float radio;

    public Circulo(float coord_x, float coord_y, Color color, float radio) {
        super(coord_x, coord_y, color);
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float perimetro(){
        return (float) ((Math.PI * radio)*radio);
    }

    public float area(){
        return (float) ((2 * Math.PI) * radio);
    }

    @Override
    public String toString() {
        return "Circulo ["
                + "radio = "
                + radio + "]";
    }
}
