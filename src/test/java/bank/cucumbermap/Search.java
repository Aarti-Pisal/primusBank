package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search 
{
	@When("^user click on branches$")
	public void user_click_on_branches() throws Throwable 
	{
		   Object[] input5=new Object[1];
		     input5[0]="//*[@src='images/Branches_but.jpg']";
		     Hashtable<String, Object> input5op=SeleniumOperations.click(input5);  
		     
		     HTMLReportGenerator.StepDetails(input5op.get("STATUS").toString(), "user enters \"([^\"]*)\" as username", input5op.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as country$")
	public void user_select_as_country(String country1) throws Throwable 
	{
		 Object[] input6=new Object[2];
	     input6[0]="//*[@name='lst_countryS']";
	     input6[1]=country1;
	     Hashtable<String, Object> input6op=SeleniumOperations.dropDown(input6);  
	     
	     HTMLReportGenerator.StepDetails(input6op.get("STATUS").toString(), "user enters \"([^\"]*)\" as username", input6op.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as state$")
	public void user_select_as_state(String state1) throws Throwable
	{
		  Object[] input7=new Object[2];
		     input7[0]="//*[@name='lst_stateS']";
		     input7[1]=state1;
		     Hashtable<String, Object> input7op=SeleniumOperations.dropDown(input7);  
		     
		     HTMLReportGenerator.StepDetails(input7op.get("STATUS").toString(), "user enters \"([^\"]*)\" as username", input7op.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as city$")
	public void user_select_as_city(String city1) throws Throwable 
	{
		Object[] input8=new Object[2];
	     input8[0]="//*[@name='lst_cityS']";
	     input8[1]=city1;
         Hashtable<String, Object> input8op=SeleniumOperations.dropDown(input8);  
	     
	     HTMLReportGenerator.StepDetails(input8op.get("STATUS").toString(), "user enters \"([^\"]*)\" as username", input8op.get("MESSAGE").toString());
	}

	@When("^user click on search button$")
	public void user_click_on_search_button() throws Throwable 
	{
		 Object[] input9=new Object[1];
	     input9[0]="//*[@id='btn_search']";
  Hashtable<String, Object> input9op=SeleniumOperations.click(input9);  
	     
	     HTMLReportGenerator.StepDetails(input9op.get("STATUS").toString(), "user enters \"([^\"]*)\" as username", input9op.get("MESSAGE").toString());
	}

	@Then("^application shows list of branches from Hyderabad city and \"([^\"]*)\"$")
	public void application_shows_list_of_branches_from_Hyderabad_city_and(String BrDetail) throws Throwable 
	{
		  Object[] input11=new Object[2];
		     input11[0]="//*[text()='Branch Details']";
		     input11[1]=BrDetail;
		     Hashtable<String, Object> input11op=SeleniumOperations.validation(input11);  
		     
		     HTMLReportGenerator.StepDetails(input11op.get("STATUS").toString(), "user enters \"([^\"]*)\" as username", input11op.get("MESSAGE").toString());
	}


}
