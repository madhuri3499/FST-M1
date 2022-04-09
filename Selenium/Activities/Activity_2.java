import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net");
        //print title of page
        System.out.println(driver.getTitle());
        //using id
        WebElement elem = driver.findElement(By.id("about-link"));
        System.out.println("Text is"+elem.getText());
        //using class name
        WebElement classLoc = driver.findElement(By.className("green"));
        System.out.println("Text is"+classLoc.getText());
        //using linkText
        WebElement linkLoc = driver.findElement(By.linkText("About Us"));
        System.out.println("Text is"+linkLoc.getText());
        //using cssSelector
        WebElement cssLoc = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text is"+cssLoc.getText());

        driver.close();
    }
}
