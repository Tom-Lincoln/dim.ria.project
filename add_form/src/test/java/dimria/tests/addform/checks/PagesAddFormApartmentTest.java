package dimria.tests.addform.checks;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class PagesAddFormApartmentTest extends TestBase {

  DataAddForm dataAddFormGeoCheck = new DataAddForm()
          .withCity("Київ").withMetro("Голосіївська").withDistrict("Голосіївський").withResidentialComplex("Авангард")
          .withBuildNum("95").withRoomNum("1000");

  DataAddForm dataAddForm = new DataAddForm()
          .withCity("Львів").withStreet("Сихівська").withBuildNum("95").withCountPhoto(6);

  // ********************************************   Перевірки на кроці ГЕО

  @Test
  public void testSaleApartmentBlockFieldsPageGeo() {
    app.addForm().selectOperationTypeSale();
    app.addForm().selectApartment();
    app.addForm().checkBlockAndUnblockFieldsGeoPageApartment(dataAddFormGeoCheck);
  }

  @Test
  public void testSaleApartmentMandatoryFieldsPageGeo() {
    app.addForm().selectOperationTypeSale();
    app.addForm().selectApartment();
    app.addForm().checkCityFieldGeoPageApartment(dataAddFormGeoCheck);
    app.addForm().checkStreetFieldGeoPageApartment(dataAddFormGeoCheck);
    app.addForm().checkBuildingNumFieldGeoPageApartment(dataAddFormGeoCheck);
  }

  //************

  @Test
  public void testRentLongApartmentMandatoryFieldsPageGeo() {
    app.addForm().selectOperationTypeRentLong();
    app.addForm().selectApartment();
    app.addForm().checkCityFieldGeoPageApartment(dataAddFormGeoCheck);
    app.addForm().checkStreetFieldGeoPageApartment(dataAddFormGeoCheck);
    app.addForm().checkBuildingNumFieldGeoPageApartment(dataAddFormGeoCheck);
  }

  @Test
  public void testRentLongApartmentBlockFieldsPageGeo() {
    app.addForm().selectOperationTypeRentLong();
    app.addForm().selectApartment();
    app.addForm().checkBlockAndUnblockFieldsGeoPageApartment(dataAddFormGeoCheck);
  }

  //************

  @Test
  public void testRentDayApartmentBlockFieldsPageGeo() {
    app.addForm().selectOperationTypeRentDay();
    app.addForm().selectApartment();
    app.addForm().checkBlockAndUnblockFieldsGeoPageApartment(dataAddFormGeoCheck);
  }

  @Test
  public void testRentDayApartmentMandatoryFieldsPageGeo() {
    app.addForm().selectOperationTypeRentDay();
    app.addForm().selectApartment();
    app.addForm().checkCityFieldGeoPageApartment(dataAddFormGeoCheck);
    app.addForm().checkStreetFieldGeoPageApartment(dataAddFormGeoCheck);
    app.addForm().checkBuildingNumFieldGeoPageApartment(dataAddFormGeoCheck);
  }

// ********************************************   Перевірки на кроці фото

  @Test
  public void testSaleApartmentBigSizePhotoPage() {
    app.addForm().selectOperationTypeSale();
    app.addForm().selectApartment();
    app.addForm().selectGeoApartmentAndRoom(dataAddForm);
    app.addForm().addBadPhotoFile();
  }

  @Test
  public void testSaleApartmentAddAllowedFormatAddCheckAlreadyUploadedAndNoMainHorizontalPhotoPage() {
    app.addForm().selectOperationTypeSale();
    app.addForm().selectApartment();
    app.addForm().selectGeoApartmentAndRoom(dataAddForm);
    app.addForm().addPhotoAllowedFormat();
    app.addForm().checkNoMainHorizontalPhoto();
    app.addForm().checkAlreadyUploadedPhoto();
  }

  @Test
  public void testSaleApartmentDeleteAllFilesPhotoPage() {
    app.addForm().selectOperationTypeSale();
    app.addForm().selectApartment();
    app.addForm().selectGeoApartmentAndRoom(dataAddForm);
    app.addForm().addPhotoAllowedFormat();
    dataAddForm.withCountPhoto(5);
    app.addForm().deleteAllPhoto(dataAddForm);
  }

  @Test
  public void testSaleApartmentAddFilesAndCheckMessagesPhotoPage() {
    app.addForm().selectOperationTypeSale();
    app.addForm().selectApartment();
    app.addForm().selectGeoApartmentAndRoom(dataAddForm);
    app.addForm().addPhotoAndVideoApartmentAndRoomAndHouse(dataAddForm);
  }

  //************

  @Test
  public void testRentLongApartmentBigSizePhotoPage() {
    app.addForm().selectOperationTypeRentLong();
    app.addForm().selectApartment();
    app.addForm().selectGeoApartmentAndRoom(dataAddForm);
    app.addForm().addBadPhotoFile();
  }

  @Test
  public void testRentLongApartmentAddAllowedFormatAddCheckAlreadyUploadedAndNoMainHorizontalPhotoPage() {
    app.addForm().selectOperationTypeRentLong();
    app.addForm().selectApartment();
    app.addForm().selectGeoApartmentAndRoom(dataAddForm);
    app.addForm().addPhotoAllowedFormat();
    app.addForm().checkNoMainHorizontalPhoto();
    app.addForm().checkAlreadyUploadedPhoto();
  }

  @Test
  public void testRentLongApartmentDeleteAllFilesPhotoPage() {
    app.addForm().selectOperationTypeRentLong();
    app.addForm().selectApartment();
    app.addForm().selectGeoApartmentAndRoom(dataAddForm);
    app.addForm().addPhotoAllowedFormat();
    dataAddForm.withCountPhoto(5);
    app.addForm().deleteAllPhoto(dataAddForm);
  }

  @Test
  public void testRentLongApartmentAddFilesAndCheckMessagesPhotoPage() {
    app.addForm().selectOperationTypeRentLong();
    app.addForm().selectApartment();
    app.addForm().selectGeoApartmentAndRoom(dataAddForm);
    app.addForm().addPhotoAndVideoApartmentAndRoomAndHouse(dataAddForm);
  }

  //************

  @Test
  public void testRentDayApartmentBigSizePhotoPage() {
    app.addForm().selectOperationTypeRentDay();
    app.addForm().selectApartment();
    app.addForm().selectGeoApartmentAndRoom(dataAddForm);
    app.addForm().addBadPhotoFile();
  }

  @Test
  public void testRentDayApartmentAddAllowedFormatAddCheckAlreadyUploadedAndNoMainHorizontalPhotoPage() {
    app.addForm().selectOperationTypeRentDay();
    app.addForm().selectApartment();
    app.addForm().selectGeoApartmentAndRoom(dataAddForm);
    app.addForm().addPhotoAllowedFormat();
    app.addForm().checkNoMainHorizontalPhoto();
    app.addForm().checkAlreadyUploadedPhoto();
  }

  @Test
  public void testRentDayApartmentDeleteAllFilesPhotoPage() {
    app.addForm().selectOperationTypeRentDay();
    app.addForm().selectApartment();
    app.addForm().selectGeoApartmentAndRoom(dataAddForm);
    app.addForm().addPhotoAllowedFormat();
    dataAddForm.withCountPhoto(5);
    app.addForm().deleteAllPhoto(dataAddForm);
  }

  @Test
  public void testRentDayApartmentAddFilesAndCheckMessagesPhotoPage() {
    app.addForm().selectOperationTypeRentDay();
    app.addForm().selectApartment();
    app.addForm().selectGeoApartmentAndRoom(dataAddForm);
    app.addForm().addPhotoAndVideoApartmentAndRoomAndHouse(dataAddForm);
  }

  // ********************************************   Перевірки на кроці інфо про будинок

  @Test
  public void testSaleApartmentMandatoryFieldsBuildingPage() {
    app.addForm().selectOperationTypeRentDay();
    app.addForm().selectApartment();
    app.addForm().selectGeoApartmentAndRoom(dataAddForm);
    app.addForm().addPhotoAndVideo(dataAddForm);
    app.addForm().checkFloorsFieldGeoPageApartment();
    app.addForm().checkDefaultSetupFieldGeoPageApartment();
  }

}
