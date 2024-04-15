package Ex6;

public class Empleado {

    private String nombre;
    private String apellido;
    private int edad;
    private int salary;

    public Empleado(){
    }
    public Empleado(String nombre, String apellido, int edad, int salary) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salary = salary;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean plus(int plusSalary){

    }

    public boolean compruebaNombre(){

    }
}
