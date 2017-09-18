package dao.impl;

import dao.CrudDao;
import dao.OwnerDao;
import database.StorageData;
import model.Owner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by qw-user on 14.09.2017.
 */
public class OwnerDaoImpl implements CrudDao<Owner>, OwnerDao {

    @Override
    public void save(Owner owner) {
        storageData.addOwner(owner);
        long count = 1;
        for (int i = 0; i <StorageData.ownerList.size() ; i++) {
            if (StorageData.ownerList.get(i).getId() == count) {
                count++;
                i = 0;
            }
        }
        owner.setId(count);
    }

    @Override
    public List<Owner> getAll() {
        System.out.println(StorageData.getOwnerList());
        return StorageData.getOwnerList();
    }

    @Override
    public Owner update(Owner owner) {
        if(owner.getJobPosition().equals("Driver")){
            owner.setJobPosition("Programmer");
        }
        return owner;
    }

    @Override
    public void delete(Owner owner) {
        StorageData.ownerList.remove(owner);
        owner.setId((long) 0);
    }

    @Override
    public String getFirstOwner() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<? extends StorageData> storageClass = storageData.getClass();
        Method getFirstOwner = storageClass.getDeclaredMethod("getFirstOwner");
        getFirstOwner.setAccessible(true);
        System.out.println("First owner: " + getFirstOwner.invoke(storageData));
        return getFirstOwner.invoke(storageData).toString();
    }
}
