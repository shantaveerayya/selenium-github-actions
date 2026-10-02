import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HelloWorldTest {

    @Test
    public void helloWorldTest() throws InterruptedException {

        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Close all child windows but keep parent

        // Store the parent window before child windows are opened
        String parentWindow = driver.getWindowHandle();
        // Click something that opens child windows
        driver.findElement(By.xpath("//button")).click();
        // Get all open windows
        Set<String> windows = driver.getWindowHandles();
        // Convert Set to List
        List<String> windowList = new ArrayList<>(windows);

        // Loop through all windows
        for (int i = 0; i < windowList.size(); i++) {
            // Store current window handle
            String currentWindow = windowList.get(i);
            // Check whether current window is NOT the parent
            if (!currentWindow.equals(parentWindow)) {
                // Switch to child window
                driver.switchTo().window(currentWindow);
                // Close child window
                driver.close();
            }
        }
        // After closing all child windows,
        // switch Selenium back to the parent
        driver.switchTo().window(parentWindow);


        Thread.sleep(2000);
        driver.quit();




    }
}