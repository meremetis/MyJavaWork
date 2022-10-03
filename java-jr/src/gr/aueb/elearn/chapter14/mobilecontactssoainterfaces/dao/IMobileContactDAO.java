package gr.aueb.elearn.chapter14.mobilecontactssoainterfaces.dao;

import gr.aueb.elearn.chapter14.identifiableentity.MobileContact;

public interface IMobileContactDAO {
    boolean insert (MobileContact contact);
    MobileContact getOneContactPossibleNull(String phoneNumber);
    boolean update (String phoneNumber, MobileContact newContact);
    boolean delete (String phoneNumber);
    MobileContact[] getAll();
}
