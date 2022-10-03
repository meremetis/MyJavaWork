package gr.aueb.elearn.chapter5;

import java.util.Scanner;

/**
 * orizei methodus pou elenxoun ean enas arithmos einai artios h peritos
 */
public class EvenOrodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("parakalw doste akereo arithmo");
        num = in.nextInt();

        if(isEven(num)){
            System.out.println("o arithmos " + num +" einai artios");
        }

        if(isOdd(num)){
            System.out.println("o arithmos " + num +" einai peritos");
        }

    }

    /**
     * elencei an enas arithmos einai artios/zugos
     * @param a o arithmos pou elenxoume
     * @return true ean o arithmos einai artios, alios false
     */
    public static boolean isEven(int a){
        return ((a % 2) == 0);
    }

    /**
     * elencei an enas arithmos einai peritos/monos
     * @param a o arithmos pou elenxoume
     * @return true ean o arithmos einai peritos, alios false
     */
    public static boolean isOdd(int a){
        return ((a % 2) != 0);
    }
}
