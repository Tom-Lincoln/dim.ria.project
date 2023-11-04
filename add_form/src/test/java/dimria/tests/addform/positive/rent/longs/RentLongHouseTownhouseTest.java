package dimria.tests.addform.positive.rent.longs;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RentLongHouseTownhouseTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Львів").withDistrict("Франківський").withStreet("Наукова")
            .withCadastreNumber("4610136600:04:008:0002").withCadastreNumberDoNotShow(true)
            .withCountPhoto(6).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withRooms("3").withFloors("2").withTotalArea("85")
            .withPrice("35000").withCurrency("UAH");

    @Test
    public void testRentLongTownhouse() {
        app.addForm().selectOperationTypeRentLong();
        app.addForm().selectTownhouse();
        app.addForm().selectGeoHouseAndPartHouse(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldRentLongHouse(dataAddForm);
        app.addForm().selectSomeCharacteristics();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
