package service;


import java.lang.reflect.InvocationTargetException;

/**
 * @author Igor Hnes on 9/14/17.
 */
public interface MacService {

    String getFirstMac() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
}
