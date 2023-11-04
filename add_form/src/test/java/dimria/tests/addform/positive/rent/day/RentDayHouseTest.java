package dimria.tests.addform.positive.rent.day;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RentDayHouseTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Вінниця").withDistrict("Поділля").withStreet("Свободи").withBuildNum("100").withBuildingNumDoNotShow(true)
            .withCountPhoto(6).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withRooms("5").withFloors("2").withTotalArea("150")
            .withPrice("100").withCurrency("EUR");

    @Test
    public void testRentDayHouse() {
        app.addForm().selectOperationTypeRentDay();
        app.addForm().selectHouse();
        app.addForm().selectGeoHouseAndPartHouseRentDay(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldRentDayHouse(dataAddForm);
        app.addForm().selectSomeCharacteristics();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
