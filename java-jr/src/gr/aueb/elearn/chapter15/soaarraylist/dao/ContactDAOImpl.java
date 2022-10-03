package gr.aueb.elearn.chapter15.soaarraylist.dao;

import gr.aueb.elearn.chapter15.soaarraylist.model.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ContactDAOImpl implements IContactDao{
    private static final List<Contact> contacts = new ArrayList<>();

    @Override
    public boolean insert(Contact contact) {
        if (contact == null) return false;
        
        if (contacts.contains(contact)) return false;
        contacts.add(contact);
        return true;
    }

    @Override
    public Optional<Contact> update(Contact contact) {
        int positionToUpdate = -1;
        if (contact == null) return Optional.empty();

        positionToUpdate = getPosition(contact.getId());
        if (positionToUpdate != -1)
        {
            Contact contactToReturn = contacts.get(positionToUpdate);
            contacts.set(positionToUpdate, contact);
            return Optional.of(contactToReturn);
        }

        return Optional.empty();
    }



    @Override
    public boolean delete(long id) {
        int positionToDelete = getPosition(id);
        if (positionToDelete !=1)
        {
            contacts.remove(positionToDelete);
            return true;
        }
        else return false;
    }

    @Override
    public List<Contact> getAll() {
        return new ArrayList<>(contacts);
    }

    @Override
    public Optional<Contact> getOne(long id) {
        int positionToReturn = getPosition(id);

        if (positionToReturn != -1)
        {
            return Optional.of(contacts.get(positionToReturn));
        }
        else return Optional.empty();
    }

    private int getPosition(long id)
    {
        int positionToReturn = -1;
        for (int i = 0; i < contacts.size(); i++)
        {
            if (contacts.get(i).getId() == id)
            {
                positionToReturn = i;
                break;
            }
        }

        return positionToReturn;
    }
}
