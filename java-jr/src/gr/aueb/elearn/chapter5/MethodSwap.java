package gr.aueb.elearn.chapter5;

public class MethodSwap {
    public static void main(String[] args) {
        int x = 1;
        int y = 17;

        swap(x, y);

        System.out.printf(" x = %d, y = %d", x, y);
    }
    public static void swap(int x , int y)
    {
        int temp = x;

        x = y;
        y = temp;
    }
}
/**
 * den ginete na ginei auto me method by value
 */