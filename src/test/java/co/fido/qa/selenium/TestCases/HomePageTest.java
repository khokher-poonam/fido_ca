package co.fido.qa.selenium.TestCases;

import co.fido.qa.selenium.Config.Config;
import co.fido.qa.selenium.DriverManager.DriverManager;
import co.fido.qa.selenium.Listeners.ScreenshotListener;
import co.fido.qa.selenium.Pages.HomePage;
import co.fido.qa.selenium.reports.HtmlReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners({ScreenshotListener.class})

public class HomePageTest {
    WebDriver driver = DriverManager.getDriver();
    ExtentTest test = HtmlReports.getReport().createTest("HomePageTest");

    @BeforeSuite(enabled =true)
    public void setUp(){
        driver.get(Config.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
@Test
    public void HomePageTest() throws InterruptedException {
        HomePage page;
        page = new HomePage(driver);
    Assert.assertEquals("Phones, Plans and More - Go Get It | Fido",driver.getTitle());
        page.shopLink();

    }
    @AfterClass
    public void flush(){
        HtmlReports.getReport().flush();
    }
    @AfterSuite
    public void tearDown()
    {
        driver.quit();
    }
}
