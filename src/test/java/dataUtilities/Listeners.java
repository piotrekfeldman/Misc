package dataUtilities;

import Tests.SenditPl;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Listeners extends Base implements ITestListener {


   Screen s= new Screen();


    public Listeners() throws FileNotFoundException {
    }


    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {


        System.out.println("sukces");
      try {
            s.GetScreenShoot(driver, result.getName());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {

        GetScreenShoot(result.getName());
        System.out.println("Test zakończony porażką");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
