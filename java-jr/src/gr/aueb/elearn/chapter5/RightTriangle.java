package gr.aueb.elearn.chapter5;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * elenxos ean ena trigono einai orthogonio
 */
public class RightTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        boolean isRight;
        final double EPSILON = 0.005;


        System.out.println("doste mikos 3on pleurwn a - b - c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        //elenxos ean einai orthogonio - orthogonio einai ean a^2 = b^2 + c^2.
        System.out.printf("%.4f %.4f %.4f %n", a*a, b*b, c*c);
        isRight = (Math.abs(a*a - b*b - c*c) <= EPSILON);

        System.out.printf("%n"+isRight);
    }
}
