package service.impl;

import dao.CrudDao;
import dao.IphoneDao;
import dao.factory.DaoFactory;
import model.Iphone;
import service.CrudService;
import service.IphoneService;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by qw-user on 14.09.2017.
 */
public class IphoneServiceImpl implements CrudService<Iphone>, IphoneService {

    CrudDao crudDao = DaoFactory.getIphoneCrudDao();
    IphoneDao iphoneDao = DaoFactory.getIphoneDao();

    @Override
    public void save(Iphone iphone) {
        crudDao.save(iphone);
    }

    @Override
    public List<Iphone> getAll() {
        return crudDao.getAll();
    }

    @Override
    public Iphone update(Iphone iphone) {
        crudDao.update(iphone);
        return iphone;
    }

    @Override
    public void delete(Iphone iphone) {
        crudDao.delete(iphone);
    }

    @Override
    public String getFirstIphone() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return  iphoneDao.getFirstIphone();
    }
}
