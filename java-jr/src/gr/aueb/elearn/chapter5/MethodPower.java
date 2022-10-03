package gr.aueb.elearn.chapter5;

import java.util.Scanner;

/**
 * orizei thn methodo se dunamh
 * upologizei a^n
 * elenxei me thn main thn liturgia ths methodou
 */
public class MethodPower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a  ,n, power ;

        System.out.println("doste 2 akereous");
        a = in.nextInt();
        n = in.nextInt();

        power = pow(a,n);//pragmatikes parametroi

        System.out.println("h dunamh tou " +  a  + " sthn " + n  +  " : " +power );
    }

    /**
     * vriskei thn ipsosh se dunamh
     * @param a h bash
     * @param n h ipsosh se dunamh
     * @return a^n
     */
    public static int pow(int a, int n){//tipikes paramametroi
        int power = 1;
        for (int i = 1; i <= n; i++){
            power *= a;
        }
        return power;

    }
}
