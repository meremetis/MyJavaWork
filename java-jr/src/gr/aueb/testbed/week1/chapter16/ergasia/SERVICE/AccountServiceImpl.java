package gr.aueb.testbed.week1.chapter16.ergasia.SERVICE;

import gr.aueb.testbed.week1.chapter16.ergasia.DAO.IGenericDAO;
import gr.aueb.testbed.week1.chapter16.ergasia.DTO.AbstractEntityDTO;
import gr.aueb.testbed.week1.chapter16.ergasia.DTO.AccountDTO;
import gr.aueb.testbed.week1.chapter16.ergasia.MODEL.Account;

public class AccountServiceImpl extends AbstractService<AccountDTO> implements IAccountService  {
    public AccountServiceImpl() {
    }

    public AccountServiceImpl(IGenericDAO accountDAO) {
        super(accountDAO);
    }

}
