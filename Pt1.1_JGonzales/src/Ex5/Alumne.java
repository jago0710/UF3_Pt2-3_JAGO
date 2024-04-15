package Ex5;

public class Alumne {

    private String nom;

    public Alumne() {
    }
    public Alumne(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void saluda(){
        System.out.println("Hola soy " + nom);
    }

    @Override
    public String toString() {
        return "Alumne [" +
                "nom='" + nom +
                "]";
    }
}
