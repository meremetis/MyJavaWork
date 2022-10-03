package gr.aueb.elearn.chapter14.mobilecontactssoainterfaces.service.exception;

import gr.aueb.elearn.chapter14.mobilecontactssoainterfaces.dto.MobileContactDTO;

public class ContactAlreadyExistsException extends Exception{
    private final static long serialVersionUID = 1L;

    public ContactAlreadyExistsException(MobileContactDTO dto){
        System.out.println("contact with phone number "+ dto.getPhoneNumber() +
        "already exists");
    }
}
