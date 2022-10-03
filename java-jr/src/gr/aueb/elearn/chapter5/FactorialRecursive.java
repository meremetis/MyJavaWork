package gr.aueb.elearn.chapter5;

public class FactorialRecursive {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if ( n <= 1)
        {
            return 1;
        }
        else
        {
            return n * factorial( n-1);
        }


        /**
         * pio suntoma tha borousame na grapsoume
         * return  (n <= 1)? 1: (n * factorial( n-1));
         */

    }
}
