package gr.aueb.elearn.chapter8;

import java.util.Scanner;

/**
 * epidikniei thn ArithmeticException
 */
public class ArithemeticExceptionDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, result;

        System.out.println("doste 2 arithmous gia dieresh");

        a = in.nextInt();
        b = in.nextInt();

        result = a / b;

        System.out.println("to apotelesma ths diereshs einai "+result);
    }
}
