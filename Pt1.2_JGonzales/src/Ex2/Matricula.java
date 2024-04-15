package Ex2;

import javax.swing.*;
import java.util.ArrayList;

public class Matricula {

    private Alumno alumno;
    private ArrayList<Modulo> modulos;
    private int nota;

    public Matricula(Alumno alumno, ArrayList<Modulo> modulos, int nota) {
        this.alumno = alumno;
        this.modulos = modulos;
        this.nota = nota;
    }

    public void addModulo(Modulo modulo){
        modulos.add(modulo);
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(ArrayList<Modulo> modulos) {
        this.modulos = modulos;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Matricula [" +
                "alumno = " + alumno +
                ", modulos = " + modulos +
                ", nota = " + nota + "]";
    }
}
