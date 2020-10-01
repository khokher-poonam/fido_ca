package co.fido.qa.selenium.DriverManager;

import co.fido.qa.selenium.Config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {

    public static DriverManager driverManager;
    public WebDriver webDriver;

    private DriverManager(){
        String browser = Config.getProperty("browser");
        webDriver =  initDriver( browser);
    }

    private WebDriver initDriver(String browser){
        if (browser.equalsIgnoreCase(BrowserType.CHROME)){
            System.setProperty(Config.getProperty("chrome.property"), Config.getProperty("chrome.exe.path"));
            return new ChromeDriver();
        }else if(browser.equalsIgnoreCase(BrowserType.FIREFOX)){
            System.setProperty(Config.getProperty("firefox.property"), Config.getProperty("firefox.exe.path"));
            return new FirefoxDriver();
        }else if(browser.equalsIgnoreCase(BrowserType.IE)) {
            System.setProperty(Config.getProperty("ie.property"), Config.getProperty("ie.exe.path"));
            return new InternetExplorerDriver();
        }else{
            System.setProperty(Config.getProperty("chrome.property"), Config.getProperty("chrome.exe.path"));
            return new ChromeDriver();
        }
    }

    public static  WebDriver getDriver(){
        if(driverManager == null){
            driverManager =new DriverManager();

        }
        return driverManager.webDriver;
    }
}
