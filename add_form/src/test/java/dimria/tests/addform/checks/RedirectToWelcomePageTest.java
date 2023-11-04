package dimria.tests.addform.checks;

import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RedirectToWelcomePageTest extends TestBase {

  @Test
  public void testRedirectToWelcomePageFromOperationTypePage() {
    app.addForm().redirectToWelcomePageFromOperationTypePage();
  }

  @Test
  public void testRedirectToWelcomePageFromCategoryTypePage() {
    app.addForm().redirectToWelcomePageFromCategoryTypePage();
  }

  @Test
  public void testRedirectToWelcomePageFromRealtyTypePage() {
    app.addForm().redirectToWelcomePageFromRealtyTypePage();
  }

  @Test
  public void testRedirectToWelcomePageFromGeoPage() {
    app.addForm().redirectToWelcomePageFromGeoPage();
  }

  @Test
  public void testRedirectToWelcomePageFromRPhotoPage() {
    app.addForm().redirectToWelcomePageFromPhotoPage();
  }

  @Test
  public void testRedirectToWelcomePageFromVideoPage() {
    app.addForm().redirectToWelcomePageFromVideoPage();
  }

  @Test
  public void testRedirectToWelcomePageFromBuildingPage() {
    app.addForm().redirectToWelcomePageFromBuildingPage();
  }

  @Test
  public void testRedirectToWelcomePageFromMainCharsPage() {
    app.addForm().redirectToWelcomePageFromMainCharsPage();
  }

  @Test
  public void testRedirectToWelcomePageFromCommunicationsPage() {
    app.addForm().redirectToWelcomePageFromCommunicationsPage();
  }

  @Test
  public void testRedirectToWelcomePageFurniturePage() {
    app.addForm().redirectToWelcomePageFromFurniturePage();
  }

  @Test
  public void testRedirectToWelcomePageFromUtpPage() {
    app.addForm().redirectToWelcomePageFromUtpPage();
  }

  @Test
  public void testRedirectToWelcomePageFromDescriptionPage() {
    app.addForm().redirectToWelcomePageFromDescriptionPage();
  }

  @Test
  public void testRedirectToWelcomePageFromPricePage() {
    app.addForm().redirectToWelcomePageFromPricePage();
  }

  @Test
  public void testRedirectToWelcomePageFromViewPage() {
    app.addForm().redirectToWelcomePageFromViewPage();
  }

}
