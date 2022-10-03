package gr.aueb.elearn.chapter2;

import java.util.Scanner;

/**
 * diavazei 2uo akereous apo ton xristh
 * (std input), upologizei to athrisma
 * kai ektipwnei sthn othonh (std output)
 */
public class ScannerDemo {

    public static void main(String[] args) {
        //dilosh kai arxik metavlitwn
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        //edoles / expresion
        System.out.println("please insert 2 ints ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2;

        //ektuposh apotelesmatwn
        System.out.printf("to apotelesma %d kai %d einai %d", num1, num2, sum);
        in.close();
    }
}
