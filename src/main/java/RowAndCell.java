import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class RowAndCell {
    public static void main(String[] args) throws ParseException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement baseTable = driver.findElement(By.tagName("table"));

        WebElement tableRow = baseTable.findElement(By.xpath(".//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
        String rowText = tableRow.getText();
        System.out.println("Third row of table: " + rowText);

        WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
        String valueIneed = cellIneed.getText();
        System.out.println("Cell value is : " + valueIneed);

        driver.close();


    }
}
