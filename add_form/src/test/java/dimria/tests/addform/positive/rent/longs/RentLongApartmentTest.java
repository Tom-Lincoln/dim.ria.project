package dimria.tests.addform.positive.rent.longs;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RentLongApartmentTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Дніпро").withDistrict("Покровський").withMetro("Покровська").withResidentialComplex("SkyCity").withRoomNum("22")
            .withBuildNum("28").withBuildingNumDoNotShow(true).withRoomNumDoNotShow(true)
            .withCountPhoto(6).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withRooms("2").withFloor("5").withTotalArea("65")
            .withPrice("450").withCurrency("EUR");

    @Test
    public void testRentLongApartment() {
        app.addForm().selectOperationTypeRentLong();
        app.addForm().selectApartment();
        app.addForm().selectGeoApartmentAndRoom(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().addBuildingMandatoryField();
        app.addForm().selectMainCharsMandatoryFieldRentLongApartment(dataAddForm);
        app.addForm().selectSomeCharacteristics();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}