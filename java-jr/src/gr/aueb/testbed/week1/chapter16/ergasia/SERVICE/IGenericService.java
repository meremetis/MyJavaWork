package gr.aueb.testbed.week1.chapter16.ergasia.SERVICE;

import java.util.Map;

public interface IGenericService<T> {

    T insertAccount(Long id, T t);

    void deleteAccount(Long id);

    void replaceAccount(Long id, T t);

    T getAccount(Long id);

    Map<Long, T> getAllAccount();
}
