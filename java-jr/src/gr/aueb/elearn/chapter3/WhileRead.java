package gr.aueb.elearn.chapter3;

import java.util.Scanner;

/**
 * diavazei apo thn input mexri na vrei theriko arithmo
 */
public class WhileRead {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("dose arithmo");
        num = in.nextInt();

        while(num < 0){
            System.out.println("htan arnitikos doste ki allo");
            num = in.nextInt();
        }
        System.out.println("dosate thetiko - o arithmos htan : " + num);
    }
}
