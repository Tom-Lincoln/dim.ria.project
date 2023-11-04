package dimria.tests.addform.positive.sale;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class SaleGarageParkingTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Вінниця").withDistrict("Поділля").withStreet("Свободи")
            .withCountPhoto(4).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withCarPlaces("1").withTotalArea("20")
            .withPrice("16000").withCurrency("EUR");

    @Test
    public void testSaleGarageParking() {
        app.addForm().selectOperationTypeSale();
        app.addForm().selectParking();
        app.addForm().selectGeoGarage(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldGarage(dataAddForm);
        app.addForm().selectSomeCharacteristicsGParking();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
