package gr.aueb.testbed.week1.chapter15.service.exceptions;


import gr.aueb.testbed.week1.chapter15.model.Account;

public class AccountNotExistException extends Exception{
    public AccountNotExistException(Account account)
    {
        super("account with id= "+account.getId() +"not exists");
    }

    public AccountNotExistException(long id)
    {
        super("account with id= "+id +"not exists");
    }
}
