package Ex1;

public class Canario implements Cantante{
    private String color;
    private String pais;

    public Canario(String color, String pais) {
        this.color = color;
        this.pais = pais;
    }

    @Override
    public void canta() {
        System.out.println(this.toString() + " esta cantando");
    }

    @Override
    public String toString() {
        return "Canario{" +
                "color='" + color + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
