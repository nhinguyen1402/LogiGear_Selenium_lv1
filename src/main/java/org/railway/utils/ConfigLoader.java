package org.railway.utils;

import java.util.Properties;

public class ConfigLoader {
    private final Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader(){
        properties = PropertyUtils.propertyLoader("src/main/resources/properties.properties");
    }

    public static ConfigLoader getInstance(){
        if(configLoader == null){
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getUrl(){
        String prop = properties.getProperty("RAILWAY_HOME_URL");
        if(prop != null) return prop;
        else throw new RuntimeException("property RAILWAY_HOME_URL is not specified in the properties.properties file");
    }

    public String getValidUserName(){
        String prop = properties.getProperty("USERNAME");
        if(prop != null) return prop;
        else throw new RuntimeException("property USERNAME is not specified in the properties.properties file");
    }

    public String getValidPassword(){
        String prop = properties.getProperty("PASSWORD");
        if(prop != null) return prop;
        else throw new RuntimeException("property PASSWORD is not specified in the properties.properties file");
    }

    public String getInvalidPassword(){
        String prop = properties.getProperty("INVALID_PASSWORD");
        if(prop != null) return prop;
        else throw new RuntimeException("property INVALID_PASSWORD is not specified in the properties.properties file");
    }

    public String getScope(){
        String prop = properties.getProperty("scope");
        if(prop != null) return prop;
        else throw new RuntimeException("property scope is not specified in the config.properties file");
    }

    public String getUser(){
        String prop = properties.getProperty("user_id");
        if(prop != null) return prop;
        else throw new RuntimeException("property user_id is not specified in the config.properties file");
    }

}
