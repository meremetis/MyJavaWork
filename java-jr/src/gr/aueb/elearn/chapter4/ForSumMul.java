package gr.aueb.elearn.chapter4;

/**
 * ypologogizei to athrisma - ginomeno ton prwtwn
 * 10 arithmwn
 */
public class ForSumMul {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i<=10;i++){
            sum+=i;
            System.out.println(sum);
        }

        System.out.println("---------------------------------");

        for (int i = 1; i<=10;i++){
            mul*=i;
            System.out.println(mul);
        }

        System.out.println("Athrisma prwtwn 10 arithmwn : "+sum);
        System.out.println("Ginomeno : " + mul );
    }
}
