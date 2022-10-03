package gr.aueb.elearn.chapter3;

import java.util.Scanner;

/**
 * ipologizei to plithos ton psifiwn
 * enos akereou
 */
public class DigitsCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, count = 0;
        int result;

        System.out.println("dose enan akereo arithmo");
        num = in.nextInt();
        result = num;

        do{
            result = result / 10;
            count++;
        }while(result != 0);
        System.out.printf("plithos psifiwn tou %d: %d ",num ,count);
    }
}
