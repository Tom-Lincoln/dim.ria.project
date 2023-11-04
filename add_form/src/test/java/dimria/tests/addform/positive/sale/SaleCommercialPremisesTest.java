package dimria.tests.addform.positive.sale;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class SaleCommercialPremisesTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Львів").withDistrict("Залізничний").withStreet("Городоцька")
            .withCadastreNumber("4610136600:04:008:0002")
            .withCountPhoto(4).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withTotalArea("60").withFloor("1").withFloors("5")
            .withPrice("88000").withCurrency("EUR");

    @Test
    public void testSaleCommercialPremises() {
        app.addForm().selectOperationTypeSale();
        app.addForm().selectCommercialPremises();
        app.addForm().selectGeoTownhouseAndCommercial(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldCommercialPremises(dataAddForm);
        app.addForm().selectSomeCharacteristicsCommercial();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
