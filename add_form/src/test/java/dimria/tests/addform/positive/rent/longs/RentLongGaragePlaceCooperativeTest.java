package dimria.tests.addform.positive.rent.longs;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RentLongGaragePlaceCooperativeTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Львів").withDistrict("Франківський").withStreet("Пулюя")
            .withCountPhoto(4).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withCarPlaces("1").withTotalArea("20")
            .withPrice("50").withCurrency("USD");

    @Test
    public void testRentLongGaragePlaceCooperative() {
        app.addForm().selectOperationTypeRentLong();
        app.addForm().selectGaragePlaceCooperative();
        app.addForm().selectGeoGarage(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldGarage(dataAddForm);
        app.addForm().selectSomeCharacteristicsGarage();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
