package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;
import org.railway.utils.FileUtils;

import java.util.List;

public class FileDownloaderPage extends BasePage {
    private String lblFileDownloaderTitle = "//h3[contains(.,'File Downloader')]";
    private String lnkDynamicFileNameByIndex = "div.example a[href]:nth-of-type(%s)";
    private String linkFileNames = "div.example a[href]";

    private WebElement getLblFileDownloaderTitle() {
        return Constant.DRIVER.findElement(By.xpath(lblFileDownloaderTitle));
    }

    private WebElement getLnkDynamicFileNameByIndex(int index) {
        lnkDynamicFileNameByIndex = String.format(lnkDynamicFileNameByIndex, index);
        return Constant.DRIVER.findElement(By.cssSelector(lnkDynamicFileNameByIndex));
    }

    private List<WebElement> getLinkFileNames() {
        return Constant.DRIVER.findElements(By.cssSelector(linkFileNames));
    }

    public boolean isFileDownLoaderTitlePresented() {
        return isElementPresented(getLblFileDownloaderTitle());
    }

    public int getNumberOfTotalDownloadableFiles() {
        return getLinkFileNames().size();
    }

    public void clickOnRandomFileByIndex(int randomIndex) {
        scrollToElement(getLnkDynamicFileNameByIndex(randomIndex));
        getLnkDynamicFileNameByIndex(randomIndex).click();
    }

    public String getRandomFileNameByIndex(int randomIndex) {
        scrollToElement(getLnkDynamicFileNameByIndex(randomIndex));
        return getLnkDynamicFileNameByIndex(randomIndex).getText();
    }

    public boolean doesFileNameExist(String fileName) {
        return FileUtils.doesFileNameExist(fileName);
    }

    public void deleteFileName(String fileName) {
        FileUtils.deleteFileByName(fileName);
    }
}