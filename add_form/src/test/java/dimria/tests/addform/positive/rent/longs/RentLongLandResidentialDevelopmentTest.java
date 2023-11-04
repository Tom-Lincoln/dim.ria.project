package dimria.tests.addform.positive.rent.longs;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class RentLongLandResidentialDevelopmentTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Вінниця").withDistrict("Поділля").withStreet("Свободи")
            .withCadastreNumber("0510136600:02:031:0012").withCadastreNumberDoNotShow(true)
            .withCountPhoto(4).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withTotalArea("30")
            .withPrice("250000").withCurrency("EUR");

    @Test
    public void testRentLongLandResidentialDevelopment() {
        app.addForm().selectOperationTypeRentLong();
        app.addForm().selectLandResidentialDevelopment();
        app.addForm().selectGeoLand(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldLand(dataAddForm);
        app.addForm().selectSomeCharacteristicsLand();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
