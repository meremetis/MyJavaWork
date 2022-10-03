package gr.aueb.elearn.chapter5;

public class DoubleOperands {
    public static void main(String[] args) {
        double num1 = 12.5;
        double num2 = 2.0;

        double result = num1 / num2;
        double remain = num1 % num2;

        //expected result = 2.25, remain = 0.5

        System.out.println(result + " : " + remain);
    }
}
