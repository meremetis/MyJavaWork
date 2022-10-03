package gr.aueb.elearn.chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * elenxei thn eisodo tou xristh, an einai eggirh
 * timh ilikas alios dinei katalilo minima
 */
public class InputMissmatchExceptionDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age;

        while (true){
            try
            {
                System.out.println("doste mia eggirh timh ilikias");
                age = s.nextInt();

                if ((age < 0) || (age >= 130))
                {
                    System.out.println("timh den einai egirh");
                }
                else if (age == 0){
                    break;
                }
                else
                {
                    System.out.println(" h ilikia pou dosate  eina " + age);
                }
            } catch (InputMismatchException e) {
                System.out.println("den dosate eggirh timh");
                s.nextLine();
            }

        }
    }
}
