package Ex2_Aquario;

public class Planta extends Organismo{

    private char tipo; //( "S" Tija, "B" Bulb, "R" Arrels)

    public Planta(String nombre, String familia, char tipoDeLuz, int tempMaxTolerada, int tempMinTolerada, float phMaxTolerada, float phMinTolerada, char tipo) {
        super(nombre, familia, tipoDeLuz, tempMaxTolerada, tempMinTolerada, phMaxTolerada, phMinTolerada);
        this.tipo = tipo;
    }

    public String buscarTipoDePlanta(){
        switch (tipo){
            case 'S':
                return "Tija";
            case 'B':
                return "Bulb";
            case 'R':
                return "Arrels";
            default:
                return "La dieta ingresada no existe";
        }
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

}
