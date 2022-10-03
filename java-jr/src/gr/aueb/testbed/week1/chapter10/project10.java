package gr.aueb.testbed.week1.chapter10;

public class project10 {

    public static void main(String[] args)
    {
        boolean[][] arr = new boolean[30][12];

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println();
            for (int j = 0; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        book('C',4,arr);

         print(arr);
        book('C',4,arr);
        cancel('C',4,arr);

    }
//kanei book mia thesh ean den einai idi kratimenh
    public static void book(char column,int row,boolean[][] arr)
    {
        int stilh = -1;

        if (column == 'A') stilh =0 ;
        if (column == 'B') stilh =1 ;
        if (column == 'C') stilh =2 ;
        if (column == 'D') stilh =3 ;
        if (column == 'E') stilh =4 ;
        if (column == 'F') stilh =5 ;
        if (column == 'G') stilh =6 ;
        if (column == 'H') stilh =7 ;
        if (column == 'K') stilh =8 ;
        if (column == 'L') stilh =9 ;
        if (column == 'M') stilh =10 ;
        if (column == 'N') stilh =11 ;

        System.out.println(arr[row-1][stilh]);
        if (!arr[row-1][stilh])
        {
            arr[row-1][stilh] = true;
        }
        else
        {
            System.out.println("htan kratimeno");
        }


        System.out.println(arr[row-1][stilh]);
    }


    //akironei thn kratish mia theshs an einai idi kratimenh
    public static void cancel(char column,int row,boolean[][] arr)
    {
        int stilh = -1;

        if (column == 'A') stilh =0 ;
        if (column == 'B') stilh =1 ;
        if (column == 'C') stilh =2 ;
        if (column == 'D') stilh =3 ;
        if (column == 'E') stilh =4 ;
        if (column == 'F') stilh =5 ;
        if (column == 'G') stilh =6 ;
        if (column == 'H') stilh =7 ;
        if (column == 'K') stilh =8 ;
        if (column == 'L') stilh =9 ;
        if (column == 'M') stilh =10 ;
        if (column == 'N') stilh =11 ;

        System.out.println(arr[row-1][stilh]);
        if (arr[row-1][stilh])
        {
            arr[row-1][stilh] = false;
            System.out.println("egine akirosh kratishs");
        }
        else System.out.println("den iparxei kratish");


        System.out.println(arr[row-1][stilh]);
    }

    public static void print(boolean[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println();
            for (int j = 0; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void printMenu()
    {
        System.out.println("Epilekste ena apo ta parakatw!");
        System.out.println("1. Eisagogh epafhs");
        System.out.println("2. Diagrafh epafhs");
        System.out.println("3. Enhmerwsh epafhs");
        System.out.println("4. Anazitish epafhs me kodiko");
        System.out.println("5. Deposit se account");
        System.out.println("6. withdrow apo account");
        System.out.println("7. Ektiposh epafwn");
        System.out.println("8. Eksodos");
    }
}
