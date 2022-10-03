package gr.aueb.elearn.chapter4;

import java.io.IOException;
import java.util.Scanner;

/**
 * ylopoiei enan aplo upologisth tsephs pou kanei prosthesh,
 * aferesh, pollaplasiasmo, diairesh kai mod (ypolipo)
 */
public class Calculator {
    public static void main(String[] args) throws IOException {
        //dilosh arx
        Scanner in = new Scanner(System.in);
        int num1, num2, result;
        char ch;

        System.out.println("dose 2 arithmous kai simvolo prakshs");
        num1 = in.nextInt();
        ch = (char)System.in.read();
        num2 = in.nextInt();

        switch (ch){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num2 % num2;
                break;
            default:
                result = 0;
                break;
        }
        System.out.println("apotelesma : " +result);

    }
}
