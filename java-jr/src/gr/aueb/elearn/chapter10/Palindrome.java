package gr.aueb.elearn.chapter10;

import java.io.IOException;

public class Palindrome {

    public static void main(String[] args) {

        final int LEN = 100;
        int high = 0;
        char[] sentence = new char[LEN];
        char ch;
        boolean isPal;

        try
        {
            System.out.println("dwste mia protash pros elenxo an einai palindromikh");
            do {
                ch = (char) System.in.read();
                if ((ch >= 'A') && (ch <='Z'))
                {
                    sentence[high++] = ch;
                }
            }while ((ch != '.') && (high < LEN));

            isPal = isPalindrome(sentence, 0 , high-1);
            System.out.printf("h protash einai palidromikh", (isPal) ? "" : "den");
        }catch (IOException e){
            System.out.println("sfalma io");
        }

    }

































    public static boolean isPalindrome(char[] sentense, int low, int high)
    {
        int i = low, j = high;
        boolean isPal = true;

        if (sentense == null)
        {
            return false;
        }

        while ((i < j) && (isPal)) {
           if (sentense[i++] != sentense[j--]){
                   isPal = false;
            }
        }
        return isPal;
    }
}

