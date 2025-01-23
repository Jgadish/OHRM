Feature: Test Redbus Application

Scenario: Test Search Bus Functionality

Given user open "https://www.redbus.in/" url and user on home page
When user Enter "Mumbai" From city and "Pune" To city
And user select "10" Date and "Feb 2025" monthyear
Then user click on search button