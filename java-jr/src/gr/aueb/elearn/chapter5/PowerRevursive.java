package gr.aueb.elearn.chapter5;

public class PowerRevursive {
    public static void main(String[] args) {
        int a = 2, n = 4;
        System.out.println(power(a, n));
    }
    /**
     * ypologizei to a ^n me anadromh
     */
    public static int power(int a, int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else
        {
            return a * power(a , n-1);
        }
    }
}
