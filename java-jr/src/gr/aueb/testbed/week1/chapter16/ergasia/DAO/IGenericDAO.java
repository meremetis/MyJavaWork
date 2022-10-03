package gr.aueb.testbed.week1.chapter16.ergasia.DAO;

import java.util.Map;

public interface IGenericDAO<T> {
    T insert(Long id, T t);

    void delete(Long id);

    void replace(Long id, T t);

    T get(Long id);

    Map<Long, T> getall();
}
