package dimria.tests.addform.positive.rent.day;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RentDayHouseTownhouseTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Дніпро").withDistrict("Покровський").withMetro("Покровська").withResidentialComplex("SkyCity")
            .withBuildingNumDoNotShow(true)
            .withCountPhoto(6).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withRooms("5").withFloors("2").withTotalArea("150")
            .withPrice("4500").withCurrency("UAH");

    @Test
    public void testRentDayTownhouse() {
        app.addForm().selectOperationTypeRentDay();
        app.addForm().selectTownhouse();
        app.addForm().selectGeoTownhouseRentDay(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldRentDayHouse(dataAddForm);
        app.addForm().selectSomeCharacteristics();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
