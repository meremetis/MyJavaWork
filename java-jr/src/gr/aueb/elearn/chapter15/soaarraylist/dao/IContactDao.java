package gr.aueb.elearn.chapter15.soaarraylist.dao;

import gr.aueb.elearn.chapter15.soaarraylist.model.Contact;

import java.util.List;
import java.util.Optional;

public interface IContactDao {
    boolean insert(Contact contact);
    Optional<Contact> update(Contact contact);
    boolean delete(long id);
    List<Contact> getAll();
    Optional<Contact> getOne(long id);
}
