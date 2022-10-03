package gr.aueb.elearn.chapter7;


/**
 * dimiourgei kai diasxizei , dhl ektiponei ena ena tus xaraktires enos string
 */
public class StringCreateAndTraverse {
    public static void main(String[] args) {
        String s1 = "This is AUEB";

        for (int i = 0; i < s1.length(); i ++)
        {
            System.out.print(s1.charAt(i));//emfanizei ena ena grama
        }

        System.out.println();

        for (int i = s1.length()-1; i >= 0 ; i --)
        {
            System.out.print(s1.charAt(i));//emfanizei ena ena grama
        }










    }
}
