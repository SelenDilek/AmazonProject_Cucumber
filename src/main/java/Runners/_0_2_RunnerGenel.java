package Runners;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        plugin =
                {"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
        // to generate a extend report we need this plugin
        },
        features = {"src/test/java"},
        glue = {"stepDefinition"},
        dryRun = false,
        tags = {"@SmokeTest"}
)
public class _0_2_RunnerGenel extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void afterClass(){
        Reporter.loadXMLConfig("src/main/java/XMLFiles/extendReportSet.xml");

        Reporter.setSystemInfo("QA Tester : ", "Omer Ozdemir");//kendi bilgilerinizi ekleyin.
        Reporter.setSystemInfo("Application name : ", "Your Store Test  ");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
    }
}

