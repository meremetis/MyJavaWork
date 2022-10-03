package gr.aueb.elearn.chapter10;

public class BinarySearch {

    public static void main(String[] args) {
        int[] ages = {3, 18, 40, 50, 64, 74};
        int n = binarySearch(ages, 3, 0 , ages.length-1);
    }




    public static int binarySearch(int[] array, int value, int low , int high)
    {
        if (high < low) return -1; //not found

        int median = high + low /2;

        if (value == array[median]) return median ; //found


        if (value < array[median])
        {
            return binarySearch(array, value, low, median -1);
        }
        else
        {
            return binarySearch(array,value,median+1,high);
        }
    }
}
