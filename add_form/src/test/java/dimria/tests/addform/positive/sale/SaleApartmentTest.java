package dimria.tests.addform.positive.sale;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class SaleApartmentTest extends TestBase {

  DataAddForm dataAddForm = new DataAddForm()
          .withCity("Дніпро").withDistrict("Покровський").withMetro("Покровська").withResidentialComplex("SkyCity")
          .withBuildNum("28Н") .withRoomNum("22").withNoBuildingNumber(true).withBuildingNumDoNotShow(false).withRoomNumDoNotShow(true)
          .withCountPhoto(6).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
          .withRooms("2").withFloor("3").withTotalArea("80")
          .withPrice("75000").withCurrency("USD");

  @Test
  public void testSaleApartment() {
    app.addForm().selectOperationTypeSale();
    app.addForm().selectApartment();
    app.addForm().selectGeoApartmentAndRoom(dataAddForm);
    app.addForm().addPhotoAndVideo(dataAddForm);
    app.addForm().addBuildingMandatoryField();
    app.addForm().selectMainCharsMandatoryFieldSaleApartment(dataAddForm);
    app.addForm().selectSomeCharacteristics();
    app.addForm().addDescription();
    app.addForm().addPrice(dataAddForm);
    //paymentViewPagePublish();
  }
}
