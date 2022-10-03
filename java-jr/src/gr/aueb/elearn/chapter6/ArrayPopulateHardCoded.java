package gr.aueb.elearn.chapter6;

/**
 * dimiurgei enan pinaka me (new)
 * kai ton arxikopiei mesa ston pinaka
 */
public class ArrayPopulateHardCoded {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 19;
        arr[1] = 20;
        arr[2] = 23;
        arr[3] = 22;
        arr[4] = 30;

        // print the array Elements
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
