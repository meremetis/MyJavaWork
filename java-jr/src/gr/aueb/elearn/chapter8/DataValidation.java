package gr.aueb.elearn.chapter8;

import java.util.Scanner;

public class DataValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strNum;
        int num;

        while (true){
            System.out.println("Parakalw doste enan arithmo");
            strNum = in.next();

            if (isInt(strNum))
            {
                num = Integer.parseInt(strNum);
                System.out.println("dosate ton arithmo : " +num);
                break;
            }
            else
            {
                System.out.println("den dosate akereo arithmo");
            }
        }
        System.out.println("bye!!");
    }

    public static boolean isInt(String s){
        try
        {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e)
        {

            //e.printStackTrace();
            return false;
        }
    }
}
