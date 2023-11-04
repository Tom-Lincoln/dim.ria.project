package dimria.tests.addform.positive.rent.day;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RentDayRoomTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Вінниця").withDistrict("Поділля").withStreet("Свободи").withNoBuildingNumber(true)
            .withRoomNum("10").withBuildingNumDoNotShow(true).withRoomNumDoNotShow(true)
            .withCadastreNumber("8000000000:88:192:0036").withCadastreNumberDoNotShow(true)
            .withCountPhoto(6).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withPrice("10").withCurrency("USD");

    @Test
    public void testRentDayRoom() {
        app.addForm().selectOperationTypeRentDay();
        app.addForm().selectRoom();
        app.addForm().selectGeoApartmentAndRoom(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().addBuildingMandatoryField();
        app.addForm().selectMainCharsMandatoryFieldRentDayRoom(dataAddForm);
        app.addForm().selectSomeCharacteristics();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();*/
    }
}
