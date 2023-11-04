package dimria.tests.addform.positive.sale;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class SaleGarageTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Дніпро").withDistrict("Покровський").withMetro("Покровська").withResidentialComplex("SkyCity")
            .withCountPhoto(4).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withCarPlaces("1").withTotalArea("30")
            .withPrice("15000").withCurrency("EUR");

    @Test
    public void testSaleGarage() {
        app.addForm().selectOperationTypeSale();
        app.addForm().selectGarage();
        app.addForm().selectGeoGarage(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldGarage(dataAddForm);
        app.addForm().selectSomeCharacteristicsGarage();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
