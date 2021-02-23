Feature: Login Feature

Background: user is successfully logged in
When user opens "Chrome" browser with exe "D:\\Bank\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enters url "http://primusbank.qedgetech.com/"

@SmokeTest
Scenario: Login functionality for valid username and valid password
When user enters "Admin" as username
When user enters "Admin" as password
When user click on login button
Then user is on "Admin" page and get msg 
