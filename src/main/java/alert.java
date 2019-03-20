import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by myroslav on 14.02.19.
 */
public class alert {
    public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        String baseUrl = "http://demo.guru99.com/test/delete_customer.php";
        driver.get(baseUrl);
        WebElement customerID = driver.findElement(By.name("cusid"));
        customerID.sendKeys("hello");
        driver.findElement(By.name("submit")).click();
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.println(alertMessage);
        Thread.sleep(5000);
        alert.accept();


    }
}
