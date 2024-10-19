
Feature: Registration Functionality

Scenario: Student Registration with all  details
 Given User opens the Application
 When User clicks on Forms
 And  User clicks on practiceForm
 And User enters details below fields
 |firstName              |vinod            |
 |lastName               |reddy            |
 |gender                 |Male             |
 |mobileNumber           |9012344561       |
 |dataOfBirth            |17 July 2003     |
 |hobbies                |Reading          |
 |pictute                |vinod            |
 |currentAddress         |talupula         |
 |state                  |Haryana          |
 |city                   |Karnal           |
 
 And User clicks on submit button
 Then User sucessfully registred
 
 