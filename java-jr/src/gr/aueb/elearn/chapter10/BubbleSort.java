package gr.aueb.elearn.chapter10;

public class BubbleSort {

    public static void main(String[] args) {
        int[] marks = {3, 5, 1, 8, 11, 9};

        bubbleSort(marks);

        for (int mark : marks ){
            System.out.println(mark + " ");
        }
    }

    public static void bubbleSort(int[] array)
    {
        int tmp;

        for (int i = array.length -1; i >0 ; i--) {
            for (int j = 0; j <=i -1 ; j++) {
                if (array[j] > array[j+1]){
                        tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                }
            }
        }


    }
}
