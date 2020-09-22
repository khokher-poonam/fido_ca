package co.fido.qa.selenium.Config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Config {

        //to hold the properties

        private Properties properties;
        private static Config config;
        private final String CONFIG_FILE="framework.properties";
        private static Logger logger = LogManager.getLogger(Config.class);

     private Config()  {

            properties =new Properties();     //creating object for the Property class
            try {
                Path path = Paths.get("src","test","resources",CONFIG_FILE);
                logger.info("Reading the file {} to load properties",path.toString());
                InputStream stream = new FileInputStream(path.toFile());
                properties.load(stream);

            } catch (FileNotFoundException e){
                logger.error("Properties File file NOT Found can't load property - MSG {} ", CONFIG_FILE);
                e.printStackTrace();
            } catch (IOException e) {
                logger.error("Something went wrong in reading the file -MSG {}", e.getMessage());
                e.printStackTrace();
            }

        }

        public static String getProperty(String key){
            logger.debug("Looking for property Key {}",key);
            if (config ==null){
                config = new Config();
            }
            if (config.properties.getProperty(key)==null) {
                logger.warn("No property found for Key  {} ,Please verify the properties file");
            }
            return config.properties.getProperty(key);
        }

    }

