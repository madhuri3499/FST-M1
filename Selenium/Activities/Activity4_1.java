import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net");
        //print title
        System.out.println("Title is"+driver.getTitle());
        driver.findElement(By.xpath("//a[@id='about-link']")).click();
        System.out.println("Title is"+driver.getTitle());
        driver.close();
    }
}
