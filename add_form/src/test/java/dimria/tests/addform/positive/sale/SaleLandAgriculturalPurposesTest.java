package dimria.tests.addform.positive.sale;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class SaleLandAgriculturalPurposesTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Київ").withMetro("Голосіївська").withDistrict("Голосіївський").withStreet("Свободи")
            .withCadastreNumber("8000000000:88:192:0036")
            .withCountPhoto(4).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withTotalArea("3").withUnitLandMeasurement("SquareMetres") //null="Hundred" || "Hectare" || "SquareMetres"
            .withPrice("7600000").withCurrency("UAH");

    @Test
    public void testSaleLandAgriculturalPurposes() {
        app.addForm().selectOperationTypeSale();
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
