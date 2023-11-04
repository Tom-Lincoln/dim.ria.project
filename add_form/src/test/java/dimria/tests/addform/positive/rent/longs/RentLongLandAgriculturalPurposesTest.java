package dimria.tests.addform.positive.rent.longs;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RentLongLandAgriculturalPurposesTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Київ").withDistrict("Голосіївський").withStreet("Свободи")
            .withCadastreNumber("8000000000:88:192:0036").withCadastreNumberDoNotShow(true)
            .withCountPhoto(4).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withTotalArea("300")
            .withPrice("2600000").withCurrency("UAH");

    @Test
    public void testRentLongLandAgriculturalPurposes() {
        app.addForm().selectOperationTypeRentLong();
        app.addForm().selectLandAgriculturalPurposes();
        app.addForm().selectGeoLand(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldLand(dataAddForm);
        app.addForm().selectSomeCharacteristicsLand();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
