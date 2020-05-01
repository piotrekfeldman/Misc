package dataUtilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Screen {

    static WebDriver driver;

    public Screen(WebDriver driver) throws FileNotFoundException {
        Base b=new Base();

        this.driver= b.driver;
    }
    public Screen() {

    }

    public void GetScreenShoot(String result)  {


        File scrShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            File DestFile = new File("C:\\Users\\piotr\\OneDrive\\Desktop\\Nowy folder (4)\\Testcase " + result + new SimpleDateFormat("MM-dd-yyyy_HH-mm").format(new GregorianCalendar().getTime()) + ".png");
            FileUtils.copyFile(scrShot, DestFile);
        }
        catch(IOException e){
            e.printStackTrace();
        }




    }
}
