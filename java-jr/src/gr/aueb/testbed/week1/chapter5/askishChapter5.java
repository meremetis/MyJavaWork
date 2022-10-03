package gr.aueb.testbed.week1.chapter5;

import java.util.Scanner;

public class askishChapter5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n , choice;

        do
        {
            showMmenu();
            choice = in.nextInt();
            //n = in.nextInt();

            if ((choice>=1) && (choice<=5))
            {
                switch (choice)
                {
                    case 1:
                        System.out.println("1. asterakia orizontia");
                        System.out.println("Dwste ARITHMO GIA ASTERAKIA  ");
                        n = in.nextInt();
                        stars(n,choice);
                        break;
                    case 2:
                        System.out.println("2. asterakia katheta");
                        System.out.println("Dwste ARITHMO GIA ASTERAKIA  ");
                        n = in.nextInt();
                        stars(n,choice);
                        break;
                    case 3:
                        System.out.println("3. n grames me asterakia");
                        System.out.println("Dwste ARITHMO GIA ASTERAKIA  ");
                        n = in.nextInt();
                        stars(n,choice);
                        break;
                    case 4:
                        System.out.println("4. n grames me asterakia 1 - n");
                        System.out.println("Dwste ARITHMO GIA ASTERAKIA  ");
                        n = in.nextInt();
                        stars(n,choice);
                        break;
                    case 5:
                        System.out.println("5. n grames me asterakia n - 1");
                        System.out.println("Dwste ARITHMO GIA ASTERAKIA  ");
                        n = in.nextInt();
                        stars(n,choice);
                        break;
                    case 6:
                        System.out.println("Antio");
                        break;
                    default:
                        System.out.println("Dwste epilogh apo to 1 ews 5");
                        break;
                }
            }
            else
            {
                System.out.println("termatismos");
            }
        }while (choice != 6);

        System.out.println("loop broke becouse while == false");
    }

    public static void showMmenu() {
        System.out.println("Eepilekste");
        System.out.println("1. Emfanise n asterakia orizontia");
        System.out.println("2. Emfanise n asterakia katheta");
        System.out.println("3. Emfanise n grames me n asterakia");
        System.out.println("4. Emfanise n grames me asterakia 1 - n");
        System.out.println("5. Emfanise n grames me asterakia n - 1");
        System.out.println("6. Gia Exodo");
        System.out.println("Dwste epilogh");
    }




    public static void stars(int n, int choice){
        if (choice == 1){
            System.out.println("Enjoy\n");
            for (int i = 1; i <= n; i++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
        else if (choice == 2){
            System.out.println("Enjoy\n");
            for (int i = 1; i <= n; i++){
                System.out.println("*");
            }
            System.out.println();
        }
        else if (choice == 3){
            System.out.println("Enjoy\n");

            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= n; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println();
        }

        else if (choice == 4){
            System.out.println("Enjoy\n");

            for (int i = 1; i <= n; i++)
            {
                for (int j = (n + 1)-i; j <= n; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println();
        }

        else if (choice == 5){
            System.out.println("Enjoy\n");

            for (int i = 1; i <= n; i++)
            {
                for (int j = n - i ; j >= 0; j--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println();
        }
        else
        {
            System.out.println("akiro noumero");
        }
    }








}
