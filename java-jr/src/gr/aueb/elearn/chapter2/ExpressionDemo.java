package gr.aueb.elearn.chapter2;

/**
 * dixnei thn xrish arithmitikwn telestwn
 * +, -, *, /, %, ++, --
 */
public class ExpressionDemo {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int sum = 0;

        sum = num1 + num2; //sum -> 3

        sum = sum + 1; //sum -> 4
        sum = num1++; // sum -> 1 , num1 ->2

        sum = ++num1; //  num->3 , sum -> 3

        sum += 5;// sum -> 8

        sum = ((num1 + num2) * 3) / ((num2 + 4) * 2);
    }
}
