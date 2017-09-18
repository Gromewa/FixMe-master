package service;

import model.AbstractEntity;

import java.util.List;

/**
 * Created by qw-user on 14.09.2017.
 */
public interface CrudService<T extends AbstractEntity> {

    void save(T type);

    List<T> getAll();

    T update(T type);

    void delete(T type);


}
