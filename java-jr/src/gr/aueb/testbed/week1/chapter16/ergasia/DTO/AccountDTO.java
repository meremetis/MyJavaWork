package gr.aueb.testbed.week1.chapter16.ergasia.DTO;

import gr.aueb.testbed.week1.chapter16.ergasia.MODEL.User;

import java.util.Objects;

public class AccountDTO extends AbstractEntityDTO implements IdentifiableEntityDTO {

    private String iban;
    private User holder;
    private double balance;

    public AccountDTO() {
    }

    public AccountDTO(Long id,String iban, User holder, double balance) {
        super.setId(id);
        this.iban = iban;
        this.holder = holder;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public User getHolder() {
        return holder;
    }

    public void setHolder(User holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "iban='" + iban + '\'' +
                ", holder=" + holder +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountDTO that = (AccountDTO) o;
        return Double.compare(that.getBalance(), getBalance()) == 0 && getIban().equals(that.getIban()) && getHolder().equals(that.getHolder());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIban(), getHolder(), getBalance());
    }
}
