package gr.aueb.elearn.chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age;

        while (true)
        {
            try
            {
                System.out.println("doste ena akereo arithmo gia thn hlikia sas");
                age = s.nextInt();
                System.out.println("h ilikia pou dosate einai : " + age);
                if (age == 0) break;

            }catch (InputMismatchException e){
                System.out.println("den dosate arithmo parakalw doste akereo");
                s.nextLine();
            }

        }
        System.out.println("Adios");
        s.close();
    }
}
