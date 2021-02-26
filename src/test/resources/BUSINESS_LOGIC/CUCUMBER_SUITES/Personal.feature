Feature: Personal Feature

Background: user is successfully logged in
When user opens "Chrome" browser with exe "D:\\Bank\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enters url "http://primusbank.qedgetech.com/"

@RegressionTest
Scenario: Application Shows valid Contact Number 
When user click on Personal
When user click on Customer Service
Then user is on Customer Services page get Contact "08082324252" and get msg 