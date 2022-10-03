package gr.aueb.elearn.chapter3;

import java.util.Scanner;

/**
 * ypologizei kai ektiponei to n! (paragontiko tou n)
 * to paragontiko tou n einai iso me *1*2*3...*n.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1, n;
        int facto = 1;

        System.out.println("dose 1 akereo atihmo");
        n = in.nextInt();

        while(i <= n){
            facto *= i;
            i++;
        }
        System.out.printf("to paragontiko tou %d einai : %d %n", n, facto);
    }
}
