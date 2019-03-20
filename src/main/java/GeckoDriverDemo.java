import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GeckoDriverDemo {
    String driverPath = "drivers/geckodriver";
    public WebDriver driver;

    @Before
    public void startBrowser(){
        System.setProperty("webdriver.gecko.driver", driverPath);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver(capabilities);

    }

    @Test
    public void navigateToUrl(){
        driver.get("http://demo.guru99.com/selenium/guru99home/");
    }

    @After
    public void endTest(){
        driver.close();
    }

}
