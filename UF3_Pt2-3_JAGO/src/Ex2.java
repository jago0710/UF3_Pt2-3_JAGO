import java.io.FileReader;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(readFlatTextMin("/media/55157653l/Cco/M03-Programación/UF3_Pt2-3_JAGO/src/prueba.txt"));
    }

    public static String readFlatTextMin(String path) {
        try {
            String res = "";

            FileReader fr = new FileReader(path);
            int ch = fr.read();
            while (ch != -1) {
                res = res + (char) ch;
                ch = fr.read();
            }
            fr.close();
            return res.toLowerCase();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}