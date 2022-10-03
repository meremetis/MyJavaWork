package gr.aueb.elearn.chapter9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class IOEncodeing {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("c:/temp/testencode1.txt", StandardCharsets.UTF_8);
        PrintWriter pw = new PrintWriter("c:/temp/testencode2.txt", "Windows-1252");

        ps.println("Hello auto-flush from printStream");
        pw.println("φργργεργρεεγε");

        ps.close();
        pw.close();
    }
}
