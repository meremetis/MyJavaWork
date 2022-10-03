package gr.aueb.elearn.chapter8;

import java.util.Scanner;

public class ExceptionsFinalyScaner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        try {
            int i = s.nextInt();
            System.out.println("value of i : " +i);
            System.out.println("Inside try");
           // throw new Exception();
        }catch (Exception e){
            System.out.println("parakalw doste ekereo");

            System.out.println("inside catch");
            return;
        }finally {
            System.out.println("Finaly ------------------ always executed");
            s.close();


        }
        //  System.out.println("Outside try/");
    }
}
