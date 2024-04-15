package Ex4;

import java.util.ArrayList;

public class SchoolDataBase {

    ArrayList<UserSchool> listBaseOfData;

    public SchoolDataBase(ArrayList<UserSchool> listBaseOfData) {
        this.listBaseOfData = listBaseOfData;
    }

    public ArrayList<UserSchool> getListBaseOfData() {
        return listBaseOfData;
    }

    public void setListBaseOfData(ArrayList<UserSchool> listBaseOfData) {
        this.listBaseOfData = listBaseOfData;
    }

    private void addUserToBd(UserSchool userSchool){
        listBaseOfData.add(userSchool);
    }

    @Override
    public String toString() {
        return "SchoolDataBase [" +
                "listBaseOfData = " + listBaseOfData +
                "]";
    }
}
