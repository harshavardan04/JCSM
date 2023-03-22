package utilities;

import java.io.*;
import java.util.Properties;

public class PropertyClass {

    public static Properties loadProperties(String filePath) {
        Properties props = new Properties();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            try {
                props.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("Properties file not loaded" + filePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Properties file not found" + filePath);
        }
        return props;
    }
}
