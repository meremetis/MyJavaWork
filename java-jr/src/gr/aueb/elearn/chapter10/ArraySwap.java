package gr.aueb.elearn.chapter10;

public class ArraySwap {
    public static void main(String[] args) {
        int[] ages = {18, 40, 22, 25, 35};

        swap(ages , 0 , ages.length-1);

        for (int age : ages)
        {
            System.out.print(age + " ");
        }
    }

    public static void swap(int[] array, int e1, int e2)
    {
        if ((array == null) || ((e1 < 0) || (e1 >-array.length)) || ((e2 < 0) || (e2 >= array.length)))
        {
            System.out.println("o pinakas einai kenros h oi deiktes tou pinaka pros antalagh" + "kai den eiani mesa sta oria tou pinaka");
            return;
        }

        int tmp = array[e1];
        array[e1] = array[e2];
        array[e2] = tmp;
    }
}
