import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(6000);
       // driver.manage().window().minimize();
       // Thread.sleep(6000);
        driver.findElement(By.name("q")).sendKeys("Roman Reings Photos", Keys.ENTER);
        Thread.sleep(10000);
        driver.quit();
    }
}
