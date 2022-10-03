package gr.aueb.elearn.chapter5;

import java.util.Scanner;

/**
 * ylopoiei ena menu epilogwn me xrhsh methoden
 */
public class MethodMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice ;

        do
        {
            showMmenu();
            choice = in.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("H <<eisagwgh>> egine epitixos");
                    break;
                case 2:
                    System.out.println("H <<enimerwsh>> egine epitixos");
                    break;
                case 3:
                    System.out.println("H <<diagrafh>> egine epitixos");
                    break;
                case 4:
                    System.out.println("H <<anazhthsh>> egine epitixos");
                    break;
                case 5:
                    System.out.println("Antio");
                    break;
                default:
                    System.out.println("Dwste epilogh apo to 1 ews 5");
                    break;


            }
        }while (choice != 5);

        System.out.println("loop broke becouse while == false");
    }

    public static void showMmenu() {
        System.out.println("Eepilekste");
        System.out.println("1. Gia Eisagwgh");
        System.out.println("2. Gia Enhmerosh");
        System.out.println("3. Gia Diagrafh");
        System.out.println("4. Gia Anazhthsh");
        System.out.println("5. Gia Exodo");
        System.out.println("Dwste epilogh");
    }
}
