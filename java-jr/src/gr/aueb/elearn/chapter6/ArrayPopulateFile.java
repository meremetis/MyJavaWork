package gr.aueb.elearn.chapter6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * arxikopiei ton pinaka diavazodas apo ena arxio
 */
public class ArrayPopulateFile {
    public static void main(String[] args) throws FileNotFoundException {
        int[] arr = new int[5];
        File fl1 = new File("c:/meremeths/myFileName.txt");
        Scanner in = new Scanner(fl1);

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int x : arr){
            System.out.println(x);
        }


    }
}
