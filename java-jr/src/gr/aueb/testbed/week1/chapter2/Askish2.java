package gr.aueb.testbed.week1.chapter2;

import java.util.Scanner;

/**
 * grapste ena programa pou tha diavazei apo ton xrhsth 3hs akereous
 * pou anaparistoun hmera , mhna, etos
 * kai thn emfanizei se morfh
 * hh/mm/ee
 */
public class Askish2 {

    public static void main(String[] args) {

        //Arx
        Scanner in = new Scanner(System.in);
        int days;
        int month;
        int year;

        //edoles
        System.out.println("doste: hmera, doste: mhna, doste: etos.");
        days = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        //emfanish
        System.out.printf("%02d/%02d/%04d \n", days, month, year);

        System.out.println(Byte.SIZE +" "+ Short.SIZE);
    }
}
