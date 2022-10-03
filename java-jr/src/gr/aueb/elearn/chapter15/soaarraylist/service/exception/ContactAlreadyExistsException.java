package gr.aueb.elearn.chapter15.soaarraylist.service.exception;

import gr.aueb.elearn.chapter15.soaarraylist.model.Contact;

public class ContactAlreadyExistsException extends Exception{
    public ContactAlreadyExistsException(Contact contact)
    {
        super("Contact with id= "+ contact.getId() + "already exist");
    }
}
