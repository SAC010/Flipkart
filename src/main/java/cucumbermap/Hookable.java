package cucumbermap;

import java.net.UnknownHostException;

import com.relevantcodes.extentreports.HTMLReporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.HTMLReportGenerator;

public class Hookable
{
	@Before
	public void before (Scenario scenario) throws Throwable
	{
		HTMLReportGenerator.TestSuiteStart("D:\\ALLSOFTWARES\\Automation support\\selenium_and _drivers\\selenium workspace\\Flipkart Test Reports\\flipkart.htlm","flipkart");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		
		System.out.println("---------------------Scenario Start----------------------");
		 
		
	}
	
	
	
	
	@After
	public void after (Scenario scenario)
	{
		
	
	System.out.println("---------------------Scenario End-------------------------");

	HTMLReportGenerator.TestCaseEnd();
	HTMLReportGenerator.TestSuiteEnd();
	}


}