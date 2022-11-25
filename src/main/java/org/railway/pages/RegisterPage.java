package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;

public class RegisterPage extends BasePage {
    private final By txtUserName = By.cssSelector("input#email");
    private final By txtPassword = By.cssSelector("input#password");
    private final By txtConfirmPass = By.cssSelector("input#confirmPassword");
    private final By txtPassPort = By.cssSelector("input#pid");
    private final By btnRegister = By.cssSelector("[value=Register]");
    private final By lblRegisterError = By.cssSelector("p.message.error");
    private final By lblUserNameError = By.cssSelector("li.email label.validation-error");
    private final By lblPassWordError = By.cssSelector("li.password label.validation-error");
    private final By lblPidError = By.cssSelector("li.pid-number label.validation-error");
    private final By lblSuccessRegister = By.cssSelector("#content p");
}
