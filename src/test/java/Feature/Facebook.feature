Feature: Test Facebook Application

Scenario: Test the Facebook Registration Page

Given User is on "https://www.facebook.com/reg" Registration Page
When user Enter "Jagadish" FirstName and "Patil" LastName
And user Select "10" Date and "May" Month and "1993" Year
And user Select "Male" gender
And User Enter "Jagadish@gmail.com" Email and "Jagadish@123" Password
