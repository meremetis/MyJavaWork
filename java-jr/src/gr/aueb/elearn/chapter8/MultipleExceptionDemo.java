package gr.aueb.elearn.chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, result;


        try{
            num1 = in.nextInt();

            num2 = in.nextInt();

            result = num1 / num2;
            System.out.println(result);
        }
        catch (ArithmeticException e1){
            System.out.println("apagorevete h dieresh me to 0");
        }
        catch (InputMismatchException e2){
            System.out.println("parakalw doste akereo arithmo");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
