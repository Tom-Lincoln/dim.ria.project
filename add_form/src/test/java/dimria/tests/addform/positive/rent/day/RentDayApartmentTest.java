package dimria.tests.addform.positive.rent.day;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RentDayApartmentTest extends TestBase {

  DataAddForm dataAddForm = new DataAddForm()
          .withCity("Дніпро").withDistrict("Покровський").withMetro("Покровська").withResidentialComplex("SkyCity")
          .withBuildNum("28Н").withRoomNum("22").withBuildingNumDoNotShow(true).withRoomNumDoNotShow(true)
          .withCountPhoto(6).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
          .withRooms("2")
          .withPrice("30").withCurrency("EUR");

  @Test
  public void testRentDayApartment() {
    app.addForm().selectOperationTypeRentDay();
    app.addForm().selectApartment();
    app.addForm().selectGeoApartmentAndRoom(dataAddForm);
    app.addForm().addPhotoAndVideo(dataAddForm);
    app.addForm().addBuildingMandatoryField();
    app.addForm().selectMainCharsMandatoryFieldRentDayApartment(dataAddForm);
    app.addForm().selectSomeCharacteristics();
    app.addForm().addDescription();
    app.addForm().addPrice(dataAddForm);

    //paymentViewPagePublish();
  }
}