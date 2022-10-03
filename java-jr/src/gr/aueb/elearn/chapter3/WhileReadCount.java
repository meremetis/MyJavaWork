package gr.aueb.elearn.chapter3;

import java.util.Scanner;

/**
 * diavazei apo input mexri na vrei thetiko arithmo
 * metraei to plithos ton arnitikwn arithmwn
 */
public class WhileReadCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int count = 0;

        System.out.println("dose arithmo");
        num = in.nextInt();

        while(num < 0){
            count++;
            System.out.println("htan arnitikos doste ki allo");
            num = in.nextInt();

        }
        System.out.println("dosate thetiko - o arithmos htan : " + num + " arnitikoi : "+ count);
    }
}
