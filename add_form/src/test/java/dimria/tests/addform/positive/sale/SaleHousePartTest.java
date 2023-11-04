package dimria.tests.addform.positive.sale;

import dimria.model.DataAddForm;
import dimria.tests.TestBase;
import org.testng.annotations.Test;

public class SaleHousePartTest extends TestBase {

    DataAddForm dataAddForm = new DataAddForm()
            .withCity("Київ").withMetro("Голосіївська").withDistrict("Голосіївський").withStreet("Свободи").withBuildNum("100")
            .withBuildingNumDoNotShow(true)
            .withCadastreNumber("8000000000:88:192:0036").withCadastreNumberDoNotShow(true)
            .withCountPhoto(6).withVideoLink("https://www.youtube.com/watch?v=B66ckEAHvBs")
            .withRooms("3").withFloors("1").withTotalArea("85")
            .withPrice("130000").withCurrency("USD");

    @Test
    public void testSaleHousePart() {
        app.addForm().selectOperationTypeSale();
        app.addForm().selectHousePart();
        app.addForm().selectGeoHouseAndPartHouse(dataAddForm);
        app.addForm().addPhotoAndVideo(dataAddForm);
        app.addForm().selectMainCharsMandatoryFieldSaleHouse(dataAddForm);
        app.addForm().selectSomeCharacteristics();
        app.addForm().addDescription();
        app.addForm().addPrice(dataAddForm);

        //paymentViewPagePublish();
    }
}
