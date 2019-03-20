import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class multipleActions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        String baseUrl = "http://www.facebook.com/";
        driver.get(baseUrl);

        WebElement txtUserName = driver.findElement(By.id("email"));

        Actions builder = new Actions(driver);
        Action seriusOfActions = builder
                .moveToElement(txtUserName)
                .click()
                .keyDown(txtUserName, Keys.SHIFT)
                .sendKeys(txtUserName, "hello")
                .keyUp(txtUserName, Keys.SHIFT)
                .doubleClick(txtUserName)
                .contextClick()
                .build();

        seriusOfActions.perform();

    }
}
