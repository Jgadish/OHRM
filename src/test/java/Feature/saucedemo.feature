Feature: Test saucedemo Application

Scenario: Validate the login Functinality
Given user is on "https://www.saucedemo.com/" login page
When user enter "standard_user" username  and "secret_sauce" password 
And user click on submit button

Scenario: Validate the Product Functinality
Given user is on Product Page
When user Select "Price (high to low)" from Drop Down
And User Add 4 Product To Cart
Then user Click On Container
And user Click on Checkout

Scenario: Validate the Personal Functinality
When user Enter "Jagadish" FirstName and "Patil" lastName and "112233" Postalcode
And user Click on Continue
And user click on Finish










