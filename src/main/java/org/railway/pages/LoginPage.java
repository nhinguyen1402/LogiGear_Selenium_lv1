package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;

public class LoginPage extends BasePage {
    private final By txtUserName = By.cssSelector("input#username");
    private final By txtPassword = By.cssSelector("input#password");
    private final By btnLogin = By.cssSelector("[value=Login]");
    private final By lblLoginError = By.cssSelector("p.message.error.LoginForm");
}
