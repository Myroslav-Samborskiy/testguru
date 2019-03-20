import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchTo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String alertMessage = "";
        driver.get("http://output.jsbin.com/usidix/1");
        driver.findElement(By.xpath("//input[@value = 'Go!']")).click();
        alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        driver.switchTo().alert().accept();


        driver.close();

    }
}
