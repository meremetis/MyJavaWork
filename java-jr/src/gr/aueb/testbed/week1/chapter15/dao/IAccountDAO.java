package gr.aueb.testbed.week1.chapter15.dao;





import gr.aueb.testbed.week1.chapter15.model.Account;

import java.util.List;
import java.util.Optional;

public interface IAccountDAO {
    boolean insert(Account account);
    Optional<Account> update(Account account);
    boolean delete(long id);
    List<Account> getAll();
    Optional<Account> getOne(long id);

//dikies mou
    Optional<Account> updateOne(long id, double value);
    Optional<Account> withdrowOne(long id, double value);
}
