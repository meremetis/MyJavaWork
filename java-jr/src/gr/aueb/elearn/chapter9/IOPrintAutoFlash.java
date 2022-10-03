package gr.aueb.elearn.chapter9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOPrintAutoFlash {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("c:/temp/test3.txt"),true);
        PrintWriter pw = new PrintWriter(new FileOutputStream("c:/temp/test4.txt"),true);

        Scanner in = new Scanner(System.in);
/*
parakatw h print tou printstream emfanish amessa
aneksartita apo to an to auto flash einai true h oxi
giati opos anageroume kai stis shmeiwseis
h printStream ta text kai character oriented streams ta kanei auto ouos h alos
 */
        ps.print("Hello auto-flush from printStream");
/*
kataktw h println() tou printWriter emesa
giati auto flash einai true
 */
        pw.println("Hello Auto-Flash from PrintWriter*");

/*
ean soto printwriter afdi gia println() exoume print()
akoma kai an to auto flush is true den tha grapsei amesa
giati gia na grapsei amesa tha prepi na kanoume flush(0
diladi na vgaloume apo sxolia thn grafh apo katw
 */
        pw.print("Hello Auto-Flash from PrintWriter again");
        //pw.flush();

        /*

        ton scaner ton vazoume gia na blokaroume to programa oste na perimenei
        kai na eleksoume ta atxeia as se auto to shmeio exei graftei to parapanw input
        diaforerika an den prokarei paei sto close();
        kai ola ginode flush();


         */

        String str = in.next();
        System.out.println(str);

        ps.close();
        pw.close();
        in.close();
    }
}
