package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;

public class LoginPage extends BasePage {
    private final By txtUserName = By.cssSelector("input#username");
    private final By txtPassword = By.cssSelector("input#password");
    private final By btnLogin = By.cssSelector("[value=Login]");
    private final By lblLoginError = By.cssSelector("p.message.error.LoginForm");

    private WebElement getTxtUserName() {
        return Constant.DRIVER.findElement(txtUserName);
    }
    private WebElement getTxtPassword() {
        return Constant.DRIVER.findElement(txtPassword);
    }
    private WebElement getBtnLogin() {
        return Constant.DRIVER.findElement(btnLogin);
    }
    private WebElement getLblLoginError() { return Constant.DRIVER.findElement(lblLoginError); }

    public void login(String username, String pass) {
        this.inputUserName(username);
        this.inputPassword(pass);
        clickLoginButton();
    }
    public String getErrorMsgText() {
        scrollToElement(getLblLoginError());
        return this.getLblLoginError().getText();
    }
    public void inputUserName(String userName) {
        scrollToElement(getTxtUserName());
        getTxtUserName().sendKeys(userName);
    }
    public void inputPassword(String password) {
        scrollToElement(getTxtPassword());
        getTxtPassword().sendKeys(password);
    }
    public void clickLoginButton() {
        scrollToElement(getBtnLogin());
        getBtnLogin().click();
    }
}
