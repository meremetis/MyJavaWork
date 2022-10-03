package gr.aueb.elearn.chapter10;

public class SelectionSort2 {
    public static void main(String[] args) {
        int[] marks = {3,5,1,8,9};

        selectionSort(marks);
        for (int mark : marks)
            System.out.println(mark + " " );
    }

    public static void selectionSort(int[] array)
    {
        int minPosition;

        for (int i = 0; i < array.length ; i++) {
            minPosition = arrayMin(array, i, array.length-1);

            ArraySwap.swap(array,i,minPosition);
        }
    }

    public static int arrayMin(int[] array, int low, int high)
    {
        int minPosition = low;

        for (int i = low + 1 ; i <= high ; i++) {
            if (array[i] < array[minPosition]){
                minPosition =1;
            }
        }
        return minPosition;
    }

}
