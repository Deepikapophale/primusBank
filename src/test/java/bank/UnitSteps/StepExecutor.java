package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class StepExecutor 
{
	public static void main(String[] args) {
//Browser Launch
		       Object [] input = new Object[2];
               input[0] = "Chrome";
               input[1]= "D:\\bankingProject\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe";	
		       SeleniumOperations.browserLaunch(input);
		
//open URL
		Object [] input1 = new Object[1];
		input1[0] = "http:/primusbank.qedgetech.com";	
		SeleniumOperations.applicationLaunch(input1);
						
//Enter UserName
				Object [] input2 = new Object[2];
				input2[0] = "//*[@name='txtuId']";
				input2[1]= "Admin";	
				SeleniumOperations.sendKey(input2);
// Enter Password
				Object [] input3 = new Object[2];
				input3[0] = "//*[@name='txtPword']";
				input3[1]= "Admin";	
				SeleniumOperations.sendKey(input3);
								
// click on login button
					 Object [] input4 = new Object[1];
					 input4[0] = "//*[@name='login']";	
					 SeleniumOperations.click(input4);		
					 
// welcome message
					 Object [] welcome = new Object[2]; 
						welcome[0] = "//*[text()='Admin']";
						welcome[1] = "Welcome to Admin page";
						SeleniumOperations.validation(welcome);
//click on branches
				Object [] input5 = new Object[1];
				input5[0] = "//*[@src='images/Branches_but.jpg']";	
				SeleniumOperations.click(input5);					
											
//select country
				Object [] input6 = new Object[2];
				input6[0] = "//*[@name='lst_countryS']";
				input6[1]= "INDIA";	
				SeleniumOperations.selectdropdown(input6);
		
	
// select state
				Object [] input7 = new Object[2];
				input7[0] = "//*[@name='lst_stateS']";
				input7[1]= "Andhra Pradesh";	
				SeleniumOperations.selectdropdown(input7);
		
// select city
				Object [] input8 = new Object[2];
				input8[0] = "//*[@name='lst_cityS']";
				input8[1]= "Hyderabad";	
				SeleniumOperations.selectdropdown(input8);
			
// click on search button
				Object [] input9 = new Object[1];
				input9[0] = "//*[@name='btn_search']";	
				SeleniumOperations.click(input9);	
		
		
		}
		
}
