Feature: Search Feature

Background: user is successfully logged in
When user opens "Chrome" browser with exe "D:\\Bank\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enters url "http://primusbank.qedgetech.com/"
When user enters "Admin" as username
When user enters "Admin" as password
When user click on login button

@SmokeTest
Scenario: Search functionality 
When user click on branches
When user select "INDIA" as country
When user select "Andhra Pradesh" as state
When user select "Hyderabad" as city
When user click on search button
Then application shows list of branches from Hyderabad city and "Branch Details"
