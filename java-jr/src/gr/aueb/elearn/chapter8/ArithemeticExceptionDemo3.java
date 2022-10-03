package gr.aueb.elearn.chapter8;

import java.util.Scanner;

/**
 * epidikniei thn ArithmeticException kai ton
 * ortho xeirismo ths eksereshs
 */
public class ArithemeticExceptionDemo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,result;



        try {
            System.out.println("doste 2 arithmous gia dieresh");

            a = in.nextInt();
            b = in.nextInt();

            result = a / b;

            System.out.println("to apotelesma ths diereshs einai "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Apagorevete h dieresh me to 0");
        }
    }
}
