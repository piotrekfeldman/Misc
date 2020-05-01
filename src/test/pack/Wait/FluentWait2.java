package src.Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWait2 {

    public static void main  (String [] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\chromedriver.exe");

        WebDriver d=new ChromeDriver();
        d.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        d.findElement(By.cssSelector("div[id='start'] button")).click();

        Wait<WebDriver> wait2=new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
        WebElement foo2=wait2.until(new Function<WebDriver, WebElement>() {
            public WebElement apply (WebDriver driver)
            {
                if(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed())
                {
                    return (driver.findElement(By.cssSelector("div[id='finish'] h4")));
                }

                else
                {
                    return null;
                }
            }
        });
System.out.println(d.findElement(By.cssSelector("div[id='finish'] h4")).getText());

    }
}

