import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

public class GetMaximumValue {
    public static void main(String[] args) throws ParseException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://demo.guru99.com/test/web-table-element.php");

        String max;
        double m = 0, r = 0;

        //No.of Columns
        List col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println("Total No of columns are: " + col.size());

        //No. of rows
        List rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("Total of rows are: " + rows.size());

        for (int i = 1; i < rows.size(); i++) {
            max = driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i + 1) + "]/td[4]")).getText();
            NumberFormat f = NumberFormat.getNumberInstance();
            Number num = f.parse(max);
            max = num.toString();
            m = Double.parseDouble(max);

            if (m > r) {
                r = m;
            }
        }
        System.out.printf("Maximum current price is :" + r);


        driver.close();

    }
}
