import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeTestForDesiredCapabilities {
    public static void main(String[] args) {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome123");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver(capabilities);
        driver.manage().window().maximize();
        String browserName = capabilities.getBrowserName();
        driver.get("http://gmail.com");
        System.out.println("browser name is: " + browserName);
        driver.close();
    }
}
