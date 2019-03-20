import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/social-icon.html";
        driver.get(baseUrl);
        String expectedTooltip = "Github";

        WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));
        String actualTooltip = github.getAttribute("title");

        System.out.println("Actual Title of Tool Tip " + actualTooltip);
        if (expectedTooltip.equals(actualTooltip)) {
            System.out.println("Test case passed");
        }

        driver.close();


    }
}
