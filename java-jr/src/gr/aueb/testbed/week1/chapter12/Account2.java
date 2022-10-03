package gr.aueb.testbed.week1.chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Account2 {

    private long id;
    private String iban;
    private String lastname;
    private String firstname;
    private String ssn;
    private double balance;

    public Account2() {
    }

    public Account2(long id, String iban, String lastname, String firstname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.lastname = lastname;
        this.firstname = firstname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    /**
     * Deposits an amaunt to the account
     *
     * @param amount
     *              the amount of money deposited
     *
     * @return
     *          true, if deposit is succesful, false otherwise
     *
     * @throws FileNotFoundException
     * if the {@link #printErrorMessage(PrintStream, String)} refers to invalid stream
     */
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

    /**
     * Withdraws a certain amount of money from account
     * @param amount the amount of money to withdraw
     *
     * @param ssn
     *          the ssn number of the person who performs withdraw;
     *
     * @return
     *          true, if withdraw is successful, false otherwise
     *
     * @throws FileNotFoundException
     * if the {@link #printErrorMessage(PrintStream, String)} reffers to invalid stream;
     */
    public boolean widthdraw(double amount, String ssn) throws FileNotFoundException {

        if (!isSsnValid(ssn))
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

    /**
     * Gets the balance's amount instance
     * @return the balance
     */
    public double getAccountBalance()
    {
        return getBalance();
    }

    /**
     * Gets the state of the account Instance
     *
     * @return the account state
     * */
    public String getAccountState()
    {
        return "id: " + id + "\t" + "Firstname: " + firstname + "\t"
                + "Lastname " + lastname + "\t" + "IBAN: " + iban + "\t"
                + "Ssn" + ssn + "\t" + "Balance" + balance;
    }


    /**
     * Print the account state
     */
    public void printAccountState()
    {
        System.out.println("id: " + id + "\n" + "Firstname: " + firstname + "\n"
                + "Lastname " + lastname + "\n" + "IBAN: " + iban + "\n"
                + "Ssn" + ssn + "\n" + "Balance" + balance);
    }

    private void printErrorMessage (PrintStream ps, String s){
        if ((ps != null) && (s != null)){
            ps.println(s);
        }
    }

    private boolean isSsnValid(String ssn)
    {
        if (ssn == null) return false;
        return this.ssn.equals(ssn);
    }



}
