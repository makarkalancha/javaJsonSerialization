import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * User: Makar Kalancha
 * Date: 08/08/2016
 * Time: 22:58
 */
public enum Settings {
    INSTANCE;

    private SettingsCore settingsCore = new SettingsCore();

    private static class SettingsCore {
        private String utilScreen;
        private String defaultScreen;
        private String fuelCategory;
        private String electricityCategory;

//        @Override
//        public String toString() {
//            return "SettingsCore{" +
//                    "defaultScreen='" + defaultScreen + '\'' +
//                    ", utilScreen='" + utilScreen + '\'' +
//                    ", fuelCategory='" + fuelCategory + '\'' +
//                    ", electricityCategory='" + electricityCategory + '\'' +
//                    '}';
//        }


        //        private transient static Gson gson = new Gson();
//        public String getSettingsJson(){
//            return gson.toJson(this);
//        }
    }
//    public String getSettingsJson(){
//        return settingsCore.getSettingsJson();
//    }

    private static Gson gson = new Gson();
    public String getSettingsJson(){
        return gson.toJson(settingsCore);
    }

    public void toFile() throws Exception{
        try(Writer writer = new FileWriter("settings.conf")) {
            gson.toJson(settingsCore, writer);
        }
    }

    public void fromFile() throws Exception{
        File file = new File("settings.conf");
        if(file.exists()) {
            try (Reader reader = new FileReader(file)) {
                settingsCore = gson.fromJson(reader, SettingsCore.class);
//            SettingsPlaceholder settings1 = gson.fromJson(reader, SettingsPlaceholder.class);
//            System.out.println(settingsCore);
            }
        } else {
            settingsCore = new SettingsCore();
        }
    }

    public String getDefaultScreen() {
        return settingsCore.defaultScreen;
    }

    public void setDefaultScreen(String defaultScreen) {
        settingsCore.defaultScreen = defaultScreen;
    }

    public String getElectricityCategory() {
        return settingsCore.electricityCategory;
    }

    public void setElectricityCategory(String electricityCategory) {
        settingsCore.electricityCategory = electricityCategory;
    }

    public String getFuelCategory() {
        return settingsCore.fuelCategory;
    }

    public void setFuelCategory(String fuelCategory) {
        settingsCore.fuelCategory = fuelCategory;
    }

    public String getUtilScreen() {
        return settingsCore.utilScreen;
    }

    public void setUtilScreen(String utilScreen) {
        settingsCore.utilScreen = utilScreen;
    }
}
