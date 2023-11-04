package dimria.tests.addform.positive.rent.day;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RentDayHousePartTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Київ").withMetro("Голосіївська").withDistrict("Голосіївський").withStreet("Свободи").withBuildNum("100")
            .withBuildingNumDoNotShow(true)
            .withCountPhoto(6).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withRooms("3")
            .withPrice("100").withCurrency("USD");

    @Test
    public void testRentDayHousePart() {
        app.addForm().selectOperationTypeRentDay();
        app.addForm().selectHousePart();
        app.addForm().selectGeoHouseAndPartHouseRentDay(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldRentDayHouse(dataAddForm);
        app.addForm().selectSomeCharacteristics();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
