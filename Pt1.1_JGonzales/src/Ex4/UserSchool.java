package Ex4;

public class UserSchool {
    private String name;
    private int age;
    private String rol;

    public UserSchool(String name, int age, String rol) {
        this.name = name;
        this.age = age;
        this.rol = rol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void showUser(){
        System.out.println("UserSchool [" +
                "name = " + name +
                ", age = " + age +
                ", rol = " + rol +
                "]");
    }

    @Override
    public String toString() {
        return "\nUserSchool [" +
                "name = " + name +
                ", age = " + age +
                ", rol = " + rol +
                "]";
    }
}
