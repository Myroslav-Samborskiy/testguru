import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        driver.get(baseUrl);
        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.printf("Test passed");
        } else {
            System.out.printf("Test failed");
        }

        driver.quit();

    }
}
