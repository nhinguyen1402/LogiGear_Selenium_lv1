package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage extends BasePage{
    private By txtCurrentPass = By.xpath("//input[@id='currentPassword']");
    private By txtNewPass = By.xpath("//input[@id='newPassword']");
    private By txtConfirmPass = By.xpath("//input[@id='confirmPassword']");
    private By bntChangePass = By.xpath("//input[contains(@title,'Change')]");
    private By registerErrorMsg = By.xpath("//p[@class='message error']");
    private By currentPassErrorMsg = By.xpath("//li[@class='current-password']//label[@class='validation-error']");
    private By newPassErrorMsg = By.xpath("//li[@class='new-password']//label[@class='validation-error']");

    public WebElement getTxtCurrentPass() {
        return driver.findElement(txtCurrentPass);
    }
    public WebElement getTxtNewPass() {
        return driver.findElement(txtNewPass);
    }
    public WebElement getTxtConfirmPass() {
        return driver.findElement(txtConfirmPass);
    }
    public WebElement getBntChangePass() {
        return driver.findElement(bntChangePass);
    }
    public WebElement getRegisterErrorMsg() {
        return driver.findElement(registerErrorMsg);
    }
    public WebElement getCurrentPassErrorMsg() {
        return driver.findElement(currentPassErrorMsg);
    }
    public WebElement getNewPassErrorMsg() {
        return driver.findElement(newPassErrorMsg);
    }

    public void changePass(String currentPass, String newPass, String confirmPass) {
        getTxtCurrentPass().sendKeys(currentPass);
        getTxtNewPass().sendKeys(newPass);
        getTxtConfirmPass().sendKeys(confirmPass);
        getBntChangePass().click();
    }
}
