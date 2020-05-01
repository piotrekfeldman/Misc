package src.Dropdowns;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class AutoSuggestive {
    public static void main(String[] args) throws InterruptedException {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\chromedriver.exe");

        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://ksrtc.in/oprs-web/guest/home.do");

       // d.findElement(By.id("fromPlaceName")).click();
        d.findElement(By.id("fromPlaceName")).sendKeys("ban");
        Thread.sleep(3000);

        d.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);

        JavascriptExecutor js = (JavascriptExecutor) d;
        String executor = "return document.getElementById(\"fromPlaceName\").value;";
        String text = (String) js.executeScript(executor);
        System.out.println(text);
       // d.findElement(By.id("fromPlaceName")).click();
       // d.findElement(By.id("fromPlaceName")).sendKeys("BAN");
        int i=0;
        while (!text.equalsIgnoreCase("BANGALORE AIRPORT")) {
            i++;
            d.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
            text = (String) js.executeScript(executor);
            System.out.println(text);
            if (text.equalsIgnoreCase("BANGALORE AIRPORT")) {
                System.out.println("Element found");
                break;
            }


        }



        }

    }

