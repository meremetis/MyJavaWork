package gr.aueb.testbed.week1.chapter10;

import gr.aueb.testbed.week1.chapter15.dto.AccountDTO;
import gr.aueb.testbed.week1.chapter15.model.Account;
import gr.aueb.testbed.week1.chapter15.service.exceptions.AccountAlreadyExistsException;
import gr.aueb.testbed.week1.chapter15.service.exceptions.AccountNotExistException;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * prwth thesh exei epwnimo , onoma, thlefono
 */
public class project2 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String[][] arr = new String[10][3];


//        insert(arr,"123","panos","mere");
//        print(arr);
//        System.out.println();
//        System.out.println("--------------------------");
//        insert(arr,"153","panos","mere");
//        print(arr);
//
//        upDate(arr,"123");
//        print(arr);
//        delete(arr,"153");
//        print(arr);
int choice = 0;

        do {
            printMenu();
            choice = getChoice();

            switch (choice) {
                case 1:
                    insert(arr,"222","fff","ggg");
                    break;
                case 2:
                    delete(arr,"222");
                    break;
                case 3:
                    upDate(arr,"222");
                    break;
                case 4:
                    print(arr);
                    break;
                case 5:
                    System.out.println("epileksate eksodo");
                    break;
                default:
                    System.out.println("epilekste metaksi 1-4");
                    break;
            }

        }while (choice != 5);
    }


    public static void  print(String[][] arr){
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println();
            for (int j = 0; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]);
            }

        }
    }

    public static void  insert(String[][] arr,String phone ,String name,String lname){
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length ; j++)
            {
                if(arr[i][2] == null && !isExist(arr,phone))
                {
                    arr[i][0] = name;
                    arr[i][1] = lname;
                    arr[i][2] = phone;
                }

            }
        }
    }

    public static  boolean isExist(String[][] arr, String phone)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length ; j++)
            {
                if (arr[i][2] == phone)return true;
            }
        }
        return false;
    }

    public static  void upDate(String[][] arr, String phone)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length ; j++)
            {
                if(isExist(arr,phone))
                {
                    Scanner in = new Scanner(System.in);
                    System.out.println("dose onoma");
                    arr[i][0] = in.nextLine();

                    System.out.println("dose epitheto");
                    arr[i][1] = in.nextLine();

                    System.out.println("dose arithmo");
                    arr[i][2] = in.nextLine();
                }
            }
        }

    }


    public static  void delete(String[][] arr, String phone)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length ; j++)
            {
                if(arr[i][2] == phone)
                {

                    arr[i][0] = null;
                    arr[i][1] = null;
                    arr[i][2] = null;
                    System.out.println();
                    System.out.println("deleted");
                }
            }
        }

    }
    public static int getChoice()
    {
        String s = in.next();
        if (isInt(s)) return Integer.parseInt(s);
        return -1;
    }
    private static boolean isInt(String s)
    {
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static void printMenu()
    {
        System.out.println("Epilekste ena apo ta parakatw!");
        System.out.println("1. Eisagogh epafhs");
        System.out.println("2. Diagrafh epafhs");
        System.out.println("3. Enhmerwsh epafhs");

        System.out.println("4. Ektiposh epafwn");
        System.out.println("5. Eksodos");
    }

}
