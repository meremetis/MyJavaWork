package gr.aueb.testbed.week1.chapter6.myCode;

public class Array2dD {
    public static void main(String[] args) {
       int[][] arr1 = new int[2][2];

       int[][] arr2 = {
               {1,2},
               {3,4},
               {5,6},
               {3,3},

       };

        int[][] arr3 = new int[2][];
        arr3[0] = new int [2];
        arr3[1] = new int [1];



//        for (int i = 0 ; i < arr2.length;i++){
//            for (int j = 0 ; j < arr2[i].length;j++){
//                System.out.println(arr2[i][j]);
//            }
//        }

//         for(int[] row : arr2){
//             for (int i = 0; i < row.length ; i++){
//                 System.out.print(row[i]+" ");
//             }
//             System.out.println();
//         }

        for ( int[] row : arr2){
            for(int col: row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
