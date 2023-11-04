package dimria.appmanager;

import dimria.model.DataAddForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static org.testng.Assert.*;


public class AddFormHelper extends HelperBase {

  public AddFormHelper(WebDriver driver) {
    super(driver);
  }


  // ********************************************   Other Locators


  // Підсвічування поля червоною рамкою
  private boolean showErrorField(String locator){
    return driver.findElement(By.xpath(locator)).getAttribute("class").contains("show-error");

    //return //Objects.equals(driver.findElement(By.xpath(locator)).getAttribute("class"),"item-pseudoselect-form show-error");

  }

  // Меседж знизу на сторінці - не видимий
  private String getLocatorMessageNotShow(){
    return "//*[@class=\"toast-wrapper\"]";
  }

  // Меседж знизу на сторінці - видимий
  private String getLocatorMessageShow(){
    return "//*[@class=\"toast-wrapper show\"]";
  }


  // ********************************************   Url Locators

  private static String getUrlAddForm() {
    return "https://dom.ria.com/v2/uk/add_form/";
  }

  private static String getUrlOperationTypePage() {
    return "https://dom.ria.com/v2/uk/add_form/operation-type";
  }

  private static String getUrlCategoryTypePage() {
    return "https://dom.ria.com/v2/uk/add_form/category-type";
  }

  private static String getUrlRealtyTypePage() {
    return "https://dom.ria.com/v2/uk/add_form/realty-type";
  }

  private static String getUrlGeoPage() {
    return "https://dom.ria.com/v2/uk/add_form/geo";
  }

  private static String getUrlPhotoPage() {
    return "https://dom.ria.com/v2/uk/add_form/photo";
  }

  private static String getUrlVideoPage() {
    return "https://dom.ria.com/v2/uk/add_form/video";
  }

  private static String getUrlBuildingPage() {
    return "https://dom.ria.com/v2/uk/add_form/building";
  }

  private static String getUrlMainCharsPage() {
    return "https://dom.ria.com/v2/uk/add_form/main_chars";
  }

  private static String getUrlCommunicationsPage() {
    return "https://dom.ria.com/v2/uk/add_form/communications";
  }

  private static String getUrlFurniturePage() {
    return "https://dom.ria.com/v2/uk/add_form/furniture";
  }

  private static String getUrlUtpPage() {
    return "https://dom.ria.com/v2/uk/add_form/utp";
  }

  private static String getUrlDescriptionPage() {
    return "https://dom.ria.com/v2/uk/add_form/description";
  }

  private static String getUrlPricePage() {
    return "https://dom.ria.com/v2/uk/add_form/price";
  }

  private static String getUrlViewPage() {
    return "https://dom.ria.com/v2/uk/add_form/realty-view";
  }


  // ********************************************   Buttons And Left Title Locators


  private static String getLocatorButtonNextPage() {
    return "//*[@id=\"app\"]/div/div[3]/div/button[2]";
  }

  private static String getLocatorButtonBackPage() {
    return "//*[@id=\"app\"]/div/div[3]/div/button[1]";
  }

  private static String getLocatorLeftTitle() {
    return "//*[@id=\"app\"]/div/div[1]/div/div[1]/span";
  }

  private static String getLocatorButtonNextOnWelcomePage() {
    return "//*[@id=\"app\"]/div/div[1]/div/div[2]/div/button";
  }


  // ********************************************   OperationType & CategoryType & RealtyType Helper Locators


  private static String getLocatorOperationTypeSale() {
    return "//label[@for=\"step2-1\"]";
  }

  private static String getLocatorOperationTypeRentLong() {
    return "//label[@for=\"step2-2\"]";
  }

  private static String getLocatorOperationTypeRentDay() {
    return "//label[@for=\"step2-3\"]";
  }

  private static String getLocatorCategoryTypeApartment() {
    return "//label[@for=\"step2-1\"]";
  }

  private static String getLocatorCategoryTypeRoom() {
    return "//label[@for=\"step2-40\"]";
  }

  private static String getLocatorCategoryTypeHouse() {
    return "//label[@for=\"step2-4\"]";
  }

  private static String getLocatorCategoryTypeCommercial() {
    return "//label[@for=\"step2-13\"]";
  }

  private static String getLocatorCategoryTypeLand() {
    return "//label[@for=\"step2-24\"]";
  }

  private static String getLocatorCategoryTypeGarage() {
    return "//label[@for=\"step2-30\"]";
  }

  private static String getLocatorRealtyTypeOne() {
    return "//label[@for=\"step2-1\"]";
  }

  private static String getLocatorRealtyTypeTwo() {
    return "//label[@for=\"step2-2\"]";
  }

  private static String getLocatorRealtyTypeThree() {
    return "//label[@for=\"step2-3\"]";
  }

  private static String getLocatorRealtyTypeFour() {
    return "//label[@for=\"step2-4\"]";
  }


  // ********************************************   Geo Locators


  private static String getPathInputThisElement() {
    return "//preceding-sibling::input[1]";
  }

  private static String getLocatorCity() {
    return "//input[@id=\"field1\"]";
  }

  private static String getLocatorResidentialComplex() {
    return "//input[@id=\"field2\"]";
  }

  private static String getLocatorMetro() {
    return "//input[@id=\"field3\"]";
  }

  private static String getLocatorDistrict() {
    return "//input[@id=\"field4\"]";
  }

  private static String getLocatorStreet() {
    return "//input[@id=\"field5\"]";
  }

  private static String getLocatorBuildingNum() {
    return "//input[@id=\"field6\"]";
  }

  private static String getLocatorRoomNum() {
    return "//input[@placeholder=\"№ квартири\"]";
  }

  private static String getLocatorBuildingNumDoNotShow() {
    return "//label[@for=\"isShowBuildingNo\"]";
  }

  private static String getLocatorNoBuildingNumber() {
    return "//label[@for=\"no_building_number\"]";
  }

  private static String getLocatorRoomNumDoNotShow() {
    return "//label[@for=\"isShowFlatNo\"]";
  }

  private static String getLocatorCadastreNum() {
    return "//input[@placeholder=\"Кадастровий номер\"]";
  }

  private static String getLocatorCadastreNumDoNotShow() {
    return "//label[@for=\"showCadastreNumber\"]";
  }

  private static String getLocatorCircleLocation() {
    return "//input[@id=\"building_circle\"]";
  }

  private static String getLocatorPointLocation() {
    return "//input[@id=\"building_point\"]";
  }


  // ********************************************   Photo And Video Locators


  private static String getLocatorVideoLink() {
    return "//input[@id=\"videoInput\"]";
  }

  private static String getLocatorMessageSaveDraftsPagePhoto() {
    return "//div[contains(text(),\"Оголошення збережено в Чернетках.\")]";
  }

  private static String getMessageTextPleaseWait() {
    return "Зачекайте, поки всі фото завантажаться!";
  }

  private static String getMessageTextPhotoDeleted() {
    return "Фото видалено";
  }

  private static String getMessageNoMainVerticalPhoto() {
    return "Вертикальне фото не може бути головним";
  }

  private static String getLocatorAddPhoto() {
    return "//input[@type='file']";
  }

  private static String getLocatorErrorAdd() {
    return "//span[contains(text(), \"На жаль, не вдалось завантажити\")]";
  }

  private static String getPathPhotoFileJpgFormat(int i) {
    return "C:\\Java\\Projects\\dim.ria.project\\add_form\\src\\test\\resources\\photo\\" + i + ".jpg";
  }

  private static String getPathPhotoPngFormat() {
    return "C:\\Java\\Projects\\dim.ria.project\\add_form\\src\\test\\resources\\photo\\1.png";
  }

  private static String getPathPhotoJpegFormat() {
    return "C:\\Java\\Projects\\dim.ria.project\\add_form\\src\\test\\resources\\photo\\2.jpeg";
  }

  private static String getPathPhotoJpgFormat() {
    return "C:\\Java\\Projects\\dim.ria.project\\add_form\\src\\test\\resources\\photo\\3.jpg";
  }

  private static String getPathPhotoPngVerticalFormat() {
    return "C:\\Java\\Projects\\dim.ria.project\\add_form\\src\\test\\resources\\photo\\4.png";
  }

  private static String getPathPhotoHeicFormat() {
    return "C:\\Java\\Projects\\dim.ria.project\\add_form\\src\\test\\resources\\photo\\5.heic";
  }

