package gr.aueb.testbed.week1.chapter15.service.exceptions;


import gr.aueb.testbed.week1.chapter15.model.Account;

public class AccountAlreadyExistsException extends Exception{
    public AccountAlreadyExistsException(Account account)
    {
        super("Account with id= "+ account.getId() + "already exist");
    }
}
