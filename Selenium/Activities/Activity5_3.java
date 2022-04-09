import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.id("dynamicText")).isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println(driver.findElement(By.id("dynamicText")).isEnabled());
        driver.close();
    }
}
