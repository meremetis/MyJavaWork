package gr.aueb.testbed.week1.chapter15.service;


import gr.aueb.testbed.week1.chapter15.dto.AccountDTO;
import gr.aueb.testbed.week1.chapter15.model.Account;
import gr.aueb.testbed.week1.chapter15.service.exceptions.AccountAlreadyExistsException;
import gr.aueb.testbed.week1.chapter15.service.exceptions.AccountNotExistException;

import java.util.List;
import java.util.Optional;

public interface IAccountService {
    boolean insertAccount(AccountDTO accountDTO) throws AccountAlreadyExistsException;
    Optional<Account> updateAccount(AccountDTO accountDTO) throws AccountNotExistException;
    void deleteAccount(long id) throws AccountNotExistException;
    List<Account> getAllAccount();
    Optional<Account> getOneAccount(long id) throws AccountNotExistException;

    //dikies mou

    Optional<Account> deposit(long id,double value) throws AccountNotExistException;

    Optional<Account> withdrow(long id,double value) throws AccountNotExistException;


}
