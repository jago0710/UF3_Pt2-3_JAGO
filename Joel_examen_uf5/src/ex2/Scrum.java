package ex2;

import java.util.ArrayList;
import java.util.Map;

public class Scrum {

    private String projetName;
    private Map<String, ArrayList<Student>> students;

    public Scrum(Map<String, ArrayList<Student>> students) {
        this.students = students;
    }

    public Map<String, ArrayList<Student>> getStudents() {
        return students;
    }

    public void setStudents(Map<String, ArrayList<Student>> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Scrum{" +
                "students=" + students +
                '}';
    }

//    public void addProject(String projectName){
////        if (students. ){
//
//        }
//
//    }



}
