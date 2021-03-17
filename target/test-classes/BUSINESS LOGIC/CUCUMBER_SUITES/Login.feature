Feature: Login feature

Background: usser is succesfully logged in
When user opens the "chrome" browser and exe "D:\\bankingProject\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enters the url "http://primusbank.qedgetech.com/"


@SmokeTest
Scenario: Login functionality for valid credential
When user enters "Admin" as username
When user enters "Admin" as password
When user clicks on login button
Then user is on the "Admin" main page and get message as welcome to Admin

