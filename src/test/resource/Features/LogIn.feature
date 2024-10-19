
Feature: login Functionality

Scenario: Login with valid Credentials

Given User opens the Application
When User clicks on BookStoreApplication
And User clicks on login button
And User enter userName as "kumar" password as "Vinod@123"
And User clicks on login button
And User should be Logged in

Scenario: Login with
