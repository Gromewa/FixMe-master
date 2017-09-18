package dao;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Igor Hnes on 9/14/17.
 */
public interface MacDao {

    String getFirstMac() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;

}
