package service.factory;

/**
 * Created by qw-user on 18.09.2017.
 */
import model.Mac;
import service.*;
import service.impl.IphoneServiceImpl;
import service.impl.MacServiceImpl;
import service.impl.OwnerServiceImpl;
import service.impl.PowerBankServiceImpl;

public class ServiceFactory {

    public static MacService getMacService(){
        return new MacServiceImpl();
    }

    public static IphoneService getIphoneService(){
        return new IphoneServiceImpl();
    }

    public static OwnerService getOwnerService(){
        return new OwnerServiceImpl();
    }

    public static PowerBankService getPowerBankService(){
        return new PowerBankServiceImpl();
    }

    public static CrudService getMacCrudService(){
        return new MacServiceImpl();
    }

    public static CrudService getIphoneCrudService(){
        return new IphoneServiceImpl();
    }

    public static CrudService getOwnerCrudService(){
        return new OwnerServiceImpl();
    }

    public static CrudService getPowerBankCrudService(){
        return new PowerBankServiceImpl();
    }
}
