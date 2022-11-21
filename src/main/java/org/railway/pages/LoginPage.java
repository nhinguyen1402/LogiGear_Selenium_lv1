package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;

public class LoginPage extends BasePage {
    private final By txtUserName = By.xpath("//input[@id='username']");
    private final By txtPassword = By.xpath("//input[@id='password']");
    private final By btnLogin = By.xpath("//input[@value='Login']");
    private final By linkRegister = By.xpath("//div[@id='content']//following::a[contains(@href,'Register')]");
    private final By linkForgotPass = By.xpath("//div[@id='content']//following::a[contains(@href,'Forgot')]");
    private final By loginErrorMsg = By.xpath("//p[@class='message error LoginForm']");
    private final By userNameErrorMsg = By.xpath("//li[@class='username']//label[@class='validation-error']");
    private final By passWordErrorMsg = By.xpath("//li[@class='password']//label[@class='validation-error']");

    public WebElement getTxtUserName() {
        return Constant.DRIVER.findElement(txtUserName);
    }

    public WebElement getTxtPassword() {
        return Constant.DRIVER.findElement(txtPassword);
    }

    public WebElement getBtnLogin() {
        return Constant.DRIVER.findElement(btnLogin);
    }

    public WebElement getLinkRegister() {
        return Constant.DRIVER.findElement(linkRegister);
    }

    public WebElement getLinkForgotPass() {
        return Constant.DRIVER.findElement(linkForgotPass);
    }

    public WebElement getLoginErrorMsg() {
        return Constant.DRIVER.findElement(loginErrorMsg);
    }

    public WebElement getUserNameErrorMsg() {
        return Constant.DRIVER.findElement(userNameErrorMsg);
    }

    public WebElement getPassWordErrorMsg() {
        return Constant.DRIVER.findElement(passWordErrorMsg);
    }

    public void login(String username, String pass) {
        getTxtUserName().sendKeys(username);
        getTxtPassword().sendKeys(pass);
        getBtnLogin().click();
    }

    public String getErrorMsg() {
        return this.getLoginErrorMsg().getText();
    }

    public String getUserNameMsg() {
        return this.getUserNameErrorMsg().getText();
    }
}
