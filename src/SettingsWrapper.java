/**
 * User: Makar Kalancha
 * Date: 08/08/2016
 * Time: 22:58
 */
public enum SettingsWrapper {
    INSTANCE;

    private Settings settings;

    private SettingsWrapper(){
        settings = new Settings();
    }

    private static class Settings {
        private String utilScreen;
        private String defaultScreen;
        private String fuelCategory;
        private String electricityCategory;
    }
        public String getDefaultScreen() {
            return settings.defaultScreen;
        }

        public void setDefaultScreen(String defaultScreen) {
            settings.defaultScreen = defaultScreen;
        }

        public String getElectricityCategory() {
            return settings.electricityCategory;
        }

        public void setElectricityCategory(String electricityCategory) {
            settings.electricityCategory = electricityCategory;
        }

        public String getFuelCategory() {
            return settings.fuelCategory;
        }

        public void setFuelCategory(String fuelCategory) {
            settings.fuelCategory = fuelCategory;
        }

        public String getUtilScreen() {
            return settings.utilScreen;
        }

        public void setUtilScreen(String utilScreen) {
            settings.utilScreen = utilScreen;
        }
    }
}
