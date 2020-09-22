package co.fido.qa.selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
    @FindBy(xpath = "//ul[@class='o-navLinkList']//li//a[@title='Shop']")
    WebElement shop;
    @FindBy(xpath="//ul[@class='o-navLinkList']//li//a[@title='Mobile Phones']")
    WebElement phones;

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public HomePage shopLink() throws InterruptedException {
        this.shop.click();
        Actions actions=new Actions(driver);
        actions.moveToElement(shop).moveToElement(phones).click().build().perform();
        Thread.sleep(3000);
        return this;
    }
}
