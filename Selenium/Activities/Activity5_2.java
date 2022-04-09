import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//input[@name='toggled']")).isSelected());
        driver.findElement(By.id("//input[@name='toggled']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@name='toggled']")).isSelected());
        driver.close();
    }
}
