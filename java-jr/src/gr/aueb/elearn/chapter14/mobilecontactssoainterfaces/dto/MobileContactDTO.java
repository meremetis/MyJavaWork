package gr.aueb.elearn.chapter14.mobilecontactssoainterfaces.dto;

public class MobileContactDTO extends UserDTO{
    private UserDTO user;
    private String phoneNumber;

    public MobileContactDTO() {
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
