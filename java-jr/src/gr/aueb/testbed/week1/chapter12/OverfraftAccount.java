package gr.aueb.testbed.week1.chapter12;

import gr.aueb.elearn.chapter12.Account;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class OverfraftAccount extends Account {
    private double unlimitedBalance = super.getBalance();

    public OverfraftAccount() {

    }



    public OverfraftAccount(long id, String iban, String lastname, String firstname, String ssn, double balance) {
        super(id, iban, lastname, firstname, ssn, balance);

    }

    public boolean widthdraw(double amount, String ssn) throws FileNotFoundException {

        if (!isSsnValid(ssn))
        {
            printErrorMessage(System.err,"Error: Invalid SSN");
            printErrorMessage(new PrintStream(new FileOutputStream("log.txt",true)),"Severe Error: Invalid SSN");
            return false;
        }
        else {
            unlimitedBalance -= amount;
            System.out.println("Widthdraw Success !!");
            return true;
        }




//        if (amount <= super.getBalance())
//        {
//            super.setBalance(super.getBalance()-amount);
////            balance -= amount;
//            return true;
//        }
//        else {
//            printErrorMessage(System.err,"Error: Insufficient Amount");
//            printErrorMessage(new PrintStream(new FileOutputStream("log.txt",true)),"Warning: Insufficient Amount");
//            return false;
//        }
    }

    private boolean isSsnValid(String ssn)
    {
        if (ssn == null) return false;
        return super.getSsn().equals(ssn);
    }

    private void printErrorMessage (PrintStream ps, String s){
        if ((ps != null) && (s != null)){
            ps.println(s);
        }
    }
    public void printAccountState()
    {
        System.out.println("id: " + super.getId() + "\n" + "Firstname: " + super.getFirstname() + "\n"
                + "Lastname " + super.getLastname() + "\n" + "IBAN: " + super.getIban() + "\n"
                + "Ssn" + super.getSsn() + "\n" + "Balance " + unlimitedBalance );
    }
}
