package dimria.tests.addform.positive.rent.longs;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RentLongCommercialOfficeTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Львів").withDistrict("Франківський").withResidentialComplex("Helga").withBuildNum("120")
            .withCadastreNumber("4610136600:04:008:0002")
            .withCountPhoto(4).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withTotalArea("150").withFloor("0").withFloors("2")
            .withPrice("4500").withCurrency("EUR");

    @Test
    public void testRentLongCommercialOffice() {
        app.addForm().selectOperationTypeRentLong();
        app.addForm().selectCommercialOffice();
        app.addForm().selectGeoTownhouseAndCommercial(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldCommercialPremises(dataAddForm);
        app.addForm().selectSomeCharacteristicsCommercial();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
