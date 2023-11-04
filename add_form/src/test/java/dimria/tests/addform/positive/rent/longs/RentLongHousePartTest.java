package dimria.tests.addform.positive.rent.longs;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RentLongHousePartTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Київ").withMetro("Голосіївська").withDistrict("Голосіївський").withStreet("Свободи").withBuildNum("100")
            .withBuildingNumDoNotShow(true)
            .withCadastreNumber("8000000000:88:192:0036").withCadastreNumberDoNotShow(true)
            .withCountPhoto(6).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withRooms("3").withFloors("1").withTotalArea("85")
            .withPrice("900").withCurrency("USD");

    @Test
    public void testRentLongHousePart() {
        app.addForm().selectOperationTypeRentLong();
        app.addForm().selectHousePart();
        app.addForm().selectGeoHouseAndPartHouse(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldRentLongHouse(dataAddForm);
        app.addForm().selectSomeCharacteristics();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
