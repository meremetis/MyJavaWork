package gr.aueb.testbed.week1.chapter16.ergasia.SERVICE;

import gr.aueb.testbed.week1.chapter16.ergasia.DAO.IAccountDAO;
import gr.aueb.testbed.week1.chapter16.ergasia.DAO.IGenericDAO;
import gr.aueb.testbed.week1.chapter16.ergasia.DAO.IJoinedAccount;
import gr.aueb.testbed.week1.chapter16.ergasia.DTO.AccountDTO;
import gr.aueb.testbed.week1.chapter16.ergasia.DTO.JoinedAccountDTO;
import gr.aueb.testbed.week1.chapter16.ergasia.MODEL.Account;
import gr.aueb.testbed.week1.chapter16.ergasia.MODEL.JoinedAccount;

import java.util.Map;

public abstract class AbstractService<T> implements IGenericService<T>  {
    protected final IGenericDAO dao;

    public AbstractService() {
    }

    public AbstractService(IGenericDAO accountDAO)
    {
        this.dao = accountDAO;
    }




    @Override
    public T insertAccount(Long id, T t) {
        dao.insert(id,t);
        System.out.println("ekane insert");
        return t;
    }

    @Override
    public void deleteAccount(Long id) {
        dao.delete(id);
    }

    @Override
    public void replaceAccount(Long id, T t) {
        dao.replace(id,t);
    }

    @Override
    public T getAccount(Long id) {

                    dao.get(id);
                    return null;
    }

    @Override
    public Map<Long, T> getAllAccount() {
        return dao.getall();
    }

  protected Account convertDTO(AccountDTO accountDTO)
  {
      return new Account(accountDTO.getId(),accountDTO.getIban(),accountDTO.getHolder(),accountDTO.getBalance());
  }
   protected JoinedAccount convertDTO(JoinedAccountDTO joinedAccountDTO)
   {
       return  new JoinedAccount(joinedAccountDTO.getId(), joinedAccountDTO.getFirstHolder(), joinedAccountDTO.getSecondHolder(),joinedAccountDTO.getIban(),joinedAccountDTO.getBalance());
   }
}
