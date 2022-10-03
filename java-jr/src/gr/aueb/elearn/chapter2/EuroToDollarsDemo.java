package gr.aueb.elearn.chapter2;

import java.util.Scanner;

/**
 * diavazei apo ton xrhsth ena akeraio pou
 * anaparista ena poso euro kai metatrepei
 * se dolaria kai cents USA sumfwna me thn
 * isotimia 1 euro = 116 USA cents
 */
public class EuroToDollarsDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int RATE = 116;
        int inputEuros = 0;
        int totalUsaDollars = 0;
        int usaDollars = 0;
        int usaCents = 0;

        //Edoles
        System.out.println("please insert amount of euros");
        inputEuros = in.nextInt();
        totalUsaDollars = inputEuros * RATE;

        usaDollars = totalUsaDollars / 100;
        usaCents = totalUsaDollars % 100;

        //ektiposh
        System.out.printf("%d euros = %d USA Dollars, %d usa Cents", inputEuros, usaDollars , usaCents);
    }
}
