package gr.aueb.testbed.week1.chapter15.model;

import gr.aueb.elearn.chapter15.soaarraylist.model.Contact;

import java.util.Objects;

public class Account {
    private long id;
    private String iban;
    private String lastname;
    private String firstname;
    private String ssn;
    private double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public Account(long id, String iban, String lastname, String firstname, String ssn, double balance) {
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

    public void setDeposit(double balance){this.balance += balance;}

    public void setWithdrow(double balance){this.balance -= balance;}

    @Override
    public int hashCode() {
        return Objects.hash(getId(),getIban(),getLastname(),getFirstname(),getSsn(),getBalance());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return getId() == account.getId() &&
                getIban() == account.getIban() &&
                getLastname() == account.getLastname() &&
                getFirstname() == account.getFirstname() &&
                getSsn() == account.getSsn() &&
                getBalance() == account.getBalance();




    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", iban='" + iban + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", ssn='" + ssn + '\'' +
                ", balance=" + balance +
                '}';
    }
}
