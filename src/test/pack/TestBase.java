package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    static Properties prop = new Properties();
    public WebDriver driver = null;
    public FileInputStream fis = new FileInputStream(System.getProperty(("user.dir")) + "\\testng\\datadriven.properties");

    public TestBase() throws FileNotFoundException {
    }


    public WebDriver Login() throws IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\piotr\\Downloads\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\piotr\\Downloads\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "C:\\Users\\piotr\\Downloads\\IEDriverServer.exe");
        prop.load(fis);


        System.out.println(prop.get("username"));
        System.out.println(prop.get("password"));

        String browser = prop.getProperty("browser");
        //String browser=System.getProperty("browser");
        if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            driver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("ie")) {
            driver = new InternetExplorerDriver();

        }

        return driver;

    }


    public void OpenAndLog() throws IOException {


        driver.get(prop.getProperty("url"));
        driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
        driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
        driver.findElement(By.cssSelector("button[class='btn-default-large']")).click();

    }
}
