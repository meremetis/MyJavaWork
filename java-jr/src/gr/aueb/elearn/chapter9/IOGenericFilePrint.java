package gr.aueb.elearn.chapter9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class IOGenericFilePrint {



    public static void main(String[] args) {

        try {
            PrintStream ps = new PrintStream(new FileOutputStream("c:/temp/allTESt1.txt",true),true,"UTF-8");
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream
                    ("c:/temp/allTESt2.txt",true), StandardCharsets.UTF_8),true);

            ps.printf(Locale.US,"%.2fn", 9.45);

            pw.printf(Locale.getDefault(), "%.2fn", 9.45);

            ps.close();
            pw.close();

        }catch (FileNotFoundException e){
            System.out.println("den vrethike arxio");
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }



    }
}
