package dimria.tests.addform.positive.sale;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class SaleRoomTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Вінниця").withDistrict("Поділля").withStreet("Свободи").withNoBuildingNumber(true).withRoomNum("10")
            .withBuildingNumDoNotShow(true).withRoomNumDoNotShow(true)
            .withCountPhoto(6).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withRooms("1").withFloor("3").withTotalArea("30")
            .withPrice("21000").withCurrency("USD");

    @Test
    public void testSaleRoom() {
        app.addForm().selectOperationTypeSale();
        app.addForm().selectRoom();
        app.addForm().selectGeoApartmentAndRoom(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().addBuildingMandatoryField();
        app.addForm().selectMainCharsMandatoryFieldSaleRoom(dataAddForm);
        app.addForm().selectSomeCharacteristics();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);
        //paymentViewPagePublish();
    }
}
