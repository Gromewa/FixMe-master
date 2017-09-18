package service;

import model.Iphone;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by qw-user on 14.09.2017.
 */
public interface IphoneService {

    String getFirstIphone() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
}
