package dao;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by qw-user on 14.09.2017.
 */
public interface OwnerDao {

    String getFirstOwner() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
}
