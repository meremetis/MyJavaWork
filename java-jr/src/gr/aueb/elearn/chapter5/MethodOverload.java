package gr.aueb.elearn.chapter5;

public class MethodOverload {
    public static void main(String[] args) {
        int a = 5, b = 15;

        int sum1, sum3;
        long sum2, sum4;

        sum1 = add(1, 2);
        sum2 = add(1L, 2L);
        sum3 = add(1, 2, 12);
        sum4 = add(1, 2, 12L);

        System.out.println(sum1 + " " + sum2 + " " + sum3 + " " + sum4);
    }
    public static int add(int a, int b)
        /*pografh (signature)  methodou einai  το όνομά της μαζί με τις τυπικές
    της παραμέτρους.*/
    {
        return a + b;
    }

    public static long add(long a, long b)
    {
        return a + b;
    }

    public static int add(int a, int b, int c)
    {
        return a + b + c;
    }

    public static long add(int a, int b, long c)
    {
        return a + b + c;
    }


}
