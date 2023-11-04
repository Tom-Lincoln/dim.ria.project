package dimria.tests.addform.positive.sale;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class SaleLandCommercialPurposesTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Львів").withDistrict("Залізничний").withStreet("Городоцька")
            .withCadastreNumber("4610136600:04:008:0002").withCadastreNumberDoNotShow(true)
            .withCountPhoto(4).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withTotalArea("20")
            .withPrice("150000").withCurrency("USD");

    @Test
    public void testSaleLandCommercialPurposes() {
        app.addForm().selectOperationTypeSale();
        app.addForm().selectLandCommercialPurposes();
        app.addForm().selectGeoLand(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldLand(dataAddForm);
        app.addForm().selectSomeCharacteristicsLand();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
