package co.fido.qa.selenium.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PhonePage {

    WebDriver driver;
    @FindBy(xpath="//*[@id='samsung-host']/label/div[1]")
    WebElement samsung;
    @FindBy(xpath="//*[@id='apple-host']/label/div[1]")
    WebElement apple;
    @FindBy(xpath="//*[@id=\"clearance-host\"]/label/div[1]")
    WebElement Clearance;

@FindBy(xpath="//a[contains(@title,'Samsung Galaxy S10+')]")
WebElement samsung5G_ViewDetailBtn;
@FindBy(xpath="//button[contains(@title,'Get started')]/span")
WebElement getStartedBtn;
@FindBy(xpath="//div[@class='dsa-layout container']//div[@class='p-24 w-100 ng-star-inserted']//button//span[1]//span")
WebElement ContinueButton;
@FindBy(xpath = "//div[@class='dsa-layout container']//div[@class='d-flex flex-row justify-content-end']//button//span[1]//span")
   WebElement Continuebtn2;
@FindBy(xpath = "//div[@class='dsa-layout container']//div[@class='d-flex flex-row justify-content-between']//button[@title='Continue']//span//span")
  WebElement Continuebtn3;
@FindBy(xpath = "//div[@class='dsa-layout container']//div[@class='d-flex flex-row-reverse']//button")
WebElement Continuebtn4;
@FindBy(xpath = "//div[@class='dsa-layout container']//div[@class='p-24']//button")
WebElement checkoutBtn;
@FindBy(xpath = "//input[@id='ds-form-input-id-0']")
WebElement emailField;
@FindBy(xpath = "//input[@id='ds-form-input-id-1']")
WebElement confirmEmail;
@FindBy(xpath = "//input[@id='ds-form-input-id-2']")
WebElement first_Name;
    @FindBy(xpath = "//input[@id='ds-form-input-id-3']")
    WebElement last_Name;
    @FindBy(xpath = "//input[@id='ds-form-input-id-4']")
    WebElement contactNo;
    @FindBy(xpath = "//input[@id='ds-form-input-id-7']")
    WebElement billingaddress;
    @FindBy(xpath = "//textarea[@id='ds-form-input-id-8']")
    WebElement additionalComment;
@FindBy(xpath  ="//div[@class='col-xs-12 col-md-7']//div[@id='step-1-open']//button")
WebElement continue_lastBtn;
@FindBy(xpath = "//input[@id='ds-radio-input-id-6']")
WebElement shipp_add;

    public PhonePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public PhonePage samsungLinks()
    {
        this.samsung.click();
        return this;
    }
    public PhonePage appleLinks()
    {
        this.apple.click();
        return this;
    }


    public PhonePage clearancecheckbox()
    {
        this.Clearance.click();
        return this;
    }


    public PhonePage samsungViewBtn() throws InterruptedException {
        this.samsung5G_ViewDetailBtn.click();
        Thread.sleep(4000);
        return this;
    }
    public PhonePage getStartedBtn() throws InterruptedException {
        this.getStartedBtn.click();
        Thread.sleep(3000);
        return this;
    }
    public  PhonePage ContinueButton()
    {
        this.ContinueButton.click();
        return this;
    }
    public void scrollpage()
    {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
        JavascriptExecutor jse = (JavascriptExecutor) this.driver;
        jse.executeScript("window.scrollBy(0,200)", "");


    }
    public PhonePage Continuebtn2()
    {
        this.Continuebtn2.click();
        return this;
    }
    public PhonePage Continuebtn3()
    {
        this.Continuebtn3.click();
        return this;
    }
    public PhonePage Continuebtn4()
    {
        this.Continuebtn4.click();
        return this;
    }
public PhonePage CheckoutBtn()
{
    this.checkoutBtn.click();
    return this;
}

  public PhonePage EmailField(String ef)
  {
      this.emailField.sendKeys(ef);
      return this;
  }
    public PhonePage confirm_email(String cf)
    {
        this.confirmEmail.sendKeys(cf);
        return this;
    }
    public PhonePage first_Name(String fn)
    {
        this.first_Name.sendKeys(fn);
        return this;
    }
    public PhonePage Last_Nmae(String ln)
    {
        this.last_Name.sendKeys(ln);
        return this;
    }
    public PhonePage contact_no(Object cn)
    {
        this.contactNo.sendKeys(String.valueOf(cn));
        return this;
    }
    public PhonePage billing(String ba)
    {
//        Select select=new Select(billingaddress);
//        select.selectByVisibleText("22 Hillson Crt - Brampton, ON, L6P 1C4");
        this.billingaddress.sendKeys(ba);
        this.billingaddress.click();
//        Actions act=new Actions(driver);
//        act.moveToElement(driver.findElement(By.xpath("//ul//li[@class='ng-star-inserted']"))).click().build().perform();
//        this.billingaddress.sendKeys(ba.trim());
//        billingaddress.sendKeys(Keys.DOWN);
//        billingaddress.sendKeys(Keys.ENTER);

        return this;
    }
    public PhonePage additional_comment(String ac)
    {
        this.additionalComment.sendKeys(ac.trim()+ Keys.ENTER);
        return this;

    }
    public PhonePage continue_lastBtn()
    {
        this.continue_lastBtn.click();
        return this;
    }
    public PhonePage shipp_add()
    {
        this.shipp_add.click();
        return this;
    }
}
