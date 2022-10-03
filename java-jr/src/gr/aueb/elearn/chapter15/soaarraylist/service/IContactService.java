package gr.aueb.elearn.chapter15.soaarraylist.service;

import gr.aueb.elearn.chapter15.soaarraylist.dto.ContactDTO;
import gr.aueb.elearn.chapter15.soaarraylist.model.Contact;
import gr.aueb.elearn.chapter15.soaarraylist.service.exception.ContactAlreadyExistsException;
import gr.aueb.elearn.chapter15.soaarraylist.service.exception.ContactNotExistException;

import java.util.List;
import java.util.Optional;

public interface IContactService {
    boolean insertContact(ContactDTO contactDTO) throws ContactAlreadyExistsException;
    Optional<Contact> updateContact(ContactDTO contactDTO) throws ContactNotExistException;
    void deleteContact(long id) throws ContactNotExistException;
    List<Contact> getAllContacts();
    Optional<Contact> getOneContact(long id) throws ContactNotExistException;
}
