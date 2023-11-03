import org.railway.helper.DataHelper;
import org.railway.pages.FileDownloaderPage;
import org.railway.pages.HomePage;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PretestSelenium2 extends BaseTest {

    @Test(testName = "Selenium Pretest",
            description = "User can visit and download file from 'the-internet.herokuapp' downloader file.")
    public void downloadFileFromHerokuapp() {
        HomePage homePage = new HomePage();
        FileDownloaderPage fileDownloaderPage = new FileDownloaderPage();
        SoftAssert softAssert = new SoftAssert(); // Instantiate SoftAssert

        Log4j.info("Click on File Download link");
        homePage.clickOnExampleLink(Constant.FILE_DOWNLOAD);

        Log4j.info("VP: Verify that user is on File Downloader page.");
        softAssert.assertTrue(fileDownloaderPage.isFileDownLoaderTitlePresented(),
                "User is not on File Downloader page.");

        int numberOfTotalDownLoadableFile = fileDownloaderPage.getNumberOfTotalDownloadableFiles();

        Log4j.info("VP: Verify that total downloadable files are 25.");
        softAssert.assertEquals(numberOfTotalDownLoadableFile, 25,
                "Total downloadable files are: " + numberOfTotalDownLoadableFile);

        int randomIndex = DataHelper.randomNumber(0, numberOfTotalDownLoadableFile);
        String randomFileName = fileDownloaderPage.getRandomFileNameByIndex(randomIndex);

        Log4j.info("VP: Verify the file does not exist before downloading (random file name): " + randomFileName);
        softAssert.assertFalse(fileDownloaderPage.doesFileNameExist(randomFileName),
                randomFileName + " already exists!");

        Log4j.info("Click on a file randomly at index: " + randomIndex);
        fileDownloaderPage.clickOnRandomFileByIndex(randomIndex);

        Log4j.info("VP: Verify that the file has been downloaded successfully to your local machine with the correct file name.");
        softAssert.assertTrue(fileDownloaderPage.doesFileNameExist(randomFileName),
                randomFileName + " has been downloaded unsuccessfully ");

        Log4j.info("Post-condition: Delete the downloaded file");
        fileDownloaderPage.deleteFileName(randomFileName);

        softAssert.assertAll(); // Perform the final assertion
    }
}
