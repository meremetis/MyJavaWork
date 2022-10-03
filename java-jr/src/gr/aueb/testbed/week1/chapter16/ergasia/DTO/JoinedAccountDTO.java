package gr.aueb.testbed.week1.chapter16.ergasia.DTO;

import gr.aueb.testbed.week1.chapter16.ergasia.MODEL.User;

import java.util.Objects;

public class JoinedAccountDTO extends AbstractEntityDTO implements IdentifiableEntityDTO{
    private User firstHolder;
    private User secondHolder;
    private String iban;
    private double balance;

    public JoinedAccountDTO() {
    }

    public JoinedAccountDTO(Long id,User firstHolder, User secondHolder, String iban, double balance) {
        super.setId(id);
        this.firstHolder = firstHolder;
        this.secondHolder = secondHolder;
        this.iban = iban;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "JoinedAccountDTO{" +
                "firstHolder=" + firstHolder +
                ", secondHolder=" + secondHolder +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }

    public User getFirstHolder() {
        return firstHolder;
    }

    public void setFirstHolder(User firstHolder) {
        this.firstHolder = firstHolder;
    }

    public User getSecondHolder() {
        return secondHolder;
    }

    public void setSecondHolder(User secondHolder) {
        this.secondHolder = secondHolder;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JoinedAccountDTO that = (JoinedAccountDTO) o;
        return Double.compare(that.balance, balance) == 0 && firstHolder.equals(that.firstHolder) && secondHolder.equals(that.secondHolder) && iban.equals(that.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstHolder, secondHolder, iban, balance);
    }
}
