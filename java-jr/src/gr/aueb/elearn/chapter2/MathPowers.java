package gr.aueb.elearn.chapter2;

import java.util.Scanner;

/**
 * ipologizei to tetragono kai ton kivo enos aritmou pou tou dinei
 * enas xrisths. xrisimopiei thn etimh methodo Math.pow() ths klashs Math.
 *
 * @author meremetis
 */
public class MathPowers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("parakalw doste arithmo");

        num = in.nextInt();

        System.out.printf("tetragono: %d, kivos: %d", (int)Math.pow(num,2), (int)Math.pow(num,3));
    }
}
