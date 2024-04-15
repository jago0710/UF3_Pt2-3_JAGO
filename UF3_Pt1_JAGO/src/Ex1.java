import java.io.File;

public class Ex1 {
    public static void main(String[] args)
    {
       findFileMoreBig("/home/jago/Descargas");
    }

    public static void findFileMoreBig(String path) {
        try {
            String fileName = "";
            double length = 0;
            File directorio = new File(path);
            if (directorio.listFiles() != null) {
                for (File file : directorio.listFiles()) {
                    if (file.length() > length) {
                        length = file.length();
                        fileName = file.getName();
                    }
                }
                System.out.println("El archivo más grande es " + fileName + " con " + length);
            } else {
                System.out.println("El directorio esta vacío");
            }
            if (directorio.exists() && directorio.isDirectory()) {
            } else {
                System.out.println("No existe este directorio o no es un directorio");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void hola(){
        System.out.println("Hola como estas");
    }


}
