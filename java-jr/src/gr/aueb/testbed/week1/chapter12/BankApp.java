package gr.aueb.testbed.week1.chapter12;
import gr.aueb.testbed.week1.chapter12.OverfraftAccount;
import gr.aueb.elearn.chapter12.Account;

import java.io.FileNotFoundException;

public class BankApp {
    public static void main(String[] args) throws FileNotFoundException {




        OverfraftAccount p1 = new OverfraftAccount(1,"gr14","tsiou","nikos","4421",1000);

        p1.printAccountState();
        p1.widthdraw(2000,"4421");
        p1.printAccountState();
        System.out.println("-------------------------------------------------------------");
        Account p2 = new Account(3,"gr50","tsaaaa","sofia","4441",4000);
        p2.printAccountState();
        p2.widthdraw(500,"4441");
        p2.printAccountState();
        System.out.println("-------------------------------------------------------------");

        JointAccount x1 = JointAccount.getUser1();
        JointAccount x2 = JointAccount.getUser2();

        x1.printAccountState();
        x2.printAccountState();

        x1.deposit(500);
        x1.printAccountState();
        x2.printAccountState();
        x1.widthdraw(1000,"1345");
        x2.widthdraw(1000,"1345");

        x1.printAccountState();
        x2.printAccountState();



    }
}
