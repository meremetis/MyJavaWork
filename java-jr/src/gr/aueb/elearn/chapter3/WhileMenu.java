package gr.aueb.elearn.chapter3;

import java.util.Scanner;

/**
 * ilopoiei ena menu, opou o xrhsts epilegei ena arithmo kai
 * lamvanei feedback. to 0 einai eksodos, giafto to do - while ektelite oso to num einai diaforo to 0
 */
public class WhileMenu {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("parakalw doste arithmo gia to menu apo to 1-3 kai 0 gia eksodo");
            num = in.nextInt();
            if (num == 0){
                System.out.println("dosate 0 eksodos");
            }
            else if(num == 1){
                System.out.println("dosate 1 ");
            }
            else if(num == 2){
                System.out.println("dosate 2 ");
            }
            else if(num == 3){
                System.out.println("dosate 3 ");
            }
            else {
                System.out.println("prepei na dosete enan arithmo apo to 1-3 h 0 gia eksodo");
            }

        }while(num != 0);

        System.out.println("euxaristume gia sas");
    }

}
