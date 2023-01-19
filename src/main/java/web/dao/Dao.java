package web.dao;

import java.util.List;

public interface Dao<T, K extends Number> {

    List<T> getAll();

    void add(T entity);
    T getById(K id);
    void deleteById(K id);
    void update(T entity);

}
