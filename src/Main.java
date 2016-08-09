import com.google.gson.Gson;
import com.sun.scenario.Settings;

import java.io.FileWriter;

/**
 * User: Makar Kalancha
 * Date: 08/08/2016
 * Time: 22:58
 */
public class Main {
    public static void main(String[] args) throws Exception{
        SettingsWrapper instance = SettingsWrapper.INSTANCE;
//        SettingsWrapper1 instance = new SettingsWrapper1();
        instance.setUtilScreen("---UtilScreen");
        instance.setDefaultScreen("---DefaultScreen");
        instance.setFuelCategory("---FuelCategory");
        instance.setElectricityCategory("---ElectricityCategory");

        System.out.println(instance);
        System.out.println(instance.getUtilScreen());
        System.out.println(instance.getDefaultScreen());
        System.out.println(instance.getFuelCategory());
        System.out.println(instance.getElectricityCategory());

        Gson gson = new Gson();
        gson.toJson(instance, new FileWriter(
                "settings.conf"));

        String json = gson.toJson(instance);
        System.out.println(json);
    }
}
