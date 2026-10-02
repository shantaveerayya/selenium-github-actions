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
        System.out.println("Hello World");


        Thread.sleep(2000);
        driver.quit();




    }
}