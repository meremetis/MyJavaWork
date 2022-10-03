package gr.aueb.testbed.week1.chapter2;

import java.util.Scanner;

/**
 * anaptiksh programatos metatrophs farenheit se celsius
 *
 * @author meremetis
 * @see Askhsh1
 */
public class Askhsh1 {
    public static void main(String[] args) {
        //arxikopoihsh
        int farenheit;
        int celsius;
        Scanner in = new Scanner(System.in);

        //edoles
        System.out.println("parakalw doste vathmous farenheit");
        farenheit = in.nextInt();
        celsius = 5 * (farenheit - 32) / 9;

        //ektiposh
        System.out.printf("oi vathmoi farenheit: %d isoute me: %d vathmous celsium", farenheit, celsius);


    }
}
