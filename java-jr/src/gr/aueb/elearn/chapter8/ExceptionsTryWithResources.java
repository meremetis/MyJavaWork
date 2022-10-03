package gr.aueb.elearn.chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsTryWithResources {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int i = in.nextInt();
            System.out.println(i);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
