
/**
 * User: Makar Kalancha
 * Date: 08/08/2016
 * Time: 22:58
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Settings instance = Settings.INSTANCE;
//        instance.setUtilScreen("---UtilScreen");
//        instance.setDefaultScreen("---DefaultScreen");
//        instance.setFuelCategory("---FuelCategory");
//        instance.setElectricityCategory("---ElectricityCategory");
//        instance.toFile();

//        System.out.println(instance);
//        System.out.println(instance.getUtilScreen());
//        System.out.println(instance.getDefaultScreen());
//        System.out.println(instance.getFuelCategory());
//        System.out.println(instance.getElectricityCategory());
//        System.out.println(instance.getSettingsJson());


        instance.fromFile();
        System.out.println(instance);
        System.out.println(instance.getUtilScreen());
        System.out.println(instance.getDefaultScreen());
        System.out.println(instance.getFuelCategory());
        System.out.println(instance.getElectricityCategory());
    }
}
