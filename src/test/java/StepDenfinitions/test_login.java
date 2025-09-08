package StepDenfinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_login {
    WebDriver driver;

    @Given("opening the chrome brower")
    public void opening_the_chrome_brower() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(10,400)");
        Thread.sleep(3000);
    }

    @When("Entering the username and password")
    public void entering_the_username_and_password() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys("student");
        driver.findElement(By.name("password")).sendKeys("Password123");
        Thread.sleep(2000);
    }

    @When("clicking the login button")
    public void clicking_the_login_button() {
        driver.findElement(By.id("submit")).click();
    }

    @Then("closeing the brower")
    public void closeing_the_brower() {
        System.out.println("Closing the brower");
        driver.quit();
    }

}
