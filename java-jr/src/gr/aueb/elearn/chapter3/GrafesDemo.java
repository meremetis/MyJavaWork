package gr.aueb.elearn.chapter3;

import java.util.Scanner;

/**
 * dexete os eidoso plithos mathimatwn
 * kai sinilo vathmologias
 * kai ipologizei mo
 */
public class GrafesDemo {

    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        int mathimata;
        int vathmologia;
        int mo;

        System.out.println("dose plithos mathimatwn");
        mathimata = in.nextInt();
        System.out.println("dose sunolo vathmologias");
        vathmologia = in.nextInt();

        if (mathimata != 0)
        {
            mo = vathmologia / mathimata;
            if (mo <= 6){
                System.out.println("kalos mesos oros: "+mo);
            }
            else if (mo <= 8) {
                System.out.println("arketa kalos mo: "+mo);
            }
            else if (mo <= 10) {
                System.out.println("aristos mo: "+mo);
            }
            else
            {
                System.out.println("apotixia");
            }
        }
        else
        {
            System.out.println("to plithos vathimatwn den borei na einai 0");
        }
    }
}
