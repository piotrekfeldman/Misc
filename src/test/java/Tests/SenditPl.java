package Tests;

import dataUtilities.Base;
import dataUtilities.PageObjectRepo;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SenditPl extends Base {

    public SenditPl() throws FileNotFoundException {
    }

    @BeforeTest
    public void OpenBrowser() throws IOException, InterruptedException {
        BasicConfigurator.configure();  // linijka wymagana aby uruchomić loggera
        driver = InitializeDriver();

        //Base b=new Base();
        //b.Logs().debug();
        Logger logger=Logs();
        logger.info("Driver initialized");
        driver.get("https://sendit.pl/");
        logger.debug("Page is open");
        logger.debug("Landing Sendit page is open");
        Thread.sleep(3000);

    }

    @Test
    public void Zaloguj() {
        PageObjectRepo p = new PageObjectRepo(driver);
        p.Zaloguj().click();
        p.Username().sendKeys(pr.getProperty("username"));
        p.Password().sendKeys(pr.getProperty("password"));
            p.Submit().click();
        }


        @AfterTest
        public void Shutdown () {


            driver.quit();
        }

    }
