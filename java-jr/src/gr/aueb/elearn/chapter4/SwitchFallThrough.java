package gr.aueb.elearn.chapter4;

import java.util.Scanner;

/**
 * lamvanei enan arithmo pou sumvolizei bathmo
 * apo ton xristi kai emfanizei katalilo minima
 */
public class SwitchFallThrough {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        switch (choice)
        {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("katw apo thn vash");
                break;
            case 5:
            case 6:
                System.out.println("kalos");
                break;
            case 7:
            case 8:
                System.out.println("lian kalos");
                break;
            case 9:
            case 10:
                System.out.println("arista");
                break;
            default:

        }

    }
}
