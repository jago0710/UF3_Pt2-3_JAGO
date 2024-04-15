import java.io.File;

public class Ex2 {
    public static void main(String[] args) {
        findFileMoreBigModify(args);
    }

    public static void findFileMoreBigModify(String[] args) {
        try {
            String fileName = "";
            double length = 0;
            File directory = new File(args[0]);
            if (directory.exists() && directory.isDirectory()) {
                if (directory.listFiles() != null) {
                    for (File file : directory.listFiles()) {
                        if (file.length() > length) {
                            length = file.length();
                            fileName = file.getName();
                        }
                    }
                    System.out.println("El archivo más grande es " + fileName + " con " + length);
                } else {
                    System.out.println("El directorio esta vacío");
                }
            } else {
                System.out.println("No existe este directorio o no es directamente un directorio");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
