package gr.aueb.elearn.chapter10;

public class ArraySecondMin1 {
    public static void main(String[] args) {
        int[]marks = {14,13};
        int secondMinPosition = arraySecondMin(marks);

        System.out.printf("secind min value %d & second min position = %d", marks[secondMinPosition],secondMinPosition);
    }

    public static int arraySecondMin(int[] array)
    {
        int minPosition = 0, secondMinPosition = 0;

        if ((array == null) || (array.length < 2))
        {
            System.out.println("to megethos tou pinaka prepi na einai tulaxiston 2");
            System.exit(1);
        }
//vriskoume to min position
        for (int i = 1; i < array.length ; i++) {
            if ((array[i]) < array[minPosition])
            {
                minPosition = i;
            }
        }

        if (minPosition == 0) secondMinPosition =1;
//
        for (int i = 1; i < array.length ; i++) {
            if (i == minPosition) continue;
            if ((array[i]) < array[secondMinPosition])
            {
                secondMinPosition = i;
            }
        }

        return secondMinPosition;


    }
}
