package gr.aueb.elearn.chapter5;

public class FibonacciRecursive {

    public static void main(String[] args) {
        int b =6;
        System.out.println("Fibonacci a = " + fibo(b));
    }


    public static int fibo(int b){
        //if (b < 0) return -1;
        if (b == 0) return 0;
        if (b == 1) return 1;
        return fibo(b-1)+fibo(b-2);
    }

}
