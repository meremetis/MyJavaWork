package gr.aueb.elearn.chapter7;


import java.util.Scanner;

/**
 * anazita enan xaraktira pou dinei o xrisths kai emfanizei katalilo minima
 */
public class StringSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str ;

        System.out.println("dose ena alfarithmitiko");
        str = s.next();

        //anazitw ton xaraktira A

        //System.out.printf("o xaraktiras A %s periexete sto alfarithmitiko  \n", (str.contains("A"))? " " : "den");
        System.out.printf("%s", (str.contains("A")) ? (String.format("thesh: %d", str.indexOf('A')+1)) :"" );
        System.out.println();
        System.out.printf("%s", (str.contains("A")) ? (String.format("thesh: %d", str.indexOf('A')+1)) :"" );
    }
}
