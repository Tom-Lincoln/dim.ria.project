package dimria.tests.addform.positive.rent.longs;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RentLongCommercialPremisesTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Львів").withDistrict("Залізничний").withStreet("Городоцька")
            .withCadastreNumber("4610136600:04:008:0002")
            .withCountPhoto(4).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withTotalArea("60").withFloor("1").withFloors("5")
            .withPrice("2300").withCurrency("EUR");

    @Test
    public void testRentLongCommercialPremises() {
        app.addForm().selectOperationTypeRentLong();
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
