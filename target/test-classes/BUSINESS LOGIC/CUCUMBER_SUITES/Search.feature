Feature: Login feature

Background: usser is succesfully logged in
When user opens the "chrome" browser and exe "D:\\bankingProject\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enters the url "http://primusbank.qedgetech.com/"
When user enters "Admin" as username
When user enters "Admin" as password
When user clicks on login button
When user is on the "Admin" main page and get message as welcome to Admin


@SmokeTest
Scenario: Search fuctionality
When user click on branches
When user select "INDIA" as counry
When user select "Andhra Pradesh" as state
When user select "Hyderabad" as city
When user click n search button
Then application shows branches for hyderabad city
