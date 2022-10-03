package gr.aueb.elearn.chapter6;

/**
 * anazita kai antikathista ena stixio
 */
public class ArraySearchAndReplace {
    public static void main(String[] args) {
        boolean found=false;
        int[] arr= {5, 3, 1, 8, 8, 10};

        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] == 1){
                found = true;
                arr[i] = 20;

            }
        }

        for (int x : arr){
            System.out.println(x);
        }
        System.out.printf("%segine alagh", (found?"":"den "));
    }
}
