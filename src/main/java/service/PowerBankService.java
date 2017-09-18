package service;

import model.PowerBank;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by qw-user on 14.09.2017.
 */
public interface PowerBankService {

    String getFirstPowerBank() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;
}
