package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {

@When("^user click on branches$")
public void user_click_on_branches() throws Throwable {
	Object [] input5 = new Object[1];
	input5[0] = "//*[@src='images/Branches_but.jpg']";	
	Hashtable<String,Object>input5op = SeleniumOperations.click(input5);   
	HTMLReportGenerator.StepDetails(input5op.get("STATUS").toString(), "^user click on branches$", input5op.get("MESSAGE").toString());
}

@When("^user select \"([^\"]*)\" as counry$")
public void user_select_as_counry(String cname) throws Throwable {
	Object [] input6 = new Object[2];
	input6[0] = "//*[@name='lst_countryS']";
	input6[1]= cname;	
	Hashtable<String,Object>input6op = SeleniumOperations.selectdropdown(input6);   
	HTMLReportGenerator.StepDetails(input6op.get("STATUS").toString(), "^user select \"([^\"]*)\" as counry$", input6op.get("MESSAGE").toString());
}

@When("^user select \"([^\"]*)\" as state$")
public void user_select_as_state(String sname) throws Throwable {
	Object [] input7 = new Object[2];
	input7[0] = "//*[@name='lst_stateS']";
	input7[1]= sname;	
	Hashtable<String,Object>input7op = SeleniumOperations.selectdropdown(input7);   
	HTMLReportGenerator.StepDetails(input7op.get("STATUS").toString(), "^user select \"([^\"]*)\" as state$", input7op.get("MESSAGE").toString());
}

@When("^user select \"([^\"]*)\" as city$")
public void user_select_as_city(String cityname) throws Throwable {
	Object [] input8 = new Object[2];
	input8[0] = "//*[@name='lst_cityS']";
	input8[1]= cityname;	
	Hashtable<String,Object>input8op = SeleniumOperations.selectdropdown(input8);   
	HTMLReportGenerator.StepDetails(input8op.get("STATUS").toString(), "^user select \"([^\"]*)\" as city$", input8op.get("MESSAGE").toString());
}

@When("^user click n search button$")
public void user_click_n_search_button() throws Throwable {
	Object [] input9 = new Object[1];
	input9[0] = "//*[@name='btn_search']";	
	Hashtable<String,Object>input9op = SeleniumOperations.click(input9);   
	HTMLReportGenerator.StepDetails(input9op.get("STATUS").toString(), "^user click n search button$", input9op.get("MESSAGE").toString());
}

@Then("^application shows branches for hyderabad city$")
public void application_shows_branches_for_hyderabad_city(String branchdetail) throws Throwable {
	Object [] detail = new Object[2]; 
	detail[0] = "//*[id()='lab19']";
	detail[1] = branchdetail;
	Hashtable<String,Object>detailop = SeleniumOperations.validation(detail);   
	HTMLReportGenerator.StepDetails(detailop.get("STATUS").toString(), "^user click n search button$", detailop.get("MESSAGE").toString());
}


}
