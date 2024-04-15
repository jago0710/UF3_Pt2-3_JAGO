public class Coche {

//1. Crea una classe Cotxe que tingui els atributs model i matrícula, i els corresponents mètodes set i get per a cada un.
//Crea una altra classe CotxeTest amb un main on es creïn 2 objectes de tipus Cotxe i es provin els seus mètodes set i get.

    private String Modelo;
    private String Matricula;

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public Coche(String modelo, String matricula){
        this.setModelo(modelo);
        this.setMatricula(matricula);
    }

    @Override
    public String toString() {
        return "Coche [" +
                "Modelo = " + Modelo +
                ", Matricula = " + Matricula +
                ']';
    }
}
