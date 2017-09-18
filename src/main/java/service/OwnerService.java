package service;

import model.Owner;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by qw-user on 14.09.2017.
 */
public interface OwnerService {

    String getFirstOwner() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
}
