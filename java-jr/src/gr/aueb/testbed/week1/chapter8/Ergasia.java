package gr.aueb.testbed.week1.chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ergasia
{
    public static void main(String[] args)
    {
            try
            {
                menu();
            }
            catch (InputMismatchException e)
            {
                System.out.println("prepi na doseis times apo to 1 ews 5");
            }
     }


    /**
     * ektiposh epiloghs kai try-catch-rethrow
     */
        public static void menu ()
        {
            try(Scanner in = new Scanner(System.in))
            {
                int choice;
                 do
                {
                    showMmenu();
                    choice = in.nextInt();
                    if ((choice>=1)&&(choice<=5))
                    {
                        switch (choice)
                        {
                            case 1:
                                System.out.println("Edoses -> 1h epilogh");
                                break;
                            case 2:
                                System.out.println("Edoses -> 2h epilogh " );
                                break;
                            case 3:
                                System.out.println("Edoses -> 3h epilogh ");
                                break;
                            case 4:
                                System.out.println("Edoses -> 4h epilogh ");
                                break;
                            case 5:
                                System.out.println("antio");
                                break;

                            default:
                                System.out.println("Parakalw doste epilogh apo to 1 - 5");
                                break;
                        }
                    }
                    else
                        System.out.println(">EKSODOS<");
                }
                while (choice != 5);
            }
            catch (InputMismatchException e)
            {
                //System.out.println("tsiou");
                e.printStackTrace();
                throw e;
            }
        }



        /**
         * menu
         */
        public static void showMmenu() {
            System.out.println("Eepilekste");
            System.out.println("1. epilogh");
            System.out.println("2. epilogh");
            System.out.println("3. epilogh");
            System.out.println("4. epilogh");
            //System.out.println("5. Gia Ypolipo");
            System.out.println("5. Gia Eksodo");
            System.out.println("Dwste epilogh");
        }
    }

