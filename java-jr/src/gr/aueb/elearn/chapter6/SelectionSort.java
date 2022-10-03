package gr.aueb.elearn.chapter6;

/**
 * taksinomei enan pinaka me thn methodo selection short
 */
public class SelectionSort {
    public static int[] arr = {2, 6, 9, 3, 1, 12};
    public static void main(String[] args)
    {
        int min;

        for (int i = 0 ; i < arr.length -1 ; i++){
            min = i;

            for (int j = i + 1 ; j < arr.length; j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j;
                }

            }
            swap(i, min);
        }
    }


    public static void swap(int i , int j)
    {
        int tmp = arr[i];
        arr [i] = arr[j];
        arr[j] = tmp;
    }


}
