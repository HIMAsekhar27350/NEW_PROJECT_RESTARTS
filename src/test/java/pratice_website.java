import io.github.bonigarcia.wdm.WebDriverManager;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class pratice_website {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        String get_title=driver.getTitle();
        //String get_page_source=driver.getPageSource();
        String get_currentURL=driver.getCurrentUrl();
        System.out.println("TITLE = "+get_title);
        System.out.println("get_currentURL = "+get_currentURL);
        //System.out.println("get_page_source = "+get_page_source);
        driver.findElement(By.linkText("Test Login Page")).click();
        Thread.sleep(3000);
        WebElement username = driver.findElement(By.name("username"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //js.executeScript("arguments[0].scrollIntoView();",username);
        js.executeScript("window.scrollBy(10,400)");
        Thread.sleep(3000);
        username.sendKeys("student");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Password123");
        Thread.sleep(3000);
        WebElement submit_button=driver.findElement(By.id("submit"));
        submit_button.click();
        WebElement successmsg=driver.findElement(By.xpath("//h1[contains(text(),'Logged In Successfully')]"));
        WebElement msg=driver.findElement(By.xpath("//p[@class='has-text-align-center']//strong"));

        if(successmsg.isDisplayed()){
            System.out.println("MESSAGE IS DISPLAYED: "+successmsg.getText());
            System.out.println(msg.getText());
        }else {
            System.out.println("MESSAGE IS NOT DISPLAYED");
        }
        WebElement log_out=driver.findElement(By.linkText("Log out"));
        log_out.click();
        driver.quit();
    }
}
