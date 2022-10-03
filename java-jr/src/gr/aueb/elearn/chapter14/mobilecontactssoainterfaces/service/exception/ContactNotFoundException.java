package gr.aueb.elearn.chapter14.mobilecontactssoainterfaces.service.exception;

import gr.aueb.elearn.chapter14.mobilecontactssoainterfaces.dto.MobileContactDTO;

public class ContactNotFoundException extends Exception{
    private final static long serialVersionUID = 1L;

    public ContactNotFoundException(MobileContactDTO dto){
        System.out.println("Contact with" +dto.getPhoneNumber() + "not found");
    }

    public ContactNotFoundException(String message)
    {
        System.out.println(message);
    }

}
