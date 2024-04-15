package Ex1;

public class Persona implements Cantante{
    private String name;
    private int edad;

    public Persona(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    @Override
    public void canta() {
        System.out.println(this.name + " esta cantando");
    }
}
