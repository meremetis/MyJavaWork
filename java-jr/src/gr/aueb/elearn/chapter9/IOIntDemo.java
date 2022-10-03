package gr.aueb.elearn.chapter9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

/**
 * diavazei ena arxio kai grafei se ena alo arxio to athrisma kai ton meso oro
 */
public class IOIntDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("c:/temp/intIn.txt"));

        PrintStream ps = new PrintStream("c:/temp/intOut.txt");

        String token;
        int num = 0, sum = 0, count = 0;
        double average =0.0;

        while (sc.hasNext())
        {
            token = sc.next();
            if (inInt(token))
            {
                num = Integer.parseInt(token);
                count++;
                sum += num;
            }
        }

        average = (double) sum / count;
        ps.printf("to athrisma einai %d%n",sum);
        ps.printf(Locale.ENGLISH, "o mesos oros einai %.2f", average);

        sc.close();
        ps.close();

    }

    public static boolean inInt(String s){
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
