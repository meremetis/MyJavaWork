package gr.aueb.testbed.week1.chapter10;

import java.util.Scanner;

public class kriptografish {
    static  final int XX = 2;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        System.out.println("grapse kati gia coding");
        input = in.next();
        String coded="";
        String coded2="";


        coded = getEncryption(input);
        coded2 = getEncryption2(input);



        for (int i = 0; i < input.length(); i ++)
        {
            System.out.print((int)input.charAt(i)+"/");//emfanizei ena ena grama
        }
        System.out.println();
        System.out.println("Coded------->"+coded);
        System.out.println("Code2------->"+coded2);



    }

    public static String getEncryption( String input)
    {
        String coded="";

            for (int i = 0; i < input.length(); i ++)
            {
                //System.out.print(input.charAt(i));//emfanizei ena ena grama
                coded +=  (char)(input.charAt(i)+1);//grafei se ena string 1 - 1 ta gramata me kodikopiish +1
            }
        return coded;
    }
    public static String getEncryption2( String input)
    {
        String coded2="";

        for (int i = 0; i < input.length(); i ++)
        {
            if (i == 0){
                coded2 +=   (input.charAt(i)+(int)input.charAt(i));//grafei se ena string 1 - 1 ta gramata me kodikopiish +1
            }

            if ( i > 0 &&  i < input.length()-1)
            {
                coded2 +=   ((input.charAt(i)+(int)input.charAt(i-1) % XX));
            }





//            if (i > 0 &&  i < input.length()-1 ) {
//                coded2 +=  (char) ((input.charAt(i)+((int)input.charAt(i-1))) % XX);
//            }
//            if (((char)input.charAt(input.length()-1) == '#')){
//                coded2 +=  -1;
//            }

        }
        return coded2;
    }
}
