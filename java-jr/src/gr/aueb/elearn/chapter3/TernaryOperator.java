package gr.aueb.elearn.chapter3;

import java.util.Scanner;

/**
 * ypologizei to apoluto enos arithmou n
 * me thn xrish triadikou
 */
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, abs;

        System.out.println("dose arithmo gia na brw to apolito");
        n = in.nextInt();
        /*abs = (n >= 0 )? n : -n;

        System.out.printf("to apoluto tou %d einai %d ", n, abs);
    */
        System.out.printf("to apoluto tou %d einai %d ", n, (n >= 0) ? n : -n );
    }

}
