package gr.aueb.testbed.week1.chapter12;

import gr.aueb.elearn.chapter12.Account;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class JointAccount extends Account {
     double balance=5000;

    private long id = 30;
    private String iban ="gr45";
    private String lastname="zeugari";
    private String firstname="maria-nikos";
    private String ssn="1345";



    private static final JointAccount USER1 = new JointAccount();
    private static final JointAccount USER2 = USER1;

    public static JointAccount getUser1(){
        return USER1;
    }
    public static JointAccount getUser2(){
        return USER2;
    }





    public boolean widthdraw(double amount, String ssn) throws FileNotFoundException {

        if (!isSsnValid(ssn)   )
        {
            printErrorMessage(System.err,"Error: Invalid SSN");
            printErrorMessage(new PrintStream(new FileOutputStream("log.txt",true)),"Severe Error: Invalid SSN");
            return false;
        }



        if (amount <= balance)
        {

            balance -= amount;
            return true;
        }
        else {
            printErrorMessage(System.err,"Error: Insufficient Amount");
            printErrorMessage(new PrintStream(new FileOutputStream("log.txt",true)),"Warning: Insufficient Amount");
           return false;
       }


    }



    public boolean deposit(double amount) throws FileNotFoundException {
        if (amount > 0)
        {
            balance += amount;
            return true;
        }
        else {
            printErrorMessage(System.err,"Error: Negative Amount");
            printErrorMessage(new PrintStream(new FileOutputStream("log.txt",true)),"Warning: Negative Amount");
            return false;
        }
    }










    private boolean isSsnValid(String ssn)
    {
        if (ssn == null) return false;
        return this.ssn.equals(ssn);
    }

    private void printErrorMessage (PrintStream ps, String s){
        if ((ps != null) && (s != null)){
            ps.println(s);
        }
    }
    public void printAccountState()
    {
        System.out.println("id: " + id + "\n" + "Firstname: " + firstname + "\n"
                + lastname + "\n" + "IBAN: " + iban + "\n"
                + "Ssn" + ssn + "\n" + "Balance " + balance );
    }
}
