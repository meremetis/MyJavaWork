package gr.aueb.elearn.chapter14.mobilecontactssoainterfaces.model;

import gr.aueb.elearn.chapter14.identifiableentity.MobileContact;

public class MobileContanct extends AbstractEntity {
    private User user;
    private String phoneNumber;



    public MobileContanct(){}















    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
