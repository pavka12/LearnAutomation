import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.CommonFunctions;

public class Hooks {

    CommonFunctions commonFunctions = new CommonFunctions();

    @Before
    public void beforeScenario() {

        commonFunctions.openBrowser();
    }

    @After
    public void afterScenario() {
        commonFunctions.closeBrowser();
    }
}
