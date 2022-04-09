import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(" https://training-support.net/selenium/ajax");
        //print tile
        System.out.println("Title is"+driver.getTitle());
        driver.findElement(By.cssSelector(".violet")).click();
        WebElement ajax = driver.findElement(By.cssSelector("#ajax-content"));
        wait.until(ExpectedConditions.textToBePresentInElement(ajax,"HELLO!"));
        System.out.println(ajax.getText());
        wait.until(ExpectedConditions.textToBePresentInElement(ajax,"I'm late!"));
        System.out.println(ajax.getText());
        driver.close();
    }
}
