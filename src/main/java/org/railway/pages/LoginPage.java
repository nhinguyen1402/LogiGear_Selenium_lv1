package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private By txtUserName = By.xpath("//input[@id='username']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By btnLogin = By.xpath("//input[@value='Login']");
    private By linkRegister = By.xpath("//div[@id='content']//following::a[contains(@href,'Register')]");
    private By linkForgotPass = By.xpath("//div[@id='content']//following::a[contains(@href,'Forgot')]");
    private By loginErrorMsg = By.xpath("//p[@class='message error LoginForm']");
    private By userNameErrorMsg = By.xpath("//li[@class='username']//label[@class='validation-error']");
    private By passWordErrorMsg = By.xpath("//li[@class='password']//label[@class='validation-error']");
    public WebElement getTxtUserName() {
        return driver.findElement(txtUserName);
    }
    public WebElement getTxtPassword() {
        return driver.findElement(txtPassword);
    }
    public WebElement getBtnLogin() {
        return driver.findElement(btnLogin);
    }
    public WebElement getLinkRegister() {
        return driver.findElement(linkRegister);
    }
    public WebElement getLinkForgotPass() {
        return driver.findElement(linkForgotPass);
    }
    public WebElement getLoginErrorMsg() {
        return driver.findElement(loginErrorMsg);
    }
    public WebElement getUserNameErrorMsg() {
        return driver.findElement(userNameErrorMsg);
    }
    public WebElement getPassWordErrorMsg() {
        return driver.findElement(passWordErrorMsg);
    }

    public void login(String username, String pass) {
        getTxtUserName().sendKeys(username);
        getTxtPassword().sendKeys(pass);
        getBtnLogin().click();
    }
}
