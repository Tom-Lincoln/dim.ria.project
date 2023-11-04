package dimria.tests.addform.positive.sale;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class SaleGaragePlaceCarParkTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Львів").withDistrict("Шевченківський").withResidentialComplex("Роланд").withBuildNum("10")
            .withCountPhoto(4).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withCarPlaces("1").withTotalArea("20")
            .withPrice("8000").withCurrency("EUR");

    @Test
    public void testSaleGaragePlaceCarPark() {
        app.addForm().selectOperationTypeSale();
        app.addForm().selectPlaceCarPark();
        app.addForm().selectGeoGarage(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldGarage(dataAddForm);
        app.addForm().selectSomeCharacteristicsGParking();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
