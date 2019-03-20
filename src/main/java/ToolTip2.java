import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip2 {
    public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/test/tooltip.html";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String expectedTooltip = "What's new in 3.2";
        driver.get(baseUrl);

        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));

        Actions builder = new Actions(driver);
        builder.clickAndHold().moveToElement(download);
        builder.moveToElement(download).build().perform();

        WebElement actualTooltip = driver.findElement(By.xpath(".//*[@class='box']/div/a"));
        String tooltipActual = actualTooltip.getText();

        System.out.printf("actual tooltip is: " + tooltipActual);

        if (tooltipActual.equals(expectedTooltip)) {
            System.out.println("Test case passed");
        }


        driver.close();
    }
}
