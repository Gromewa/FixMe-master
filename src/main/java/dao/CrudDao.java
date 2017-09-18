package dao;


import database.StorageData;
import model.AbstractEntity;

import java.util.List;

/**
 * Created by qw-user on 14.09.2017.
 */
public interface CrudDao<T extends AbstractEntity> {

    StorageData storageData = new StorageData();

    void save(T type);

    List<T> getAll();

    T update(T type);

    void delete(T type);
}
