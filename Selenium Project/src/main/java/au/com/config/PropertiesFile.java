package au.com.config;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {

   static Properties prop = new Properties();

    public static void main (String[] args) {
        readPropertiesFile();
        writePropertiesFile();
        readPropertiesFile();
    }


    public static void readPropertiesFile() {


        try {
             InputStream input = new FileInputStream(“config.properties”);
            // this will make the config/properties file available to java program
            prop.load(input);

            prop.getProperty(“browser”);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*   Properties properties = new Properties();
InputStream input = new FileInputStream("C:\Users\afiar\Selenium\src\main\java\au.com\config\
            config.properties");
properties.load(input);   */

    public static void writePropertiesFile() {
        OutputStream output = new FileOutputStream(“config.properties”);
        prop.setProperty("browser", "Chrome");
        prop.store(output, null);
    }



}
