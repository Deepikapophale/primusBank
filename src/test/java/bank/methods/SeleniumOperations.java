package bank.methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.DiscreteDomain;

public class SeleniumOperations {
	public static WebDriver driver=null;
	public static Hashtable<String,Object> outputParameters = new Hashtable<String,Object> ();
	// Browser Launch
	
	public static Hashtable<String,Object> browserLaunch(Object[]inputparameters)
	{
		try {
		
	String  strBrowserName=(String)inputparameters[0];
	String webDriverExePath=(String)inputparameters[1];
	
if(strBrowserName.equalsIgnoreCase("chrome")) 
	{
		
System.setProperty("webdriver.chrome.driver", webDriverExePath);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	} else if(strBrowserName.equalsIgnoreCase("FF"))
	{
System.setProperty("webdriver.chrome.driver", webDriverExePath);
       driver = new FirefoxDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
       
       outputParameters.put("STATUS", "PASS");
       outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputparameters[0].toString());
       
       
       
       
	}} catch(Exception e)
		{outputParameters.put("STATUS", "FAIL");
	       outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputparameters[0].toString());
	       
		} return outputParameters;
		}
	
	
// Application Launch
	
	public static Hashtable<String,Object> applicationLaunch(Object[]inputparameters) 
	{
		try {
		String strUrl = (String)inputparameters[0];
		
		driver.get(strUrl);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
	       outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputparameters[0].toString());
	       
	}
	catch(Exception e)
	{ outputParameters.put("STATUS", "FAIL");
    outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputparameters[0].toString());
    
	}return outputParameters;
	}
// send keys
	
		public static Hashtable<String,Object> sendKey(Object[]inputparameters) 
		{
		try {
		String xpath = (String)inputparameters[0];
		String value = (String)inputparameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement obj = driver.findElement(By.xpath(xpath));
		obj.clear();
		obj.sendKeys(value);
		outputParameters.put("STATUS", "PASS");
	       outputParameters.put("MESSAGE", "Action: SendKey, Input Given:"+inputparameters[0].toString());
	       
	}
	catch(Exception e)
	{ outputParameters.put("STATUS", "FAIL");
 outputParameters.put("MESSAGE", "Action: SendKeys, Input Given:"+inputparameters[0].toString());
 
	}return outputParameters;
		} 
		
		
// click		
	public static Hashtable<String,Object>click (Object[]inputparameters) 
	{
		try {
			String xpath = (String)inputparameters[0];
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
			WebElement obj1 = driver.findElement(By.xpath(xpath));	
			obj1.click();	
			outputParameters.put("STATUS", "PASS");
		       outputParameters.put("MESSAGE", "Action: Click, Input Given:"+inputparameters[0].toString());
		       
		}
		catch(Exception e)
		{ outputParameters.put("STATUS", "FAIL");
	 outputParameters.put("MESSAGE", "Action: Click, Input Given:"+inputparameters[0].toString());
	 
		}return outputParameters;
			} 	
		
		
	// DropDown
	
		public static Hashtable<String,Object> selectdropdown (Object[]inputparameters) 
		{
			try {
			String xpath = (String)inputparameters[0];
			String name = (String)inputparameters[1];
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Select sel = new Select(driver.findElement(By.xpath(xpath)));
			sel.selectByVisibleText(name);
			outputParameters.put("STATUS", "PASS");
		       outputParameters.put("MESSAGE", "Action: DropDown, Input Given:"+inputparameters[0].toString());
		       
		}
		catch(Exception e)
		{ outputParameters.put("STATUS", "FAIL");
	 outputParameters.put("MESSAGE", "Action: DropDown, Input Given:"+inputparameters[0].toString());
	 
		}return outputParameters;
			} 	


// validation

public static Hashtable<String,Object> validation (Object[]inputparameters) 
{
	
		String xpath = (String)inputparameters[0];
		String String1 = (String)inputparameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement web = driver.findElement(By.xpath(xpath));
		String String2 = web.getText();
		try {
			if (String1.equalsIgnoreCase(String2))
			{
				System.out.println("Test case pass");
			}
			else {
				System.out.println("Test case fail");
			}outputParameters.put("STATUS", "PASS");
		       outputParameters.put("MESSAGE", "Action: Vlidation, Input Given:"+inputparameters[0].toString());
		       
		}
		catch(Exception e)
		{ outputParameters.put("STATUS", "FAIL");
	 outputParameters.put("MESSAGE", "Action: Validation, Input Given:"+inputparameters[0].toString());
	 
		}return outputParameters;
			} 	
				

}

	
	
		
		