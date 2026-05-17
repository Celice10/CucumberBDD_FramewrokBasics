package configs;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    static {                             // Static block to load properties when the class is loaded

        prop = new Properties();         // Create a Properties object to hold the configuration properties
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config.properties");   // Load the properties file using FileInputStream
            prop.load(file);                                                                            // Load the properties from the file into the Properties object

        } catch (Exception e) {                                 // Handle any exceptions that may occur during file loading
            e.printStackTrace();
        }

    }

    public static String getBrowser() {
        return prop.getProperty("browser");
    }

    public static String getUrl() {
        return prop.getProperty("url");
    }
}





