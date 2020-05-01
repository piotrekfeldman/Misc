package src.Miscellanous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class LinksOnThePage {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.teleman.pl/program-tv/stacje/Polsat-Sport-Premium-2?date=2019-11-05");
        System.out.println(driver.findElements(By.xpath("//a")).size());




    }
}