package gr.aueb.elearn.chapter15.soaarraylist.service;

import gr.aueb.elearn.chapter15.soaarraylist.dao.IContactDao;
import gr.aueb.elearn.chapter15.soaarraylist.dto.ContactDTO;
import gr.aueb.elearn.chapter15.soaarraylist.model.Contact;
import gr.aueb.elearn.chapter15.soaarraylist.service.exception.ContactAlreadyExistsException;
import gr.aueb.elearn.chapter15.soaarraylist.service.exception.ContactNotExistException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class ContactServiceImpl implements IContactService{
    private final IContactDao dao;

    public ContactServiceImpl(IContactDao contactDao)
    {
        this.dao = contactDao;
    }


    @Override
    public boolean insertContact(ContactDTO contactDTO) throws ContactAlreadyExistsException {
        try {
            Contact contact = convertDTO(contactDTO);
            if (dao.insert(contact))
            {
                return true;
            }
            else
            {
                throw new ContactAlreadyExistsException(contact);

            }
        }catch (ContactAlreadyExistsException e)
        {
            System.err.println("Contact Exists Exception " + LocalDateTime.now());
            throw e;
        }
    }

    @Override
    public Optional<Contact> updateContact(ContactDTO contactDTO) throws ContactNotExistException {
        try {
            Contact contact = convertDTO(contactDTO);
            Optional<Contact> optionalContact = dao.update(contact);
            if (optionalContact.isEmpty())
            {
                throw new ContactNotExistException(contact);
            }else
            {
                return optionalContact;
            }
        }catch (ContactNotExistException e)
        {
            System.err.println();
            throw e;
        }
    }

    @Override
    public void deleteContact(long id) throws ContactNotExistException {

        try {
            if (!dao.delete(id)) throw new ContactNotExistException(id);
        }catch (ContactNotExistException e)
        {
            System.err.println("Contact not exist");
            throw e;
        }
    }

    @Override
    public List<Contact> getAllContacts() {
        return dao.getAll();
    }

    @Override
    public Optional<Contact> getOneContact(long id) throws ContactNotExistException {
        try {
            Optional<Contact> contact = dao.getOne(id);
            if (contact.isPresent())
            {
                return contact;
            }else
            {
                throw new ContactNotExistException(id);
            }

        }catch (ContactNotExistException e)
        {
            System.err.println("Contact not exist");
            throw e;
        }
    }














    //ftiaxnei ena adikimeno tipou contact ala me ta gnorismata tou adikimenou dto
    private Contact convertDTO(ContactDTO contactDTO)
    {
        return new Contact(contactDTO.getId(),contactDTO.getFirstname(),contactDTO.getLastname());
    }
}
