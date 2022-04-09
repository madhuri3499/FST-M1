import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        WebElement msg = driver.findElement(By.cssSelector("#action-confirmation"));
        wait.until(ExpectedConditions.visibilityOf(msg));
        System.out.println(msg.getText());
        driver.close();
    }
}
