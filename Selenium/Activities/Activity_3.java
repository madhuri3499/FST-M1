import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        //print title
        System.out.println(driver.getTitle());
        driver.findElement(By.id("firstName")).sendKeys("Madhu");
        driver.findElement(By.id("lastName")).sendKeys("G");
        driver.findElement(By.id("email")).sendKeys("madhu@gmail.com");
        driver.findElement(By.id("number")).sendKeys("8927351729");
        driver.findElement(By.cssSelector(".ui.green"));

        driver.close();
    }
}
