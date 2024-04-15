import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        other("/home/jago/Documetos");
    }
    public static void other(String path){

    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Ordenar por abecedario");
        System.out.println("2. Ordenar por modificación");
        System.out.println("3. Ordenar por tamaño de +/-");
        System.out.println("0. Salir");
        System.out.print("Elige una opción:");
        String option = sc.next();

        switch (option){
           case "1":

           break;
           case "2":

           break;
           case "3":

           break;
           case "0":
               System.out.println("Saliendo...");
           break;

        }
    }

    public static void OrderByAbc(String path){
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()){

        } else {
            System.out.println("No es un directorio o no existe");
        }
    }
}
