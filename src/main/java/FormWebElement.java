import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormWebElement {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/login.html";
        driver.get(baseUrl);

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        WebElement submitButton = driver.findElement(By.id("SubmitLogin"));

        email.sendKeys("myroslav2112@gmail.co");
        password.sendKeys("323232");
        System.out.println("Text field set");

        email.clear();
        password.clear();
        System.out.println("Text field cleared");
        submitButton.click();

        driver.close();

    }
}
