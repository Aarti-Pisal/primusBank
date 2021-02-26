package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Personal 
{
	@When("^user click on Personal$")
	public void user_click_on_Personal() throws Throwable
	{
		 Object[] input13=new Object[1];
	     input13[0]="//*[@id='personal']";
	     Hashtable<String, Object> input13op=SeleniumOperations.click(input13);   
	     HTMLReportGenerator.StepDetails(input13op.get("STATUS").toString(), "user click on Personal", input13op.get("MESSAGE").toString());
	}

	@When("^user click on Customer Service$")
	public void user_click_on_Customer_Service() throws Throwable 
	{
		  Object[] input14=new Object[1];
		  input14[0]="//*[@href='customerServices.html']";
		  Hashtable<String, Object> input14op=SeleniumOperations.click(input14);   
		  HTMLReportGenerator.StepDetails(input14op.get("STATUS").toString(), "user click on Customer Service", input14op.get("MESSAGE").toString());
	}

	@Then("^user is on Customer Services page get Contact \"([^\"]*)\" and get msg$")
	public void user_is_on_Customer_Services_page_get_Contact_and_get_msg(String text) throws Throwable 
	{
		Object[] input15=new Object[2];
	    input15[0]="//*[text()='08082324252']";
	    input15[1]=text;
	    Hashtable<String, Object> input15op=SeleniumOperations.validation(input15);  
	    HTMLReportGenerator.StepDetails(input15op.get("STATUS").toString(), "user is on Customer Services page get Contact \"([^\"]*)\" and get msg", input15op.get("MESSAGE").toString());
	    
	}


	
}
