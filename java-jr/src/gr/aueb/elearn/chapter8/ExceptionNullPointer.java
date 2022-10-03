package gr.aueb.elearn.chapter8;

/**
 * epidikniei null pointer exceptin
 * Όταν μία αναφορική μεταβλητή είναι null δηλ. δεν
 * έχει τιμή, τότε δεν μπορούμε να καλέσουμε
 * μεθόδους όπως length(), charAt(), equals(),
 *
 */
public class ExceptionNullPointer {
    public static void main(String[] args) {
        String s = null;
        int len = s.length();
        System.out.println(len);
    }
}
