package gr.aueb.elearn.chapter8;

import java.util.Scanner;

public class ExceptionsFinally {
    public static void main(String[] args) {


        try {

            System.out.println("Inside try");
            throw new Exception();
        }catch (Exception e){
            System.out.println("inside catch");
            return;
        }finally {
            System.out.println("Finaly ------------------ always executed");



        }
      //  System.out.println("Outside try/");
    }
}
