package dimria.tests;

import org.openqa.selenium.remote.Browser;
import org.testng.annotations.*;
import dimria.appmanager.ApplicationManager;

public class TestBase {

    protected static final ApplicationManager app = new ApplicationManager(Browser.CHROME.browserName());

    @BeforeSuite(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        app.stop();
    }

    @BeforeMethod
    public void newTab() throws InterruptedException {
        app.openNewWindow();
    }

    @AfterMethod
    public void returnMainPage() throws InterruptedException {
        app.backToMainWindow();
    }
}
