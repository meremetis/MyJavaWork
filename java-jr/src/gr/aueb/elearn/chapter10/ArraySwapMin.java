package gr.aueb.elearn.chapter10;

public class ArraySwapMin {
    public static void main(String[] args) {
        int[] ages = {50, 44, 18, 25, 30};

        ArraySwap.swap(ages, 0, arrayMin(ages));

        for ( int age : ages){
            System.out.println(age + " ");
        }
    }


    public static int arrayMin(int[] array)
    {
        int minPosition = 0;

        for (int i = 1; i < array.length ; i++) {
            if (array[i] < array[minPosition])
            {
                minPosition = i;
            }
        }
        return minPosition;
    }


}
