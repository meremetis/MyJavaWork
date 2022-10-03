package gr.aueb.elearn.chapter9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * ekktuponei se arxeio xaraktires me th xrhsh
 * ton PrintStream kai PrintWriter
 */
public class IoFilePrint {
    public static void main(String[] args) {
        try(
                PrintStream ps = new PrintStream("c:/temp/test3.txt");
                PrintWriter pw = new PrintWriter("c:/temp/test4.txt");
        )
        {

            ps.println("Hello World2! from PrintStream1");
            pw.println("Hello World2! from PrintWriter1");

        }
        catch (FileNotFoundException e){
            System.out.println("to arxio den vrethike");
        }
    }
}
