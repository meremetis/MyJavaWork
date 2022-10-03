package gr.aueb.elearn.chapter3;

import java.util.Scanner;

/**
 * ipologizei thn dunamh a ^ b
 */
public class PowerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        long result = 1;
        int i = 1;


        System.out.println("dose 2 akereous");

        a = in.nextInt();
        b = in.nextInt();

        while(i <= b){

            result = result * a;
            i++;

            System.out.printf("h dunamh %d eis thn %d einai: %d %n",a ,b, result);
        }
        System.out.printf("h dunamh %d eis thn %d einai: %d",a ,b, result);

    }
}
