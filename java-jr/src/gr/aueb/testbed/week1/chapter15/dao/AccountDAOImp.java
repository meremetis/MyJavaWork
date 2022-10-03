package gr.aueb.testbed.week1.chapter15.dao;






import gr.aueb.testbed.week1.chapter15.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDAOImp implements IAccountDAO {
    private static final List<Account> accounts = new ArrayList<>();


    @Override
    public boolean insert(Account account) {
        if (account == null) return false;
        if (accounts.contains(account)) return false;
        accounts.add(account);
        return true;
    }

    @Override
    public Optional<Account> update(Account account) {
        int positionToUpdate = -1;
        if (account == null) return Optional.empty();

        positionToUpdate = getPosition(account.getId());
        if (positionToUpdate != -1) {
            Account accountToReturn = accounts.get(positionToUpdate);
            accounts.set(positionToUpdate, account);
            return Optional.of(accountToReturn);
        }
        return Optional.empty();
    }




    @Override
    public boolean delete(long id) {
        int positionToDelete = getPosition(id);
        if (positionToDelete !=1)
        {
            accounts.remove(positionToDelete);
            return true;
        }
        else return false;
    }
    @Override
    public List<Account> getAll() {
        return new ArrayList<>(accounts);
    }

    @Override
    public Optional<Account> getOne(long id) {
        int positionToReturn = getPosition(id);

        if (positionToReturn != -1)
        {
            return Optional.of(accounts.get(positionToReturn));
        }
        else return Optional.empty();
    }

    @Override
    public Optional<Account> updateOne(long id, double value) {
        int positionToUpdate = getPosition(id);

        if (positionToUpdate != -1)
        {


            Account accountToReturn = accounts.get(positionToUpdate);
            accountToReturn.setDeposit(value);

            return Optional.of(accountToReturn);
        }
        else return Optional.empty();
    }

    @Override
    public Optional<Account> withdrowOne(long id, double value) {
        int positionToUpdate = getPosition(id);

        if (positionToUpdate != -1)
        {


            Account accountToReturn = accounts.get(positionToUpdate);
            accountToReturn.setWithdrow(value);

            return Optional.of(accountToReturn);
        }
        else return Optional.empty();
    }


    private int getPosition(long id)
        {
            int positionToReturn = -1;
            for (int i = 0; i < accounts.size(); i++)
            {
                if (accounts.get(i).getId() == id)
                {
                    positionToReturn = i;
                    break;
                }
            }

            return positionToReturn;
        }


}
