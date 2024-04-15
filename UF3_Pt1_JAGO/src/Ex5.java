import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        removeFilesByNumber("/home/55157653l/Documents");
    }

    public static void removeFilesByNumber(String path) {
        try {
            File directory = new File(path);
            if (directory.exists() && directory.isDirectory()) {
                for (File file : directory.listFiles()) {
                    char ch = file.getName().charAt(0);
                    if (Character.isDigit(ch)){
                        System.out.println(file.getName());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
