package gr.aueb.elearn.chapter7;

import java.util.Scanner;

public class StringCopyConcatEquals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1, s2;//edw to s1 kai to s2 einai null

        System.out.println("dose ena alfarithmitko");
        s1 = in.next();

        /**
         * apo katw antigrafume to dixti s1 sto s2
         * epomenos kai to s2 dixnei sto idio string sto heap
         */

        s2 = s1;

        /**
         * parakatw sunenonoume ta s1 kai s2 kai eksoroume sto s2
         * to s2 pavei na dixnei sto proigumeno string kai dimourgite nero string me thn nea sunenomenh timh
         * to s1 eksakoluthei kai dixnei sto aueb
         */
        s2 = s1 + s2;

        /**
         * parakatw sigrinoume me thn equals
         * arxika elenxoume gia null giati at to s1 einai null tha dimourgithei sfalma
         * kata thn klish ths s1.equals();
         */

        System.out.println("s1 = " +s1+" s2 = " + s2);
        if((s1 != null) && (s1.equals(s2))){
            System.out.println("einai isa");
        }
        else
            System.out.println("den einai isa");
    }
}
