package trail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tempt
{    static ChromeDriver driver=null;
	public static void main(String[] args) throws InterruptedException 
	{	// SMOKE TEST
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "D:\\ALLSOFTWARES\\Automation support\\selenium_and _drivers\\chromedriver103.0.5060.24\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Open Application
		driver.get("https://www.flipkart.com/");
		
		// Cancel Login Window
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		// Navigate To "Login"
		Actions act=new Actions(driver);
		WebElement abc= driver.findElement(By.xpath("//*[text()='Login']"));
		act.moveToElement(abc).build().perform();
		
		//explicit wait
		WebDriverWait wait1= new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='My Profile']")));
				
		// Click on "My Profile"
		driver.findElement(By.xpath("//*[text()='My Profile']")).click();
		
		// Provide User Name
		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("9226157112");  
		
		// provide Password
		driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Yogesh@123456789");
		
		// Click on "Login" Button
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
				
		//explicit wait
		WebDriverWait wait2= new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Manage Addresses']")));
				
		//Click on "Manage Addresses"
		driver.findElement(By.xpath("//*[text()='Manage Addresses']")).click();
		
		//Click on "+ ADD A NEW ADDRESS"
		driver.findElement(By.xpath("//*[text()='ADD A NEW ADDRESS']")).click();
		
		Thread.sleep(3000);
		//Provide Name
		driver.findElement(By.xpath("//*[@tabindex='1']")).sendKeys("Sachin Rohokale");
		
		Thread.sleep(3000);
		//Provide 10-digit mobile number
		driver.findElement(By.xpath("//*[@tabindex='2']")).sendKeys("9503919182");
		
		//Provide Pincode
		driver.findElement(By.xpath("//*[@tabindex='3']")).sendKeys("414103");
		
		//Provide Locality
		driver.findElement(By.xpath("//*[@tabindex='4']")).sendKeys("Ahmednagar");
				
		//Provide Address
		driver.findElement(By.xpath("//*[@tabindex='5']")).sendKeys("A/P: Bhalwani, Tal-Parner,Dist-Ahmednagar");
		
		//Provide Landmark
		driver.findElement(By.xpath("//*[@tabindex='8']")).sendKeys("Near Bus Stand");
		
		//Provide Alternate PhoneNo.
		driver.findElement(By.xpath("//*[@tabindex='9']")).sendKeys("9226157112");
		
		//RadioButton Select "Work"
		driver.findElement(By.xpath("(//*[@class='_1XFPmK'])[2]")).click();
		
		//Click Save
		driver.findElement(By.xpath("//*[@tabindex='10']")).click();
		
		Thread.sleep(3000);
		//Print Saved Address
		Object xyz =driver.findElement(By.xpath("(//*[@class='_26SF1Q'])[1]")).getText();
		System.out.println(xyz);
	}

	
	
	

}
