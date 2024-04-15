import java.util.ArrayList;
import java.util.Scanner;

public class Notes {
    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<Float> treureNotes(ArrayList<Float> arrayNotes){
        try {
            float nota = 0;
            while (nota != -1) {
                System.out.print("Ingresa una nota: ");
                float notaArray = sc.nextFloat();
                if (notaArray == -1) {
                    nota = notaArray;
                    System.out.println(">>>>>>>>>>>>>>>" +
                            "<<<<<<<<<<<<<<<");
                } else {
                    arrayNotes.add(notaArray);
                }
            }
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
        return arrayNotes;
    }

    public static float treureMedia(ArrayList<Float> notes) {
        float result = 0;
        try{
            float sumaNotes = 0;
            for (float nota : notes) {
                sumaNotes = nota + sumaNotes;
            }
            result = sumaNotes / notes.size();
            return result;
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
        return result;
    }

}