package bank.UnitSteps;
import bank.methods.SeleniumOperations;

public class StepExecutor 
{
	public static void main(String[] args)
	{
	     //BrowserLaunch
		 Object[] input=new Object[2];
	     input[0]="Chrome";
	     input[1]="D:\\Bank\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
	     SeleniumOperations.browserLaunch(input);
	     
	     //ApplicationLaunch
	     Object[] input1=new Object[1];
	     input1[0]="http://primusbank.qedgetech.com/";
	     SeleniumOperations.applicationLaunch(input1);

	     //Enter User Name
	     Object[] input2=new Object[2];
	     input2[0]="//*[@id='txtuId']";
	     input2[1]="Admin";
	     SeleniumOperations.sendKey(input2);

	     //Enter Password
	     Object[] input3=new Object[2];
	     input3[0]="//*[@id='txtPword']";
	     input3[1]="Admin";
	     SeleniumOperations.sendKey(input3);
	     
	     //Click on Login Button
	     Object[] input4=new Object[1];
	     input4[0]="//*[@id='login']";
	     SeleniumOperations.click(input4);
	     
	     
	     //Validation of Successfuly Login test case
	     Object[] input10=new Object[2];
	     input10[0]="//*[text()='Admin']";
	     input10[1]="Admin";
	     SeleniumOperations.validation(input10);
	     
	     //Click on Branches
	     Object[] input5=new Object[1];
	     input5[0]="//*[@src='images/Branches_but.jpg']";
	     SeleniumOperations.click(input5);
	     
	     //Select Country
	     Object[] input6=new Object[2];
	     input6[0]="//*[@name='lst_countryS']";
	     input6[1]="INDIA";
	     SeleniumOperations.dropDown(input6);
	     
	     //Select State
	     Object[] input7=new Object[2];
	     input7[0]="//*[@name='lst_stateS']";
	     input7[1]="Andhra Pradesh";
	     SeleniumOperations.dropDown(input7);
	     
	     //Select City
	     Object[] input8=new Object[2];
	     input8[0]="//*[@name='lst_cityS']";
	     input8[1]="Hyderabad";
	     SeleniumOperations.dropDown(input8);
	     
	     //Click on Search Button
	     Object[] input9=new Object[1];
	     input9[0]="//*[@id='btn_search']";
	     SeleniumOperations.click(input9);
	    
	    //Validation of application shows list of branches from "Hyderabad" city
	     Object[] input11=new Object[2];
	     input11[0]="//*[text()='Branch Details']";
	     input11[1]="Branch Details";
	     SeleniumOperations.validation(input11);
	     
	     //Click On Log Out
	     Object[] input12=new Object[1];
	     input12[0]="//*[@src='images/admin_but_03.jpg']";
	     SeleniumOperations.click(input12);
	     
	     //Click on Personal Login
	     Object[] input13=new Object[1];
	     input13[0]="//*[@id='personal']";
	     SeleniumOperations.click(input13);
	     
	     //Click on Customer Service
	     Object[] input14=new Object[1];
	     input14[0]="//*[@href='customerServices.html']";
	     SeleniumOperations.click(input14);
	     
	     //Validation For Contact number
	     Object[] input15=new Object[2];
	     input15[0]="//*[text()='08082324252']";
	     input15[1]="08082324252";
	     SeleniumOperations.validation(input15);
}
}