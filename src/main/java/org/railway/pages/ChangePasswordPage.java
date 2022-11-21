package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;

public class ChangePasswordPage extends BasePage{
    private final By txtCurrentPass = By.xpath("//input[@id='currentPassword']");
    private final By txtNewPass = By.xpath("//input[@id='newPassword']");
    private final By txtConfirmPass = By.xpath("//input[@id='confirmPassword']");
    private final By bntChangePass = By.xpath("//input[contains(@title,'Change')]");
    private final By registerErrorMsg = By.xpath("//p[@class='message error']");
    private final By currentPassErrorMsg = By.xpath("//li[@class='current-password']//label[@class='validation-error']");
    private final By newPassErrorMsg = By.xpath("//li[@class='new-password']//label[@class='validation-error']");
    private final By changePasswordTitle = By.cssSelector("#content h1");
    public WebElement getTxtCurrentPass() {
        return Constant.DRIVER.findElement(txtCurrentPass);
    }
    public WebElement getTxtNewPass() {
        return Constant.DRIVER.findElement(txtNewPass);
    }
    public WebElement getTxtConfirmPass() {
        return Constant.DRIVER.findElement(txtConfirmPass);
    }
    public WebElement getBntChangePass() {
        return Constant.DRIVER.findElement(bntChangePass);
    }
    public WebElement getRegisterErrorMsg() {
        return Constant.DRIVER.findElement(registerErrorMsg);
    }
    public WebElement getCurrentPassErrorMsg() {
        return Constant.DRIVER.findElement(currentPassErrorMsg);
    }
    public WebElement getNewPassErrorMsg() {
        return Constant.DRIVER.findElement(newPassErrorMsg);
    }

    public void changePass(String currentPass, String newPass, String confirmPass) {
        getTxtCurrentPass().sendKeys(currentPass);
        getTxtNewPass().sendKeys(newPass);
        getTxtConfirmPass().sendKeys(confirmPass);
        getBntChangePass().click();
    }
}