  private static String getLocatorMessageInvalidAddPhoto(int countDeletePhoto) {
    return "//div[contains(text(), \"Нам шкода, та ми змушені видалити " + countDeletePhoto + " фото\")]";
  }

  private static String getPathBigSizePhoto() {
    return "C:\\Java\\Projects\\dim.ria.project\\add_form\\src\\test\\resources\\photo\\bad\\more10MB.jpg";
  }

  private static String getPathSmallHorizontalSidePhoto() {
    return "C:\\Java\\Projects\\dim.ria.project\\add_form\\src\\test\\resources\\photo\\bad\\599x600.jpg";
  }

  private static String getPathSmallVerticalSidePhoto() {
    return "C:\\Java\\Projects\\dim.ria.project\\add_form\\src\\test\\resources\\photo\\bad\\600x599.jpg";
  }

  private static String getPathBmpFormatPhoto() {
    return "C:\\Java\\Projects\\dim.ria.project\\add_form\\src\\test\\resources\\photo\\bad\\0024.bmp";
  }

  private static String getPathGifFormatPhoto() {
    return "C:\\Java\\Projects\\dim.ria.project\\add_form\\src\\test\\resources\\photo\\bad\\0022.gif";
  }

  private static String getPathBadPhoto() {
    return "C:\\Java\\Projects\\dim.ria.project\\add_form\\src\\test\\resources\\photo\\bad\\00000.jpg";
  }

  private static String getLocatorMessageBigSizePhoto() {
    return "//div[contains(text(), \"Фото більше 10 мегабайт\")]";
  }

  private static String getLocatorMessageSmallSizesPhoto() {
    return "//div[contains(text(), \"Фото менше 600х600 пікселів\")]";
  }

  private static String getLocatorMessageBadFormatPhoto() {
    return "//div[contains(text(), \"Фото недопустимого формату, використайте jpeg, jpg, png, heic, heif\")]";
  }

  private static String getLocatorMessageBadFilePhoto() {
    return "//div[contains(text(), \"Файл пошкоджено\")]";
  }

  private static String getLocatorMessageHasBennAddedPhoto() {
    return "//div[contains(text(), \"Фото вже додане\")]";
  }

  private static String getLocatorMessagePhotoPageNoAddedFiles() {
    return "//span[contains(text(), \"Додайте щонайменше\")]";
  }

  private static String getLocatorSelectDeleteFirstPhoto() {
    return "//*[@id=\"app\"]/div[1]/div[1]/div/div[2]/div[2]/div/span/div[1]/span[2]/span/label[2]";
  }

  private static String getLocatorMenuFirstPhoto() {
    return "//*[@id=\"app\"]/div[1]/div[1]/div/div[2]/div[2]/div/span/div[1]/span[2]/label[2]";
  }

  private static String getLocatorSelectMainFourPhoto() {
    return "//*[@id=\"app\"]/div[1]/div[1]/div/div[2]/div[2]/div/span/div[4]/span/span/label[1]";
  }

  private static String getLocatorMenuFourPhoto() {
    return "//*[@id=\"app\"]/div[1]/div[1]/div/div[2]/div[2]/div/span/div[4]/span/label[2]";
  }

  private static String getLocatorButtonDeleteModalWindow() {
    return "//button[contains(text(), \"Видалити\")]";
  }


  // ********************************************   Main Chars Locators


  private static String getLocatorGroundFloor() {
    return "//*[contains(label, \"Цокольний поверх\")]/*[last()]";
  }

  private static String getLocatorInputGroundFloor() {
    return "//input[@placeholder=\"0\"]";
  }

  private static String getLocatorTypeNewBuilding() {
    return "//label[@for=\"step9-2\"]";
  }

  private static String getLocatorTypeOldBuilding() {
    return "//label[@for=\"step9-1\"]";
  }

  private static String getLocatorRooms() {
    return "//input[@placeholder=\"Кімнат\"]";
  }

  private static String getLocatorTotalArea() {
    return "//input[@placeholder=\"Загальна, м²\"]";
  }

  private static String getLocatorFloor() {
    return "//input[@placeholder=\"Поверх\"]";
  }

  private static String getLocatorFloors() {
    return "//input[@placeholder=\"Поверховість\"]";
  }

  private static String getLocatorFloorsHouse() {
    return "//input[@placeholder=\"Житлових поверхів\"]";
  }

  private static String getLocatorCarPlaces() {
    return "//input[@placeholder=\"Машиномісць\"]";
  }

  private static String getLocatorArea() {
    return "//input[@placeholder=\"Площа\"]";
  }

  private static String getLocatorUnitLandMeasurementSquareMetres() {
    return "//label[@for=\"id_225\"]";
  }

  private static String getLocatorUnitLandMeasurementHectare() {
    return "//label[@for=\"id_224\"]";
  }

  private static String getLocatorUnitLandMeasurementHundred() {
    return "//label[@for=\"id_223\"]";
  }


  // ********************************************   Communications & Furniture & Utp Locators


  private static String getLocatorOneCharacteristic() {
    return "//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[1]/div[2]/div/div/div/span[1]/span[1]/label";
  }

  private static String getLocatorTwoCharacteristic() {
    return "//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div/span[1]/span[1]/label";
  }

  private static String getLocatorThreeCharacteristic() {
    return "//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[3]/div[2]/div/div/div/span[1]/span[1]/label";
  }

  private static String getLocatorFourCharacteristic() {
    return "//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[4]/div[2]/div/div/div/span[1]/span[1]/label";
  }

// ****************************************** Utp

  private static String getLocatorOneUtp() {
    return "//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[1]/div[2]/div/div/div/span/span[3]/label";
  }

  private static String getLocatorTwoUtp() {
    return "//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div/span/span[2]/label";
  }

  private static String getLocatorThreeUtp() {
    return "//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[3]/div[2]/div/div/div/span/span[3]/label";
  }


  // ********************************************   Description Locators


  private static String getLocatorDescription() {
    return "//*[@id=\"descArea\"]";
  }

  private static String getTextDescription() {
    return "тестове оголошення, не для продажу !!! " +
            "тестове оголошення, не для продажу !!! тестове оголошення, не для продажу !!! " +
            "тестове оголошення, не для продажу !!! тестове оголошення, не для продажу !!! " +
            "тестове оголошення, не для продажу !!! тестове оголошення, не для продажу !!! " +
            "тестове оголошення, не для продажу !!! тестове оголошення, не для продажу";
  }


  // ********************************************   Price Locators


  private static String getLocatorPrice() {
    return "//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div/div/input";
  }

  private static String getLocatorCurrencyEur() {
    return "//*[contains(label, \"€\")]/*[last()]";
  }

  private static String getLocatorCurrencyUah() {
    return "//*[contains(label, \"грн\")]/*[last()]";
  }

  private static String getLocatorCurrencyUsd() {
    return "//*[contains(label, \"$\")]/*[last()]";
  }

  private static String getLocatorMessageErrorMandatoryFields() {
    return "//*[contains(text(), \"У Вас є незаповнені обов'язкові поля.\")]/parent::div";
  }

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  // ********************************************   Redirect To Welcome Page

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  private static void checkRedirectToWelcomePage(String url) {
    pause(1000);
    goToUrl(url);
    pause(1000);
    assertEquals(getUrlAddForm(), getCurrentUrl());
  }

  public void redirectToWelcomePageFromOperationTypePage() {
    checkRedirectToWelcomePage(getUrlOperationTypePage());
  }

  public void redirectToWelcomePageFromCategoryTypePage() {
    checkRedirectToWelcomePage(getUrlCategoryTypePage());
  }

  public void redirectToWelcomePageFromRealtyTypePage() {
    checkRedirectToWelcomePage(getUrlRealtyTypePage());
  }

  public void redirectToWelcomePageFromGeoPage() {
    checkRedirectToWelcomePage(getUrlGeoPage());
  }

  public void redirectToWelcomePageFromPhotoPage() {
    checkRedirectToWelcomePage(getUrlPhotoPage());
  }

  public void redirectToWelcomePageFromVideoPage() {
    checkRedirectToWelcomePage(getUrlVideoPage());
  }

  public void redirectToWelcomePageFromBuildingPage() {
    checkRedirectToWelcomePage(getUrlBuildingPage());
  }

  public void redirectToWelcomePageFromMainCharsPage() {
    checkRedirectToWelcomePage(getUrlMainCharsPage());
  }

