import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Activity_1 {
    public static void main(String[] args) {
        // Create a new instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // Open the browser
        driver.get("https://www.amazon.in");

        // Close the browser
        driver.close();
    }
}
