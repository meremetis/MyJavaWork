package gr.aueb.testbed.week1.chapter3;

import java.util.Scanner;

public class Askish2 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("parakalw doste arithmo gia to menu apo to 1-4 kai 5 gia eksodo");
            num = in.nextInt();
            if (num == 5){
                System.out.println("Epileksate (5) Eksodos");
            }
            else if(num == 1){
                System.out.println("Epileksate (1) Eisagwgh");
            }
            else if(num == 2){
                System.out.println("Epileksate (2) Diagrfh");
            }
            else if(num == 3){
                System.out.println("Epileksate (3) Enhmerwsh");
            }
            else if(num == 4){
                System.out.println("Epileksate (4) Anazhthsh");
            }
            else {
                System.out.println("prepei na dosete enan arithmo apo to 1-4 h 5 gia eksodo");
            }

        }while(num != 5);
        System.out.println("euxaristume!");
    }
}
