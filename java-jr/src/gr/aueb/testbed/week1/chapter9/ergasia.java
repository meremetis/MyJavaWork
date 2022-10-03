package gr.aueb.testbed.week1.chapter9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Locale;

public class ergasia {
    public static void main(String[] args) {

        try(
                BufferedReader br = new BufferedReader(new FileReader("c/temp/grades.txt"));
                PrintStream ps = new PrintStream("c/temp/gradesOut.txt");
                PrintStream psLog = new PrintStream("c/temp/Log.txt");


        )
        {
            String line , firstName, lastName;

            int lineNumber = 0 , grade1 = 0, grade2 = 0;
            String[] tokens;
            double average = 0;

            while ((line = br.readLine()) !=null){
                lineNumber++;

                tokens = line.split(" +");
                firstName = tokens[0];
                lastName = tokens[1];
                if (isInt(tokens[2])) grade1 = Integer.parseInt(tokens[2]);
                if (isInt(tokens[3])) grade2 = Integer.parseInt(tokens[3]);

                average = (grade1 + grade2) / 2.0;

                if (((grade1 < 0) || (grade1 > 10) )  || ((grade2 < 0) || (grade2>10))){
                    psLog.println("Error in line" + lineNumber);
                }else {
                    ps.printf(Locale.US, "%s %s %.2f%n" , firstName, lastName, average);
                }
            }

            System.out.printf("Operations completed");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
    public static boolean isInt(String s){
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
