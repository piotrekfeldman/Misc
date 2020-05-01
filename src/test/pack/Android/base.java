package src.Android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class base {
    @Test
    public static void main(String[] args) throws MalformedURLException {
        String connectiontoserverlink="http://127.0.0.1:4723/wd/hub";

        // wd- web driver  ; hub
        File f= new File("src");
        File fs=new File(f,"ApiDemos-debug.apk");
        //File fs=new File(f,"API Demos for Android_v1.9.0_apkpure.com");
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
        cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
        AndroidDriver<AndroidElement> ad=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

    }
}
