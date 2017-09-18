package dao.impl;

import dao.CrudDao;
import dao.MacDao;
import database.StorageData;
import model.Mac;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;


/**
 * Created by qw-user on 14.09.2017.
 */
public class MacDaoImpl implements MacDao, CrudDao<Mac> {

    @Override
    public void save(Mac mac) {
        storageData.addMac(mac);
        long count = 1;
        for (int i = 0; i <StorageData.macList.size() ; i++) {
            if (StorageData.macList.get(i).getId() == count) {
                count++;
                i = 0;
            }
        }
        mac.setId(count);
    }

    @Override
    public List<Mac> getAll() {
        System.out.println(StorageData.getMacList());
        return StorageData.getMacList();
    }

    @Override
    public Mac update(Mac mac) {
        if(mac.getColor().equals("White")){
            mac.setColor("Silver");
        }
        return mac;
    }

    @Override
    public void delete(Mac mac) {
        StorageData.macList.remove(mac);
        mac.setId((long) 0);
    }


    @Override
    public String getFirstMac() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<? extends StorageData> storageClass = storageData.getClass();
        Method getFirstMac = storageClass.getDeclaredMethod("getFirstMac");
        getFirstMac.setAccessible(true);
        System.out.println("First Mac: " + getFirstMac.invoke(storageData));
        return getFirstMac.invoke(storageData).toString();
    }
}
