package gr.aueb.elearn.chapter5;

import java.util.Scanner;

/**
 * orizei mia methodo pou ipologizei to n!
 * elenxei me thn main ths liturgia ths methodou
 */
public class MethodFactorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int facto  , n ;

        System.out.println("doste enan akereo");
        n = in.nextInt();

        facto = factorial(n);

        System.out.println("to apotelesma tou " + n + " !n einai : "+facto);
    }


    public static int factorial(int n){
        int facto = 1;

        for (int i = 1; i <= n ; i++){
            facto *= i;
            System.out.println(facto);
        }
        return facto;
    }



}
