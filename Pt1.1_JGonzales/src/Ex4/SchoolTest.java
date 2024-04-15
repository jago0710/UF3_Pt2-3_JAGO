package Ex4;

import java.util.ArrayList;

public class SchoolTest {

    public static void main(String[] args) {
        UserSchool userSchool1 = new UserSchool("Luna", 21, "Student");
        UserSchool userSchool2 = new UserSchool("Diego", 30, "Profesor");
        UserSchool userSchool3 = new UserSchool("Kevin", 19, "Student");
        UserSchool userSchool4 = new UserSchool("Juan", 28, "Profesor");
        UserSchool userSchool5 = new UserSchool("Rosario", 20, "Student");
        ArrayList<UserSchool> userSchoolArrayList = new ArrayList<>();
        SchoolDataBase baseOfDateUserSchool = new SchoolDataBase(userSchoolArrayList);

        userSchoolArrayList.add(userSchool1);
        userSchoolArrayList.add(userSchool2);
        userSchoolArrayList.add(userSchool3);
        userSchoolArrayList.add(userSchool4);
        userSchoolArrayList.add(userSchool5);
        System.out.println(baseOfDateUserSchool);
    }
}
