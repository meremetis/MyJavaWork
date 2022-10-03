package gr.aueb.elearn.chapter7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringRead2IO {
    public static void main(String[] args) throws FileNotFoundException {


        String s ;
        Scanner sc = new Scanner(new File("c:/meremeths/meremetis.txt"));

        System.out.println(sc.next());

        }
}
