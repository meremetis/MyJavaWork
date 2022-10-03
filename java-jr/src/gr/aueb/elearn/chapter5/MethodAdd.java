package gr.aueb.elearn.chapter5;

/**
 * ipologismos 2 akerewn me xrish methodwn
 */
public class MethodAdd {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum;

        sum =  add(num1, num2);
        System.out.println(MethodAdd.add(5,7));

        System.out.println(sum);
    }

    /**
     * adds 2 intigers
     *
     * @param num1
     * @param num2
     * @return the sum of 2 values
     */
    public static int add(int num1, int num2){
        return num1 + num2;
    }
}
