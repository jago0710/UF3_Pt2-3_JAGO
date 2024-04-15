package Ex6;

public class Triangulo {
    private int side1;
    private int side2;
    private int side3;
    public Triangulo() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }
    public Triangulo(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public float perimetre(){
        return (float) (side1 + side2 + side3);
    }
    public float area(){
        int semiperimetro = (side1 + side2 + side3)/2;
        float area = (float) Math.sqrt(semiperimetro * (((semiperimetro - side1) * (semiperimetro - side2)) * (semiperimetro - side3)));
        return area;
    }
}
