package Ex1;

import java.awt.*;

public class ObjetoGeometrico {

    private float coord_x;
    private float coord_y ;
    private Color color;

    public ObjetoGeometrico(float coord_x, float coord_y, Color color) {
        this.coord_x = coord_x;
        this.coord_y = coord_y;
        this.color = color;
    }

    public ObjetoGeometrico(){
    }
    public float getCoord_x() {
        return coord_x;
    }

    public void setCoord_x(float coord_x) {
        this.coord_x = coord_x;
    }

    public float getCoord_y() {
        return coord_y;
    }

    public void setCoord_y(float coord_y) {
        this.coord_y = coord_y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ObjectoGeometrico [" +
                "coord_x = " + coord_x +
                ", coord_y = " + coord_y +
                ", color = " + color + "]";
    }
}