  public void redirectToWelcomePageFromCommunicationsPage() {
    checkRedirectToWelcomePage(getUrlCommunicationsPage());
  }

  public void redirectToWelcomePageFromFurniturePage() {
    checkRedirectToWelcomePage(getUrlFurniturePage());
  }

  public void redirectToWelcomePageFromUtpPage() {
    checkRedirectToWelcomePage(getUrlUtpPage());
  }

  public void redirectToWelcomePageFromDescriptionPage() {
    checkRedirectToWelcomePage(getUrlDescriptionPage());
  }

  public void redirectToWelcomePageFromPricePage() {
    checkRedirectToWelcomePage(getUrlPricePage());
  }

  public void redirectToWelcomePageFromViewPage() {
    checkRedirectToWelcomePage(getUrlViewPage());
  }

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  // ********************************************   OperationType & CategoryType & RealtyType Helper

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  private void selectOperationTypeAndCheckSelected(By locator, String actualTextOnPage) {
    goToUrl(getUrlAddForm());
    // привітальна сторінка
    pause(2000);
    clickAndMoveToElement(By.xpath(getLocatorButtonNextOnWelcomePage()));
    pause(1000);
    // вибір типу операції
    implicitlyWait(5);
    clickAndMoveToElement(locator);
    assertEquals(actualTextOnPage, getAttributeElement(locator, "innerText"));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  private void selectOnPageAndCheckSelectedAndTapNext(By locator, String actualTextOnPage) {
    if (Objects.equals(actualTextOnPage, "Квартира")
            || Objects.equals(actualTextOnPage, "Кімната")
            || Objects.equals(actualTextOnPage, "Будинок")
            || Objects.equals(actualTextOnPage, "Комерційна нерухомість")
            || Objects.equals(actualTextOnPage, "Земля")
            || Objects.equals(actualTextOnPage, "Гараж")) {
      assertEquals(getUrlCategoryTypePage(), getCurrentUrl());
    } else {
      assertEquals(getUrlRealtyTypePage(), getCurrentUrl());
    }
    clickAndMoveToElement(locator);
    assertTrue(getAttributeElement(locator, "innerText").contains(actualTextOnPage));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  public void selectOperationTypeSale() {
    selectOperationTypeAndCheckSelected(By.xpath(getLocatorOperationTypeSale()), "Продати");
  }

  public void selectOperationTypeRentLong() {
    selectOperationTypeAndCheckSelected(By.xpath(getLocatorOperationTypeRentLong()),"Здати довгостроково");
  }

  public void selectOperationTypeRentDay() {
    selectOperationTypeAndCheckSelected(By.xpath(getLocatorOperationTypeRentDay()), "Здати подобово");
  }

  public void selectApartment() {
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorCategoryTypeApartment()), "Квартира");
  }

  public void selectRoom() {
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorCategoryTypeRoom()), "Кімната");
  }

  public void selectHouse() {
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorCategoryTypeHouse()), "Будинок");
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorRealtyTypeOne()), "Приватний будинок");
  }

  public void selectHousePart() {
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorCategoryTypeHouse()), "Будинок");
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorRealtyTypeTwo()), "Частина будинку");
  }

  public void selectTownhouse() {
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorCategoryTypeHouse()), "Будинок");
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorRealtyTypeThree()), "Таунхаус");
  }

  public void selectCommercialOffice() {
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorCategoryTypeCommercial()), "Комерційна нерухомість");
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorRealtyTypeOne()), "Офісне приміщення");
  }

  public void selectCommercialPremises() {
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorCategoryTypeCommercial()), "Комерційна нерухомість");
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorRealtyTypeTwo()), "Комерційне приміщення");
  }

  public void selectCommercialSpecialPremises() {
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorCategoryTypeCommercial()), "Комерційна нерухомість");
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorRealtyTypeThree()), "Спеціальне приміщення");
  }

  public void selectLandResidentialDevelopment() {
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorCategoryTypeLand()), "Земля");
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorRealtyTypeOne()), "Ділянка під житлову забудову");
  }

  public void selectLandCommercialPurposes() {
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorCategoryTypeLand()), "Земля");
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorRealtyTypeTwo()), "Земля комерційного призначення");
  }

  public void selectLandAgriculturalPurposes() {
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorCategoryTypeLand()), "Земля");
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorRealtyTypeThree()), "Земля сільськогосподарського призначення");
  }

  public void selectGarage() {
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorCategoryTypeGarage()), "Гараж");
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorRealtyTypeOne()), "Окремий гараж");
  }

  public void selectGaragePlaceCooperative() {
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorCategoryTypeGarage()), "Гараж");
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorRealtyTypeTwo()), "Місце в гаражному кооперативі");
  }

  public void selectPlaceCarPark() {
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorCategoryTypeGarage()), "Гараж");
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorRealtyTypeThree()), "Місце на стоянці");
  }

  public void selectParking() {
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorCategoryTypeGarage()), "Гараж");
    selectOnPageAndCheckSelectedAndTapNext(By.xpath(getLocatorRealtyTypeFour()), "Паркінг");
  }

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  // ********************************************   Geo Helper

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  private void clearCity() {
    clickAndMoveToElement(By.xpath(getLocatorCity()));
    clickAndMoveToElement(By.xpath("//*[@id=\"clearLocation1\"]"));
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    pause(1000);
  }

  private void inputAndSelectCity(DataAddForm dataAddForm) {
    chooseSelectorValue(By.xpath(getLocatorCity()), dataAddForm.getCity());
    assertTrue(getAttributeElement(By.xpath(getLocatorCity()), "value").contains(dataAddForm.getCity()));
    // Перевірка що по замовчуванню виділена лише ха-ка локації "точно"
    assertTrue(isSelectedElement(By.xpath(getLocatorPointLocation())));
    assertFalse(isSelectedElement(By.xpath(getLocatorCircleLocation())));
  }

  // Перевіряємо що поле "Метро" присутнє, або відсутнє і при наявності заповнюємо якщо є в об'єкті значення
  private void inputAndSelectMetro(DataAddForm dataAddForm) {
    implicitlyWait(0);
    if ((Objects.equals(dataAddForm.getCity(), "Київ"))
            || (Objects.equals(dataAddForm.getCity(), "Харків"))
            || (Objects.equals(dataAddForm.getCity(), "Дніпро"))) {
      if (dataAddForm.getMetro() != null) {
        chooseSelectorValue(By.xpath(getLocatorMetro()), dataAddForm.getMetro());
        assertEquals(dataAddForm.getMetro(), getAttributeElement(By.xpath(getLocatorMetro()), "value"));
      } else {
        assertTrue(isElementPresent(By.xpath(getLocatorMetro())));
        assertEquals("", getAttributeElement(By.xpath(getLocatorMetro()), "value"));
      }
    } else {
      assertFalse(isElementPresent(By.xpath(getLocatorMetro())));
    }
  }

  private void inputAndSelectDistrict(DataAddForm dataAddForm) {
    if (dataAddForm.getDistrict() != null) {
      chooseSelectorValue(By.xpath(getLocatorDistrict()), dataAddForm.getDistrict());
      assertEquals(dataAddForm.getDistrict(), getAttributeElement(By.xpath(getLocatorDistrict()), "value"));
    } else {
      assertEquals("", getAttributeElement(By.xpath(getLocatorDistrict()), "value"));
    }
  }

  // Вибір ЖК або введення вулиці
  private void selectResidentialComplexOrStreet(DataAddForm dataAddForm) {
    if (dataAddForm.getResidentialComplex() != null) {
      chooseSelectorValue(By.xpath(getLocatorResidentialComplex()), dataAddForm.getResidentialComplex());
      assertTrue(getAttributeElement(By.xpath(getLocatorResidentialComplex()), "value").contains(dataAddForm.getResidentialComplex()));
      pause(500);
      assertNotEquals("", getAttributeElement(By.xpath(getLocatorStreet()), "value"));
    } else {
      inputAndSelectStreet(dataAddForm);
    }
  }

  private void inputAndSelectStreet(DataAddForm dataAddForm) {
    chooseSelectorValue(By.xpath(getLocatorStreet()), dataAddForm.getStreet());
    assertTrue(getAttributeElement(By.xpath(getLocatorStreet()), "value").contains(dataAddForm.getStreet()));
  }

  private void insertBuildingNum(DataAddForm dataAddForm) {
    if (dataAddForm.getBuildNum() != null) {
      chooseSelectorValue(By.xpath(getLocatorBuildingNum()), dataAddForm.getBuildNum());
      assertEquals(dataAddForm.getBuildNum(), getAttributeElement(By.xpath(getLocatorBuildingNum()), "value"));
    } else {
      assertEquals("", getAttributeElement(By.xpath(getLocatorBuildingNum()), "value"));
    }
  }

  // Вводимо номер будинку для квартир (можливе значення "Номер будинку не присвоєно")
  private void selectBuildingNumApartment(DataAddForm dataAddForm) {
    if (dataAddForm.getNoBuildingNumber()) {
      clickAndMoveToElement(By.xpath(getLocatorNoBuildingNumber()));
      assertTrue(isSelectedElement(By.xpath(getLocatorNoBuildingNumber() + getPathInputThisElement())));
      checkDisabledElement(By.xpath(getLocatorBuildingNum()));
    } else {
      assertFalse(isSelectedElement(By.xpath(getLocatorNoBuildingNumber() + getPathInputThisElement())));
      insertBuildingNum(dataAddForm);
    }
  }

  // Вибираємо ха-ку Номер будинку "Не показувати" і перевіряємо вивід на карті (радіус, точно)
  private void selectBuildingNumDoNotShow(DataAddForm dataAddForm) {
    if (dataAddForm.getBuildingNumDoNotShow()) {
      clickAndMoveToElement(By.xpath(getLocatorBuildingNumDoNotShow()));
      assertTrue(isSelectedElement(By.xpath(getLocatorBuildingNumDoNotShow() + getPathInputThisElement())));
      assertTrue(isSelectedElement(By.xpath(getLocatorCircleLocation())));
    } else {
      assertFalse(isSelectedElement(By.xpath(getLocatorBuildingNumDoNotShow() + getPathInputThisElement())));
      if (dataAddForm.getNoBuildingNumber()) {
        assertTrue(isSelectedElement(By.xpath(getLocatorCircleLocation())));
      } else {
        assertTrue(isSelectedElement(By.xpath(getLocatorPointLocation())));
      }
    }
  }

  private void inputRoomNum(DataAddForm dataAddForm) {
    if (dataAddForm.getRoomNum() != null) {
      clickAndSendText(By.xpath(getLocatorRoomNum()), dataAddForm.getRoomNum());
      assertEquals(dataAddForm.getRoomNum(), getAttributeElement(By.xpath(getLocatorRoomNum()), "value"));
    } else {
      assertEquals("", getAttributeElement(By.xpath(getLocatorRoomNum()), "value"));
    }
  }

  // Вибираємо ха-ку Номер квартири "Не показувати"
  private void selectRoomNumDoNotShow(DataAddForm dataAddForm) {
    if (dataAddForm.getRoomNumDoNotShow()) {
      clickAndMoveToElement(By.xpath(getLocatorRoomNumDoNotShow()));
      assertTrue(isSelectedElement(By.xpath(getLocatorRoomNumDoNotShow() + getPathInputThisElement())));
    } else {
      assertFalse(isSelectedElement(By.xpath(getLocatorRoomNumDoNotShow() + getPathInputThisElement())));
    }
  }

  // Вводимо і вказуємо або ні ха-ку "Не показувати" та перевіряємо введені значення і вибрані ха-ки
  private void inputCadastreAddNum(DataAddForm dataAddForm) {
    if (dataAddForm.getCadastreNumber() != null) {
      clickAndSendText(By.xpath(getLocatorCadastreNum()), dataAddForm.getCadastreNumber());
      assertEquals(dataAddForm.getCadastreNumber(), getAttributeElement(By.xpath(getLocatorCadastreNum()), "value"));
      if (dataAddForm.getCadastreNumberDoNotShow()) {
        clickAndMoveToElement(By.xpath(getLocatorCadastreNumDoNotShow()));
        assertTrue(isSelectedElement(By.xpath(getLocatorCadastreNumDoNotShow() + getPathInputThisElement())));
      }
    } else {
      assertFalse(isSelectedElement(By.xpath(getLocatorCadastreNumDoNotShow() + getPathInputThisElement())));
      assertEquals("", getAttributeElement(By.xpath(getLocatorCadastreNum()), "value"));
    }
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
  }

