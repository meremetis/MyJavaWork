package gr.aueb.testbed.week1.chapter6;

public class askish6Try2
{

    public static void main(String[] args)
    {
        int[] arr = {2, 6, 9, 3, 1, 12};
        int minValue = Integer.MAX_VALUE;
        int minPosition = 0;

        int secondMinValue = Integer.MAX_VALUE;
        int secondMinPosition = 0;


        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < minValue)
            {
                minValue = arr[i];
                minPosition = i;
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            if ((arr[i] < secondMinValue) && (arr[i] > minValue ) )
            {
                secondMinValue = arr[i];
                secondMinPosition = i;
            }
        }
        System.out.println("Proth elaxisth timh : "+ minValue+ " sthn thesh : "+(minPosition + 1) );
        System.out.println("Deuterh elaxisth timh : "+ secondMinValue+ " sthn thesh : "+(secondMinPosition + 1) );

    }
}
