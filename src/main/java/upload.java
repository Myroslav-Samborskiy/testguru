import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        String baseUrl = "http://demo.guru99.com/test/upload/";
        driver.get(baseUrl);

        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        uploadElement.sendKeys("/home/myroslav/Изображения/1.png");

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("submitbutton")).click();

        driver.close();

    }
}
