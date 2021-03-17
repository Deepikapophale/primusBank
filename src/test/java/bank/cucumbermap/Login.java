package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	

		@When("^user opens the \"([^\"]*)\" browser and exe \"([^\"]*)\"$")
		public void browserLaunch(String bname, String exe) throws Throwable {
			 Object [] input = new Object[2];
             input[0] = bname;
             input[1]= exe;	
		       SeleniumOperations.browserLaunch(input);
		}

		@When("^user enters the url \"([^\"]*)\"$")
		public void url(String urlname) throws Throwable {
			Object [] input1 = new Object[1];
			input1[0] = urlname;	
			SeleniumOperations.applicationLaunch(input1);
			}   

		@When("^user enters \"([^\"]*)\" as username$")
		public void username(String uname) throws Throwable {
			Object [] input2 = new Object[2];
			input2[0] = "//*[@name='txtuId']";
			input2[1]= uname;	
			Hashtable<String,Object>input2op = SeleniumOperations.sendKey(input2);   
			HTMLReportGenerator.StepDetails(input2op.get("STATUS").toString(), "^user enters \"([^\"]*)\" as username$", input2op.get("MESSAGE").toString());
		}

		@When("^user enters \"([^\"]*)\" as password$")
		public void password(String pass) throws Throwable {
			Object [] input3 = new Object[2];
			input3[0] = "//*[@name='txtPword']";
			input3[1]= pass;	
			Hashtable<String,Object>input3op = SeleniumOperations.sendKey(input3);   
			HTMLReportGenerator.StepDetails(input3op.get("STATUS").toString(), "^user enters \"([^\"]*)\" as password$", input3op.get("MESSAGE").toString());
		}

		@When("^user clicks on login button$")
		public void user_clicks_on_login_button() throws Throwable {
			 Object [] input4 = new Object[1];
			 input4[0] = "//*[@name='login']";	
			 Hashtable<String,Object>input4op = SeleniumOperations.click(input4);   
				HTMLReportGenerator.StepDetails(input4op.get("STATUS").toString(), "^user clicks on login button$", input4op.get("MESSAGE").toString());
			}

		@Then("^user is on the \"([^\"]*)\" main page and get message as welcome to Admin$")
		public void user_is_on_the_main_page_and_get_message_as_welcome_to_Admin(String msg) throws Throwable {
			Object [] welcome = new Object[2]; 
			welcome[0] = "//*[text()='Admin']";
			welcome[1] = msg;
			Hashtable<String,Object>welcomeop = SeleniumOperations.validation(welcome);   
			HTMLReportGenerator.StepDetails(welcomeop.get("STATUS").toString(), "^user is on the \"([^\"]*)\" main page and get message as welcome to Admin$", welcomeop.get("MESSAGE").toString());
		}


}