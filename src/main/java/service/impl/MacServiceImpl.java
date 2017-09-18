package service.impl;

import dao.MacDao;
import dao.impl.MacDaoImpl;
import model.Mac;
import service.CrudService;
import service.MacService;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by qw-user on 14.09.2017.
 */
public class MacServiceImpl implements CrudService<Mac>, MacService {


    @Override
    public String getFirstMac() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return null;
    }

    @Override
    public void save(Mac type) {

    }

    @Override
    public List<Mac> getAll() {
        return null;
    }

    @Override
    public Mac update(Mac type) {
        return null;
    }

    @Override
    public void delete(Mac type) {

    }
}
