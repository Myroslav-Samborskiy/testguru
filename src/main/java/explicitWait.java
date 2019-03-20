import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait myWait = new WebDriverWait(driver, 2);
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        driver.get(baseUrl);

        try {
            myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
            driver.findElement(By.name("userName")).sendKeys("myroslav");
        } catch (TimeoutException toe) {
            System.out.println(toe);
        }

        driver.close();

    }
}
