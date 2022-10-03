package gr.aueb.testbed.week1.chapter16.ergasia.MODEL;

public class User extends AbstractEntity implements IdentifiableEntity{
    private String firstname;
    private String lastname;
    private String ssn;

    public User() {
    }

    public User(Long id, String firstname, String lastname, String ssn) {
        super.setId(id);
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    public User(User user) {
        this.setId(user.getId());
        this.setFirstname(user.getFirstname());
        this.setLastname(user.getLastname());
        this.setSsn(user.getSsn());
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
