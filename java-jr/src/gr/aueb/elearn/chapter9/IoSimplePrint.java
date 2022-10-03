package gr.aueb.elearn.chapter9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * ftiaxnei arxio kai kanei print mesa
 */
public class IoSimplePrint {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("c:/temp/test.txt");
        ps.println("arxio test");
        ps.close();
    }
}
