package utilities;

import java.util.Properties;

public class LoadConfig {
    private final Properties properties;
    private static LoadConfig loadConfig;


    private LoadConfig() {
        this.properties = PropertyClass.loadProperties(System.getProperty("user.dir") + "/src/test/java/resources/config.properties");
    }

    public static LoadConfig getInstance() {
        if (loadConfig == null) {
            loadConfig = new LoadConfig();
        }
        return loadConfig;
    }

    public String getBaseURL() {
        String baseURL = properties.getProperty("baseurl");
        if (baseURL != null) return baseURL;
        else throw new RuntimeException("Base URL is not specified in the Config.properties file");
    }

    public String getBrowser() {
        String browser = properties.getProperty("browser");
        if (browser != null) return browser;
        else throw new RuntimeException("Browser is not specified in the Config.properties file");
    }
}

