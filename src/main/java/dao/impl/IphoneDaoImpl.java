package dao.impl;

import dao.CrudDao;
import dao.IphoneDao;
import database.StorageData;
import model.Iphone;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by qw-user on 14.09.2017.
 */
public class IphoneDaoImpl implements CrudDao<Iphone>, IphoneDao {

    @Override
    public void save(Iphone iphone) {
        storageData.addIphone(iphone);
        long count = 1;
        for (int i = 0; i < StorageData.iphoneList.size(); i++) {
            if (StorageData.iphoneList.get(i).getId() == count) {
                count++;
                i = 0;
            }
        }
        iphone.setId(count);

    }

    @Override
    public List<Iphone> getAll() {
        System.out.println(StorageData.getIphoneList());
        return StorageData.getIphoneList();
    }

    @Override
    public Iphone update(Iphone iphone) {
        if (iphone.getPrice() == 200) {
            iphone.setPrice(20);
        }
        return iphone;
    }

    @Override
    public void delete (Iphone iphone){
        StorageData.macList.remove(iphone);
        iphone.setId((long) 0);
    }

    @Override
    public String getFirstIphone () throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<? extends StorageData> storageClass = storageData.getClass();
        Method getFirstIphone = storageClass.getDeclaredMethod("getFirstIphone");
        getFirstIphone.setAccessible(true);
        System.out.println("First Iphone: " + getFirstIphone.invoke(storageData));
        return getFirstIphone.invoke(storageData).toString();
    }
}
