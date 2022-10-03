package gr.aueb.elearn.chapter2;

import java.util.Scanner;

/**
 * metatrepei posa euro se xartonomismata twn 500, 100, 50, 20 10 euro
 * kai kermata tou 1  euro. Gia paradigma ta 1204 Euro eunai
 * 2 xartonomismata ton 500euro, 2 xartonomismata ton 100 euro,
 * 0 xartonomismata ton 50euro, 20 kai 10 Euro kai 4 kermata tou 1 euro.
 *
 * ola ta parapanw me xrhsh twn div - mod ksekinontas apo ta 500 euro
 * kai katevenontas pros tis monades tou 1 euro
 *
 * @author  meremetis
 * @version 0.1
 * @see EuroModDemo
 */
public class EuroModDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long euro500, euro100, euro50, euro20, euro10;
        long remainingEuros;

        System.out.println("doste posa se euro");

        remainingEuros = in.nextLong();

        euro500 = remainingEuros / 500;
        remainingEuros = remainingEuros % 500;

        euro100 = remainingEuros / 100;
        remainingEuros = remainingEuros % 100;

        euro50 = remainingEuros / 50;
        remainingEuros = remainingEuros % 50;

        euro20 = remainingEuros / 20;
        remainingEuros = remainingEuros % 20;

        euro10 = remainingEuros / 10;
        remainingEuros = remainingEuros % 10;

        System.out.printf("Euro500: %d\tEuro100: %d\tEuro50: %d\tEuro20: %d\tEuro10: %d\tEuro1: %d", euro500, euro100, euro50, euro20, euro10, remainingEuros);


    }
}
