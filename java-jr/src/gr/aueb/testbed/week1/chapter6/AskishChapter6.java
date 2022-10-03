package gr.aueb.testbed.week1.chapter6;

public class AskishChapter6 {

    public static int[] arr2 = {2, 6, 9, 3, 1, 12};
    public static int[] arr = {2, 6, 9, 3, 1, 12};
    public static void main(String[] args)
    {
        boolean breakPoint=false;
        int min;
        int deuterhTheshElaxisthsTimhsPinaka = 0;
        int theshDeuterhsTimhs =0;

        for (int i = 0 ; i < arr.length -1 ; i++){
            min = i;

            for (int j = i + 1 ; j < arr.length; j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j;
                }
                if ((i == 1) && (j == arr.length -1) ){
                    deuterhTheshElaxisthsTimhsPinaka = min;
                    breakPoint = true;
                    break;
                }
            }
            if(breakPoint){
                break;
            }

            swap(i, min);
        }

        System.out.println("deuterh mikroterh stixio : " +arr[deuterhTheshElaxisthsTimhsPinaka] );

        //vriskw thn thesh sigrinodas tus 2 pinakes
        for (int i = 0; i < arr2.length; i++){
            if (arr2[i] == arr[deuterhTheshElaxisthsTimhsPinaka] ){
                theshDeuterhsTimhs = i;
            }
        }
        System.out.println("deuterh mikroterh stixio sthn thesh : " + theshDeuterhsTimhs );
    }


    public static void swap(int i , int j)
    {
        int tmp = arr[i];
        arr [i] = arr[j];
        arr[j] = tmp;
    }

}
