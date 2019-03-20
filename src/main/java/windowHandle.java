import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        String baseUrl = "http://demo.guru99.com/popup.php";
        driver.get(baseUrl);

        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

        String mainWindow = driver.getWindowHandle();

        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {

            String ChildWindow = i1.next();

            if (!mainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.name("emailid"))
                        .sendKeys("myroslav212@gmail.com");

                driver.findElement(By.name("btnLogin")).click();

                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
    }
}
