package gr.aueb.testbed.week1.chapter7;

import java.util.Scanner;

public class Ergasia
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input;
        System.out.println("grapse kati gia coding");
        input = in.next();
        String coded="";
        String decoded="";

        /*--kodikas kriptografishs--
           for (int i = 0; i < s1.length(); i ++)
            {
                System.out.print(s1.charAt(i));//emfanizei ena ena grama
                coded +=  (char)(s1.charAt(i)+1);//grafei se ena string 1 - 1 ta gramata me kodikopiish +1
            }
        */

        /* --kodikas apokriptografishs--
            for (int i = 0; i < coded.length(); i ++){
                decoded +=  (char)(coded.charAt(i)-1);
                // System.out.print(s1.charAt(i));
            }
        */

        coded = getEncryption(input);
        decoded = getDeciphering(coded);
        System.out.println();
        System.out.println(input);
        for (int i = 0; i < input.length(); i ++)
        {
            System.out.print((int)input.charAt(i)+"-");//emfanizei ena ena grama
        }
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Coded------->"+coded);
        System.out.println("Decoded ---->"+decoded);
    }


    /**method to encrypt String
     *
     * @param input string pros kritpografish
     * @return Ecrypted data (char)+1
     */
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

    /**Method to Encrypt data
     *
     * @param enrypted encrypted string ascii +1 to be Deciphered
     * @return Deciphered data (char)-1
     */
    public static String getDeciphering(String enrypted)
    {
        String decoded="";
        for (int i = 0; i < enrypted.length(); i ++)
        {
            //System.out.print(enrypted.charAt(i));//emfanizei ena ena grama
            decoded +=  (char)(enrypted.charAt(i)-1);//grafei se ena string 1 - 1 ta gramata me kodikopiish +1
        }
        return decoded;
    }
}
