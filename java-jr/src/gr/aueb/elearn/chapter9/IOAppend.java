package gr.aueb.elearn.chapter9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * to programa auto epidikniei to pos kanoume append diladi grafoume sto telos
 * se ena arxeio. Paratiriste thn FileOutputStrea
 * pou pernei to onoma tu arxeiou
 * ala kai mia parametro true pou einai to appeend
 *
 * tha reksoume 2 fores kai tha exei 2 egrafes
 */
public class IOAppend {
    public static void main(String[] args) throws FileNotFoundException {

        PrintStream ps = new PrintStream(new FileOutputStream("c:/temp/testencodeApend.txt",true));
        PrintWriter pw = new PrintWriter(new FileOutputStream("c:/temp/testencodeApend.txt",true));

        ps.println("Hello from PrintStream");
        pw.println("Hello from PrintWriter");

        pw.close();
        ps.close();
    }
}
