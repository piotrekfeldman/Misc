package Tests;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AppTest {
   @Test
    public void testApp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sendit.pl/");
        driver.findElement(By.linkText("Cennikds")).click();
    }
}
