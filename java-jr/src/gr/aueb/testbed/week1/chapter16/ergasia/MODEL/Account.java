package gr.aueb.testbed.week1.chapter16.ergasia.MODEL;



import java.util.Objects;

public class Account extends AbstractEntity implements IdentifiableEntity {
    private String iban;
    private User holder;
    private double balance;

    public Account() {
    }

    public Account(Long id, String iban, User holder, double balance) {
        super.setId(id);
        this.iban = iban;
        this.holder = holder;
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
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", holder=" + holder +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        gr.aueb.elearn.chapter17.Account.MODEL.Account account = (gr.aueb.elearn.chapter17.Account.MODEL.Account) o;
        return Double.compare(account.getBalance(), getBalance()) == 0 && getIban().equals(account.getIban()) && getHolder().equals(account.getHolder());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIban(), getHolder(), getBalance());
    }
}
