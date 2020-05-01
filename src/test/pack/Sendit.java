package testng;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Sendit extends TestBase {


    public Sendit() throws FileNotFoundException {
    }

    @TestNG
    public void OpenBrowser() throws IOException {
        Login();
         OpenAndLog();
    }
}
