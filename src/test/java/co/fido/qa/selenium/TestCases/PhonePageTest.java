package co.fido.qa.selenium.TestCases;

import co.fido.qa.selenium.Data.ExcelData;
import co.fido.qa.selenium.DriverManager.DriverManager;
import co.fido.qa.selenium.Listeners.ScreenshotListener;
import co.fido.qa.selenium.Pages.PhonePage;
import co.fido.qa.selenium.reports.HtmlReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({ScreenshotListener.class})
public class PhonePageTest {

    WebDriver driver= DriverManager.getDriver();
    ExtentTest test = HtmlReports.getReport().createTest("PhonePageTest");

    @Test(enabled = true,dataProvider = "fido_dataProvider" ,dataProviderClass = ExcelData.class)
    public void PhonePageTest(Object[] data) throws InterruptedException {

        PhonePage page=new PhonePage(driver);
        page.samsungLinks();
        Thread.sleep(1000);

        page.clearancecheckbox();
        Thread.sleep(1000);

        page.samsungViewBtn();
        Thread.sleep(2000);
        page.getStartedBtn();
//        driver.navigate().back();
        page.ContinueButton();
        Thread.sleep(1500);
page.scrollpage();
        page.Continuebtn2();
        Thread.sleep(2000);

        page.Continuebtn3();
        Thread.sleep(2000);

        page.Continuebtn4();
        Thread.sleep(2000);

        page.CheckoutBtn();
        Thread.sleep(3000);
Thread.sleep(3000);
page.scrollpage();
page.EmailField((String)data[0]);
page.confirm_email((String)data[1]);
page.first_Name((String)data[2]);
page.Last_Nmae((String)data[3]);
page.contact_no(data[4]);
page.billing((String)data[5]);
//page.shipp_add();
        Thread.sleep(3000);
//page.additional_comment((String)data[6]);
page.scrollpage();


//        page.continue_lastBtn();
    }
    @AfterClass
    public void flush(){
        HtmlReports.getReport().flush();
    }
}
