package gr.aueb.elearn.chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsFinalyScaner2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try
        {

            int i = s.nextInt();
            System.out.println("value of i : " +i);

        }
        catch (InputMismatchException e)
        {

            System.out.println("parakalw doste ekereo");
            System.out.println("inside catch");
            return;

        }
        finally {
            System.out.println("Finaly ------------------ always executed");

            try
            {
                if (s != null)
                    s.close();
            }catch (Exception a){
                System.out.println("cant close scanner");
            }

        }
    }
}
