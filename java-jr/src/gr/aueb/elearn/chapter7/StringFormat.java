package gr.aueb.elearn.chapter7;

/**
 * morfopiei se string ena chat kai ena int
 */
public class StringFormat {
    public static void main(String[] args) {
        char ch = 'A';
        int a = 3;

        String s1 = String.format("%c%02d", ch ,a);
        String s2 = String.format("%c%2d", ch ,a);
        System.out.println(s1);
        System.out.println(s2);
    }
}
