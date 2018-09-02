package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

    private PropertyUtil() {
    }

    private static Properties properties = new Properties();
    private static String fileName = "\\src\\main\\resources\\users.properties";

    static {
        load();
    }

    private static void load() {
        try (FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + fileName)) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static String getProperty(String propName) {
        return properties.get(propName).toString();
    }


}
