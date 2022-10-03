package gr.aueb.elearn.chapter4;

import java.io.IOException;

/**
 * diavazei xaraktira xaraktira mexri an vrei
 *
 */
public class CharRead {
    public static void main(String[] args) throws IOException {
        char ch;

        do
        {
            System.out.println("doste ena xaraktira");
            ch = (char) System.in.read();
            System.in.skip(2);
            System.out.println(ch);
        }
        while(ch != '!');

        System.out.println("antio");
    }
}
