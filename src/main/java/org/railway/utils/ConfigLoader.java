package org.railway.utils;

import java.util.Properties;

public class ConfigLoader {
    private final Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader() {
        properties = PropertyUtils.propertyLoader("src/main/resources/properties.properties");
    }

    public static ConfigLoader getInstance() {
        if (configLoader == null) {
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getPropertyByKey(String keyword) {
        String prop = properties.getProperty(keyword);
        if (prop != null) {
            return prop;
        } else {
            throw new RuntimeException("Property " + keyword + "is not specified in the properties.properties file");
        }
    }
}
