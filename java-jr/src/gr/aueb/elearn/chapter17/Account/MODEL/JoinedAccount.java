package gr.aueb.elearn.chapter17.Account.MODEL;

import java.util.Objects;

public class JoinedAccount extends AbstractEntity implements IdentifiableEntity {
    private User firstHolder;
    private User secondHolder;
    private String iban;
    private double balance;

    public JoinedAccount() {
    }

    public JoinedAccount(Long id, User firstHolder, User secondHolder, String iban, double balance) {
        super.setId(id);
        this.firstHolder = firstHolder;
        this.secondHolder = secondHolder;
        this.iban = iban;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "JoinedAccount{" +
                "firstHolder=" + firstHolder +
                ", secondHolder=" + secondHolder +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JoinedAccount that = (JoinedAccount) o;
        return Double.compare(that.balance, balance) == 0 && firstHolder.equals(that.firstHolder) && secondHolder.equals(that.secondHolder) && iban.equals(that.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstHolder, secondHolder, iban, balance);
    }
}
