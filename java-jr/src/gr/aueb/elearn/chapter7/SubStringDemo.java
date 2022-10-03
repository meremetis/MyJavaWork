package gr.aueb.elearn.chapter7;

/**
 * ektiponei ena string se morfh substring enos xaraktira th fora
 */
public class SubStringDemo {
    public static void main(String[] args) {
         String s = " this is a AUEB ";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i,i+1));
            System.out.println();
        }
        System.out.println(s.substring(2));
    }
}
