package gr.aueb.elearn.chapter9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Locale;

public class IOLocale {
    public static void main(String[] args) throws FileNotFoundException {
        double d =12.4;

        PrintStream ps = new PrintStream("c:/temp/testLocale1.txt");
        PrintWriter pw = new PrintWriter("c:/temp/testLocale2.txt");

        System.out.println("to default locale tu sistimatos einai "+ Locale.getDefault());

        ps.println(d);
        pw.println(d);

        ps.printf("%.2f\r\n", d);
        pw.printf("%.2f\r\n", d);



        ps.printf(Locale.US,"%.2f",d);
        pw.printf(Locale.getDefault(), "%.2f",d);

        ps.close();
        pw.close();

    }

}
