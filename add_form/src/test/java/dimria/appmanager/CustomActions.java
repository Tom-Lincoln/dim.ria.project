package dimria.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomActions extends Actions {
  public CustomActions(WebDriver driver) {
    super(driver);
  }

  @Override
  public CustomActions sendKeys(CharSequence... keys) {
    if (keys == null) {
      throw new IllegalArgumentException("Keys should be a not null CharSequence");
    }
    for (CharSequence key : keys) {
      key.codePoints()
              .forEach(
                      codePoint -> {
                        tick(getActiveKeyboard().createKeyDown(codePoint));
                        tick(getActiveKeyboard().createKeyUp(codePoint));
                        pause(55);
                      });
    }
    return this;
  }
}
