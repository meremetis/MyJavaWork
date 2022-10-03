package gr.aueb.testbed.week1.chapter4;

/**
 * 10 asterakia orizontia
 * 10 asterakia katheta
 * 10 asterakia kathe shra apo adistixa asterakia
 * 10 asterakia kathe shera anapoda asterakia
 */
public class Askish_1_Asterakia {
    public static void main(String[] args) {
        for (int i = 1;i<=10;i++)
        {
            System.out.print("*");
        }
        System.out.println("\n-------------------------------");
        for (int i = 1;i<=10;i++)
        {
            System.out.println("*");
        }
        System.out.println("\n-------------------------------");

        for (int i = 1;i<=10;i++)
        {
            for (int j = 11-i;j<=10;j++)
                System.out.print("*");
            System.out.print("\n");
        }
        System.out.println("\n-------------------------------");


        for (int i = 1;i<=10;i++)
        {
            for (int j = 10-i;j>=0;j--)
                System.out.print("*");
            System.out.print("\n");
        }
        System.out.println("\n-------------------------------");
    }
}
