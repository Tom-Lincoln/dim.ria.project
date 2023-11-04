package dimria.tests.addform.positive.rent.longs;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RentLongRoomTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Вінниця").withDistrict("Поділля").withStreet("Свободи").withNoBuildingNumber(true).withRoomNum("10")
            .withBuildingNumDoNotShow(true).withRoomNumDoNotShow(true)
            .withCountPhoto(6).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withRooms("1").withFloor("3").withTotalArea("30")
            .withPrice("4000").withCurrency("UAH");

    @Test
    public void testRentLongRoom() {
        app.addForm().selectOperationTypeRentLong();
        app.addForm().selectRoom();
        app.addForm().selectGeoApartmentAndRoom(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().addBuildingMandatoryField();
        app.addForm().selectMainCharsMandatoryFieldRentLongRoom(dataAddForm);
        app.addForm().selectSomeCharacteristics();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();*/
    }
}
