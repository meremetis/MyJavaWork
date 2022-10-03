package gr.aueb.testbed.week1.chapter16.ergasia.DTO;

public class UserDTO extends AbstractEntityDTO implements IdentifiableEntityDTO {
    private String firstname;
    private String lastname;
    private String ssn;

    public UserDTO() {
    }

    public UserDTO(Long id,String firstname, String lastname, String ssn) {
        super.setId(id);
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }
    public UserDTO(UserDTO userDTO)
    {
        this.setId(userDTO.getId());
        this.setFirstname(userDTO.getFirstname());
        this.setLastname(userDTO.getLastname());
        this.setSsn(userDTO.getSsn());
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
        return "UserDTO{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
