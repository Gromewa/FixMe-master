package database;

import model.Iphone;
import model.Mac;
import model.Owner;
import model.PowerBank;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class StorageData {

    public static List<Mac> macList = new LinkedList<>();

    public static List<Mac> getMacList() {
        return macList;
    }

    public void addMac(Mac mac) {
        macList.add(mac);
    }

    /**
     * @return first element of mac list to controller.
     */
    private String getFirstMac() { // todo do not change private and implements from controller to here
        return getMacList().get(0).toString();
    }



    public static List<Iphone> iphoneList = new LinkedList<>();

    public static List<Iphone> getIphoneList() {
        return iphoneList;
    }

    public void addIphone(Iphone iphone) {
        iphoneList.add(iphone);
    }

    /**
     * @return first element of iphone list to controller.
     */
    private String getFirstIphone() { // todo do not change private and implements from controller to here
        return getIphoneList().get(0).toString();
    }



    public static List<Owner> ownerList = new LinkedList<>();

    public static List<Owner> getOwnerList() {
        return ownerList;
    }

    public void addOwner(Owner owner) {
        ownerList.add(owner);
    }

    /**
     * @return first element of mac owner to controller.
     */
    private String getFirstOwner() { // todo do not change private and implements from controller to here
        return getOwnerList().get(0).toString();
    }



    public static List<PowerBank> powerBankList = new LinkedList<>();

    public static List<PowerBank> getPowerBankList() {
        return powerBankList;
    }

    public void addPowerBank(PowerBank powerBank) {
        powerBankList.add(powerBank);
    }

    /**
     * @return first element of power bank list to controller.
     */
    private String getFirstPowerBank() { // todo do not change private and implements from controller to here
        return getPowerBankList().get(0).toString();
    }
}
