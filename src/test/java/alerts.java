import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement alert_button= driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        WebElement alert_conform=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        WebElement alert_prompt=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        alert_button.click();
        Alert a = driver.switchTo().alert();
        a.accept();
        alert_button.click();
        a.dismiss();
        alert_prompt.click();
        a.sendKeys("Hima is one powerfull codeing person in the world that means to make the history");
        a.accept();
        driver.quit();
    }
}
