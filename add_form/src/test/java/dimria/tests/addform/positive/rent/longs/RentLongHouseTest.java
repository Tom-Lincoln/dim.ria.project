package dimria.tests.addform.positive.rent.longs;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RentLongHouseTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Вінниця").withDistrict("Поділля").withStreet("Свободи").withBuildNum("100").withBuildingNumDoNotShow(true)
            .withCadastreNumber("0510136600:02:031:0012")
            .withCountPhoto(6).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withRooms("5").withFloors("2").withTotalArea("150")
            .withPrice("900").withCurrency("EUR");

    @Test
    public void testRentLongHouse() {
        app.addForm().selectOperationTypeRentLong();
        app.addForm().selectHouse();
        app.addForm().selectGeoHouseAndPartHouse(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldRentLongHouse(dataAddForm);
        app.addForm().selectSomeCharacteristics();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
