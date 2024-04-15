import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        findFileWithWord("/home/55157653l/Baixades", "exercici");
    }

    public static void findFileWithWord(String path, String palabra) {

        List<String> results = new ArrayList<>();
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            if (directory != null) {
                for (File file : directory.listFiles()) {
                    if (file.getName().contains(palabra)) {
                        results.add(file.getName());
                    }
                }
                if (results.isEmpty()) {
                    System.out.println("No hay archivos que tengan la palabra " + palabra);
                } else {
                    for (String nameFile : results) {
                        System.out.println(nameFile + " contiene " + palabra);
                    }
                }
            } else {
                System.out.println("El directory esta vacío");
            }
        } else {
            System.out.println("No existe o no es un directorio");
        }
    }
}
