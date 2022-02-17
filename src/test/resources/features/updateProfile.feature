Feature: To verify BIO is update on profilepage
 

  @tag1
  Scenario Outline: To add BIO on Profile page
    Given User is loged in <username> and <password>
    And clicks on profile page and edit
    When user enters BIO text box
    And user update his location
    And user update his Website
    Then user should be able to update profile page
   
 Examples: 
      |username|password|
      |saurabh101@yopmail.com|Welcome123|
      
      
  
