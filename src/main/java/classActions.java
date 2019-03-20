import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class classActions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        driver.get(baseUrl);

        WebElement linkHome = driver.findElement(By.linkText("Home"));
        WebElement tdHome = driver.findElement(By.xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));

        Actions builder = new Actions(driver);
        Action mouseOverHome = builder.moveToElement(linkHome).build();

        String bgColor = tdHome.getCssValue("background-color");
        System.out.println("before hover " + bgColor);
        mouseOverHome.perform();
        bgColor = tdHome.getCssValue("background-color");
        System.out.println("after hover " + bgColor);

        driver.close();

    }
}
