package gr.aueb.elearn.chapter5;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice, num1 = 0, num2 = 0;

        do
        {
            showMmenu();
            choice = in.nextInt();

            if ((choice>=1)&&(choice<=5))
            {
                System.out.println("doste 2 arithmous");
                num1 = in.nextInt();
                num2 = in.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.println("Athrisma " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Aferesh " + sub(num1, num2));
                        break;
                    case 3:
                        System.out.println("Ginomeno " + mul(num1, num2));
                        break;
                    case 4:
                        System.out.println("Dieresh " + div(num1, num2));
                        break;
                    case 5:
                        System.out.println("Ypolipo " + mod(num1, num2));
                        break;
                    case 6:
                        System.out.println("antio");
                        break;
                    default:
                        System.out.println("Parakalw doste epilogh apo to 1 - 6");
                        break;
                }
            }
            else
                System.out.println(">EKSODOS<");
        }while (choice != 6);
    }


    /**
     * method menu
     */
    public static void showMmenu() {
        System.out.println("Eepilekste");
        System.out.println("1. Gia Prosthesh");
        System.out.println("2. Gia Afairesh");
        System.out.println("3. Gia Pola/smo");
        System.out.println("4. Gia Diaresh");
        System.out.println("5. Gia Ypolipo");
        System.out.println("6. Gia Eksodo");
        System.out.println("Dwste epilogh");
    }

    /**
     * method of add
     *
     * @param num1
     * @param num2
     * @return a+b
     */
    public static int add(int num1, int num2)
    {
        return num1 + num2;
    }

    /**
     * method of sub
     *
     * @param num1
     * @param num2
     * @return a - b
     */
    public static int sub(int num1, int num2)
    {
        return num1 - num2;
    }

    /**
     * method of mul
     *
     * @param num1
     * @param num2
     * @return a * b
     */
    public static int mul(int num1, int num2)
    {
        return num1 * num2;
    }


    /**
     * method of div
     *
     * @param num1
     * @param num2
     * @return a / b
     */
    public static int div(int num1, int num2)
    {
        return num1 / num2;
    }

    /**
     * method of mod
     *
     * @param num1
     * @param num2
     * @return a % b
     */
    public static int mod(int num1, int num2)
    {
        return num1 % num2;
    }

}
