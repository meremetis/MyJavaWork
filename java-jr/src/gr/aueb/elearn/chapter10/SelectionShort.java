package gr.aueb.elearn.chapter10;

public class SelectionShort {
    public static void main(String[] args) {
        int[] marks = {3,5,1,8,9};

        selectionSort(marks);
        for (int mark : marks)
            System.out.println(mark + " " );
    }

    public static void selectionSort(int[] array)
    {
        int tmp, minPosition;

        for (int i = 0; i < array.length ; i++) {
            minPosition = i;
            for (int j = i ; j <array[minPosition] ; j++) {
                minPosition = j;
            }
            tmp = array[i];
            array[i] = array[minPosition];
            array[minPosition] = tmp;
        }


    }
}
