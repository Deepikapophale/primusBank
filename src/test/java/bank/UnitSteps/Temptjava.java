package bank.UnitSteps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Temptjava {
	public static void main(String[] args) 
	{
		// browser Launch
		System.setProperty("webdriver.chrome.driver", "D:\\bankingProject\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// open URL
		driver.get("http://primusbank.qedgetech.com/");
		
		// enter Username
		driver.findElementByXPath("//*[@name='txtuId']").sendKeys("Admin");
		
		// enter password
		driver.findElementByXPath("//*[@name='txtPword']").sendKeys("Admin");
		
		// click on login
		driver.findElementByXPath("//*[@name='login']").click();
		
		// click on branch
		driver.findElementByXPath("//*[@src='images/Branches_but.jpg']").click();	
		
		// select India
		Select country = new Select(driver.findElementByXPath("//*[@name='lst_countryS']"));
		country.selectByVisibleText("INDIA");
		
		// select state
		Select state = new Select(driver.findElementByXPath("//*[@name='lst_stateS']"));
		state.selectByVisibleText("Andhra Pradesh");
		
		//select city
		Select city = new Select(driver.findElementByXPath("//*[@name='lst_cityS']"));
		city.selectByVisibleText("Hyderabad");
			// click on search
		driver.findElementByXPath("//*[@name='btn_search']").click();
	}

}
