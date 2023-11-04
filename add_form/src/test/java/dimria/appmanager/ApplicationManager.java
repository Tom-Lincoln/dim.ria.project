package dimria.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.Browser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  private final Properties properties;
  WebDriver driver;

  private AddFormHelper addFormHelper;
  private final String browser;
  public Object mainWindow;

  public ApplicationManager(String browser) {
    this.browser = browser;
    properties = new Properties();
  }

  public void init() throws IOException {
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
    if (browser.equals(Browser.CHROME.browserName())) {
      ChromeOptions options = getChromeOptions();
      driver = new ChromeDriver(options);
    } else if (browser.equals(Browser.FIREFOX.browserName())) {
      FirefoxOptions options = getFirefoxOptions();
      driver = new FirefoxDriver(options);
    }
    addFormHelper = new AddFormHelper(driver);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    driver.get(properties.getProperty("web.BaseUrl"));
    driver.findElement(By.xpath(properties.getProperty("GDPR.Locator.OK"))).click();
    login();
  }

  private static ChromeOptions getChromeOptions() {
    System.setProperty("webdriver.chrome.driver", "C:\\Java\\Projects\\drivers\\chromedriver.exe");
    System.setProperty("selenuim.browser.encoding", "UTF-8");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("test-type", "--disable-extensions", "--disable-gpu", "--no-sandbox");
    return options;
  }

  private static FirefoxOptions getFirefoxOptions() {
    System.setProperty("webdriver.gecko.driver", "C:\\Java\\Projects\\drivers\\geckodriver.exe");
      return new FirefoxOptions();
  }

  public void stop() {
    driver.quit();
  }

  public void login() {
    Cookie jwt = new Cookie("JWT", properties.getProperty("Cookie.Jwt"));
    Cookie pspId = new Cookie("PSP_ID", properties.getProperty("Cookie.PspId"));
    driver.manage().addCookie(jwt);
    driver.manage().addCookie(pspId);
    driver.navigate().refresh();
  }

  public void openNewWindow() throws InterruptedException {
    mainWindow = driver.getWindowHandle();
    driver.switchTo().newWindow(WindowType.TAB);
    TimeUnit.MILLISECONDS.sleep(250);
  }

  public void backToMainWindow() throws InterruptedException {
    driver.close();
    driver.switchTo().window((String) mainWindow);
    TimeUnit.MILLISECONDS.sleep(250);
  }

  public AddFormHelper addForm() {
    return addFormHelper;
  }

}
