package gr.aueb.testbed.week1.chapter16.ergasia.DAO;

import gr.aueb.testbed.week1.chapter16.ergasia.MODEL.IdentifiableEntity;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstactDAO<T> implements IGenericDAO<T> {

    protected Map<Long, T> entities = new HashMap<>();


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
