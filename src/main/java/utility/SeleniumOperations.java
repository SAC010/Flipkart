package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumOperations 
{
	static ChromeDriver driver=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable <String,Object>();
	
	public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
	{
		try{
		String key=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		System.setProperty(key,value);
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method Used: browserLaunch , InputParameters  "+ inputParameters[0].toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Method Used: browserLaunch , InputParameters  "+ inputParameters[0].toString());
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> openApplication(Object[]inputParameters)
	{	
		try{
		String path=(String)inputParameters[0];
		driver.get(path);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method Used: openApplication , InputParameters  "+ inputParameters[0].toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Method Used: openApplication , InputParameters  "+ inputParameters[0].toString());
			
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> clickOnElement(Object[]inputParameters)
	{
		try{
		String value=(String)inputParameters[0];
		driver.findElement(By.xpath(value)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method Used: clickOnElement , InputParameters  "+ inputParameters[0].toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Method Used: clickOnElement , InputParameters  "+ inputParameters[0].toString());
			
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> navigateToElement(Object[]inputParameters)
	{
		try{
		String value=(String)inputParameters[0];
		Actions act=new Actions(driver);
		WebElement uvw= driver.findElement(By.xpath(value));
		act.moveToElement(uvw).build().perform();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method Used: navigateToElement , InputParameters  "+ inputParameters[0].toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Method Used: navigateToElement , InputParameters  "+ inputParameters[0].toString());
			
		}
		return outputParameters;
	}
	
	
	public static Hashtable<String,Object> sendText(Object[]inputParameters)
	{
		try{
		String strPath =(String)inputParameters[0];
		String strValue=(String)inputParameters[1];;
		driver.findElement(By.xpath(strPath)).sendKeys(strValue); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method Used: sendText , InputParameters  "+ inputParameters[1].toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Method Used: sendText , InputParameters  "+ inputParameters[1].toString());
			
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> printText(Object[]inputParameters )
	{
		try{
		String strPath =(String)inputParameters[0];
		Object xyz =driver.findElement(By.xpath(strPath)).getText();
		System.out.println(xyz);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method Used: printText , InputParameters  "+ inputParameters[0].toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Method Used: printText , InputParameters  "+ inputParameters[0].toString());
			
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> validationByGetText(Object []inputParameters)
	{
		try{
			Thread.sleep(5000);
		String textGiven = (String)inputParameters[0];
		String locator = (String)inputParameters[1];
		String text=driver.findElement(By.xpath(locator)).getText();
		
		if(textGiven.equalsIgnoreCase (text))
		{
			System.out.println("Test Case is Pass");
		}else
		{
			System.out.println("Test Case is Fail");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Method Used: validationByGetText , InputParameters  "+ inputParameters[0].toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Method Used: validationByGetText , InputParameters  "+ inputParameters[0].toString());
			
		}
		return outputParameters;
		
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{	
		
		//Launch Browser
		Object[]input1= new Object[2];
			   input1[0]="webdriver.chrome.driver";
			   input1[1]="D:\\ALLSOFTWARES\\Automation support\\selenium_and _drivers\\chromedriver103.0.5060.24\\chromedriver.exe";
	           SeleniumOperations.browserLaunch(input1);
	          
			
		
		//Open application
				Object[]input2=new Object[1];
				input2[0]="https://www.flipkart.com/";
				SeleniumOperations.openApplication(input2);
		
		//Click on Element/ close pop up
				Object[]input3=new Object[1];
				input3[0]="//*[@class='_2KpZ6l _2doB4z']";
				SeleniumOperations.clickOnElement(input3);
		
		//Navigate to element
				Object[]input4=new Object[1];
				input4[0]="//*[text()='Login']";
				SeleniumOperations.navigateToElement(input4);
				
		
		
		//Click on Element/ My Profile
				Object[]input6=new Object[1];
				input6[0]="//*[text()='My Profile']";
				SeleniumOperations.clickOnElement(input6);
	
		//Send Text / UserName
				Object[]input7= new Object[2];
			    input7[0]="//*[@class='_2IX_2- VJZDxU']";
			    input7[1]="9226157112";
			    SeleniumOperations.sendText(input7);					
			 
	    //Send Text / Password
				Object[]input8= new Object[2];
			    input8[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
			    input8[1]="Yogesh@123456789";
			    SeleniumOperations.sendText(input8);	
		
	    //Click on Element/ Login
				Object[]input9=new Object[1];
				input9[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
				SeleniumOperations.clickOnElement(input9);
		
				
		// validation
			    Object[]input23=new Object[2];
			    input23[0]="Sachin Rohokale";
			    input23[1]="//*[@class='_1ruvv2']";
			    SeleniumOperations.validationByGetText(input23);
			    
		/*
	    //Click on Element/ Manage Address
				Object[]input11=new Object[1];
				input11[0]="//*[text()='Manage Addresses']";
				SeleniumOperations.clickOnElement(input11);
		
		//Click on Element/ Add New Address
				Object[]input12=new Object[1];
				input12[0]="//*[text()='ADD A NEW ADDRESS']";
				SeleniumOperations.clickOnElement(input12);
		
				Thread.sleep(3000);
				
		 //Send Text / Name
				Object[]input13= new Object[2];
			    input13[0]="//*[@tabindex='1']";
			    input13[1]="Sachin Rohokale";
			    SeleniumOperations.sendText(input13);			
		
		        Thread.sleep(3000);
		        
	     //Send Text / 10 Digit Mobile No
				Object[]input14= new Object[2];
			    input14[0]="//*[@tabindex='2']";
			    input14[1]="9503919182";
			    SeleniumOperations.sendText(input14);        
		
		 //Send Text / Postal Code
				Object[]input15= new Object[2];
			    input15[0]="//*[@tabindex='3']";
			    input15[1]="414103";
			    SeleniumOperations.sendText(input15);	
		
		 //Send Text / Locality
				Object[]input16= new Object[2];
			    input16[0]="//*[@tabindex='4']";
			    input16[1]="Ahmednagar";
			    SeleniumOperations.sendText(input16);
		
	     //Send Text / Address
				Object[]input17= new Object[2];
			    input17[0]="//*[@tabindex='5']";
			    input17[1]="A/P: Bhalwani, Tal-Parner,Dist-Ahmednagar";
			    SeleniumOperations.sendText(input17);
		
	     //Send Text / Landmark
				Object[]input18= new Object[2];
			    input18[0]="//*[@tabindex='8']";
			    input18[1]="Near Bus Stand";			
			    SeleniumOperations.sendText(input18);
	     //Send Text / Phone No. Optional
				Object[]input19= new Object[2];
			    input19[0]="//*[@tabindex='9']";
			    input19[1]="9226157112";			
			    SeleniumOperations.sendText(input19);
		
	    //ClickOnElement / Click on Radio Button
				Object[]input20= new Object[1];
			    input20[0]="(//*[@class='_1XFPmK'])[2]";		
			    SeleniumOperations.clickOnElement(input20);
		
	     //ClickOnElement / Click on Radio Button
			Object[]input21= new Object[1];
			    input[0]="//*[@tabindex='10']";		
			    SeleniumOperations.clickOnElement(input21);
		  
			   
		        Thread.sleep(3000);
		 //PrintText / Print Address
				Object[]input22= new Object[1];
			    input22[0]="(//*[@class='_26SF1Q'])[1]";		
			    SeleniumOperations.printText(input22);
		
		
		
		*/
	}

}
