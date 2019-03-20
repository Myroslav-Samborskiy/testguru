import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
        driver.get(baseUrl);

        driver.findElement(By.cssSelector("a[title=\"Перейти на главную страницу Facebook\"]")).click();

        if (driver.getTitle().equals("Facebook — Выполните вход или зарегистрируйтесь")) {
            System.out.println("Ви на головній сторінці сайту");
        } else {
            System.out.println("Ви не на головній сторінці сайту");
        }

        driver.close();


    }
}
