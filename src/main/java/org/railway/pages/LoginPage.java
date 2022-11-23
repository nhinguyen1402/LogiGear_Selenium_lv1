package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;

public class LoginPage extends BasePage {
    private final By txtUserName = By.xpath("//input[@id='username']");
    private final By txtPassword = By.xpath("//input[@id='password']");
    private final By btnLogin = By.xpath("//input[@value='Login']");
    private final By linkRegister = By.xpath("//div[@id='content']//following::a[contains(@href,'Register')]");
    private final By linkForgotPass = By.xpath("//div[@id='content']//following::a[contains(@href,'Forgot')]");
    private final By lblLoginError = By.xpath("//p[@class='message error LoginForm']");
    private final By lblUserNameError = By.xpath("//li[@class='username']//label[@class='validation-error']");
    private final By lblPassWordError = By.xpath("//li[@class='password']//label[@class='validation-error']");

    private WebElement getTxtUserName() {
        return Constant.DRIVER.findElement(txtUserName);
    }
    private WebElement getTxtPassword() {
        return Constant.DRIVER.findElement(txtPassword);
    }
    private WebElement getBtnLogin() {
        return Constant.DRIVER.findElement(btnLogin);
    }
    private WebElement getLinkRegister() {
        return Constant.DRIVER.findElement(linkRegister);
    }
    private WebElement getLinkForgotPass() {
        return Constant.DRIVER.findElement(linkForgotPass);
    }
    private WebElement getLblLoginError() { return Constant.DRIVER.findElement(lblLoginError); }
    private WebElement getLblUserNameError() {
        return Constant.DRIVER.findElement(lblUserNameError);
    }
    private WebElement getLblPassWordError() {
        return Constant.DRIVER.findElement(lblPassWordError);
    }

    public void login(String username, String pass) {
        this.inputUserName(username);
        this.inputPassword(pass);
        clickLoginButton();
    }
    public String getErrorMsg() {
        return this.getLblLoginError().getText();
    }
    public String getUserNameMsg() {
        return this.getLblUserNameError().getText();
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
