package co.fido.qa.selenium.TestCases;

import co.fido.qa.selenium.Config.Config;
import co.fido.qa.selenium.DriverManager.DriverManager;
import co.fido.qa.selenium.Listeners.ScreenshotListener;
import co.fido.qa.selenium.Utils.CaptureType;
import co.fido.qa.selenium.Utils.FrameWorkUtls;
import co.fido.qa.selenium.reports.HtmlReports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners({ScreenshotListener.class})
public class DummyTest {

    ExtentTest test = HtmlReports.getReport().createTest("DummyTest");
    @Test(enabled = false)
    public void testBrosweProperty(){
        System.out.println(Config.getProperty("browser"));
        Assert.assertEquals("chrome", Config.getProperty("browser"));
    }

    @Test(enabled = false, expectedExceptions = IllegalArgumentException.class)
    public void nonExitenceKeytest(){
        Config.getProperty("bac");
    }

    @Test()
    public void testBroser() throws InterruptedException, IOException {
        WebDriver driver = DriverManager.getDriver();
        driver.get(Config.getProperty("url"));

        test.log(Status.PASS, "APP URL OPENED SUCCEFFULLY");
        test.addScreenCaptureFromPath(FrameWorkUtls.captureScreen("testBroser", CaptureType.PASS));
        Thread.sleep(5000);
        driver.quit();
        HtmlReports.getReport().flush();
    }


}
