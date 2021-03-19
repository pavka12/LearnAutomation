


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(dryRun = false, features= ".",  tags ={"@menu"},
            plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/tsr/tsr.html")
    public class Run {

        @AfterClass
        public static void generateReport()
        {
            Reporter.loadXMLConfig("C:\\Users\\anupa\\IdeaProjects\\TestAutomationNext\\src\\main\\resources\\extent-config.xml");
        }
    }



