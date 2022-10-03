package gr.aueb.elearn.chapter6;

/**
 * anazita to elaxisto kai to megisto stixio enos pinaka
 */
public class ArraySearchMinMax {
    public static void main(String[] args) {
        int[] arr = {5, 3, 17, 8, 10};
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int minPosition = 0;
        int maxPosition = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minValue)
            {
                minValue = arr[i];
                minPosition = i;
            }
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxValue)
            {
                maxValue = arr[i];
                maxPosition = i;
            }
        }

        System.out.println("h elaxisth timh tou pinaka einai h : "+ minValue + " kai vriskete sthn thesh : "+(minPosition + 1) );


        System.out.println("h megisth timh tou pinaka einai h : "+ maxValue + " kai vriskete sthn thesh : "+(maxPosition + 1) );










    }
}
