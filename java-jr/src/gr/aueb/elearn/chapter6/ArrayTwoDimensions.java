package gr.aueb.elearn.chapter6;

public class ArrayTwoDimensions {

    public static void main(String[] args) {
       int[][] a1 = new int[2][2];
        a1[0][0] = 1 ;
        a1[0][1] = 2 ;
        a1[1][0] = 3 ;
        a1[1][1] = 4 ;

        int[][] a2 = {
                {0, 1},
                {2, 3},
                {4 ,5},
                {6, 7}
        };

        int[][] a3= new int[2][];

        a3[0] = new int[2];
        a3[1] = new int[3];

        //emdanish me for emfoleuemenes

        for (int i = 0 ; i < a2.length; i++)
        {
            for (int j = 0 ; j < a2[i].length; j++)
            {
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //emdanish me for each kai for emfoleumenh
        for (int[] row : a2){
            for (int i = 0; i < row.length; i++){
                System.out.print(row[i]+" ");
            }
            System.out.println();
        }

        //emdanish me for each emfoleumenes
        System.out.println();
        for (int[] row : a2){
            for (int column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        }


    }
}
