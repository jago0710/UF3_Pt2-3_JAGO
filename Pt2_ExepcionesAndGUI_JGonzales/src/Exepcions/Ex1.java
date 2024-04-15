package Exepcions;

import javax.crypto.ExemptionMechanismException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Ingresa un número: ");
            int num = sc.nextInt();
            System.out.println("Este es el número que ingresaste: " + num);
        } catch (InputMismatchException e){
            System.out.println("Error solo se admiten números \nLa exepción es: " + e);
        }
    }
}
