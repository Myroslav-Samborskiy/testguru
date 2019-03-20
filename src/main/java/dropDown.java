import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        String baseUrl = "http://demo.guru99.com/test/newtours/register.php";
        driver.get(baseUrl);

        Select drdCountry = new Select(driver.findElement(By.name("country")));
        drdCountry.selectByVisibleText("ALGERIA");


    }
}
