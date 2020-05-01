package src.com;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Node {



    public static void main(String[] args) throws MalformedURLException {
        String baseUrl, nodeURL;
        nodeURL = "http://localhost:4444/wd/hub";
        baseUrl ="https://www.onet.pl/";
        DesiredCapabilities capabilities = new DesiredCapabilities();
       capabilities.setBrowserName("firefox");
       capabilities.setPlatform(Platform.LINUX);
       WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
       driver.get(baseUrl);

    }

    public void simpleTest(WebDriver driver, String baseUrl)
    {
        driver.get(baseUrl);

    }
}
