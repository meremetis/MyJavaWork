package gr.aueb.elearn.chapter17.Account.DAO;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractDAO<T> implements IGenericDAO<T> {
    protected  Map<Long, T> entities = new HashMap<>();


    @Override
    public T insert(Long id, T t) {
        if (entities.containsKey(id)) return null;
        entities.put(id, t);
        return t;
    }

    @Override
    public void delete(Long id) {
        entities.remove(id);
    }

    @Override
    public void replace(Long id, T t) {
        entities.remove(id,t);
    }

    @Override
    public T get(Long id) {
        return entities.get(id);
    }

    @Override
    public Map<Long, T> getall() {
        return new HashMap<>(entities);
    }
}
