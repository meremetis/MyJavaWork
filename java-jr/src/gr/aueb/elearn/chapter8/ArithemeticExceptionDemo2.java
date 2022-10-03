package gr.aueb.elearn.chapter8;

import java.util.Scanner;

/**
 * epidikniei ths ArithmeticException
 *,  thn try/ catch kai thn printStacktrace
 */
public class ArithemeticExceptionDemo2 {
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
            e.printStackTrace();//dixnei se pia gramh einai to lathos
        }
    }
}
