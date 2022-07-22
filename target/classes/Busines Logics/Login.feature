Feature: Login functionality

Background: Application opens Sucessfully
Given user open browser with "webdriver.chrome.driver" and "D:\\ALLSOFTWARES\\Automation support\\selenium_and _drivers\\chromedriver103.0.5060.24\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"

@SmokeTest
Scenario: Login functionality with valid user name and password
When user Click on initial login popup window
When user navigate to login button
When user click on my profile 
When user enter "9226157112" as login id
When user enter "Yogesh@123456789" as password
When user click Login 
Then Application Show Login Sucessful


