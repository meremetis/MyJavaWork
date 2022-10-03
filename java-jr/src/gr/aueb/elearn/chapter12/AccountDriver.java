package gr.aueb.elearn.chapter12;

import java.io.FileNotFoundException;

public class AccountDriver {

    public static void main(String[] args) throws FileNotFoundException {
        Account alice = new Account(1,"gr123","wonderland","alice","0454",102.30);

        if (alice.deposit(1000)){
            System.out.println("Succesful Deposit");
        }
        else
            System.out.println("Something went wrong");


        if (alice.widthdraw(500,"0454")){
            System.out.println("Succesful Withdrawal");
        }
        else
            System.out.println("Invalid Withdrawl: Something went wrong");

        if (alice.widthdraw(500,"0454")){
            System.out.println("Succesful Withdrawal");
        }
        else
            System.out.println("Invalid Withdrawl: Something went wrong");


        System.out.println("remaining balance: " + alice.getAccountBalance() + " Euros");
        System.out.println(alice.getAccountState());
        alice.printAccountState();
    }
}
