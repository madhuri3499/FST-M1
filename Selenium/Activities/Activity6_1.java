import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("toggleCheckbox")).click();
        WebElement checkbox = driver.findElement(By.xpath("//input[@name = 'toggled']"));
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        driver.findElement(By.id("toggleCheckbox")).click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();
        driver.close();
    }
}
