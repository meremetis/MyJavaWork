package gr.aueb.elearn.chapter10;

import java.io.IOException;

public class PalindromeSB {
    public static void main(String[] args) {


        StringBuilder sentence = new StringBuilder();
        char ch;
        boolean isPal;

        try
        {
            System.out.println("dwste mia protash pros elenxo an einai palindromikh");
            do {
                ch = (char) System.in.read();
                if ((ch >= 'A') && (ch <='Z'))
                {
                    sentence.append(ch) ;
                }
            }while ((ch != '.') );

            isPal = isPalindrome(sentence);
            System.out.printf("h protash einai palidromikh", (isPal) ? "" : "den");
        }catch (IOException e){
            System.out.println("sfalma io");
        }

    }

    public static boolean isPalindrome(StringBuilder sentense)
    {
        int i , j ;
        boolean isPal = true;

        if (sentense == null)
        {
            return false;
        }

        i=0;
        j=sentense.length()-1;
        while ((i < j) && (isPal)) {
            if (sentense.charAt(i++) != sentense.charAt(j--)){
                isPal = false;
            }
        }
        return isPal;
    }
}

