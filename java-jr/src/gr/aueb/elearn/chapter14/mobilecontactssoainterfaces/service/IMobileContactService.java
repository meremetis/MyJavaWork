package gr.aueb.elearn.chapter14.mobilecontactssoainterfaces.service;

import gr.aueb.elearn.chapter14.identifiableentity.MobileContact;
import gr.aueb.elearn.chapter14.mobilecontactssoainterfaces.dto.MobileContactDTO;
import gr.aueb.elearn.chapter14.mobilecontactssoainterfaces.service.exception.ContactAlreadyExistsException;
import gr.aueb.elearn.chapter14.mobilecontactssoainterfaces.service.exception.ContactNotFoundException;

public interface IMobileContactService {
    void insertContact (MobileContactDTO dto) throws ContactAlreadyExistsException;
    MobileContact getContactOrNull(MobileContactDTO dto) throws  ContactNotFoundException;
    void updateContact (String phoneNumber, MobileContactDTO dto)throws ContactNotFoundException;
    void deleteContact (String phoneNumber)throws ContactNotFoundException;
    MobileContact[] getAll();
}
