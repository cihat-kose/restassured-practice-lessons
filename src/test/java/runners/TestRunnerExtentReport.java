package runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions
        (
                tags="@API",
                features = "src/test/java/features",
                glue = "stepDefinitions",
                plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                        "json:target/cucumber/cucumber.json"}, // JSON report for Jenkins and Extent Report
                dryRun = false
        )


public class TestRunnerExtentReport extends AbstractTestNGCucumberTests {

    @AfterClass
    public void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("Windows Username", "Bug Hunter");
        // Alternate --> System.getProperty("user.name")
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("Username", "Cihat");
        ExtentService.getInstance().setSystemInfo("Application Name", "Petstore");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Project Version", "1.0.0");
    }

}
