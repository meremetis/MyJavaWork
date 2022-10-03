package gr.aueb.elearn.chapter8;

/**
 * • Παρατηρούμε
 * ότι η μέθοδος
 * κάνει catch το
 * exception και
 * μετά το κάνει
 * rethrow
 * εφόσον θέλει
 * η main να
 * δώσει μήνυμα
 * στον χρήστη
 */
public class ArithmeticExceptionDemoReThrow {


    public static void main(String[] args) {
        int result;

        try {
            result = div(5, 0);
        }catch (ArithmeticException e){
            System.out.println("invalid div by zero");
        }
    }



    public static int div (int a, int b) {
        try {
            return a/b;
        }catch (ArithmeticException e){
            System.out.println("tsiou");
            //e.printStackTrace();
            throw e;
        }
    }
}
