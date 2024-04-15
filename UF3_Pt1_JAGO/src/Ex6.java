import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        createFilesToDirectorys("/home/jago/Documentos/Prueba");
    }

    public static void createFilesToDirectorys(String path) {
        try {
            File directory = new File(path);
            System.out.println(Arrays.toString(directory.listFiles()));
            if (directory.isDirectory() && directory.exists()) {
                for (File file : directory.listFiles()) {
                   if (file.isFile()) {
                        File fileForCreated = new File(directory.getAbsolutePath(), file.getName().substring(0, file.getName().lastIndexOf(".")));
                        boolean mkdir = fileForCreated.mkdir();
                        System.out.println("Se a creador el dirctorio?: " + mkdir);
                    } else if (file.isDirectory()){
                        File fileForCreated = new File(directory.getAbsolutePath(), file.getName() + ".txt");
                        boolean fileCreated = fileForCreated.createNewFile();
                        System.out.println("fileCreated ok?: " + fileCreated);
                        System.out.println("Archivo " + fileForCreated.getName() + " creado correctamente");
                    }
                }
            } else {
                System.out.println("El directorio no existe o no es directorio");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createDirectorysToFiles(String path) {

    }
}
