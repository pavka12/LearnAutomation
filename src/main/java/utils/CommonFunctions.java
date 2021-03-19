package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class CommonFunctions {


        public static WebDriver driver;
        public String screenShotPath = new File("src/main/resources/errorShots//").getAbsolutePath();

        public void openBrowser() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }

        public void closeBrowser() {

            driver.quit();
        }
        public void takeScreenShot(String fileName) throws Exception {
            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            File destFile = new File(screenShotPath + "+fileName+");
            FileUtils.copyFile(srcFile, destFile);


        }
    }


