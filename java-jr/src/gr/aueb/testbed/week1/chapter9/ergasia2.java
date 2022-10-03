package gr.aueb.testbed.week1.chapter9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class ergasia2
{

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("c:/temp/grades.txt"));
        PrintStream ps = new PrintStream("c:/temp/gradesout.txt");
        PrintStream psLogs = new PrintStream("c:/temp/LogfileError.txt");

        String[] files = new String[16];
        String token;


        int counterMine = 0;

        while (sc.hasNext())
        {
            token = sc.next();
            files[counterMine] = token;
            counterMine ++;
        }

//        for (String a : files){
//            System.out.print(a);
//        }

        for (int i = 0; i <5 ; i++)
        {
            if ( i == 0)
            {
                if (((Integer.parseInt(files[i+2])<0 ) || (Integer.parseInt(files[i+2])>10 )))
                {
                    psLogs.println("Error at grade + " +files[i+2] + " of student " + files[i] + " "+files[i+1]);
                }
                if (((Integer.parseInt(files[i+3])<0 ) || (Integer.parseInt(files[i+3])>10 )))
                {
                    psLogs.println("Error at grade + " +files[i+3]+ " of student " + files[i] + " "+files[i+1]);
                }
                ps.println("Onoma "+files[i] + " epitheto "+files[i+1]+ "vathmos1: "+files[i+2]+ " vathmos2 "+files[i+3] + " mo: " + ((double)(Integer.parseInt(files[i+2])+Integer.parseInt(files[i+3]))/2)+"\n");
            }
           else if (i == 1)
           {
               if (((Integer.parseInt(files[i+5])<0 ) || (Integer.parseInt(files[i+5])>10 )))
               {
                   psLogs.println("Error at grade + " +files[i+5]+" of student " + files[i+3] + " "+files[i+4] );
               }
               if (((Integer.parseInt(files[i+6])<0 ) || (Integer.parseInt(files[i+6])>10 )))
               {
                   psLogs.println("Error at grade + " +files[i+6]+" of student " + files[i+3] + " "+files[i+4]);
               }
               ps.println("Onoma "+files[i+3] + " epitheto "+files[i+4]+ "vathmos1: "+files[i+5]+ " vathmos2 "+files[i+6] + " mo: " + ((double)(Integer.parseInt(files[i+5])+Integer.parseInt(files[i+5]))/2)+"\n");
           }
            else if (i == 2)
            {
                if (((Integer.parseInt(files[i+8])<0 ) || (Integer.parseInt(files[i+8])>10 )))
                {
                    psLogs.println("Error at grade + " +files[i+8]+" of student " + files[i+6] + " "+files[i+7] );
                }
                if (((Integer.parseInt(files[i+9])<0 ) || (Integer.parseInt(files[i+9])>10 )))
                {
                    psLogs.println("Error at grade + " +files[i+9]+" of student " + files[i+6] + " "+files[i+7]);
                }
                ps.println("Onoma "+files[i+6] + " epitheto "+files[i+7]+ "vathmos1: "+files[i+8]+ " vathmos2 "+files[i+9] + " mo: " + ((double)(Integer.parseInt(files[i+8])+Integer.parseInt(files[i+9]))/2)+"\n");
            }
            else if (i == 3)
            {
                if (((Integer.parseInt(files[i+11])<0 ) || (Integer.parseInt(files[i+11])>10 )))
                {
                    psLogs.println("Error at grade + " +files[i+11]+" of student " + files[i+9] + " "+files[i+10] );
                }
                if (((Integer.parseInt(files[i+12])<0 ) || (Integer.parseInt(files[i+12])>10 )))
                {
                    psLogs.println("Error at grade + " +files[i+12]+" of student " + files[i+9] + " "+files[i+10]);
                }
                ps.println("Onoma "+files[i+9] + " epitheto "+files[i+10]+ "vathmos1: "+files[i+11]+ " vathmos2 "+files[i+12] + " mo: " + ((double)(Integer.parseInt(files[i+11])+Integer.parseInt(files[i+12]))/2)+"\n");
            }
        }



        sc.close();
        ps.close();

    }

        public static boolean inInt(String s)
        {
            try
            {
                Integer.parseInt(s);
                return true;
            }
            catch (NumberFormatException e)
            {
                return false;
            }
        }
}
