package dimria.appmanager;

import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class HelperBase {

  protected static WebDriver driver;

  public HelperBase(WebDriver driver) {
    HelperBase.driver = driver;
  }

  public static void goToUrl(String Url) {
    driver.get(Url);
  }

  public static void pause(Integer milliseconds) {
    try {
      TimeUnit.MILLISECONDS.sleep(milliseconds);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void implicitlyWait(int seconds) {
    driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
  }

  public static void refreshPage() {
    driver.navigate().refresh();
  }

  public static void clickAndMoveToElement(By locator) {
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("arguments[0].scrollIntoView({behavior: \"auto\", block: \"center\", inline: \"center\"});",
            driver.findElement(locator));
    pause(200);
    driver.findElement(locator).click();
  }

  private static void sendKeysForCustomActions(String text) {
    new CustomActions(driver)
            .sendKeys(text)
            .perform();
  }

  public static void clickAndSendText(By locator, String text) {
    driver.findElement(locator).sendKeys(text, Keys.ENTER);
  }

  public static void chooseSelectorValue(By locator, String text) {
    clickAndMoveToElement(locator);
    sendKeysForCustomActions(text);
    pause(1500);
    driver.findElement(By.cssSelector("div.item.block")).click();
    pause(100);
  }

  public static void addFile(By locator, String text) {
    driver.findElement(locator).sendKeys(text);
  }

  public static boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private static boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public static String getCurrentUrl() {
    pause(500);
    return driver.getCurrentUrl();
  }

  public static boolean checkDisabledElement(By locator) {
    return Boolean.parseBoolean(driver.findElement(locator).getAttribute("disabled"));
  }

  public static String getAttributeElement(By locator, String attribute) {
    return String.format(driver.findElement(locator).getAttribute(attribute));
  }

  public static String checkDisplayValue(By locator) {
    return driver.findElement(locator).getCssValue("display");
  }

  public static boolean isSelectedElement(By locator) {
    return driver.findElement(locator).isSelected();
  }

  public static String getText(By locator) {
    return driver.findElement(locator).getText();
  }
}
