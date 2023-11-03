package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;


public class BasePage {
    private String lnkDynamicExample = ("//li/a[(text()='%s')]");

    private WebElement getLnkDynamicExample(String exampleName) {
        lnkDynamicExample = String.format(lnkDynamicExample, exampleName);
        return Constant.DRIVER.findElement(By.xpath(lnkDynamicExample));
    }

    public void clickOnExampleLink(String exampleName) {
        scrollToElement(getLnkDynamicExample(exampleName));
        getLnkDynamicExample(exampleName).click();
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Constant.DRIVER;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public boolean isElementPresented(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
