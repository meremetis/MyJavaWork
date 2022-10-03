package gr.aueb.elearn.chapter15.soaarraylist.service.exception;

import gr.aueb.elearn.chapter15.soaarraylist.model.Contact;

public class ContactNotExistException extends Exception{
    public ContactNotExistException(Contact contact)
    {
        super("Contact with id= "+contact.getId() +"not exists");
    }

    public ContactNotExistException(long id)
    {
        super("Contact with id= "+id +"not exists");
    }


}
