package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login 
{
	@Given ("^user open browser with \"(.*)\" and \"(.*)\"$")
	public static void browserLaunch(String key,String value)
	{
		Object[]input1= new Object[2];
		   input1[0]=key;
		   input1[1]=value;
		   Hashtable<String,Object> output1=SeleniumOperations.browserLaunch(input1);
        
	}
	
	@Given ("^user enter url as \"(.*)\"$")
	public static void openApplication(String path) throws InterruptedException
	{
		Object[]input2=new Object[1];
		input2[0]=path;
		Hashtable<String,Object> output2=SeleniumOperations.openApplication(input2);
		  
		
	
	}
	
	
	@When("^user Click on initial login popup window$")
	public void user_Click_on_initial_login_popup_window() throws Throwable
	{
		Object[]input3=new Object[1];
		input3[0]="//*[@class='_2KpZ6l _2doB4z']";
		Hashtable<String,Object> output3= SeleniumOperations.clickOnElement(input3);
		 HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user Click on initial login popup window$", output3.get("MESSAGE").toString()); 
		
		
	}

	@When("^user navigate to login button$")
	public void user_navigate_to_login_button() throws Throwable
	{
		Object[]input4=new Object[1];
		input4[0]="//*[text()='Login']";
		Hashtable<String,Object> output4=SeleniumOperations.navigateToElement(input4);
		 HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user navigate to login button$", output4.get("MESSAGE").toString()); 
		
		
	}

	@When("^user click on my profile$")
	public void user_click_on_my_profile() throws Throwable 
	{
		Object[]input6=new Object[1];
		input6[0]="//*[text()='My Profile']";
		Hashtable<String,Object> output6=SeleniumOperations.clickOnElement(input6);
		 HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user click on my profile$", output6.get("MESSAGE").toString()); 
		
	}

	@When("^user enter \"([^\"]*)\" as login id$")
	public void user_enter_as_login_id(String value) throws Throwable 
	{
		Object[]input7= new Object[2];
	    input7[0]="//*[@class='_2IX_2- VJZDxU']";
	    input7[1]=value;
	    Hashtable<String,Object> output7=SeleniumOperations.sendText(input7);	
	    HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user enter \"([^\"]*)\" as login id$", output7.get("MESSAGE").toString()); 
	    
	   
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String value) throws Throwable
	{
		Object[]input8= new Object[2];
	    input8[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
	    input8[1]=value;
	    Hashtable<String,Object> output8=SeleniumOperations.sendText(input8);
	    HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^user enter \"([^\"]*)\" as password$", output8.get("MESSAGE").toString()); 
	}

	@When("^user click Login$")
	public void user_click_Login() throws Throwable 
	{	
		Object[]input9=new Object[1];
		input9[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		Hashtable<String,Object> output9=SeleniumOperations.clickOnElement(input9);
		 HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "^user click Login$", output9.get("MESSAGE").toString()); 
		
	
	}

	@Then ("^Application Show Login Sucessful$")
	public void application_Show_Login_Sucessful() throws Throwable 
	{
		
		   Object[]input10=new Object[2];
		    input10[0]="Sachin Rohokale";
		    input10[1]="//*[@class='_1ruvv2']";
		    Hashtable<String,Object> output10=SeleniumOperations.validationByGetText(input10);
		    HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "^Application Show Login Sucessful$", output10.get("MESSAGE").toString()); 
		
		

	
	}
}
