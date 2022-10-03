package gr.aueb.testbed.week1.chapter15.service;




import gr.aueb.testbed.week1.chapter15.dao.IAccountDAO;
import gr.aueb.testbed.week1.chapter15.dto.AccountDTO;
import gr.aueb.testbed.week1.chapter15.model.Account;
import gr.aueb.testbed.week1.chapter15.service.exceptions.AccountAlreadyExistsException;
import gr.aueb.testbed.week1.chapter15.service.exceptions.AccountNotExistException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class AccountServiceImp implements IAccountService{
    private final IAccountDAO dao;
    public AccountServiceImp(IAccountDAO accountDAO)
    {
        this.dao = accountDAO;
    }


    @Override
    public boolean insertAccount(AccountDTO accountDTO) throws AccountAlreadyExistsException {
        try {
            Account account = convertDTO(accountDTO);
            if (dao.insert(account))
            {
                return true;
            }
            else
            {
                throw new AccountAlreadyExistsException(account);

            }
        }catch (AccountAlreadyExistsException e)
        {
            System.err.println("Contact Exists Exception " + LocalDateTime.now());
            throw e;
        }
    }

    @Override
    public Optional<Account> updateAccount(AccountDTO accountDTO) throws AccountNotExistException {
        try {
            Account account = convertDTO(accountDTO);
            Optional<Account> optionalAccount = dao.update(account);
            if (optionalAccount.isEmpty())
            {
                throw new AccountNotExistException(account);
            }else
            {
                return optionalAccount;
            }
        }catch (AccountNotExistException e)
        {
            System.err.println();
            throw e;
        }
    }

    @Override
    public void deleteAccount(long id) throws AccountNotExistException {
        try {
            if (!dao.delete(id)) throw new AccountNotExistException(id);
        }catch (AccountNotExistException e)
        {
            System.err.println("Contact not exist");
            throw e;
        }
    }

    @Override
    public List<Account> getAllAccount() {
        return dao.getAll();
    }

    @Override
    public Optional<Account> getOneAccount(long id) throws AccountNotExistException {
        try {
            Optional<Account> account = dao.getOne(id);
            if (account.isPresent())
            {
                return account;
            }else
            {
                throw new AccountNotExistException(id);
            }

        }catch (AccountNotExistException e)
        {
            System.err.println("Contact not exist");
            throw e;
        }
    }

    @Override
    public Optional<Account> deposit(long id, double value) throws AccountNotExistException {
        try {
            Optional<Account> account = dao.updateOne(id,value);
            if (account.isPresent())
            {
                return account;
            }else
            {
                throw new AccountNotExistException(id);
            }

        }catch (AccountNotExistException e)
        {
            System.err.println("Contact not exist");
            throw e;
        }
    }

    @Override
    public Optional<Account> withdrow(long id, double value) throws AccountNotExistException {
        try {
            Optional<Account> account = dao.withdrowOne(id,value);
            if (account.isPresent())
            {
                return account;
            }else
            {
                throw new AccountNotExistException(id);
            }

        }catch (AccountNotExistException e)
        {
            System.err.println("Contact not exist");
            throw e;
        }
    }


    private Account convertDTO(AccountDTO accountDTO)
    {
        return new Account(accountDTO.getId(),accountDTO.getIban(),accountDTO.getLastname(),accountDTO.getFirstname(), accountDTO.getSsn(),accountDTO.getBalance());
    }


}
