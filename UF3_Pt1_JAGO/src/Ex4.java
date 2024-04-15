import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        viewfeatures("/home/55157653l/Baixades");
    }

    public static void viewfeatures(String path){
        try{
            File directory = new File(path);
            List<File> files = new ArrayList<>();
            for (File file : directory.listFiles()){
                System.out.println("---CARACTERISTICAS de " + file.getName() + "---");
                System.out.println("Nombre: " + file.getName());
                System.out.println("Existe? " + file.exists());
                System.out.println("Es directorio? " + file.isDirectory());
                System.out.println("Es archivo? " + file.isFile());
                System.out.println("Se puede leer? : " + file.canRead());
                System.out.println("Se puede escribir? : " + file.canWrite());
                System.out.println("Se puede ejecutar? : " + file.canExecute());
                System.out.println("Tamanõ: " + file.length());
                if (file.isFile()){
                    String extension = "";
                    extension = file.getName().substring(file.getName().lastIndexOf("."));
                    System.out.println("Tipo: " + extension);
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
