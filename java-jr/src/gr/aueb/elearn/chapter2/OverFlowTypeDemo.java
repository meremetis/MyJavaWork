package gr.aueb.elearn.chapter2;

import java.util.Locale;

public class OverFlowTypeDemo {
    public static void main(String[] args) {
        long num = 2_147_483_648L;
        int i = 20;
        long myLong = 40;

        i = (int) myLong;

        long result = myLong + 3;//emesh alagh tipou se long apo int

        System.out.println(result);
        System.out.printf("to apotelesma einai  : %06d \n" , result );
        System.out.printf(Locale.US,"to apotelesma einai %,d" , result);
    }
}
