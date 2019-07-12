package runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

//import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 
@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\admin\\Google Drive\\Deekshith Code\\BATCH\\9-JUlY 2018\\workspace\\marchcucumber\\src\\test\\java\\Feature\\sfdc.feature",
glue= {"marchcucumber"},
plugin = {
"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
"pretty", "html:target/cucumber", "json:target/cucumber.json"})
//"com.cucumber.listener.ExtentCucumberFormatter:test-out/report.html"}monochrome = true) extends AbstractTestNGCucumberTests
public class RunnerTest extends AbstractTestNGCucumberTests{
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig("features/extent-config.xml");
	}
 
	
	}
 

