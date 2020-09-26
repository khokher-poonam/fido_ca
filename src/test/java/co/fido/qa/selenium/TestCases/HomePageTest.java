package co.fido.qa.selenium.TestCases;

import co.fido.qa.selenium.Config.Config;
import co.fido.qa.selenium.DriverManager.DriverManager;
import co.fido.qa.selenium.Listener.ScreenshotListener;
import co.fido.qa.selenium.Pages.HomePage;
import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({ScreenshotListener.class})

public class HomePageTest {
    WebDriver driver = DriverManager.getDriver();

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
    @AfterSuite
    public void tearDown()
    {
        driver.quit();
    }
}
