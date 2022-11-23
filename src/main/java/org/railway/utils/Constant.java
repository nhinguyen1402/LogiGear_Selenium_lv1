package org.railway.utils;

import org.openqa.selenium.WebDriver;

public class Constant {
    public static WebDriver DRIVER;
    public static final int TIMEOUT_IN_SECONDS = 10;
    public static final String RAILWAY_HOME_URL = "http://railwayb2.somee.com/Page/HomePage.cshtml";
    public static final String USERNAME = ConfigLoader.getInstance().getPropertyByKey("USERNAME");
    public static final String PASSWORD = ConfigLoader.getInstance().getPropertyByKey("PASSWORD");
    public static final String INVALID_PASSWORD = ConfigLoader.getInstance().getPropertyByKey("INVALID_PASSWORD");
    public static final String EMPTY_USERNAME = ConfigLoader.getInstance().getPropertyByKey("EMPTY_USERNAME");
    public static final String EMPTY_PASSWORD = ConfigLoader.getInstance().getPropertyByKey("EMPTY_PASSWORD");
    public static final String EMPTY_PID = ConfigLoader.getInstance().getPropertyByKey("EMPTY_PID");
}
