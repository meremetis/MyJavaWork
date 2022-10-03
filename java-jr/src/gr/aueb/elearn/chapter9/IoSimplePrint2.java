package gr.aueb.elearn.chapter9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * driaxnei arxio kai grafei mesa me PritStream ala kai me PrintWriter
 */
public class IoSimplePrint2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("c:/temp/test3.txt");
        ps.println("Hello AUEB eLearning frim PrintStream");

        PrintWriter pw =new PrintWriter("c:/temp/test4.txt");
        pw.println("Hello AUEB eLearning frim PrintWriter");
        ps.close();
        pw.close();
    }
}
