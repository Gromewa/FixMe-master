package dao.impl;

import dao.CrudDao;
import dao.PowerBankDao;
import database.StorageData;
import model.PowerBank;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by qw-user on 14.09.2017.
 */
public class PowerBankDaoImpl implements CrudDao<PowerBank>, PowerBankDao {

    @Override
    public void save(PowerBank powerBank) {
        storageData.addPowerBank(powerBank);
        long count = 1;
        for (int i = 0; i < StorageData.powerBankList.size() ; i++) {
            if (StorageData.powerBankList.get(i).getId() == count) {
                count++;
                i = 0;
            }
        }
        powerBank.setId(count);
    }

    @Override
    public List<PowerBank> getAll() {
        System.out.println(StorageData.getPowerBankList());
        return StorageData.getPowerBankList();
    }

    @Override
    public PowerBank update(PowerBank powerBank) {
        if(powerBank.getWeight()==500){
            powerBank.setWeight(476.89);
        }
        return powerBank;
    }

    @Override
    public void delete(PowerBank powerBank) {
        StorageData.powerBankList.remove(powerBank);
        powerBank.setId((long) 0);
    }

    @Override
    public String getFirstPowerBank() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<? extends StorageData> storageClass = storageData.getClass();
        Method getFirstPowerBank = storageClass.getDeclaredMethod("getFirstPowerBank");
        getFirstPowerBank.setAccessible(true);
        System.out.println("First power bank: " + getFirstPowerBank.invoke(storageData));
        return getFirstPowerBank.invoke(storageData).toString();
    }
}
