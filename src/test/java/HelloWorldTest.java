import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HelloWorldTest {

    @Test
    public void helloWorldTest() throws InterruptedException {

        //WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        System.out.println("Hello World");

        String actualTitle = driver.getTitle();

        // Intentionally wrong expected value
        Assertions.assertEquals("Wrong Title", actualTitle);

        Thread.sleep(2000);
        driver.quit();




    }
}