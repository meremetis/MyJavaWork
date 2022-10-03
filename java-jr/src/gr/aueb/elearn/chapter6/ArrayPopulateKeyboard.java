package gr.aueb.elearn.chapter6;

import java.util.Scanner;

/**
 *arxikopiei me Scanner apo to pliktrologio
 */

public class ArrayPopulateKeyboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ages = new int[5];

        for (int i = 0; i < ages.length;i++){

            System.out.println("dose timh : " + (i+1) );
            ages[i] = in.nextInt();
        }

        for (int x : ages)
            System.out.println(x);

    }
}
