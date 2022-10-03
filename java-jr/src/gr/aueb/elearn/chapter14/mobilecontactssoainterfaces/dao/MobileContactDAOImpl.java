package gr.aueb.elearn.chapter14.mobilecontactssoainterfaces.dao;

import gr.aueb.elearn.chapter14.identifiableentity.MobileContact;

public class MobileContactDAOImpl implements IMobileContactDAO {
    private static final IMobileContactDAO DAO = new MobileContactDAOImpl();

    private final MobileContact[] contacts = new MobileContact[10];
    private int pivot = -1;


    /*this class should not be directly instatiable*/

    private  MobileContactDAOImpl(){}

    public static IMobileContactDAO getInstance (){return DAO;}

    public MobileContact[] getContacts() {
        return contacts;
    }

    public int getPivot() {
        return pivot;
    }

    public void setPivot(int pivot) {
        this.pivot = pivot;
    }

    @Override
    public boolean insert(MobileContact contact) {
        return false;
    }

    @Override
    public MobileContact getOneContactPossibleNull(String phoneNumber) {
        return null;
    }

    @Override
    public boolean update(String phoneNumber, MobileContact newContact) {
        return false;
    }

    @Override
    public boolean delete(String phoneNumber) {
        return false;
    }

    @Override
    public MobileContact[] getAll() {
        return new MobileContact[0];
    }
}
