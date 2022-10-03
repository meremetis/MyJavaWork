package gr.aueb.testbed.week1.chapter5;

import java.util.Scanner;

public class ErgasiaChapter5Teliko {
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
                        //stars(n,choice);
                        starsHo(n);
                        break;
                    case 2:
                        System.out.println("2. asterakia katheta");
                        System.out.println("Dwste ARITHMO GIA ASTERAKIA  ");
                        n = in.nextInt();
                        //stars(n,choice);
                        starsVe(n);
                        break;
                    case 3:
                        System.out.println("3. n grames me asterakia");
                        System.out.println("Dwste ARITHMO GIA ASTERAKIA  ");
                        n = in.nextInt();
                        //stars(n,choice);
                        starsHV(n);
                        break;
                    case 4:
                        System.out.println("4. n grames me asterakia 1 - n");
                        System.out.println("Dwste ARITHMO GIA ASTERAKIA  ");
                        n = in.nextInt();
                        //stars(n,choice);
                        starsLigaStaPola(n);
                        break;
                    case 5:
                        System.out.println("5. n grames me asterakia n - 1");
                        System.out.println("Dwste ARITHMO GIA ASTERAKIA  ");
                        n = in.nextInt();
                       // stars(n,choice);
                        starsPolaStaLiga(n);
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

    /**emfanizei orizodia asteria
     *
     * @param n plithos orizodiwn asteriwn
     */
    public static void starsHo(int n)
    {
        for (int i = 0; i < n ; i++)
        {
            System.out.print("*");
        }
    System.out.println();
    }

    /**emfanizei katheta asteria
     *
     * @param n plithos jkathetwn asteriwn
     */
    public static void starsVe(int n)
    {
        for (int i = 0; i < n ; i++)
        {
            System.out.println("*");
        }
        System.out.println();
    }

    /**ises grames ises stiles
     *
     * @param n plithos gramwn kai asteriwn
     */
    public static void starsHV(int n)
    {
        for (int i = 0; i < n ; i++)
        {
            starsHo(n);
        }
        System.out.println();
    }

    /**emfanish apo ta liga sta pola
     *
     * @param n plithos gramwn
     */
    public static void starsLigaStaPola(int n)
    {
        for (int i = 1; i <= n ; i++)
        {
            starsHo(i);
        }
        System.out.println();
    }

    /**
     * emfanish apo ta pola sta liga
     *
     * @param n plithos gramwn
     */
    public static void starsPolaStaLiga(int n)
    {
        for (int i = n; i > 0 ; i--)
        {
            starsHo(i);
        }
        System.out.println();
    }
}
