package gr.aueb.testbed.week1.chapter3;

import java.util.Scanner;

/**
 * disekto
 */
public class AskishDisekto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean disekto = false;
        int etos = 0;

        System.out.println("dose etos");
        etos = in.nextInt();

        if (((etos % 4 == 0) && (etos % 100 != 0) ) || (etos % 400 == 0) ){
            System.out.println("disekto");
        }
        else{
            System.out.println("oxi disekto");
        }
    }
}
