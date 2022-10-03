package gr.aueb.elearn.chapter8;

/**
 * epidikniei thn ArrayIndexOutOfBoundException
 */
public class ArrayIndexOOBExceptionDemo {
    public static void main(String[] args) {
        int[] grades = {1, 5, 9, 10};

        for (int i = 0; i <= grades.length ; i++) {
            System.out.print(grades[i]+" ");
        }
    }
}
