package test.java;
import org.testng.Assert;
import org.testng.annotations.Test;
public class BaseTest {

    @BeforeMethod
    public void setUpBaseURI() throws IOException {
  String BaseURi=”  api.coingecko.com/api/v3”;
Assetion assert =new Assertion()
assert.assertNotEqual(Basetest.baseUri,"NULL");
    }

    public void logResponseInReport(Response response) {
        ExtentManager.addResponseLogToReport(response.asPrettyString());
    }


}