// ****************************************** ВИБІР ГЕО

  public void selectGeoApartmentAndRoom(DataAddForm dataAddForm) {
    assertEquals(getUrlGeoPage(), getCurrentUrl());
    inputAndSelectCity(dataAddForm);
    inputAndSelectMetro(dataAddForm);
    inputAndSelectDistrict(dataAddForm);
    selectResidentialComplexOrStreet(dataAddForm);
    selectBuildingNumApartment(dataAddForm);
    inputRoomNum(dataAddForm);
    selectBuildingNumDoNotShow(dataAddForm);
    selectRoomNumDoNotShow(dataAddForm);
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  public void selectGeoHouseAndPartHouse(DataAddForm dataAddForm) {
    assertEquals(getUrlGeoPage(), getCurrentUrl());
    inputAndSelectCity(dataAddForm);
    inputCadastreAddNum(dataAddForm);
    inputAndSelectMetro(dataAddForm);
    inputAndSelectDistrict(dataAddForm);
    inputAndSelectStreet(dataAddForm);
    insertBuildingNum(dataAddForm);
    selectBuildingNumDoNotShow(dataAddForm);
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  public void selectGeoTownhouseAndCommercial(DataAddForm dataAddForm) {
    assertEquals(getUrlGeoPage(), getCurrentUrl());
    inputAndSelectCity(dataAddForm);
    inputCadastreAddNum(dataAddForm);
    inputAndSelectMetro(dataAddForm);
    inputAndSelectDistrict(dataAddForm);
    selectResidentialComplexOrStreet(dataAddForm);
    insertBuildingNum(dataAddForm);
    selectBuildingNumDoNotShow(dataAddForm);
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  public void selectGeoLand(DataAddForm dataAddForm) {
    assertEquals(getUrlGeoPage(), getCurrentUrl());
    inputAndSelectCity(dataAddForm);
    inputCadastreAddNum(dataAddForm);
    inputAndSelectMetro(dataAddForm);
    inputAndSelectDistrict(dataAddForm);
    inputAndSelectStreet(dataAddForm);
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  public void selectGeoGarage(DataAddForm dataAddForm) {
    assertEquals(getUrlGeoPage(), getCurrentUrl());
    inputAndSelectCity(dataAddForm);
    inputAndSelectMetro(dataAddForm);
    inputAndSelectDistrict(dataAddForm);
    selectResidentialComplexOrStreet(dataAddForm);
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  public void selectGeoHouseAndPartHouseRentDay(DataAddForm dataAddForm) {
    assertEquals(getUrlGeoPage(), getCurrentUrl());
    inputAndSelectCity(dataAddForm);
    inputAndSelectMetro(dataAddForm);
    inputAndSelectDistrict(dataAddForm);
    inputAndSelectStreet(dataAddForm);
    insertBuildingNum(dataAddForm);
    selectBuildingNumDoNotShow(dataAddForm);
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  public void selectGeoTownhouseRentDay(DataAddForm dataAddForm) {
    assertEquals(getUrlGeoPage(), getCurrentUrl());
    inputAndSelectCity(dataAddForm);
    inputAndSelectMetro(dataAddForm);
    inputAndSelectDistrict(dataAddForm);
    selectResidentialComplexOrStreet(dataAddForm);
    insertBuildingNum(dataAddForm);
    selectBuildingNumDoNotShow(dataAddForm);
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // ********************************************   Перевірка блокування і розблокування полів на кроці ГЕО
  // Перевірка заповнення і стирання полів при видаленні міста
  // Перевірка заповнення обов'язкових полів


  // Перевірка що всі поля розблоковано на кроці ГЕО
  private void checkUnblockFieldsGeoPageApartment() {
    assertTrue(isElementPresent(By.xpath(getLocatorMetro())));
    assertFalse((checkDisabledElement(By.xpath(getLocatorResidentialComplex())))
            & (checkDisabledElement(By.xpath(getLocatorDistrict())))
            & (checkDisabledElement(By.xpath(getLocatorStreet())))
            & (checkDisabledElement(By.xpath(getLocatorBuildingNum())))
            & (checkDisabledElement(By.xpath(getLocatorRoomNum()))));
    assertFalse((checkDisabledElement(By.xpath(getLocatorNoBuildingNumber() + getPathInputThisElement())))
            & (checkDisabledElement(By.xpath(getLocatorBuildingNumDoNotShow() + getPathInputThisElement())))
            & (checkDisabledElement(By.xpath(getLocatorRoomNumDoNotShow() + getPathInputThisElement())))
            & (checkDisabledElement(By.xpath(getLocatorCircleLocation())))
            & (checkDisabledElement(By.xpath(getLocatorPointLocation()))));


  }

  // Перевірка що всі поля заблоковано на кроці ГЕО
  private void checkBlockFieldsGeoPageApartment() {
    assertFalse(isElementPresent(By.xpath(getLocatorMetro())));
    assertTrue((checkDisabledElement(By.xpath(getLocatorResidentialComplex())))
            & (checkDisabledElement(By.xpath(getLocatorDistrict())))
            & (checkDisabledElement(By.xpath(getLocatorStreet())))
            & (checkDisabledElement(By.xpath(getLocatorBuildingNum())))
            & (checkDisabledElement(By.xpath(getLocatorRoomNum()))));
    assertTrue((checkDisabledElement(By.xpath(getLocatorNoBuildingNumber() + getPathInputThisElement())))
            & (checkDisabledElement(By.xpath(getLocatorBuildingNumDoNotShow() + getPathInputThisElement())))
            & (checkDisabledElement(By.xpath(getLocatorRoomNumDoNotShow() + getPathInputThisElement())))
            & (checkDisabledElement(By.xpath(getLocatorCircleLocation())))
            & (checkDisabledElement(By.xpath(getLocatorPointLocation()))));
  }

  // Перевірка що всі значення полів введення є пустими
  private void checkGeoPageAllValueElementIsNull() {
    assertEquals("", getAttributeElement(By.xpath(getLocatorCity()), "value"));
    assertEquals("", getAttributeElement(By.xpath(getLocatorResidentialComplex()), "value"));
    assertEquals("", getAttributeElement(By.xpath(getLocatorDistrict()), "value"));
    assertEquals("", getAttributeElement(By.xpath(getLocatorStreet()), "value"));
    assertEquals("", getAttributeElement(By.xpath(getLocatorBuildingNum()), "value"));
    assertEquals("", getAttributeElement(By.xpath(getLocatorRoomNum()), "value"));
  }

  // Перевірка що після тапу на кнопку "Наступний крок" виділяються червоним поля: місто, вулиця, номер будинку
  private void checkFieldsGeoPageApartment() {
    assertFalse(showErrorField(getLocatorCity()));
    assertFalse(showErrorField(getLocatorStreet()));
    assertFalse(showErrorField(getLocatorBuildingNum()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
    pause(100);
    assertTrue(showErrorField(getLocatorCity()));
    assertTrue(showErrorField(getLocatorStreet()));
    assertTrue(showErrorField(getLocatorBuildingNum()));
    pause(100);
  }

  // Перевірка що поля заблоковані, після введення міста розблоковані, вводимо ГЕО
  // Стираємо місто і перевіряємо що всі поля заблоковані та стерті в них значення
  public void checkBlockAndUnblockFieldsGeoPageApartment(DataAddForm dataAddForm) {
    assertEquals(getUrlGeoPage(), getCurrentUrl());
    checkBlockFieldsGeoPageApartment();
    inputAndSelectCity(dataAddForm);
    checkUnblockFieldsGeoPageApartment();
    inputAndSelectMetro(dataAddForm);
    inputAndSelectDistrict(dataAddForm);
    selectResidentialComplexOrStreet(dataAddForm);
    selectBuildingNumApartment(dataAddForm);
    inputRoomNum(dataAddForm);
    selectBuildingNumDoNotShow(dataAddForm);
    selectRoomNumDoNotShow(dataAddForm);
    clearCity();
    checkBlockFieldsGeoPageApartment();
    checkGeoPageAllValueElementIsNull();
  }

  // Перевірка що після тапу на кнопку "Наступний крок" виділяються червоним поля: місто, вулиця, номер будинку
  // Вводимо місто і перевіряємо що після тапу на кнопку "Наступний крок" виділяються червоним поля: вулиця, номер будинку
  public void checkCityFieldGeoPageApartment(DataAddForm dataAddForm) {
    assertEquals(getUrlGeoPage(), getCurrentUrl());
    checkFieldsGeoPageApartment();
    inputAndSelectCity(dataAddForm);
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
    assertFalse(showErrorField(getLocatorCity()));
    assertTrue(showErrorField(getLocatorStreet()));
    assertTrue(showErrorField(getLocatorBuildingNum()));
    pause(100);
    clearCity();
  }

  // Перевірка що після тапу на кнопку "Наступний крок" виділяються червоним поля: місто, вулиця, номер будинку
  // Вводимо місто, вулицю і перевіряємо що після тапу на кнопку "Наступний крок" виділяються червоним поля: номер будинку
  public void checkStreetFieldGeoPageApartment(DataAddForm dataAddForm) {
    checkFieldsGeoPageApartment();
    inputAndSelectCity(dataAddForm);
    selectResidentialComplexOrStreet(dataAddForm);
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
    assertFalse(showErrorField(getLocatorCity()));
    assertFalse(showErrorField(getLocatorStreet()));
    assertTrue(showErrorField(getLocatorBuildingNum()));
    pause(100);
    clearCity();
  }

  // Перевірка що після тапу на кнопку "Наступний крок" виділяються червоним поля: місто, вулиця, номер будинку
  // Вводимо місто, вулицю, номер будинку і перевіряємо що кроці ФОТО у нас вивівся меседж про збереження в чернетку
  public void checkBuildingNumFieldGeoPageApartment(DataAddForm dataAddForm) {
    checkFieldsGeoPageApartment();
    inputAndSelectCity(dataAddForm);
    selectResidentialComplexOrStreet(dataAddForm);
    insertBuildingNum(dataAddForm);
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
    assertTrue(isElementPresent(By.xpath(getLocatorMessageSaveDraftsPagePhoto())));
  }

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  // ********************************************   Photo & Video Helper

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  // Перевіряємо виведення меседжа і текст
  private void checkMessageText(String actual) {
    assertTrue(isElementPresent(By.xpath(getLocatorMessageShow())));
    assertFalse(isElementPresent(By.xpath(getLocatorMessageNotShow())));
    assertEquals(actual, getText(By.xpath(getLocatorMessageShow())));
  }

  private void addPhotoFiles(DataAddForm dataAddForm) {
    assertEquals(getUrlPhotoPage(), getCurrentUrl());
    assertTrue(isElementPresent(By.xpath(getLocatorMessageSaveDraftsPagePhoto())));
    for (int i = 1; i <= dataAddForm.getCountPhoto(); i++) {
      addPhotoAndCheckErrorUpload(getPathPhotoFileJpgFormat(i), 4000);
    }
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // Додаємо фото, якщо виникла помилка при завантаженні фото, перезавантажуємо сторінку
  private static void addPhotoAndCheckErrorUpload(String getPathPhoto, int milliseconds) {
    addFile(By.xpath(getLocatorAddPhoto()), getPathPhoto);
    pause(milliseconds);
    if (isElementPresent(By.xpath(getLocatorErrorAdd()))) {
      refreshPage();
      pause(2000);
      addFile(By.xpath(getLocatorAddPhoto()), getPathPhoto);
      pause(milliseconds);
    }
  }

  private void addYoutubeLink(DataAddForm dataAddForm) {
    assertEquals(getUrlVideoPage(), getCurrentUrl());
    pause(500);
    if (dataAddForm.getVideoLink() != null) {
      clickAndSendText(By.xpath(getLocatorVideoLink()), dataAddForm.getVideoLink());
      pause(2000);
      assertFalse(isElementPresent(By.xpath(getLocatorVideoLink())));
    } else {
      assertEquals("", getAttributeElement(By.xpath(getLocatorVideoLink()), "value"));
    }
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // Перевіряємо меседж збереження в чернетці, додаємо фото і посилання на відео
  public void addPhotoAndVideo(DataAddForm dataAddForm) {
    addPhotoFiles(dataAddForm);
    addYoutubeLink(dataAddForm);
  }

  // ********************************************   Перевірка додавання коректних фото

  // Перевіряємо що фото додалось і вивівся меседж почекати завантаження, якщо ні, перезавантажуємо сторінку і ще раз додаємо
  // Перевіряємо меседжі необхідності мінімальної кі-сті фото
  private void addPhotoFilesAndCheckMessages(DataAddForm dataAddForm, String getMessageMinimumPhoto, int countMinimumPhoto) {
    /*assertEquals(getUrlPhotoPage(), getCurrentUrl());
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
    pause(500);
    checkMessageText(getMessageMinimumPhoto);
    for (int i = 1; i <= dataAddForm.getCountPhoto(); i++) {
      addPhotoAndCheckErrorUpload(getPathPhotoFileJpgFormat(i), 4000);
      if (i == 4) {
        addFile(By.xpath(getLocatorAddPhoto()), getPathPhotoFileJpgFormat(i));
        clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
        pause(100);
        checkMessageText(getMessageTextPleaseWait());
        pause(4000);
        clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
        checkMessageText(getMessageMinimumPhoto);
      }
    }
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }*/

    assertEquals(getUrlPhotoPage(), getCurrentUrl());
    pause(500);
    implicitlyWait(0);
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
    pause(500);
    checkMessageText(getMessageMinimumPhoto);
    for (int i = 1; i <= dataAddForm.getCountPhoto(); i++) {
      addFile(By.xpath(getLocatorAddPhoto()), getPathPhotoFileJpgFormat(i));
      clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
      pause(500);
      if (!Objects.equals(getText(By.xpath(getLocatorMessageShow())), getMessageTextPleaseWait())) {
        refreshPage();
        pause(2000);
        addFile(By.xpath(getLocatorAddPhoto()), getPathPhotoFileJpgFormat(i));
        clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
        pause(100);
        checkMessageText((getMessageTextPleaseWait()));
      }
      checkMessageText((getMessageTextPleaseWait()));
      pause(4000);
      if (i < countMinimumPhoto) {
        clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
        pause(100);
        checkMessageText(getMessageMinimumPhoto);
      }
    }
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
    assertEquals(getUrlVideoPage(), getCurrentUrl());
  }

  private void addBadFileAndCheckMessageInvalidAddPhoto(String pathBadPhoto, int countDeletePhoto, String locatorMessageBadFilePhoto) {
    addFile(By.xpath(getLocatorAddPhoto()), pathBadPhoto);
    if (Objects.equals(pathBadPhoto, getPathPhotoHeicFormat())){
      pause(10000);
    } else {
      pause(1500);
    }
    assertTrue(isElementPresent(By.xpath(getLocatorMessageInvalidAddPhoto(countDeletePhoto))));
    assertTrue(isElementPresent(By.xpath(locatorMessageBadFilePhoto)));
  }

  // Додавання фото замалого розширення, завеликого розміру і формату не jpeg, jpg, png, heic, heif
  // Перевірка виведення відповідного меседжу помилки
  public void addBadPhotoFile() {
    assertEquals(getUrlPhotoPage(), getCurrentUrl());
    pause(1000);
    assertFalse(isElementPresent(By.xpath(getLocatorMessageInvalidAddPhoto(1))));
    addBadFileAndCheckMessageInvalidAddPhoto(getPathBigSizePhoto(), 1, getLocatorMessageBigSizePhoto());
    addBadFileAndCheckMessageInvalidAddPhoto(getPathSmallHorizontalSidePhoto(), 2, getLocatorMessageSmallSizesPhoto());
    addBadFileAndCheckMessageInvalidAddPhoto(getPathSmallVerticalSidePhoto(), 3, getLocatorMessageSmallSizesPhoto());
    addBadFileAndCheckMessageInvalidAddPhoto(getPathBmpFormatPhoto(), 4, getLocatorMessageBadFormatPhoto());
    addBadFileAndCheckMessageInvalidAddPhoto(getPathGifFormatPhoto(), 5, getLocatorMessageBadFormatPhoto());
    addBadFileAndCheckMessageInvalidAddPhoto(getPathBadPhoto(), 6, getLocatorMessageBadFilePhoto());
  }

  // Додавання фото у форматах jpeg, jpg, png, heic, heif
  public void addPhotoAllowedFormat() {
    assertEquals(getUrlPhotoPage(), getCurrentUrl());
    addPhotoAndCheckErrorUpload(getPathPhotoPngFormat(), 3000);
    addPhotoAndCheckErrorUpload(getPathPhotoJpegFormat(), 3000);
    addPhotoAndCheckErrorUpload(getPathPhotoJpgFormat(), 3000);
    addPhotoAndCheckErrorUpload(getPathPhotoPngVerticalFormat(), 3000);
    addPhotoAndCheckErrorUpload(getPathPhotoHeicFormat(), 10000);
  }

  // Перевірка виведення меседжа помилки при спробі зробити головним горизонтальне фото
  public void checkNoMainHorizontalPhoto() {
    clickAndMoveToElement(By.xpath(getLocatorMenuFourPhoto()));
    clickAndMoveToElement(By.xpath(getLocatorSelectMainFourPhoto()));
    pause(1000);
    checkMessageText(getMessageNoMainVerticalPhoto());
  }

  // Видалення всіх фото
  // Перевірка меседжу про видалення
  public void deleteAllPhoto(DataAddForm dataAddForm) {
    assertFalse(isElementPresent(By.xpath(getLocatorMessagePhotoPageNoAddedFiles())));
    for (int i = 1; i <= dataAddForm.getCountPhoto(); i++) {
      clickAndMoveToElement(By.xpath(getLocatorMenuFirstPhoto()));
      clickAndMoveToElement(By.xpath(getLocatorSelectDeleteFirstPhoto()));
      clickAndMoveToElement(By.xpath(getLocatorButtonDeleteModalWindow()));
      pause(2000);
      checkMessageText(getMessageTextPhotoDeleted());
    }
    assertTrue(isElementPresent(By.xpath(getLocatorMessagePhotoPageNoAddedFiles())));
  }

  // Додавання однакового фото
  // Перевірка виведення меседжу що фото вже додане
  public void checkAlreadyUploadedPhoto() {
    addBadFileAndCheckMessageInvalidAddPhoto(getPathPhotoPngFormat(), 1, getLocatorMessageHasBennAddedPhoto());
    addBadFileAndCheckMessageInvalidAddPhoto(getPathPhotoJpegFormat(), 2, getLocatorMessageHasBennAddedPhoto());
    addBadFileAndCheckMessageInvalidAddPhoto(getPathPhotoJpgFormat(), 3, getLocatorMessageHasBennAddedPhoto());
    addBadFileAndCheckMessageInvalidAddPhoto(getPathPhotoPngVerticalFormat(), 4, getLocatorMessageHasBennAddedPhoto());
    addBadFileAndCheckMessageInvalidAddPhoto(getPathPhotoHeicFormat(), 5, getLocatorMessageHasBennAddedPhoto());
  }

  public void addPhotoAndVideoApartmentAndRoomAndHouse(DataAddForm dataAddForm) {
    addPhotoFilesAndCheckMessages(dataAddForm, "Потрібно додати мінімум 5 фото!", 5);
  }

  public void addPhotoAndVideoCommercialAndLandAndGarage(DataAddForm dataAddForm) {
    addPhotoFilesAndCheckMessages(dataAddForm, "Потрібно додати мінімум 3 фото!", 3);
  }

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  // ********************************************   Building & Cadastre Helper

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  // ****************************************** ПЕРЕВІРКА ЗАПОВНЕНОСТІ СУТНОСТІ БУДИНКУ І ДОДАВАННЯ ХАРАКТЕРИСТИК

  // На кроці Інфо про будинок чи заблоковане поле "Поверховість" (в такому випадку підтягнулась сутність будинку)
  // Якщо поле не заблоковане, заповнюємо і перевіряємо чи набуло поле введеного значення
  public void addBuildingMandatoryField() {
    assertEquals(getUrlBuildingPage(), getCurrentUrl());
    pause(500);
    if (!checkDisabledElement(By.xpath(getLocatorFloors()))) {
      String floors = "10";
      clickAndSendText(By.xpath(getLocatorFloors()), floors);
      assertEquals(floors, getAttributeElement(By.xpath(getLocatorFloors()), "value"));
    }
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  public void checkFloorsFieldGeoPageApartment() {
    assertEquals(getUrlBuildingPage(), getCurrentUrl());
    pause(500);
    assertFalse(showErrorField(getLocatorFloors()));
    pause(100);
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
    pause(100);
    assertEquals(getUrlBuildingPage(), getCurrentUrl());
    assertTrue(showErrorField(getLocatorFloors()));
  }

  public void checkDefaultSetupFieldGeoPageApartment() {

  }

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  // ********************************************   MainChars Helper

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  // На кроці Основні параметри для комерційної нерухомості заповнюємо новобудова або вторинна нерухомість в залежності від ЖК
  private void selectTypeNewOrOldBuilding(DataAddForm dataAddForm) {
    if (!Objects.equals(checkDisplayValue(By.xpath(getLocatorTypeNewBuilding() + "//parent::div//parent::div")), "none")) {
      if (dataAddForm.getResidentialComplex() != null) {
        clickAndMoveToElement(By.xpath(getLocatorTypeNewBuilding()));
        assertTrue(isSelectedElement(By.xpath(getLocatorTypeNewBuilding() + getPathInputThisElement())));
      } else {
        assertTrue(isSelectedElement(By.xpath(getLocatorTypeOldBuilding() + getPathInputThisElement())));
      }
    } else {
      assertTrue(isSelectedElement(By.xpath(getLocatorTypeOldBuilding() + getPathInputThisElement())));
    }
  }

  // На кроці Основні параметри для землі вказуємо одиницю виміру ділянки
  private void selectUnitLandMeasurement(String unit) {
    assertTrue(isSelectedElement(By.xpath(getLocatorUnitLandMeasurementHundred() + getPathInputThisElement())));
    if (!Objects.equals(unit, "Hundred")) {
      if (Objects.equals(unit, "Hectare")) {
        selectAndCheckIsSelectedElement(getLocatorUnitLandMeasurementHectare());
      } else if (Objects.equals(unit, "SquareMetres")) {
        selectAndCheckIsSelectedElement(getLocatorUnitLandMeasurementSquareMetres());
      }
    }
  }

  // Вводимо значення, після чого перевіряємо чи набуло цього значення поле
  private void inputAndCheckValueElement(String locator, String dataAddFormInputValue) {
    clickAndSendText(By.xpath(locator), dataAddFormInputValue);
    assertEquals(dataAddFormInputValue, getAttributeElement(By.xpath(locator), "value"));
  }

  // Вводимо характеристику (checkbox), після чого перевіряємо чи дійсно елемент набуває атрибут вибраного
  private void selectAndCheckIsSelectedElement(String locator) {
    clickAndMoveToElement(By.xpath(locator));
    assertTrue(isSelectedElement(By.xpath(locator + getPathInputThisElement())));
  }

  // Перевіряємо чи вводиться поверх 0, якщо так, тоді перевіряємо що поле блокується і виділяється ха-ка "Цокольний поверх"
  // Інакше перевіряємо чи набуло поле введене значення і що не виділена ха-ка "Цокольний поверх"
  private void inputAndCheckValueElementFloor(String locator, String dataAddFormInputValue) {
    clickAndSendText(By.xpath(locator), dataAddFormInputValue);
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    if (Objects.equals(dataAddFormInputValue, "0")) {
      assertEquals("", getAttributeElement(By.xpath(getLocatorInputGroundFloor()), "value"));
      assertTrue(isSelectedElement(By.xpath(getLocatorGroundFloor() + getPathInputThisElement())));
      assertTrue(checkDisabledElement(By.xpath(getLocatorGroundFloor() + "//..//..//input")));
    } else {
      assertEquals(dataAddFormInputValue, getAttributeElement(By.xpath(locator), "value"));
      assertFalse(isSelectedElement(By.xpath(getLocatorGroundFloor() + getPathInputThisElement())));
      assertFalse(checkDisabledElement(By.xpath(getLocatorGroundFloor() + "//..//..//input")));
    }
  }

  // ****************************************** ЗАПОВНЕННЯ ОБОВ'ЯЗКОВИХ ОСНОВНИХ ХАРАКТЕРИСТИК

  // Заповнюємо обов'язкові поля на кроці Основні параметри (Продаж квартири)
  public void selectMainCharsMandatoryFieldSaleApartment(DataAddForm dataAddForm) {
    assertEquals(getUrlMainCharsPage(), getCurrentUrl());
    inputAndCheckValueElement(getLocatorRooms(), dataAddForm.getRooms());
    inputAndCheckValueElementFloor(getLocatorFloor(), dataAddForm.getFloor());
    inputAndCheckValueElement(getLocatorTotalArea(), dataAddForm.getTotalArea());
    pause(200);
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // Заповнюємо обов'язкові поля на кроці Основні параметри (Продаж кімнати)
  public void selectMainCharsMandatoryFieldSaleRoom(DataAddForm dataAddForm) {
    assertEquals(getUrlMainCharsPage(), getCurrentUrl());
    inputAndCheckValueElement(getLocatorTotalArea(), dataAddForm.getTotalArea());
    inputAndCheckValueElementFloor(getLocatorFloor(), dataAddForm.getFloor());
    pause(200);
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // Заповнюємо обов'язкові поля на кроці Основні параметри (Продаж будинку)
  public void selectMainCharsMandatoryFieldSaleHouse(DataAddForm dataAddForm) {
    assertEquals(getUrlMainCharsPage(), getCurrentUrl());
    inputAndCheckValueElement(getLocatorRooms(), dataAddForm.getRooms());
    inputAndCheckValueElement(getLocatorTotalArea(), dataAddForm.getTotalArea());
    inputAndCheckValueElement(getLocatorFloorsHouse(), dataAddForm.getFloors());
    pause(200);
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // Заповнюємо обов'язкові поля на кроці Основні параметри (Продаж комерційної нерухомості)
  public void selectMainCharsMandatoryFieldCommercialPremises(DataAddForm dataAddForm) {
    assertEquals(getUrlMainCharsPage(), getCurrentUrl());
    selectTypeNewOrOldBuilding(dataAddForm);
    inputAndCheckValueElement(getLocatorTotalArea(), dataAddForm.getTotalArea());
    inputAndCheckValueElementFloor(getLocatorFloor(), dataAddForm.getFloor());
    inputAndCheckValueElement(getLocatorFloors(), dataAddForm.getFloors());
    pause(200);
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // Заповнюємо обов'язкові поля на кроці Основні параметри (Продаж землі)
  public void selectMainCharsMandatoryFieldLand(DataAddForm dataAddForm) {
    assertEquals(getUrlMainCharsPage(), getCurrentUrl());
    selectUnitLandMeasurement(dataAddForm.getUnitLandMeasurement());
    pause(200);
    inputAndCheckValueElement(getLocatorArea(), dataAddForm.getTotalArea());
    pause(200);
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // Заповнюємо обов'язкові поля на кроці Основні параметри (Продаж гаражів)
  public void selectMainCharsMandatoryFieldGarage(DataAddForm dataAddForm) {
    assertEquals(getUrlMainCharsPage(), getCurrentUrl());
    inputAndCheckValueElement(getLocatorCarPlaces(), dataAddForm.getCarPlaces());
    inputAndCheckValueElement(getLocatorTotalArea(), dataAddForm.getTotalArea());
    pause(200);
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // =============================================================================================================

  // Заповнюємо обов'язкові поля на кроці Основні параметри (Довгострокова оренда квартири)
  public void selectMainCharsMandatoryFieldRentLongApartment(DataAddForm dataAddForm) {
    assertEquals(getUrlMainCharsPage(), getCurrentUrl());
    inputAndCheckValueElement(getLocatorRooms(), dataAddForm.getRooms());
    inputAndCheckValueElementFloor(getLocatorFloor(), dataAddForm.getFloor());
    inputAndCheckValueElement(getLocatorTotalArea(), dataAddForm.getTotalArea());
    pause(200);
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // Заповнюємо обов'язкові поля на кроці Основні параметри (Довгострокова оренда кімнати)
  public void selectMainCharsMandatoryFieldRentLongRoom(DataAddForm dataAddForm) {
    assertEquals(getUrlMainCharsPage(), getCurrentUrl());
    inputAndCheckValueElement(getLocatorTotalArea(), dataAddForm.getTotalArea());
    inputAndCheckValueElementFloor(getLocatorFloor(), dataAddForm.getFloor());
    pause(200);
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // Заповнюємо обов'язкові поля на кроці Основні параметри (Довгострокова оренда будинку)
  public void selectMainCharsMandatoryFieldRentLongHouse(DataAddForm dataAddForm) {
    assertEquals(getUrlMainCharsPage(), getCurrentUrl());
    inputAndCheckValueElement(getLocatorFloorsHouse(), dataAddForm.getFloors());
    inputAndCheckValueElement(getLocatorRooms(), dataAddForm.getRooms());
    inputAndCheckValueElement(getLocatorTotalArea(), dataAddForm.getTotalArea());
    pause(200);
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // =============================================================================================================

  // Заповнюємо обов'язкові поля на кроці Основні параметри (Подобова оренда квартири)
  public void selectMainCharsMandatoryFieldRentDayApartment(DataAddForm dataAddForm) {
    assertEquals(getUrlMainCharsPage(), getCurrentUrl());
    inputAndCheckValueElement(getLocatorRooms(), dataAddForm.getRooms());
    pause(200);
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // Заповнюємо обов'язкові поля на кроці Основні параметри (Подобова оренда кімнати)
  public void selectMainCharsMandatoryFieldRentDayRoom(DataAddForm dataAddForm) {
    assertEquals(getUrlMainCharsPage(), getCurrentUrl());
    pause(200);
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // Заповнюємо обов'язкові поля на кроці Основні параметри (Подобова оренда будинку)
  public void selectMainCharsMandatoryFieldRentDayHouse(DataAddForm dataAddForm) {
    assertEquals(getUrlMainCharsPage(), getCurrentUrl());
    inputAndCheckValueElement(getLocatorRooms(), dataAddForm.getRooms());
    pause(200);
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  // ********************************************   Communications & Furniture & Utp Helper

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  // ****************************************** ЗАПОВНЕННЯ ДЕЯКИХ ХАРАКТЕРИСТИК

  public void selectSomeCharacteristics() {
    // Communications
    assertEquals(getUrlCommunicationsPage(), getCurrentUrl());
    selectAndCheckIsSelectedElement(getLocatorOneCharacteristic());
    selectAndCheckIsSelectedElement(getLocatorTwoCharacteristic());
    selectAndCheckIsSelectedElement(getLocatorThreeCharacteristic());
    selectAndCheckIsSelectedElement(getLocatorFourCharacteristic());
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
    //Furniture
    assertEquals(getUrlFurniturePage(), getCurrentUrl());
    selectAndCheckIsSelectedElement(getLocatorOneCharacteristic());
    selectAndCheckIsSelectedElement(getLocatorTwoCharacteristic());
    selectAndCheckIsSelectedElement(getLocatorThreeCharacteristic());
    selectAndCheckIsSelectedElement(getLocatorFourCharacteristic());
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
    //UTP
    assertEquals(getUrlUtpPage(), getCurrentUrl());
    selectAndCheckIsSelectedElement(getLocatorOneUtp());
    selectAndCheckIsSelectedElement(getLocatorTwoUtp());
    selectAndCheckIsSelectedElement(getLocatorThreeUtp());
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  public void selectSomeCharacteristicsCommercial() {
    // Communications
    assertEquals(getUrlCommunicationsPage(), getCurrentUrl());
    selectAndCheckIsSelectedElement(getLocatorOneCharacteristic());
    selectAndCheckIsSelectedElement(getLocatorTwoCharacteristic());
    selectAndCheckIsSelectedElement(getLocatorThreeCharacteristic());
    selectAndCheckIsSelectedElement(getLocatorFourCharacteristic());
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
    //Furniture
    assertEquals(getUrlFurniturePage(), getCurrentUrl());
    selectAndCheckIsSelectedElement(getLocatorOneCharacteristic());
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
    //UTP
    assertEquals(getUrlUtpPage(), getCurrentUrl());
    selectAndCheckIsSelectedElement(getLocatorOneUtp());
    selectAndCheckIsSelectedElement(getLocatorTwoUtp());
    selectAndCheckIsSelectedElement(getLocatorThreeUtp());
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  public void selectSomeCharacteristicsLand() {
    // Communications
    assertEquals(getUrlCommunicationsPage(), getCurrentUrl());
    selectAndCheckIsSelectedElement(getLocatorOneCharacteristic());
    selectAndCheckIsSelectedElement(getLocatorTwoCharacteristic());
    selectAndCheckIsSelectedElement(getLocatorThreeCharacteristic());
    selectAndCheckIsSelectedElement(getLocatorFourCharacteristic());
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
    //UTP
    assertEquals(getUrlUtpPage(), getCurrentUrl());
    selectAndCheckIsSelectedElement(getLocatorOneUtp());
    selectAndCheckIsSelectedElement(getLocatorTwoUtp());
    selectAndCheckIsSelectedElement(getLocatorThreeUtp());
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  public void selectSomeCharacteristicsGarage() {
    // Communications
    assertEquals(getUrlCommunicationsPage(), getCurrentUrl());
    selectAndCheckIsSelectedElement(getLocatorOneCharacteristic());
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
    //UTP
    assertEquals(getUrlUtpPage(), getCurrentUrl());
    selectAndCheckIsSelectedElement(getLocatorOneUtp());
    selectAndCheckIsSelectedElement(getLocatorTwoUtp());
    selectAndCheckIsSelectedElement(getLocatorThreeUtp());
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  public void selectSomeCharacteristicsGParking() {
    //UTP
    assertEquals(getUrlUtpPage(), getCurrentUrl());
    selectAndCheckIsSelectedElement(getLocatorOneUtp());
    selectAndCheckIsSelectedElement(getLocatorTwoUtp());
    selectAndCheckIsSelectedElement(getLocatorThreeUtp());
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  // ********************************************   Description Helper

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  public void addDescription() {
    assertEquals(getUrlDescriptionPage(), getCurrentUrl());
    clickAndSendText(By.xpath(getLocatorDescription()), getTextDescription());
    assertTrue(getAttributeElement(By.xpath(getLocatorDescription()), "value").contains(getTextDescription()));
    pause(200);
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
  }

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  // ********************************************   Price Helper

  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************
  // **************************************************************************************************************

  private void selectCurrency(String dataAddFormCurrency) {
    if (Objects.equals(dataAddFormCurrency, "USD")) {
      selectAndCheckIsSelectedElement(getLocatorCurrencyUsd());
    } else if (Objects.equals(dataAddFormCurrency, "UAH")) {
      selectAndCheckIsSelectedElement(getLocatorCurrencyUah());
    } else if (Objects.equals(dataAddFormCurrency, "EUR")) {
      selectAndCheckIsSelectedElement(getLocatorCurrencyEur());
    }
  }

  // Вводимо значення, після чого перевіряємо чи набуло цього значення поле (для перевірки видаляємо пробіли з поля ціни)
  private void inputAndCheckValuePrice(String locator, String dataAddFormInputValue) {
    clickAndSendText(By.xpath(locator), dataAddFormInputValue);
    assertEquals(dataAddFormInputValue, getAttributeElement(By.xpath(locator), "value").replaceAll("\\s", ""));
  }

  // Вводимо ціну і переходимо на крок прев'ю і потім на крок публікації
  public void addPrice(DataAddForm dataAddForm) {
    assertEquals(getUrlPricePage(), getCurrentUrl());
    inputAndCheckValuePrice(getLocatorPrice(), dataAddForm.getPrice());
    pause(200);
    clickAndMoveToElement(By.xpath(getLocatorLeftTitle()));
    selectCurrency(dataAddForm.getCurrency());
    pause(500);
    clickAndMoveToElement(By.xpath(getLocatorButtonNextPage()));
    assertEquals(checkDisplayValue(By.xpath(getLocatorMessageErrorMandatoryFields())), "none");
    assertEquals(getUrlViewPage(), getCurrentUrl());
    // крок preview не виносився поки окремо (можна навішати перевірки заголовка в preview з рубрикою ГЕО та осн параметрами)
    //pause(5000);
    //clickButtonNextPage();
    //pause(1500);
  }

  ///* при потребі доробити (як поля в об'єкті / вхідні дані, так і перевірки та вибір на фд)
  private void selectPriceType(DataAddForm dataAddForm) {
        /*//label[@for="id_252"] - за об'єкт
        //label[@for="id_253"] - за кв.м.

        //label[@for="id_248"] - за ділянку
        //label[@for="id_249"] - за сотку
        //label[@for="id_250"] - за гектар*/
  }

  private void selectOfferType(DataAddForm dataAddForm) {
        /*//label[@for="id_1434"] - від посередника
        //label[@for="id_1435"] - без комісійних
        //label[@for="id_1473"] - від представника забудовника*/
  }

}